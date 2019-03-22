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
import jooq.cartrawler_dev_internal.dbo.tables.records.FlightpathRulesRecord;

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
public class FlightpathRules extends TableImpl<FlightpathRulesRecord> {

    private static final long serialVersionUID = -1248203232;

    /**
     * The reference instance of <code>Cartrawler_dev_internal.dbo.flightpath_rules</code>
     */
    public static final FlightpathRules FLIGHTPATH_RULES = new FlightpathRules();

    /**
     * The class holding records for this type
     */
    @Override
    public Class<FlightpathRulesRecord> getRecordType() {
        return FlightpathRulesRecord.class;
    }

    /**
     * The column <code>Cartrawler_dev_internal.dbo.flightpath_rules.rule_id</code>.
     */
    public final TableField<FlightpathRulesRecord, Integer> RULE_ID = createField("rule_id", org.jooq.impl.SQLDataType.INTEGER.nullable(false).identity(true), this, "");

    /**
     * The column <code>Cartrawler_dev_internal.dbo.flightpath_rules.rule_code</code>.
     */
    public final TableField<FlightpathRulesRecord, String> RULE_CODE = createField("rule_code", org.jooq.impl.SQLDataType.VARCHAR(32).nullable(false), this, "");

    /**
     * The column <code>Cartrawler_dev_internal.dbo.flightpath_rules.rule_type</code>.
     */
    public final TableField<FlightpathRulesRecord, String> RULE_TYPE = createField("rule_type", org.jooq.impl.SQLDataType.VARCHAR(1).nullable(false), this, "");

    /**
     * The column <code>Cartrawler_dev_internal.dbo.flightpath_rules.TestName</code>.
     */
    public final TableField<FlightpathRulesRecord, String> TESTNAME = createField("TestName", org.jooq.impl.SQLDataType.VARCHAR(50), this, "");

    /**
     * Create a <code>Cartrawler_dev_internal.dbo.flightpath_rules</code> table reference
     */
    public FlightpathRules() {
        this(DSL.name("flightpath_rules"), null);
    }

    /**
     * Create an aliased <code>Cartrawler_dev_internal.dbo.flightpath_rules</code> table reference
     */
    public FlightpathRules(String alias) {
        this(DSL.name(alias), FLIGHTPATH_RULES);
    }

    /**
     * Create an aliased <code>Cartrawler_dev_internal.dbo.flightpath_rules</code> table reference
     */
    public FlightpathRules(Name alias) {
        this(alias, FLIGHTPATH_RULES);
    }

    private FlightpathRules(Name alias, Table<FlightpathRulesRecord> aliased) {
        this(alias, aliased, null);
    }

    private FlightpathRules(Name alias, Table<FlightpathRulesRecord> aliased, Field<?>[] parameters) {
        super(alias, null, aliased, parameters, DSL.comment(""));
    }

    public <O extends Record> FlightpathRules(Table<O> child, ForeignKey<O, FlightpathRulesRecord> key) {
        super(child, key, FLIGHTPATH_RULES);
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
        return Arrays.<Index>asList(Indexes.FLIGHTPATH_RULES_FLIGHTPATH_RULES_RULE_ID);
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Identity<FlightpathRulesRecord, Integer> getIdentity() {
        return Keys.IDENTITY_FLIGHTPATH_RULES;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public UniqueKey<FlightpathRulesRecord> getPrimaryKey() {
        return Keys.FLIGHTPATH_RULES_RULE_ID;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public List<UniqueKey<FlightpathRulesRecord>> getKeys() {
        return Arrays.<UniqueKey<FlightpathRulesRecord>>asList(Keys.FLIGHTPATH_RULES_RULE_ID);
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public FlightpathRules as(String alias) {
        return new FlightpathRules(DSL.name(alias), this);
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public FlightpathRules as(Name alias) {
        return new FlightpathRules(alias, this);
    }

    /**
     * Rename this table
     */
    @Override
    public FlightpathRules rename(String name) {
        return new FlightpathRules(DSL.name(name), null);
    }

    /**
     * Rename this table
     */
    @Override
    public FlightpathRules rename(Name name) {
        return new FlightpathRules(name, null);
    }
}