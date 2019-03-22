/*
 * This file is generated by jOOQ.
 */
package jooq.cartrawler_dev_internal.dbo.tables.records;


import java.sql.Date;

import javax.annotation.Generated;

import jooq.cartrawler_dev_internal.dbo.tables.AbeVersion;

import org.jooq.Field;
import org.jooq.Record1;
import org.jooq.Record10;
import org.jooq.Row10;
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
public class AbeVersionRecord extends UpdatableRecordImpl<AbeVersionRecord> implements Record10<Integer, String, Date, Boolean, String, Boolean, String, Long, Integer, String> {

    private static final long serialVersionUID = 542814989;

    /**
     * Setter for <code>Cartrawler_dev_internal.dbo.abe_version.id</code>.
     */
    public void setId(Integer value) {
        set(0, value);
    }

    /**
     * Getter for <code>Cartrawler_dev_internal.dbo.abe_version.id</code>.
     */
    public Integer getId() {
        return (Integer) get(0);
    }

    /**
     * Setter for <code>Cartrawler_dev_internal.dbo.abe_version.version</code>.
     */
    public void setVersion(String value) {
        set(1, value);
    }

    /**
     * Getter for <code>Cartrawler_dev_internal.dbo.abe_version.version</code>.
     */
    public String getVersion() {
        return (String) get(1);
    }

    /**
     * Setter for <code>Cartrawler_dev_internal.dbo.abe_version.publish_date</code>.
     */
    public void setPublishDate(Date value) {
        set(2, value);
    }

    /**
     * Getter for <code>Cartrawler_dev_internal.dbo.abe_version.publish_date</code>.
     */
    public Date getPublishDate() {
        return (Date) get(2);
    }

    /**
     * Setter for <code>Cartrawler_dev_internal.dbo.abe_version.live</code>.
     */
    public void setLive(Boolean value) {
        set(3, value);
    }

    /**
     * Getter for <code>Cartrawler_dev_internal.dbo.abe_version.live</code>.
     */
    public Boolean getLive() {
        return (Boolean) get(3);
    }

    /**
     * Setter for <code>Cartrawler_dev_internal.dbo.abe_version.engine_release</code>.
     */
    public void setEngineRelease(String value) {
        set(4, value);
    }

    /**
     * Getter for <code>Cartrawler_dev_internal.dbo.abe_version.engine_release</code>.
     */
    public String getEngineRelease() {
        return (String) get(4);
    }

    /**
     * Setter for <code>Cartrawler_dev_internal.dbo.abe_version.default</code>.
     */
    public void setDefault(Boolean value) {
        set(5, value);
    }

    /**
     * Getter for <code>Cartrawler_dev_internal.dbo.abe_version.default</code>.
     */
    public Boolean getDefault() {
        return (Boolean) get(5);
    }

    /**
     * Setter for <code>Cartrawler_dev_internal.dbo.abe_version.supplement</code>.
     */
    public void setSupplement(String value) {
        set(6, value);
    }

    /**
     * Getter for <code>Cartrawler_dev_internal.dbo.abe_version.supplement</code>.
     */
    public String getSupplement() {
        return (String) get(6);
    }

    /**
     * Setter for <code>Cartrawler_dev_internal.dbo.abe_version.loaded</code>.
     */
    public void setLoaded(Long value) {
        set(7, value);
    }

    /**
     * Getter for <code>Cartrawler_dev_internal.dbo.abe_version.loaded</code>.
     */
    public Long getLoaded() {
        return (Long) get(7);
    }

    /**
     * Setter for <code>Cartrawler_dev_internal.dbo.abe_version.fk_stream_id</code>.
     */
    public void setFkStreamId(Integer value) {
        set(8, value);
    }

    /**
     * Getter for <code>Cartrawler_dev_internal.dbo.abe_version.fk_stream_id</code>.
     */
    public Integer getFkStreamId() {
        return (Integer) get(8);
    }

    /**
     * Setter for <code>Cartrawler_dev_internal.dbo.abe_version.minor_version</code>.
     */
    public void setMinorVersion(String value) {
        set(9, value);
    }

    /**
     * Getter for <code>Cartrawler_dev_internal.dbo.abe_version.minor_version</code>.
     */
    public String getMinorVersion() {
        return (String) get(9);
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
    // Record10 type implementation
    // -------------------------------------------------------------------------

    /**
     * {@inheritDoc}
     */
    @Override
    public Row10<Integer, String, Date, Boolean, String, Boolean, String, Long, Integer, String> fieldsRow() {
        return (Row10) super.fieldsRow();
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Row10<Integer, String, Date, Boolean, String, Boolean, String, Long, Integer, String> valuesRow() {
        return (Row10) super.valuesRow();
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Field<Integer> field1() {
        return AbeVersion.ABE_VERSION.ID;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Field<String> field2() {
        return AbeVersion.ABE_VERSION.VERSION;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Field<Date> field3() {
        return AbeVersion.ABE_VERSION.PUBLISH_DATE;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Field<Boolean> field4() {
        return AbeVersion.ABE_VERSION.LIVE;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Field<String> field5() {
        return AbeVersion.ABE_VERSION.ENGINE_RELEASE;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Field<Boolean> field6() {
        return AbeVersion.ABE_VERSION.DEFAULT;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Field<String> field7() {
        return AbeVersion.ABE_VERSION.SUPPLEMENT;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Field<Long> field8() {
        return AbeVersion.ABE_VERSION.LOADED;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Field<Integer> field9() {
        return AbeVersion.ABE_VERSION.FK_STREAM_ID;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Field<String> field10() {
        return AbeVersion.ABE_VERSION.MINOR_VERSION;
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
        return getVersion();
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Date component3() {
        return getPublishDate();
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Boolean component4() {
        return getLive();
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public String component5() {
        return getEngineRelease();
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Boolean component6() {
        return getDefault();
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public String component7() {
        return getSupplement();
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Long component8() {
        return getLoaded();
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Integer component9() {
        return getFkStreamId();
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public String component10() {
        return getMinorVersion();
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
        return getVersion();
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Date value3() {
        return getPublishDate();
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Boolean value4() {
        return getLive();
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public String value5() {
        return getEngineRelease();
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Boolean value6() {
        return getDefault();
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public String value7() {
        return getSupplement();
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Long value8() {
        return getLoaded();
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Integer value9() {
        return getFkStreamId();
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public String value10() {
        return getMinorVersion();
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public AbeVersionRecord value1(Integer value) {
        setId(value);
        return this;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public AbeVersionRecord value2(String value) {
        setVersion(value);
        return this;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public AbeVersionRecord value3(Date value) {
        setPublishDate(value);
        return this;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public AbeVersionRecord value4(Boolean value) {
        setLive(value);
        return this;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public AbeVersionRecord value5(String value) {
        setEngineRelease(value);
        return this;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public AbeVersionRecord value6(Boolean value) {
        setDefault(value);
        return this;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public AbeVersionRecord value7(String value) {
        setSupplement(value);
        return this;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public AbeVersionRecord value8(Long value) {
        setLoaded(value);
        return this;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public AbeVersionRecord value9(Integer value) {
        setFkStreamId(value);
        return this;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public AbeVersionRecord value10(String value) {
        setMinorVersion(value);
        return this;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public AbeVersionRecord values(Integer value1, String value2, Date value3, Boolean value4, String value5, Boolean value6, String value7, Long value8, Integer value9, String value10) {
        value1(value1);
        value2(value2);
        value3(value3);
        value4(value4);
        value5(value5);
        value6(value6);
        value7(value7);
        value8(value8);
        value9(value9);
        value10(value10);
        return this;
    }

    // -------------------------------------------------------------------------
    // Constructors
    // -------------------------------------------------------------------------

    /**
     * Create a detached AbeVersionRecord
     */
    public AbeVersionRecord() {
        super(AbeVersion.ABE_VERSION);
    }

    /**
     * Create a detached, initialised AbeVersionRecord
     */
    public AbeVersionRecord(Integer id, String version, Date publishDate, Boolean live, String engineRelease, Boolean default_, String supplement, Long loaded, Integer fkStreamId, String minorVersion) {
        super(AbeVersion.ABE_VERSION);

        set(0, id);
        set(1, version);
        set(2, publishDate);
        set(3, live);
        set(4, engineRelease);
        set(5, default_);
        set(6, supplement);
        set(7, loaded);
        set(8, fkStreamId);
        set(9, minorVersion);
    }
}