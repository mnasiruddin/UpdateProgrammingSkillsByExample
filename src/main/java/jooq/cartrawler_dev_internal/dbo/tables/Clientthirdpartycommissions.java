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
import jooq.cartrawler_dev_internal.dbo.tables.records.ClientthirdpartycommissionsRecord;

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
public class Clientthirdpartycommissions extends TableImpl<ClientthirdpartycommissionsRecord> {

    private static final long serialVersionUID = 1409276858;

    /**
     * The reference instance of <code>Cartrawler_dev_internal.dbo.ClientThirdPartyCommissions</code>
     */
    public static final Clientthirdpartycommissions CLIENTTHIRDPARTYCOMMISSIONS = new Clientthirdpartycommissions();

    /**
     * The class holding records for this type
     */
    @Override
    public Class<ClientthirdpartycommissionsRecord> getRecordType() {
        return ClientthirdpartycommissionsRecord.class;
    }

    /**
     * The column <code>Cartrawler_dev_internal.dbo.ClientThirdPartyCommissions.id</code>.
     */
    public final TableField<ClientthirdpartycommissionsRecord, Integer> ID = createField("id", org.jooq.impl.SQLDataType.INTEGER.nullable(false).identity(true), this, "");

    /**
     * The column <code>Cartrawler_dev_internal.dbo.ClientThirdPartyCommissions.referenceClientId</code>.
     */
    public final TableField<ClientthirdpartycommissionsRecord, Integer> REFERENCECLIENTID = createField("referenceClientId", org.jooq.impl.SQLDataType.INTEGER.nullable(false), this, "");

    /**
     * The column <code>Cartrawler_dev_internal.dbo.ClientThirdPartyCommissions.thirdPartyClientId</code>.
     */
    public final TableField<ClientthirdpartycommissionsRecord, Integer> THIRDPARTYCLIENTID = createField("thirdPartyClientId", org.jooq.impl.SQLDataType.INTEGER.nullable(false), this, "");

    /**
     * Create a <code>Cartrawler_dev_internal.dbo.ClientThirdPartyCommissions</code> table reference
     */
    public Clientthirdpartycommissions() {
        this(DSL.name("ClientThirdPartyCommissions"), null);
    }

    /**
     * Create an aliased <code>Cartrawler_dev_internal.dbo.ClientThirdPartyCommissions</code> table reference
     */
    public Clientthirdpartycommissions(String alias) {
        this(DSL.name(alias), CLIENTTHIRDPARTYCOMMISSIONS);
    }

    /**
     * Create an aliased <code>Cartrawler_dev_internal.dbo.ClientThirdPartyCommissions</code> table reference
     */
    public Clientthirdpartycommissions(Name alias) {
        this(alias, CLIENTTHIRDPARTYCOMMISSIONS);
    }

    private Clientthirdpartycommissions(Name alias, Table<ClientthirdpartycommissionsRecord> aliased) {
        this(alias, aliased, null);
    }

    private Clientthirdpartycommissions(Name alias, Table<ClientthirdpartycommissionsRecord> aliased, Field<?>[] parameters) {
        super(alias, null, aliased, parameters, DSL.comment(""));
    }

    public <O extends Record> Clientthirdpartycommissions(Table<O> child, ForeignKey<O, ClientthirdpartycommissionsRecord> key) {
        super(child, key, CLIENTTHIRDPARTYCOMMISSIONS);
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
        return Arrays.<Index>asList(Indexes.CLIENTTHIRDPARTYCOMMISSIONS_PK__CLIENTTH__3213E83F34E8D562);
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Identity<ClientthirdpartycommissionsRecord, Integer> getIdentity() {
        return Keys.IDENTITY_CLIENTTHIRDPARTYCOMMISSIONS;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public UniqueKey<ClientthirdpartycommissionsRecord> getPrimaryKey() {
        return Keys.PK__CLIENTTH__3213E83F34E8D562;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public List<UniqueKey<ClientthirdpartycommissionsRecord>> getKeys() {
        return Arrays.<UniqueKey<ClientthirdpartycommissionsRecord>>asList(Keys.PK__CLIENTTH__3213E83F34E8D562);
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Clientthirdpartycommissions as(String alias) {
        return new Clientthirdpartycommissions(DSL.name(alias), this);
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Clientthirdpartycommissions as(Name alias) {
        return new Clientthirdpartycommissions(alias, this);
    }

    /**
     * Rename this table
     */
    @Override
    public Clientthirdpartycommissions rename(String name) {
        return new Clientthirdpartycommissions(DSL.name(name), null);
    }

    /**
     * Rename this table
     */
    @Override
    public Clientthirdpartycommissions rename(Name name) {
        return new Clientthirdpartycommissions(name, null);
    }
}