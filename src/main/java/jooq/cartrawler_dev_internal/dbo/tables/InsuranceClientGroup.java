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
import jooq.cartrawler_dev_internal.dbo.tables.records.InsuranceClientGroupRecord;

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
public class InsuranceClientGroup extends TableImpl<InsuranceClientGroupRecord> {

    private static final long serialVersionUID = -452521066;

    /**
     * The reference instance of <code>Cartrawler_dev_internal.dbo.insurance_client_group</code>
     */
    public static final InsuranceClientGroup INSURANCE_CLIENT_GROUP = new InsuranceClientGroup();

    /**
     * The class holding records for this type
     */
    @Override
    public Class<InsuranceClientGroupRecord> getRecordType() {
        return InsuranceClientGroupRecord.class;
    }

    /**
     * The column <code>Cartrawler_dev_internal.dbo.insurance_client_group.id</code>.
     */
    public final TableField<InsuranceClientGroupRecord, Integer> ID = createField("id", org.jooq.impl.SQLDataType.INTEGER.nullable(false).identity(true), this, "");

    /**
     * The column <code>Cartrawler_dev_internal.dbo.insurance_client_group.tag</code>.
     */
    public final TableField<InsuranceClientGroupRecord, String> TAG = createField("tag", org.jooq.impl.SQLDataType.VARCHAR(100), this, "");

    /**
     * Create a <code>Cartrawler_dev_internal.dbo.insurance_client_group</code> table reference
     */
    public InsuranceClientGroup() {
        this(DSL.name("insurance_client_group"), null);
    }

    /**
     * Create an aliased <code>Cartrawler_dev_internal.dbo.insurance_client_group</code> table reference
     */
    public InsuranceClientGroup(String alias) {
        this(DSL.name(alias), INSURANCE_CLIENT_GROUP);
    }

    /**
     * Create an aliased <code>Cartrawler_dev_internal.dbo.insurance_client_group</code> table reference
     */
    public InsuranceClientGroup(Name alias) {
        this(alias, INSURANCE_CLIENT_GROUP);
    }

    private InsuranceClientGroup(Name alias, Table<InsuranceClientGroupRecord> aliased) {
        this(alias, aliased, null);
    }

    private InsuranceClientGroup(Name alias, Table<InsuranceClientGroupRecord> aliased, Field<?>[] parameters) {
        super(alias, null, aliased, parameters, DSL.comment(""));
    }

    public <O extends Record> InsuranceClientGroup(Table<O> child, ForeignKey<O, InsuranceClientGroupRecord> key) {
        super(child, key, INSURANCE_CLIENT_GROUP);
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
        return Arrays.<Index>asList(Indexes.INSURANCE_CLIENT_GROUP_PK__INSURANC__3213E83F787D80BC);
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Identity<InsuranceClientGroupRecord, Integer> getIdentity() {
        return Keys.IDENTITY_INSURANCE_CLIENT_GROUP;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public UniqueKey<InsuranceClientGroupRecord> getPrimaryKey() {
        return Keys.PK__INSURANC__3213E83F787D80BC;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public List<UniqueKey<InsuranceClientGroupRecord>> getKeys() {
        return Arrays.<UniqueKey<InsuranceClientGroupRecord>>asList(Keys.PK__INSURANC__3213E83F787D80BC);
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public InsuranceClientGroup as(String alias) {
        return new InsuranceClientGroup(DSL.name(alias), this);
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public InsuranceClientGroup as(Name alias) {
        return new InsuranceClientGroup(alias, this);
    }

    /**
     * Rename this table
     */
    @Override
    public InsuranceClientGroup rename(String name) {
        return new InsuranceClientGroup(DSL.name(name), null);
    }

    /**
     * Rename this table
     */
    @Override
    public InsuranceClientGroup rename(Name name) {
        return new InsuranceClientGroup(name, null);
    }
}