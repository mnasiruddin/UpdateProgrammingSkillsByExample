/*
 * This file is generated by jOOQ.
 */
package jooq.cartrawler_dev_internal.dbo.tables.records;


import java.util.UUID;

import javax.annotation.Generated;

import jooq.cartrawler_dev_internal.dbo.tables.Bulkpricerstatus;

import org.jooq.Field;
import org.jooq.Record1;
import org.jooq.Record7;
import org.jooq.Row7;
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
public class BulkpricerstatusRecord extends UpdatableRecordImpl<BulkpricerstatusRecord> implements Record7<UUID, Long, Long, Integer, Long, String, Integer> {

    private static final long serialVersionUID = 196469173;

    /**
     * Setter for <code>Cartrawler_dev_internal.dbo.bulkPricerStatus.guid</code>.
     */
    public void setGuid(UUID value) {
        set(0, value);
    }

    /**
     * Getter for <code>Cartrawler_dev_internal.dbo.bulkPricerStatus.guid</code>.
     */
    public UUID getGuid() {
        return (UUID) get(0);
    }

    /**
     * Setter for <code>Cartrawler_dev_internal.dbo.bulkPricerStatus.totalMemory</code>.
     */
    public void setTotalmemory(Long value) {
        set(1, value);
    }

    /**
     * Getter for <code>Cartrawler_dev_internal.dbo.bulkPricerStatus.totalMemory</code>.
     */
    public Long getTotalmemory() {
        return (Long) get(1);
    }

    /**
     * Setter for <code>Cartrawler_dev_internal.dbo.bulkPricerStatus.freeMemory</code>.
     */
    public void setFreememory(Long value) {
        set(2, value);
    }

    /**
     * Getter for <code>Cartrawler_dev_internal.dbo.bulkPricerStatus.freeMemory</code>.
     */
    public Long getFreememory() {
        return (Long) get(2);
    }

    /**
     * Setter for <code>Cartrawler_dev_internal.dbo.bulkPricerStatus.bytesPerSec</code>.
     */
    public void setBytespersec(Integer value) {
        set(3, value);
    }

    /**
     * Getter for <code>Cartrawler_dev_internal.dbo.bulkPricerStatus.bytesPerSec</code>.
     */
    public Integer getBytespersec() {
        return (Integer) get(3);
    }

    /**
     * Setter for <code>Cartrawler_dev_internal.dbo.bulkPricerStatus.maxMemory</code>.
     */
    public void setMaxmemory(Long value) {
        set(4, value);
    }

    /**
     * Getter for <code>Cartrawler_dev_internal.dbo.bulkPricerStatus.maxMemory</code>.
     */
    public Long getMaxmemory() {
        return (Long) get(4);
    }

    /**
     * Setter for <code>Cartrawler_dev_internal.dbo.bulkPricerStatus.message</code>.
     */
    public void setMessage(String value) {
        set(5, value);
    }

    /**
     * Getter for <code>Cartrawler_dev_internal.dbo.bulkPricerStatus.message</code>.
     */
    public String getMessage() {
        return (String) get(5);
    }

    /**
     * Setter for <code>Cartrawler_dev_internal.dbo.bulkPricerStatus.jobsAlive</code>.
     */
    public void setJobsalive(Integer value) {
        set(6, value);
    }

    /**
     * Getter for <code>Cartrawler_dev_internal.dbo.bulkPricerStatus.jobsAlive</code>.
     */
    public Integer getJobsalive() {
        return (Integer) get(6);
    }

    // -------------------------------------------------------------------------
    // Primary key information
    // -------------------------------------------------------------------------

    /**
     * {@inheritDoc}
     */
    @Override
    public Record1<UUID> key() {
        return (Record1) super.key();
    }

    // -------------------------------------------------------------------------
    // Record7 type implementation
    // -------------------------------------------------------------------------

    /**
     * {@inheritDoc}
     */
    @Override
    public Row7<UUID, Long, Long, Integer, Long, String, Integer> fieldsRow() {
        return (Row7) super.fieldsRow();
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Row7<UUID, Long, Long, Integer, Long, String, Integer> valuesRow() {
        return (Row7) super.valuesRow();
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Field<UUID> field1() {
        return Bulkpricerstatus.BULKPRICERSTATUS.GUID;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Field<Long> field2() {
        return Bulkpricerstatus.BULKPRICERSTATUS.TOTALMEMORY;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Field<Long> field3() {
        return Bulkpricerstatus.BULKPRICERSTATUS.FREEMEMORY;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Field<Integer> field4() {
        return Bulkpricerstatus.BULKPRICERSTATUS.BYTESPERSEC;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Field<Long> field5() {
        return Bulkpricerstatus.BULKPRICERSTATUS.MAXMEMORY;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Field<String> field6() {
        return Bulkpricerstatus.BULKPRICERSTATUS.MESSAGE;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Field<Integer> field7() {
        return Bulkpricerstatus.BULKPRICERSTATUS.JOBSALIVE;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public UUID component1() {
        return getGuid();
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Long component2() {
        return getTotalmemory();
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Long component3() {
        return getFreememory();
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Integer component4() {
        return getBytespersec();
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Long component5() {
        return getMaxmemory();
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public String component6() {
        return getMessage();
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Integer component7() {
        return getJobsalive();
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public UUID value1() {
        return getGuid();
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Long value2() {
        return getTotalmemory();
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Long value3() {
        return getFreememory();
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Integer value4() {
        return getBytespersec();
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Long value5() {
        return getMaxmemory();
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public String value6() {
        return getMessage();
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Integer value7() {
        return getJobsalive();
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public BulkpricerstatusRecord value1(UUID value) {
        setGuid(value);
        return this;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public BulkpricerstatusRecord value2(Long value) {
        setTotalmemory(value);
        return this;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public BulkpricerstatusRecord value3(Long value) {
        setFreememory(value);
        return this;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public BulkpricerstatusRecord value4(Integer value) {
        setBytespersec(value);
        return this;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public BulkpricerstatusRecord value5(Long value) {
        setMaxmemory(value);
        return this;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public BulkpricerstatusRecord value6(String value) {
        setMessage(value);
        return this;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public BulkpricerstatusRecord value7(Integer value) {
        setJobsalive(value);
        return this;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public BulkpricerstatusRecord values(UUID value1, Long value2, Long value3, Integer value4, Long value5, String value6, Integer value7) {
        value1(value1);
        value2(value2);
        value3(value3);
        value4(value4);
        value5(value5);
        value6(value6);
        value7(value7);
        return this;
    }

    // -------------------------------------------------------------------------
    // Constructors
    // -------------------------------------------------------------------------

    /**
     * Create a detached BulkpricerstatusRecord
     */
    public BulkpricerstatusRecord() {
        super(Bulkpricerstatus.BULKPRICERSTATUS);
    }

    /**
     * Create a detached, initialised BulkpricerstatusRecord
     */
    public BulkpricerstatusRecord(UUID guid, Long totalmemory, Long freememory, Integer bytespersec, Long maxmemory, String message, Integer jobsalive) {
        super(Bulkpricerstatus.BULKPRICERSTATUS);

        set(0, guid);
        set(1, totalmemory);
        set(2, freememory);
        set(3, bytespersec);
        set(4, maxmemory);
        set(5, message);
        set(6, jobsalive);
    }
}