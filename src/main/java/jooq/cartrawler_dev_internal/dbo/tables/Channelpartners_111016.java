/*
 * This file is generated by jOOQ.
 */
package jooq.cartrawler_dev_internal.dbo.tables;


import javax.annotation.Generated;

import jooq.cartrawler_dev_internal.dbo.Dbo;
import jooq.cartrawler_dev_internal.dbo.tables.records.Channelpartners_111016Record;

import org.jooq.Field;
import org.jooq.ForeignKey;
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
public class Channelpartners_111016 extends TableImpl<Channelpartners_111016Record> {

    private static final long serialVersionUID = -1441474092;

    /**
     * The reference instance of <code>Cartrawler_dev_internal.dbo.channelpartners_111016</code>
     */
    public static final Channelpartners_111016 CHANNELPARTNERS_111016 = new Channelpartners_111016();

    /**
     * The class holding records for this type
     */
    @Override
    public Class<Channelpartners_111016Record> getRecordType() {
        return Channelpartners_111016Record.class;
    }

    /**
     * The column <code>Cartrawler_dev_internal.dbo.channelpartners_111016.ref</code>.
     */
    public final TableField<Channelpartners_111016Record, Integer> REF = createField("ref", org.jooq.impl.SQLDataType.INTEGER.nullable(false), this, "");

    /**
     * The column <code>Cartrawler_dev_internal.dbo.channelpartners_111016.client_id</code>.
     */
    public final TableField<Channelpartners_111016Record, Integer> CLIENT_ID = createField("client_id", org.jooq.impl.SQLDataType.INTEGER.nullable(false), this, "");

    /**
     * Create a <code>Cartrawler_dev_internal.dbo.channelpartners_111016</code> table reference
     */
    public Channelpartners_111016() {
        this(DSL.name("channelpartners_111016"), null);
    }

    /**
     * Create an aliased <code>Cartrawler_dev_internal.dbo.channelpartners_111016</code> table reference
     */
    public Channelpartners_111016(String alias) {
        this(DSL.name(alias), CHANNELPARTNERS_111016);
    }

    /**
     * Create an aliased <code>Cartrawler_dev_internal.dbo.channelpartners_111016</code> table reference
     */
    public Channelpartners_111016(Name alias) {
        this(alias, CHANNELPARTNERS_111016);
    }

    private Channelpartners_111016(Name alias, Table<Channelpartners_111016Record> aliased) {
        this(alias, aliased, null);
    }

    private Channelpartners_111016(Name alias, Table<Channelpartners_111016Record> aliased, Field<?>[] parameters) {
        super(alias, null, aliased, parameters, DSL.comment(""));
    }

    public <O extends Record> Channelpartners_111016(Table<O> child, ForeignKey<O, Channelpartners_111016Record> key) {
        super(child, key, CHANNELPARTNERS_111016);
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
    public Channelpartners_111016 as(String alias) {
        return new Channelpartners_111016(DSL.name(alias), this);
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Channelpartners_111016 as(Name alias) {
        return new Channelpartners_111016(alias, this);
    }

    /**
     * Rename this table
     */
    @Override
    public Channelpartners_111016 rename(String name) {
        return new Channelpartners_111016(DSL.name(name), null);
    }

    /**
     * Rename this table
     */
    @Override
    public Channelpartners_111016 rename(Name name) {
        return new Channelpartners_111016(name, null);
    }
}