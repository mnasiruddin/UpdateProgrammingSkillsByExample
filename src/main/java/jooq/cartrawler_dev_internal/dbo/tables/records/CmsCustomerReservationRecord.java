/*
 * This file is generated by jOOQ.
 */
package jooq.cartrawler_dev_internal.dbo.tables.records;


import java.sql.Timestamp;

import javax.annotation.Generated;

import jooq.cartrawler_dev_internal.dbo.tables.CmsCustomerReservation;

import org.jooq.Field;
import org.jooq.Record1;
import org.jooq.Record4;
import org.jooq.Row4;
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
public class CmsCustomerReservationRecord extends UpdatableRecordImpl<CmsCustomerReservationRecord> implements Record4<Integer, Integer, Integer, Timestamp> {

    private static final long serialVersionUID = 1861828008;

    /**
     * Setter for <code>Cartrawler_dev_internal.dbo.cms_customer_reservation.id</code>.
     */
    public void setId(Integer value) {
        set(0, value);
    }

    /**
     * Getter for <code>Cartrawler_dev_internal.dbo.cms_customer_reservation.id</code>.
     */
    public Integer getId() {
        return (Integer) get(0);
    }

    /**
     * Setter for <code>Cartrawler_dev_internal.dbo.cms_customer_reservation.fk_cms_customer_index</code>.
     */
    public void setFkCmsCustomerIndex(Integer value) {
        set(1, value);
    }

    /**
     * Getter for <code>Cartrawler_dev_internal.dbo.cms_customer_reservation.fk_cms_customer_index</code>.
     */
    public Integer getFkCmsCustomerIndex() {
        return (Integer) get(1);
    }

    /**
     * Setter for <code>Cartrawler_dev_internal.dbo.cms_customer_reservation.fk_reservation</code>.
     */
    public void setFkReservation(Integer value) {
        set(2, value);
    }

    /**
     * Getter for <code>Cartrawler_dev_internal.dbo.cms_customer_reservation.fk_reservation</code>.
     */
    public Integer getFkReservation() {
        return (Integer) get(2);
    }

    /**
     * Setter for <code>Cartrawler_dev_internal.dbo.cms_customer_reservation.created_date</code>.
     */
    public void setCreatedDate(Timestamp value) {
        set(3, value);
    }

    /**
     * Getter for <code>Cartrawler_dev_internal.dbo.cms_customer_reservation.created_date</code>.
     */
    public Timestamp getCreatedDate() {
        return (Timestamp) get(3);
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
    // Record4 type implementation
    // -------------------------------------------------------------------------

    /**
     * {@inheritDoc}
     */
    @Override
    public Row4<Integer, Integer, Integer, Timestamp> fieldsRow() {
        return (Row4) super.fieldsRow();
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Row4<Integer, Integer, Integer, Timestamp> valuesRow() {
        return (Row4) super.valuesRow();
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Field<Integer> field1() {
        return CmsCustomerReservation.CMS_CUSTOMER_RESERVATION.ID;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Field<Integer> field2() {
        return CmsCustomerReservation.CMS_CUSTOMER_RESERVATION.FK_CMS_CUSTOMER_INDEX;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Field<Integer> field3() {
        return CmsCustomerReservation.CMS_CUSTOMER_RESERVATION.FK_RESERVATION;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Field<Timestamp> field4() {
        return CmsCustomerReservation.CMS_CUSTOMER_RESERVATION.CREATED_DATE;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Integer component1() {
        return getId();
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Integer component2() {
        return getFkCmsCustomerIndex();
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Integer component3() {
        return getFkReservation();
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Timestamp component4() {
        return getCreatedDate();
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Integer value1() {
        return getId();
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Integer value2() {
        return getFkCmsCustomerIndex();
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Integer value3() {
        return getFkReservation();
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Timestamp value4() {
        return getCreatedDate();
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public CmsCustomerReservationRecord value1(Integer value) {
        setId(value);
        return this;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public CmsCustomerReservationRecord value2(Integer value) {
        setFkCmsCustomerIndex(value);
        return this;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public CmsCustomerReservationRecord value3(Integer value) {
        setFkReservation(value);
        return this;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public CmsCustomerReservationRecord value4(Timestamp value) {
        setCreatedDate(value);
        return this;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public CmsCustomerReservationRecord values(Integer value1, Integer value2, Integer value3, Timestamp value4) {
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
     * Create a detached CmsCustomerReservationRecord
     */
    public CmsCustomerReservationRecord() {
        super(CmsCustomerReservation.CMS_CUSTOMER_RESERVATION);
    }

    /**
     * Create a detached, initialised CmsCustomerReservationRecord
     */
    public CmsCustomerReservationRecord(Integer id, Integer fkCmsCustomerIndex, Integer fkReservation, Timestamp createdDate) {
        super(CmsCustomerReservation.CMS_CUSTOMER_RESERVATION);

        set(0, id);
        set(1, fkCmsCustomerIndex);
        set(2, fkReservation);
        set(3, createdDate);
    }
}