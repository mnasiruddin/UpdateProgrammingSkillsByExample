/*
 * This file is generated by jOOQ.
 */
package jooq.cartrawler_dev_internal.dbo.tables;


import java.util.UUID;

import javax.annotation.Generated;

import jooq.cartrawler_dev_internal.dbo.Dbo;
import jooq.cartrawler_dev_internal.dbo.Keys;
import jooq.cartrawler_dev_internal.dbo.tables.records.Plan_111016Record;

import org.jooq.Field;
import org.jooq.ForeignKey;
import org.jooq.Identity;
import org.jooq.Name;
import org.jooq.Record;
import org.jooq.Schema;
import org.jooq.Table;
import org.jooq.TableField;
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
public class Plan_111016 extends TableImpl<Plan_111016Record> {

    private static final long serialVersionUID = 1538379847;

    /**
     * The reference instance of <code>Cartrawler_dev_internal.dbo.plan_111016</code>
     */
    public static final Plan_111016 PLAN_111016 = new Plan_111016();

    /**
     * The class holding records for this type
     */
    @Override
    public Class<Plan_111016Record> getRecordType() {
        return Plan_111016Record.class;
    }

    /**
     * The column <code>Cartrawler_dev_internal.dbo.plan_111016.guid</code>.
     */
    public final TableField<Plan_111016Record, UUID> GUID = createField("guid", org.jooq.impl.SQLDataType.UUID.nullable(false), this, "");

    /**
     * The column <code>Cartrawler_dev_internal.dbo.plan_111016.ID</code>.
     */
    public final TableField<Plan_111016Record, Integer> ID = createField("ID", org.jooq.impl.SQLDataType.INTEGER.nullable(false).identity(true), this, "");

    /**
     * The column <code>Cartrawler_dev_internal.dbo.plan_111016.name</code>.
     */
    public final TableField<Plan_111016Record, String> NAME = createField("name", org.jooq.impl.SQLDataType.VARCHAR(128).nullable(false), this, "");

    /**
     * The column <code>Cartrawler_dev_internal.dbo.plan_111016.msTimeout</code>.
     */
    public final TableField<Plan_111016Record, Integer> MSTIMEOUT = createField("msTimeout", org.jooq.impl.SQLDataType.INTEGER, this, "");

    /**
     * The column <code>Cartrawler_dev_internal.dbo.plan_111016.amendedBy</code>.
     */
    public final TableField<Plan_111016Record, Integer> AMENDEDBY = createField("amendedBy", org.jooq.impl.SQLDataType.INTEGER, this, "");

    /**
     * The column <code>Cartrawler_dev_internal.dbo.plan_111016.flexiUp</code>.
     */
    public final TableField<Plan_111016Record, Boolean> FLEXIUP = createField("flexiUp", org.jooq.impl.SQLDataType.BIT, this, "");

    /**
     * Create a <code>Cartrawler_dev_internal.dbo.plan_111016</code> table reference
     */
    public Plan_111016() {
        this(DSL.name("plan_111016"), null);
    }

    /**
     * Create an aliased <code>Cartrawler_dev_internal.dbo.plan_111016</code> table reference
     */
    public Plan_111016(String alias) {
        this(DSL.name(alias), PLAN_111016);
    }

    /**
     * Create an aliased <code>Cartrawler_dev_internal.dbo.plan_111016</code> table reference
     */
    public Plan_111016(Name alias) {
        this(alias, PLAN_111016);
    }

    private Plan_111016(Name alias, Table<Plan_111016Record> aliased) {
        this(alias, aliased, null);
    }

    private Plan_111016(Name alias, Table<Plan_111016Record> aliased, Field<?>[] parameters) {
        super(alias, null, aliased, parameters, DSL.comment(""));
    }

    public <O extends Record> Plan_111016(Table<O> child, ForeignKey<O, Plan_111016Record> key) {
        super(child, key, PLAN_111016);
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
    public Identity<Plan_111016Record, Integer> getIdentity() {
        return Keys.IDENTITY_PLAN_111016;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Plan_111016 as(String alias) {
        return new Plan_111016(DSL.name(alias), this);
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Plan_111016 as(Name alias) {
        return new Plan_111016(alias, this);
    }

    /**
     * Rename this table
     */
    @Override
    public Plan_111016 rename(String name) {
        return new Plan_111016(DSL.name(name), null);
    }

    /**
     * Rename this table
     */
    @Override
    public Plan_111016 rename(Name name) {
        return new Plan_111016(name, null);
    }
}