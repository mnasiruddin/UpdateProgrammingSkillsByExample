/*
 * This file is generated by jOOQ.
 */
package jooq.cartrawler_dev_internal.dbo.tables;


import java.sql.Timestamp;
import java.util.Arrays;
import java.util.List;

import javax.annotation.Generated;

import jooq.cartrawler_dev_internal.dbo.Dbo;
import jooq.cartrawler_dev_internal.dbo.Indexes;
import jooq.cartrawler_dev_internal.dbo.Keys;
import jooq.cartrawler_dev_internal.dbo.tables.records.ReservationAmendRecord;

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
public class ReservationAmend extends TableImpl<ReservationAmendRecord> {

    private static final long serialVersionUID = -465958368;

    /**
     * The reference instance of <code>Cartrawler_dev_internal.dbo.reservation_amend</code>
     */
    public static final ReservationAmend RESERVATION_AMEND = new ReservationAmend();

    /**
     * The class holding records for this type
     */
    @Override
    public Class<ReservationAmendRecord> getRecordType() {
        return ReservationAmendRecord.class;
    }

    /**
     * The column <code>Cartrawler_dev_internal.dbo.reservation_amend.id</code>.
     */
    public final TableField<ReservationAmendRecord, Integer> ID = createField("id", org.jooq.impl.SQLDataType.INTEGER.nullable(false).identity(true), this, "");

    /**
     * The column <code>Cartrawler_dev_internal.dbo.reservation_amend.fk_reservation</code>.
     */
    public final TableField<ReservationAmendRecord, Integer> FK_RESERVATION = createField("fk_reservation", org.jooq.impl.SQLDataType.INTEGER, this, "");

    /**
     * The column <code>Cartrawler_dev_internal.dbo.reservation_amend.type</code>.
     */
    public final TableField<ReservationAmendRecord, Integer> TYPE = createField("type", org.jooq.impl.SQLDataType.INTEGER, this, "");

    /**
     * The column <code>Cartrawler_dev_internal.dbo.reservation_amend.status</code>.
     */
    public final TableField<ReservationAmendRecord, Integer> STATUS = createField("status", org.jooq.impl.SQLDataType.INTEGER, this, "");

    /**
     * The column <code>Cartrawler_dev_internal.dbo.reservation_amend.date</code>.
     */
    public final TableField<ReservationAmendRecord, Timestamp> DATE = createField("date", org.jooq.impl.SQLDataType.TIMESTAMP, this, "");

    /**
     * The column <code>Cartrawler_dev_internal.dbo.reservation_amend.agent_processed</code>.
     */
    public final TableField<ReservationAmendRecord, Boolean> AGENT_PROCESSED = createField("agent_processed", org.jooq.impl.SQLDataType.BIT, this, "");

    /**
     * The column <code>Cartrawler_dev_internal.dbo.reservation_amend.clientInterface</code>.
     */
    public final TableField<ReservationAmendRecord, String> CLIENTINTERFACE = createField("clientInterface", org.jooq.impl.SQLDataType.CHAR(2), this, "");

    /**
     * The column <code>Cartrawler_dev_internal.dbo.reservation_amend.user_id</code>.
     */
    public final TableField<ReservationAmendRecord, String> USER_ID = createField("user_id", org.jooq.impl.SQLDataType.VARCHAR(50), this, "");

    /**
     * Create a <code>Cartrawler_dev_internal.dbo.reservation_amend</code> table reference
     */
    public ReservationAmend() {
        this(DSL.name("reservation_amend"), null);
    }

    /**
     * Create an aliased <code>Cartrawler_dev_internal.dbo.reservation_amend</code> table reference
     */
    public ReservationAmend(String alias) {
        this(DSL.name(alias), RESERVATION_AMEND);
    }

    /**
     * Create an aliased <code>Cartrawler_dev_internal.dbo.reservation_amend</code> table reference
     */
    public ReservationAmend(Name alias) {
        this(alias, RESERVATION_AMEND);
    }

    private ReservationAmend(Name alias, Table<ReservationAmendRecord> aliased) {
        this(alias, aliased, null);
    }

    private ReservationAmend(Name alias, Table<ReservationAmendRecord> aliased, Field<?>[] parameters) {
        super(alias, null, aliased, parameters, DSL.comment(""));
    }

    public <O extends Record> ReservationAmend(Table<O> child, ForeignKey<O, ReservationAmendRecord> key) {
        super(child, key, RESERVATION_AMEND);
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
        return Arrays.<Index>asList(Indexes.RESERVATION_AMEND_PK_RESERVATION_AMEND);
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Identity<ReservationAmendRecord, Integer> getIdentity() {
        return Keys.IDENTITY_RESERVATION_AMEND;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public UniqueKey<ReservationAmendRecord> getPrimaryKey() {
        return Keys.PK_RESERVATION_AMEND;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public List<UniqueKey<ReservationAmendRecord>> getKeys() {
        return Arrays.<UniqueKey<ReservationAmendRecord>>asList(Keys.PK_RESERVATION_AMEND);
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public ReservationAmend as(String alias) {
        return new ReservationAmend(DSL.name(alias), this);
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public ReservationAmend as(Name alias) {
        return new ReservationAmend(alias, this);
    }

    /**
     * Rename this table
     */
    @Override
    public ReservationAmend rename(String name) {
        return new ReservationAmend(DSL.name(name), null);
    }

    /**
     * Rename this table
     */
    @Override
    public ReservationAmend rename(Name name) {
        return new ReservationAmend(name, null);
    }
}