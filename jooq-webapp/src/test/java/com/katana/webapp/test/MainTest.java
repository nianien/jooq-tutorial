package com.katana.webapp.test;

import net.bytebuddy.ByteBuddy;
import net.bytebuddy.agent.ByteBuddyAgent;
import net.bytebuddy.description.method.MethodDescription;
import net.bytebuddy.dynamic.DynamicType;
import net.bytebuddy.dynamic.loading.ClassReloadingStrategy;
import net.bytebuddy.dynamic.scaffold.InstrumentedType;
import net.bytebuddy.implementation.Implementation;
import net.bytebuddy.implementation.bytecode.ByteCodeAppender;
import net.bytebuddy.jar.asm.Label;
import net.bytebuddy.jar.asm.MethodVisitor;
import org.springframework.jdbc.datasource.DelegatingDataSource;

import javax.sql.DataSource;
import java.io.PrintWriter;
import java.sql.Connection;
import java.sql.SQLException;
import java.sql.SQLFeatureNotSupportedException;
import java.util.logging.Logger;

import static net.bytebuddy.jar.asm.Opcodes.*;
import static net.bytebuddy.matcher.ElementMatchers.named;

/**
 * @author : liyifei
 * @created : 2023/11/1, 星期三
 * Copyright (c) 2004-2029 All Rights Reserved.
 **/
public class MainTest {

    public static void main(String[] args) throws Exception {
        ByteBuddyAgent.install();
        DynamicType.Loaded<DelegatingDataSource> loaded = new ByteBuddy()
                .redefine(DelegatingDataSource.class)
                .method(named("setTargetDataSource"))
                .intercept(MyImplementation.INSTANCE)
                .make()
                .load(Thread.currentThread().getContextClassLoader(), ClassReloadingStrategy.fromInstalledAgent());
        DelegatingDataSource instance = loaded.getLoaded().newInstance();
        instance.setTargetDataSource(new DummyDataSource());
        System.out.println(instance.getTargetDataSource());
    }


    enum MyAppender implements ByteCodeAppender {

        INSTANCE; // singleton org.springframework.jdbc.datasource

        @Override
        public Size apply(MethodVisitor methodVisitor,
                          Implementation.Context implementationContext,
                          MethodDescription instrumentedMethod) {
            Label label0 = new Label();
            methodVisitor.visitLabel(label0);
            methodVisitor.visitLineNumber(70, label0);
            methodVisitor.visitVarInsn(ALOAD, 0);
            methodVisitor.visitTypeInsn(NEW, "com/p6spy/engine/spy/P6DataSource");
            methodVisitor.visitInsn(DUP);
            methodVisitor.visitVarInsn(ALOAD, 1);
            methodVisitor.visitMethodInsn(INVOKESPECIAL, "com/p6spy/engine/spy/P6DataSource", "<init>", "(Ljavax/sql/DataSource;)V", false);
            methodVisitor.visitFieldInsn(PUTFIELD, "org/springframework/jdbc/datasource/DelegatingDataSource", "targetDataSource", "Ljavax/sql/DataSource;");
            Label label1 = new Label();
            methodVisitor.visitLabel(label1);
            methodVisitor.visitLineNumber(71, label1);
            methodVisitor.visitInsn(RETURN);
            Label label2 = new Label();
            methodVisitor.visitLabel(label2);
            methodVisitor.visitLocalVariable("this", "Lorg/springframework/jdbc/datasource/DelegatingDataSource;", null, label0, label2, 0);
            methodVisitor.visitLocalVariable("targetDataSource", "Ljavax/sql/DataSource;", null, label0, label2, 1);
            methodVisitor.visitMaxs(4, 2);
            return new Size(4, 2);
        }
    }


    enum MyImplementation implements Implementation {

        INSTANCE; // singleton

        @Override
        public InstrumentedType prepare(InstrumentedType instrumentedType) {
            return instrumentedType;
        }

        @Override
        public ByteCodeAppender appender(Target implementationTarget) {
            return MyAppender.INSTANCE;
        }

    }


    public DataSource spyDataSource(DataSource dataSource) {
        return new DataSource() {
            @Override
            public Connection getConnection() throws SQLException {
                return new net.sf.log4jdbc.ConnectionSpy(dataSource.getConnection());
            }

            @Override
            public Connection getConnection(String username, String password) throws SQLException {
                return new net.sf.log4jdbc.ConnectionSpy(dataSource.getConnection(username, password));
            }

            @Override
            public PrintWriter getLogWriter() throws SQLException {
                return dataSource.getLogWriter();
            }

            @Override
            public void setLogWriter(PrintWriter out) throws SQLException {
                dataSource.setLogWriter(out);
            }

            @Override
            public void setLoginTimeout(int seconds) throws SQLException {
                dataSource.setLoginTimeout(seconds);
            }

            @Override
            public int getLoginTimeout() throws SQLException {
                return dataSource.getLoginTimeout();
            }

            @Override
            public <T> T unwrap(Class<T> iface) throws SQLException {
                return dataSource.unwrap(iface);
            }

            @Override
            public boolean isWrapperFor(Class<?> iface) throws SQLException {
                return dataSource.isWrapperFor(iface);
            }

            @Override
            public Logger getParentLogger() throws SQLFeatureNotSupportedException {
                return dataSource.getParentLogger();
            }
        };
    }

}
