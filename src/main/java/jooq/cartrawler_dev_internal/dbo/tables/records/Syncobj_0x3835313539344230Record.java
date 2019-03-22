/*
 * This file is generated by jOOQ.
 */
package jooq.cartrawler_dev_internal.dbo.tables.records;


import javax.annotation.Generated;

import jooq.cartrawler_dev_internal.dbo.tables.Syncobj_0x3835313539344230;

import org.jooq.Field;
import org.jooq.Record4;
import org.jooq.Row4;
import org.jooq.impl.TableRecordImpl;


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
public class Syncobj_0x3835313539344230Record extends TableRecordImpl<Syncobj_0x3835313539344230Record> implements Record4<Integer, String, Boolean, String> {

    private static final long serialVersionUID = -1221448946;

    /**
     * Setter for <code>Cartrawler_dev_internal.dbo.syncobj_0x3835313539344230.pk_id</code>.
     */
    public void setPkId(Integer value) {
        set(0, value);
    }

    /**
     * Getter for <code>Cartrawler_dev_internal.dbo.syncobj_0x3835313539344230.pk_id</code>.
     */
    public Integer getPkId() {
        return (Integer) get(0);
    }

    /**
     * Setter for <code>Cartrawler_dev_internal.dbo.syncobj_0x3835313539344230.Reservation_Status</code>.
     */
    public void setReservationStatus(String value) {
        set(1, value);
    }

    /**
     * Getter for <code>Cartrawler_dev_internal.dbo.syncobj_0x3835313539344230.Reservation_Status</code>.
     */
    public String getReservationStatus() {
        return (String) get(1);
    }

    /**
     * Setter for <code>Cartrawler_dev_internal.dbo.syncobj_0x3835313539344230.Complete</code>.
     */
    public void setComplete(Boolean value) {
        set(2, value);
    }

    /**
     * Getter for <code>Cartrawler_dev_internal.dbo.syncobj_0x3835313539344230.Complete</code>.
     */
    public Boolean getComplete() {
        return (Boolean) get(2);
    }

    /**
     * Setter for <code>Cartrawler_dev_internal.dbo.syncobj_0x3835313539344230.ResStatus</code>.
     */
    public void setResstatus(String value) {
        set(3, value);
    }

    /**
     * Getter for <code>Cartrawler_dev_internal.dbo.syncobj_0x3835313539344230.ResStatus</code>.
     */
    public String getResstatus() {
        return (String) get(3);
    }

    // -------------------------------------------------------------------------
    // Record4 type implementation
    // -------------------------------------------------------------------------

    /**
     * {@inheritDoc}
     */
    @Override
    public Row4<Integer, String, Boolean, String> fieldsRow() {
        return (Row4) super.fieldsRow();
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Row4<Integer, String, Boolean, String> valuesRow() {
        return (Row4) super.valuesRow();
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Field<Integer> field1() {
        return Syncobj_0x3835313539344230.SYNCOBJ_0X3835313539344230.PK_ID;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Field<String> field2() {
        return Syncobj_0x3835313539344230.SYNCOBJ_0X3835313539344230.RESERVATION_STATUS;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Field<Boolean> field3() {
        return Syncobj_0x3835313539344230.SYNCOBJ_0X3835313539344230.COMPLETE;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Field<String> field4() {
        return Syncobj_0x3835313539344230.SYNCOBJ_0X3835313539344230.RESSTATUS;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Integer component1() {
        return getPkId();
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public String component2() {
        return getReservationStatus();
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Boolean component3() {
        return getComplete();
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public String component4() {
        return getResstatus();
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Integer value1() {
        return getPkId();
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public String value2() {
        return getReservationStatus();
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Boolean value3() {
        return getComplete();
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public String value4() {
        return getResstatus();
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Syncobj_0x3835313539344230Record value1(Integer value) {
        setPkId(value);
        return this;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Syncobj_0x3835313539344230Record value2(String value) {
        setReservationStatus(value);
        return this;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Syncobj_0x3835313539344230Record value3(Boolean value) {
        setComplete(value);
        return this;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Syncobj_0x3835313539344230Record value4(String value) {
        setResstatus(value);
        return this;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Syncobj_0x3835313539344230Record values(Integer value1, String value2, Boolean value3, String value4) {
        value1(value1);
        value2(value2);
        value3(value3);
        value4(value4);
        return this;
    }

    // -------------------------------------------------------------------------
    // Constructors
    // -------------------------------------------------------------------------

    /**
     * Create a detached Syncobj_0x3835313539344230Record
     */
    public Syncobj_0x3835313539344230Record() {
        super(Syncobj_0x3835313539344230.SYNCOBJ_0X3835313539344230);
    }

    /**
     * Create a detached, initialised Syncobj_0x3835313539344230Record
     */
    public Syncobj_0x3835313539344230Record(Integer pkId, String reservationStatus, Boolean complete, String resstatus) {
        super(Syncobj_0x3835313539344230.SYNCOBJ_0X3835313539344230);

        set(0, pkId);
        set(1, reservationStatus);
        set(2, complete);
        set(3, resstatus);
    }
}