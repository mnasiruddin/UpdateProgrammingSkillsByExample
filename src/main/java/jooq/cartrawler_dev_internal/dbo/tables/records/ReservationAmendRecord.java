/*
 * This file is generated by jOOQ.
 */
package jooq.cartrawler_dev_internal.dbo.tables.records;


import java.sql.Timestamp;

import javax.annotation.Generated;

import jooq.cartrawler_dev_internal.dbo.tables.ReservationAmend;

import org.jooq.Field;
import org.jooq.Record1;
import org.jooq.Record8;
import org.jooq.Row8;
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
public class ReservationAmendRecord extends UpdatableRecordImpl<ReservationAmendRecord> implements Record8<Integer, Integer, Integer, Integer, Timestamp, Boolean, String, String> {

    private static final long serialVersionUID = 2023140056;

    /**
     * Setter for <code>Cartrawler_dev_internal.dbo.reservation_amend.id</code>.
     */
    public void setId(Integer value) {
        set(0, value);
    }

    /**
     * Getter for <code>Cartrawler_dev_internal.dbo.reservation_amend.id</code>.
     */
    public Integer getId() {
        return (Integer) get(0);
    }

    /**
     * Setter for <code>Cartrawler_dev_internal.dbo.reservation_amend.fk_reservation</code>.
     */
    public void setFkReservation(Integer value) {
        set(1, value);
    }

    /**
     * Getter for <code>Cartrawler_dev_internal.dbo.reservation_amend.fk_reservation</code>.
     */
    public Integer getFkReservation() {
        return (Integer) get(1);
    }

    /**
     * Setter for <code>Cartrawler_dev_internal.dbo.reservation_amend.type</code>.
     */
    public void setType(Integer value) {
        set(2, value);
    }

    /**
     * Getter for <code>Cartrawler_dev_internal.dbo.reservation_amend.type</code>.
     */
    public Integer getType() {
        return (Integer) get(2);
    }

    /**
     * Setter for <code>Cartrawler_dev_internal.dbo.reservation_amend.status</code>.
     */
    public void setStatus(Integer value) {
        set(3, value);
    }

    /**
     * Getter for <code>Cartrawler_dev_internal.dbo.reservation_amend.status</code>.
     */
    public Integer getStatus() {
        return (Integer) get(3);
    }

    /**
     * Setter for <code>Cartrawler_dev_internal.dbo.reservation_amend.date</code>.
     */
    public void setDate(Timestamp value) {
        set(4, value);
    }

    /**
     * Getter for <code>Cartrawler_dev_internal.dbo.reservation_amend.date</code>.
     */
    public Timestamp getDate() {
        return (Timestamp) get(4);
    }

    /**
     * Setter for <code>Cartrawler_dev_internal.dbo.reservation_amend.agent_processed</code>.
     */
    public void setAgentProcessed(Boolean value) {
        set(5, value);
    }

    /**
     * Getter for <code>Cartrawler_dev_internal.dbo.reservation_amend.agent_processed</code>.
     */
    public Boolean getAgentProcessed() {
        return (Boolean) get(5);
    }

    /**
     * Setter for <code>Cartrawler_dev_internal.dbo.reservation_amend.clientInterface</code>.
     */
    public void setClientinterface(String value) {
        set(6, value);
    }

    /**
     * Getter for <code>Cartrawler_dev_internal.dbo.reservation_amend.clientInterface</code>.
     */
    public String getClientinterface() {
        return (String) get(6);
    }

    /**
     * Setter for <code>Cartrawler_dev_internal.dbo.reservation_amend.user_id</code>.
     */
    public void setUserId(String value) {
        set(7, value);
    }

    /**
     * Getter for <code>Cartrawler_dev_internal.dbo.reservation_amend.user_id</code>.
     */
    public String getUserId() {
        return (String) get(7);
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
    // Record8 type implementation
    // -------------------------------------------------------------------------

    /**
     * {@inheritDoc}
     */
    @Override
    public Row8<Integer, Integer, Integer, Integer, Timestamp, Boolean, String, String> fieldsRow() {
        return (Row8) super.fieldsRow();
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Row8<Integer, Integer, Integer, Integer, Timestamp, Boolean, String, String> valuesRow() {
        return (Row8) super.valuesRow();
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Field<Integer> field1() {
        return ReservationAmend.RESERVATION_AMEND.ID;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Field<Integer> field2() {
        return ReservationAmend.RESERVATION_AMEND.FK_RESERVATION;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Field<Integer> field3() {
        return ReservationAmend.RESERVATION_AMEND.TYPE;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Field<Integer> field4() {
        return ReservationAmend.RESERVATION_AMEND.STATUS;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Field<Timestamp> field5() {
        return ReservationAmend.RESERVATION_AMEND.DATE;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Field<Boolean> field6() {
        return ReservationAmend.RESERVATION_AMEND.AGENT_PROCESSED;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Field<String> field7() {
        return ReservationAmend.RESERVATION_AMEND.CLIENTINTERFACE;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Field<String> field8() {
        return ReservationAmend.RESERVATION_AMEND.USER_ID;
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
        return getFkReservation();
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Integer component3() {
        return getType();
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Integer component4() {
        return getStatus();
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Timestamp component5() {
        return getDate();
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Boolean component6() {
        return getAgentProcessed();
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public String component7() {
        return getClientinterface();
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public String component8() {
        return getUserId();
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
        return getFkReservation();
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Integer value3() {
        return getType();
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Integer value4() {
        return getStatus();
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Timestamp value5() {
        return getDate();
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Boolean value6() {
        return getAgentProcessed();
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public String value7() {
        return getClientinterface();
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public String value8() {
        return getUserId();
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public ReservationAmendRecord value1(Integer value) {
        setId(value);
        return this;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public ReservationAmendRecord value2(Integer value) {
        setFkReservation(value);
        return this;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public ReservationAmendRecord value3(Integer value) {
        setType(value);
        return this;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public ReservationAmendRecord value4(Integer value) {
        setStatus(value);
        return this;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public ReservationAmendRecord value5(Timestamp value) {
        setDate(value);
        return this;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public ReservationAmendRecord value6(Boolean value) {
        setAgentProcessed(value);
        return this;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public ReservationAmendRecord value7(String value) {
        setClientinterface(value);
        return this;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public ReservationAmendRecord value8(String value) {
        setUserId(value);
        return this;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public ReservationAmendRecord values(Integer value1, Integer value2, Integer value3, Integer value4, Timestamp value5, Boolean value6, String value7, String value8) {
        value1(value1);
        value2(value2);
        value3(value3);
        value4(value4);
        value5(value5);
        value6(value6);
        value7(value7);
        value8(value8);
        return this;
    }

    // -------------------------------------------------------------------------
    // Constructors
    // -------------------------------------------------------------------------

    /**
     * Create a detached ReservationAmendRecord
     */
    public ReservationAmendRecord() {
        super(ReservationAmend.RESERVATION_AMEND);
    }

    /**
     * Create a detached, initialised ReservationAmendRecord
     */
    public ReservationAmendRecord(Integer id, Integer fkReservation, Integer type, Integer status, Timestamp date, Boolean agentProcessed, String clientinterface, String userId) {
        super(ReservationAmend.RESERVATION_AMEND);

        set(0, id);
        set(1, fkReservation);
        set(2, type);
        set(3, status);
        set(4, date);
        set(5, agentProcessed);
        set(6, clientinterface);
        set(7, userId);
    }
}