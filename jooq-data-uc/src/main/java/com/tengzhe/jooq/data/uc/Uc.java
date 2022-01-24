/*
 * This file is generated by jOOQ.
 */
package com.tengzhe.jooq.data.uc;


import com.tengzhe.jooq.data.DefaultCatalog;
import com.tengzhe.jooq.data.uc.tables.Account;

import java.util.Arrays;
import java.util.List;

import org.jooq.Catalog;
import org.jooq.Table;
import org.jooq.impl.SchemaImpl;


/**
 * This class is generated by jOOQ.
 */
@SuppressWarnings({ "all", "unchecked", "rawtypes" })
public class Uc extends SchemaImpl {

    private static final long serialVersionUID = 1L;

    /**
     * The reference instance of <code>uc</code>
     */
    public static final Uc UC = new Uc();

    /**
     * The table <code>uc.account</code>.
     */
    public final Account ACCOUNT = Account.ACCOUNT;

    /**
     * No further instances allowed
     */
    private Uc() {
        super("uc", null);
    }


    @Override
    public Catalog getCatalog() {
        return DefaultCatalog.DEFAULT_CATALOG;
    }

    @Override
    public final List<Table<?>> getTables() {
        return Arrays.<Table<?>>asList(
            Account.ACCOUNT);
    }
}
