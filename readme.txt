1. H2 Quotes names

Quotes names in H2 are case sensitive, as required by the SQL specification.

That means:

------------------------------------------
CREATE TABLE "testquote" (dummy INT, "quotedDummy" INT);

SELECT * FROM "testquote";  --work
SELECT * FROM testquote;  --not work
SELECT * FROM "TestQuote";  --not work
------------------------------------------

Unquotes names are not case sensitive in H2. They are normally converted to uppercase (as in Oracle and other databases).

That means the statements

CREATE TABLE test (dummy INT);
SELECT * FROM test;
are the same as

CREATE TABLE "TEST" ("DUMMY" INT);
SELECT * FROM "TEST";


In that H2 behaves in the same way as Oracle.
This is a bit different on how other databases like MySQL and PostgreSQL deal with identifier names.
H2 has a compatibility feature: If you append ;DATABASE_TO_UPPER=FALSE to the database URL,
unquotes identifiers are not converted to uppercase, that means they are case sensitive as well.
But you need append this when creating the database, and each time you use it
(if you append the setting for existing databases, the identifiers of existing objects are already converted to uppercase).

2. JOOQ for H2

    1) DDL is unquoted with \", DSL Context set as follows:
    new Settings().withRenderNameStyle(RenderNameStyle.AS_IS)

    2) DDL is quoted with \", DSL Context set as follows:
    new Settings().withRenderNameStyle(RenderNameStyle.QUOTED);
    or
    new Settings().withRenderNameStyle(RenderNameStyle.AS_IS)  AND jdbc-url: "jdbc:h2:<url>;DATABASE_TO_UPPER=FALSE";

3. Bit wise operation for H2
 a&b; --not work
 BITAND(a,b) -- work
 see also: BITOR,BITNOT

4. insert newline for H2

 CONCAT_WS(char(10), '威信', 'VX','薇芯')
 '威信'||char(10)||'VX'||char(10)||'薇芯'
 STRINGDeCODE('威信\nVX\n薇芯')