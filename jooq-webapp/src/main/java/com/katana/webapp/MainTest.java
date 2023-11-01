package com.katana.webapp;

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
            methodVisitor.visitVarInsn(ALOAD, 0);
            methodVisitor.visitTypeInsn(NEW, "com/p6spy/engine/spy/P6DataSource");
            methodVisitor.visitInsn(DUP);
            methodVisitor.visitVarInsn(ALOAD, 1);
            methodVisitor.visitMethodInsn(INVOKESPECIAL, "com/p6spy/engine/spy/P6DataSource", "<init>", "(Ljavax/sql/DataSource;)V", false);
            methodVisitor.visitFieldInsn(PUTFIELD, "org/springframework/jdbc/datasource/DelegatingDataSource", "targetDataSource", "Ljavax/sql/DataSource;");
            methodVisitor.visitInsn(RETURN);
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


}
