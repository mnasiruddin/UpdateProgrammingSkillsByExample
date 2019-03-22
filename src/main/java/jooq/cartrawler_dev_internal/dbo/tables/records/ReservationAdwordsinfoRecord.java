/*
 * This file is generated by jOOQ.
 */
package jooq.cartrawler_dev_internal.dbo.tables.records;


import javax.annotation.Generated;

import jooq.cartrawler_dev_internal.dbo.tables.ReservationAdwordsinfo;

import org.jooq.Field;
import org.jooq.Record1;
import org.jooq.Record3;
import org.jooq.Row3;
import org.jooq.impl.UpdatableRecordImpl;


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
public class ReservationAdwordsinfoRecord extends UpdatableRecordImpl<ReservationAdwordsinfoRecord> implements Record3<Integer, Integer, Long> {

    private static final long serialVersionUID = -1474639779;

    /**
     * Setter for <code>Cartrawler_dev_internal.dbo.reservation_adwordsInfo.fk_reservation</code>.
     */
    public void setFkReservation(Integer value) {
        set(0, value);
    }

    /**
     * Getter for <code>Cartrawler_dev_internal.dbo.reservation_adwordsInfo.fk_reservation</code>.
     */
    public Integer getFkReservation() {
        return (Integer) get(0);
    }

    /**
     * Setter for <code>Cartrawler_dev_internal.dbo.reservation_adwordsInfo.fk_engineLoadsAdwordsInfo</code>.
     */
    public void setFkEngineloadsadwordsinfo(Integer value) {
        set(1, value);
    }

    /**
     * Getter for <code>Cartrawler_dev_internal.dbo.reservation_adwordsInfo.fk_engineLoadsAdwordsInfo</code>.
     */
    public Integer getFkEngineloadsadwordsinfo() {
        return (Integer) get(1);
    }

    /**
     * Setter for <code>Cartrawler_dev_internal.dbo.reservation_adwordsInfo.engineLoadID</code>.
     */
    public void setEngineloadid(Long value) {
        set(2, value);
    }

    /**
     * Getter for <code>Cartrawler_dev_internal.dbo.reservation_adwordsInfo.engineLoadID</code>.
     */
    public Long getEngineloadid() {
        return (Long) get(2);
    }

    // -------------------------------------------------------------------------
    // Primary key information
    // -------------------------------------------------------------------------

    /**
     * {@inheritDoc}
     */
    @Override
    public Record1<Integer> key() {
        return (Record1) super.key();
    }

    // -------------------------------------------------------------------------
    // Record3 type implementation
    // -------------------------------------------------------------------------

    /**
     * {@inheritDoc}
     */
    @Override
    public Row3<Integer, Integer, Long> fieldsRow() {
        return (Row3) super.fieldsRow();
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Row3<Integer, Integer, Long> valuesRow() {
        return (Row3) super.valuesRow();
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Field<Integer> field1() {
        return ReservationAdwordsinfo.RESERVATION_ADWORDSINFO.FK_RESERVATION;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Field<Integer> field2() {
        return ReservationAdwordsinfo.RESERVATION_ADWORDSINFO.FK_ENGINELOADSADWORDSINFO;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Field<Long> field3() {
        return ReservationAdwordsinfo.RESERVATION_ADWORDSINFO.ENGINELOADID;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Integer component1() {
        return getFkReservation();
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Integer component2() {
        return getFkEngineloadsadwordsinfo();
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Long component3() {
        return getEngineloadid();
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Integer value1() {
        return getFkReservation();
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Integer value2() {
        return getFkEngineloadsadwordsinfo();
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Long value3() {
        return getEngineloadid();
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public ReservationAdwordsinfoRecord value1(Integer value) {
        setFkReservation(value);
        return this;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public ReservationAdwordsinfoRecord value2(Integer value) {
        setFkEngineloadsadwordsinfo(value);
        return this;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public ReservationAdwordsinfoRecord value3(Long value) {
        setEngineloadid(value);
        return this;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public ReservationAdwordsinfoRecord values(Integer value1, Integer value2, Long value3) {
        value1(value1);
        value2(value2);
        value3(value3);
        return this;
    }

    // -------------------------------------------------------------------------
    // Constructors
    // -------------------------------------------------------------------------

    /**
     * Create a detached ReservationAdwordsinfoRecord
     */
    public ReservationAdwordsinfoRecord() {
        super(ReservationAdwordsinfo.RESERVATION_ADWORDSINFO);
    }

    /**
     * Create a detached, initialised ReservationAdwordsinfoRecord
     */
    public ReservationAdwordsinfoRecord(Integer fkReservation, Integer fkEngineloadsadwordsinfo, Long engineloadid) {
        super(ReservationAdwordsinfo.RESERVATION_ADWORDSINFO);

        set(0, fkReservation);
        set(1, fkEngineloadsadwordsinfo);
        set(2, engineloadid);
    }
}