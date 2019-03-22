/*
 * This file is generated by jOOQ.
 */
package jooq.cartrawler_dev_internal.dbo.tables.records;


import javax.annotation.Generated;

import jooq.cartrawler_dev_internal.dbo.tables.OtaReload;

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
public class OtaReloadRecord extends UpdatableRecordImpl<OtaReloadRecord> implements Record4<Integer, String, Boolean, Long> {

    private static final long serialVersionUID = 1906007958;

    /**
     * Setter for <code>Cartrawler_dev_internal.dbo.ota_reload.id</code>.
     */
    public void setId(Integer value) {
        set(0, value);
    }

    /**
     * Getter for <code>Cartrawler_dev_internal.dbo.ota_reload.id</code>.
     */
    public Integer getId() {
        return (Integer) get(0);
    }

    /**
     * Setter for <code>Cartrawler_dev_internal.dbo.ota_reload.reload_key</code>.
     */
    public void setReloadKey(String value) {
        set(1, value);
    }

    /**
     * Getter for <code>Cartrawler_dev_internal.dbo.ota_reload.reload_key</code>.
     */
    public String getReloadKey() {
        return (String) get(1);
    }

    /**
     * Setter for <code>Cartrawler_dev_internal.dbo.ota_reload.reload_in_progress</code>.
     */
    public void setReloadInProgress(Boolean value) {
        set(2, value);
    }

    /**
     * Getter for <code>Cartrawler_dev_internal.dbo.ota_reload.reload_in_progress</code>.
     */
    public Boolean getReloadInProgress() {
        return (Boolean) get(2);
    }

    /**
     * Setter for <code>Cartrawler_dev_internal.dbo.ota_reload.last_change_time</code>.
     */
    public void setLastChangeTime(Long value) {
        set(3, value);
    }

    /**
     * Getter for <code>Cartrawler_dev_internal.dbo.ota_reload.last_change_time</code>.
     */
    public Long getLastChangeTime() {
        return (Long) get(3);
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
    public Row4<Integer, String, Boolean, Long> fieldsRow() {
        return (Row4) super.fieldsRow();
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Row4<Integer, String, Boolean, Long> valuesRow() {
        return (Row4) super.valuesRow();
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Field<Integer> field1() {
        return OtaReload.OTA_RELOAD.ID;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Field<String> field2() {
        return OtaReload.OTA_RELOAD.RELOAD_KEY;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Field<Boolean> field3() {
        return OtaReload.OTA_RELOAD.RELOAD_IN_PROGRESS;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Field<Long> field4() {
        return OtaReload.OTA_RELOAD.LAST_CHANGE_TIME;
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
    public String component2() {
        return getReloadKey();
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Boolean component3() {
        return getReloadInProgress();
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Long component4() {
        return getLastChangeTime();
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
    public String value2() {
        return getReloadKey();
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Boolean value3() {
        return getReloadInProgress();
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Long value4() {
        return getLastChangeTime();
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public OtaReloadRecord value1(Integer value) {
        setId(value);
        return this;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public OtaReloadRecord value2(String value) {
        setReloadKey(value);
        return this;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public OtaReloadRecord value3(Boolean value) {
        setReloadInProgress(value);
        return this;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public OtaReloadRecord value4(Long value) {
        setLastChangeTime(value);
        return this;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public OtaReloadRecord values(Integer value1, String value2, Boolean value3, Long value4) {
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
     * Create a detached OtaReloadRecord
     */
    public OtaReloadRecord() {
        super(OtaReload.OTA_RELOAD);
    }

    /**
     * Create a detached, initialised OtaReloadRecord
     */
    public OtaReloadRecord(Integer id, String reloadKey, Boolean reloadInProgress, Long lastChangeTime) {
        super(OtaReload.OTA_RELOAD);

        set(0, id);
        set(1, reloadKey);
        set(2, reloadInProgress);
        set(3, lastChangeTime);
    }
}