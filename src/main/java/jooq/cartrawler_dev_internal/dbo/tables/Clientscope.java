/*
 * This file is generated by jOOQ.
 */
package jooq.cartrawler_dev_internal.dbo.tables;


import java.util.Arrays;
import java.util.List;

import javax.annotation.Generated;

import jooq.cartrawler_dev_internal.dbo.Dbo;
import jooq.cartrawler_dev_internal.dbo.Indexes;
import jooq.cartrawler_dev_internal.dbo.Keys;
import jooq.cartrawler_dev_internal.dbo.tables.records.ClientscopeRecord;

import org.jooq.Field;
import org.jooq.ForeignKey;
import org.jooq.Identity;
import org.jooq.Index;
import org.jooq.Name;
import org.jooq.Record;
import org.jooq.Schema;
import org.jooq.Table;
import org.jooq.TableField;
import org.jooq.UniqueKey;
import org.jooq.impl.DSL;
import org.jooq.impl.TableImpl;


/**
 * This class is generated by jOOQ.
 */
@Generated(
    value = {
        "http://www.jooq.org",
        "jOOQ version:3.11.7"
    },
    comments = "This class is generated by jOOQ"
)
@SuppressWarnings({ "all", "unchecked", "rawtypes" })
public class Clientscope extends TableImpl<ClientscopeRecord> {

    private static final long serialVersionUID = 1734923821;

    /**
     * The reference instance of <code>Cartrawler_dev_internal.dbo.ClientScope</code>
     */
    public static final Clientscope CLIENTSCOPE = new Clientscope();

    /**
     * The class holding records for this type
     */
    @Override
    public Class<ClientscopeRecord> getRecordType() {
        return ClientscopeRecord.class;
    }

    /**
     * The column <code>Cartrawler_dev_internal.dbo.ClientScope.id</code>.
     */
    public final TableField<ClientscopeRecord, Integer> ID = createField("id", org.jooq.impl.SQLDataType.INTEGER.nullable(false).identity(true), this, "");

    /**
     * The column <code>Cartrawler_dev_internal.dbo.ClientScope.parent_id</code>.
     */
    public final TableField<ClientscopeRecord, Integer> PARENT_ID = createField("parent_id", org.jooq.impl.SQLDataType.INTEGER.nullable(false), this, "");

    /**
     * The column <code>Cartrawler_dev_internal.dbo.ClientScope.virtualLocation_id</code>.
     */
    public final TableField<ClientscopeRecord, Integer> VIRTUALLOCATION_ID = createField("virtualLocation_id", org.jooq.impl.SQLDataType.INTEGER.nullable(false), this, "");

    /**
     * The column <code>Cartrawler_dev_internal.dbo.ClientScope.showClientLocationsOnly</code>.
     */
    public final TableField<ClientscopeRecord, Boolean> SHOWCLIENTLOCATIONSONLY = createField("showClientLocationsOnly", org.jooq.impl.SQLDataType.BIT, this, "");

    /**
     * Create a <code>Cartrawler_dev_internal.dbo.ClientScope</code> table reference
     */
    public Clientscope() {
        this(DSL.name("ClientScope"), null);
    }

    /**
     * Create an aliased <code>Cartrawler_dev_internal.dbo.ClientScope</code> table reference
     */
    public Clientscope(String alias) {
        this(DSL.name(alias), CLIENTSCOPE);
    }

    /**
     * Create an aliased <code>Cartrawler_dev_internal.dbo.ClientScope</code> table reference
     */
    public Clientscope(Name alias) {
        this(alias, CLIENTSCOPE);
    }

    private Clientscope(Name alias, Table<ClientscopeRecord> aliased) {
        this(alias, aliased, null);
    }

    private Clientscope(Name alias, Table<ClientscopeRecord> aliased, Field<?>[] parameters) {
        super(alias, null, aliased, parameters, DSL.comment(""));
    }

    public <O extends Record> Clientscope(Table<O> child, ForeignKey<O, ClientscopeRecord> key) {
        super(child, key, CLIENTSCOPE);
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Schema getSchema() {
        return Dbo.DBO;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public List<Index> getIndexes() {
        return Arrays.<Index>asList(Indexes.CLIENTSCOPE_PK_CLIENTSCOPE);
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Identity<ClientscopeRecord, Integer> getIdentity() {
        return Keys.IDENTITY_CLIENTSCOPE;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public UniqueKey<ClientscopeRecord> getPrimaryKey() {
        return Keys.PK_CLIENTSCOPE;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public List<UniqueKey<ClientscopeRecord>> getKeys() {
        return Arrays.<UniqueKey<ClientscopeRecord>>asList(Keys.PK_CLIENTSCOPE);
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Clientscope as(String alias) {
        return new Clientscope(DSL.name(alias), this);
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Clientscope as(Name alias) {
        return new Clientscope(alias, this);
    }

    /**
     * Rename this table
     */
    @Override
    public Clientscope rename(String name) {
        return new Clientscope(DSL.name(name), null);
    }

    /**
     * Rename this table
     */
    @Override
    public Clientscope rename(Name name) {
        return new Clientscope(name, null);
    }
}