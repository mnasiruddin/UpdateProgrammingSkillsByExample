/*
 * This file is generated by jOOQ.
 */
package jooq.cartrawler_dev_internal.dbo.tables;


import java.util.Arrays;
import java.util.List;
import java.util.UUID;

import javax.annotation.Generated;

import jooq.cartrawler_dev_internal.dbo.Dbo;
import jooq.cartrawler_dev_internal.dbo.Indexes;
import jooq.cartrawler_dev_internal.dbo.Keys;
import jooq.cartrawler_dev_internal.dbo.tables.records.ReservationConditionsRecord;

import org.jooq.Field;
import org.jooq.ForeignKey;
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
public class ReservationConditions extends TableImpl<ReservationConditionsRecord> {

    private static final long serialVersionUID = 644544085;

    /**
     * The reference instance of <code>Cartrawler_dev_internal.dbo.reservation_conditions</code>
     */
    public static final ReservationConditions RESERVATION_CONDITIONS = new ReservationConditions();

    /**
     * The class holding records for this type
     */
    @Override
    public Class<ReservationConditionsRecord> getRecordType() {
        return ReservationConditionsRecord.class;
    }

    /**
     * The column <code>Cartrawler_dev_internal.dbo.reservation_conditions.guid</code>.
     */
    public final TableField<ReservationConditionsRecord, UUID> GUID = createField("guid", org.jooq.impl.SQLDataType.UUID.nullable(false).defaultValue(org.jooq.impl.DSL.field("(newid())", org.jooq.impl.SQLDataType.UUID)), this, "");

    /**
     * The column <code>Cartrawler_dev_internal.dbo.reservation_conditions.fk_reservation</code>.
     */
    public final TableField<ReservationConditionsRecord, Integer> FK_RESERVATION = createField("fk_reservation", org.jooq.impl.SQLDataType.INTEGER.nullable(false), this, "");

    /**
     * The column <code>Cartrawler_dev_internal.dbo.reservation_conditions.order</code>.
     */
    public final TableField<ReservationConditionsRecord, Integer> ORDER = createField("order", org.jooq.impl.SQLDataType.INTEGER.nullable(false), this, "");

    /**
     * The column <code>Cartrawler_dev_internal.dbo.reservation_conditions.summary</code>.
     */
    public final TableField<ReservationConditionsRecord, Boolean> SUMMARY = createField("summary", org.jooq.impl.SQLDataType.BIT.nullable(false), this, "");

    /**
     * The column <code>Cartrawler_dev_internal.dbo.reservation_conditions.lang</code>.
     */
    public final TableField<ReservationConditionsRecord, String> LANG = createField("lang", org.jooq.impl.SQLDataType.CHAR(5), this, "");

    /**
     * The column <code>Cartrawler_dev_internal.dbo.reservation_conditions.titleHash</code>.
     */
    public final TableField<ReservationConditionsRecord, String> TITLEHASH = createField("titleHash", org.jooq.impl.SQLDataType.VARCHAR(40).nullable(false), this, "");

    /**
     * The column <code>Cartrawler_dev_internal.dbo.reservation_conditions.textHash</code>.
     */
    public final TableField<ReservationConditionsRecord, String> TEXTHASH = createField("textHash", org.jooq.impl.SQLDataType.VARCHAR(40).nullable(false), this, "");

    /**
     * The column <code>Cartrawler_dev_internal.dbo.reservation_conditions.titleNameId</code>.
     */
    public final TableField<ReservationConditionsRecord, Integer> TITLENAMEID = createField("titleNameId", org.jooq.impl.SQLDataType.INTEGER, this, "");

    /**
     * Create a <code>Cartrawler_dev_internal.dbo.reservation_conditions</code> table reference
     */
    public ReservationConditions() {
        this(DSL.name("reservation_conditions"), null);
    }

    /**
     * Create an aliased <code>Cartrawler_dev_internal.dbo.reservation_conditions</code> table reference
     */
    public ReservationConditions(String alias) {
        this(DSL.name(alias), RESERVATION_CONDITIONS);
    }

    /**
     * Create an aliased <code>Cartrawler_dev_internal.dbo.reservation_conditions</code> table reference
     */
    public ReservationConditions(Name alias) {
        this(alias, RESERVATION_CONDITIONS);
    }

    private ReservationConditions(Name alias, Table<ReservationConditionsRecord> aliased) {
        this(alias, aliased, null);
    }

    private ReservationConditions(Name alias, Table<ReservationConditionsRecord> aliased, Field<?>[] parameters) {
        super(alias, null, aliased, parameters, DSL.comment(""));
    }

    public <O extends Record> ReservationConditions(Table<O> child, ForeignKey<O, ReservationConditionsRecord> key) {
        super(child, key, RESERVATION_CONDITIONS);
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
        return Arrays.<Index>asList(Indexes.RESERVATION_CONDITIONS_PK_RESERVATION_CONDITIONS);
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public UniqueKey<ReservationConditionsRecord> getPrimaryKey() {
        return Keys.PK_RESERVATION_CONDITIONS;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public List<UniqueKey<ReservationConditionsRecord>> getKeys() {
        return Arrays.<UniqueKey<ReservationConditionsRecord>>asList(Keys.PK_RESERVATION_CONDITIONS);
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public ReservationConditions as(String alias) {
        return new ReservationConditions(DSL.name(alias), this);
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public ReservationConditions as(Name alias) {
        return new ReservationConditions(alias, this);
    }

    /**
     * Rename this table
     */
    @Override
    public ReservationConditions rename(String name) {
        return new ReservationConditions(DSL.name(name), null);
    }

    /**
     * Rename this table
     */
    @Override
    public ReservationConditions rename(Name name) {
        return new ReservationConditions(name, null);
    }
}