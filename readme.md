# 1. 应用配置

## 1.1 DB控制台

```
127.0.0.1:8081/h2-console
```

## 1.2 数据初始化

```
schema-h2.sql 用于初始化表结构
data-h2.sql 用于初始化数据
```

## 1.3. JOOQ代码生成

<font color=red>***基于H2的sql文件生成，不依赖数据库***</font>，根目录下执行命令行：

```
  默认数据库表定义：scripts/h2/**.sql，该路径可在jooqConfig.xml文件中修改
  代码生成表结构：项目根目录下执行[ mvn clean package ]
```

## 1.4. 日志配置
<font color=red>***控制台日志格式可以指定颜色***</font>
```
logging:
  pattern:
    console: "${CONSOLE_LOG_PATTERN:-%clr(%d{${LOG_DATEFORMAT_PATTERN:-yyyy-MM-dd HH:mm:ss.SSS}}){faint} %clr(${LOG_LEVEL_PATTERN:-%5p}) %clr(${PID:- }){magenta} %clr(---){faint} %clr([%15.15t]){faint} %clr(%-40.40logger{39}@%line){cyan} %clr(:) %m%n${LOG_EXCEPTION_CONVERSION_WORD:-%wEx}}"
  level:
    root: info
    org.springframework.web: trace
```

# 2. h2语法注意

## 2.1. H2 Quotes names

------------------------------------------
<font color=red>***Quotes names in H2 are case sensitive***</font>, as required by the SQL specification.

That means:

CREATE TABLE "testquote" (dummy INT, "quotedDummy" INT);

```
SELECT * FROM "testquote";  --work
SELECT * FROM testquote;  --not work
SELECT * FROM "TestQuote";  --not work
```

------------------------------------------

<font color=red bold="">***Unquotes names are not case sensitive in H2***</font>. They are normally converted to
uppercase (as in Oracle and other databases).

That means the statements

```
CREATE TABLE test (dummy INT);
SELECT * FROM test;
are the same as

CREATE TABLE "TEST" ("DUMMY" INT);
SELECT * FROM "TEST";
```

------------------------------------------

In that H2 behaves in the same way as Oracle.
This is a bit different on how other databases like MySQL and PostgreSQL deal with identifier names.
H2 has a compatibility feature: ***If you append ;DATABASE_TO_UPPER=FALSE to the database URL,
unquotes identifiers are not converted to uppercase, that means they are case sensitive as well***.
But you need append this when creating the database, and each time you use it
(if you append the setting for existing databases, the identifiers of existing objects are already converted to
uppercase).

## 2.2. JOOQ for H2

### 2.2.1. DDL is <font color=red>unquoted</font> with ```\"```

DSL Context set as follows:

####

    new Settings().withRenderNameStyle(RenderNameStyle.AS_IS)

### 2.2.2. DDL is <font color=red>quoted</font> with ```\"```

DSL Context set as follows:

```
new Settings().withRenderNameStyle(RenderNameStyle.QUOTED);
```

or

```
new Settings().withRenderNameStyle(RenderNameStyle.AS_IS)   
   
AND 

jdbc-url: "jdbc:h2:<url>;DATABASE_TO_UPPER=FALSE";
```

### 2.2.3. Bit wise operation for H2

```
   a&b; --not work
   BITAND(a,b) -- work
   see also: BITOR,BITNOT
```

### 2.2.4. insert newline for H2

```
   CONCAT_WS(char(10), '威信', 'VX','薇芯')
   '威信'||char(10)||'VX'||char(10)||'薇芯'
   STRINGDeCODE('威信\nVX\n薇芯')
```

注: char(10)=='\n'