/*
 * This file is generated by jOOQ.
 */
package jooq.cartrawler_dev_internal.dbo.tables.records;


import javax.annotation.Generated;

import jooq.cartrawler_dev_internal.dbo.tables.OtalanguagevalueNewBig;

import org.jooq.Field;
import org.jooq.Record5;
import org.jooq.Row5;
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
public class OtalanguagevalueNewBigRecord extends TableRecordImpl<OtalanguagevalueNewBigRecord> implements Record5<Integer, Integer, Integer, byte[], byte[]> {

    private static final long serialVersionUID = 1098362477;

    /**
     * Setter for <code>Cartrawler_dev_internal.dbo.otaLanguageValue_new_big.id</code>.
     */
    public void setId(Integer value) {
        set(0, value);
    }

    /**
     * Getter for <code>Cartrawler_dev_internal.dbo.otaLanguageValue_new_big.id</code>.
     */
    public Integer getId() {
        return (Integer) get(0);
    }

    /**
     * Setter for <code>Cartrawler_dev_internal.dbo.otaLanguageValue_new_big.name_id</code>.
     */
    public void setNameId(Integer value) {
        set(1, value);
    }

    /**
     * Getter for <code>Cartrawler_dev_internal.dbo.otaLanguageValue_new_big.name_id</code>.
     */
    public Integer getNameId() {
        return (Integer) get(1);
    }

    /**
     * Setter for <code>Cartrawler_dev_internal.dbo.otaLanguageValue_new_big.lang_id</code>.
     */
    public void setLangId(Integer value) {
        set(2, value);
    }

    /**
     * Getter for <code>Cartrawler_dev_internal.dbo.otaLanguageValue_new_big.lang_id</code>.
     */
    public Integer getLangId() {
        return (Integer) get(2);
    }

    /**
     * Setter for <code>Cartrawler_dev_internal.dbo.otaLanguageValue_new_big.value</code>.
     */
    public void setValue(byte... value) {
        set(3, value);
    }

    /**
     * Getter for <code>Cartrawler_dev_internal.dbo.otaLanguageValue_new_big.value</code>.
     */
    public byte[] getValue() {
        return (byte[]) get(3);
    }

    /**
     * Setter for <code>Cartrawler_dev_internal.dbo.otaLanguageValue_new_big.value_big</code>.
     */
    public void setValueBig(byte... value) {
        set(4, value);
    }

    /**
     * Getter for <code>Cartrawler_dev_internal.dbo.otaLanguageValue_new_big.value_big</code>.
     */
    public byte[] getValueBig() {
        return (byte[]) get(4);
    }

    // -------------------------------------------------------------------------
    // Record5 type implementation
    // -------------------------------------------------------------------------

    /**
     * {@inheritDoc}
     */
    @Override
    public Row5<Integer, Integer, Integer, byte[], byte[]> fieldsRow() {
        return (Row5) super.fieldsRow();
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Row5<Integer, Integer, Integer, byte[], byte[]> valuesRow() {
        return (Row5) super.valuesRow();
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Field<Integer> field1() {
        return OtalanguagevalueNewBig.OTALANGUAGEVALUE_NEW_BIG.ID;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Field<Integer> field2() {
        return OtalanguagevalueNewBig.OTALANGUAGEVALUE_NEW_BIG.NAME_ID;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Field<Integer> field3() {
        return OtalanguagevalueNewBig.OTALANGUAGEVALUE_NEW_BIG.LANG_ID;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Field<byte[]> field4() {
        return OtalanguagevalueNewBig.OTALANGUAGEVALUE_NEW_BIG.VALUE;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Field<byte[]> field5() {
        return OtalanguagevalueNewBig.OTALANGUAGEVALUE_NEW_BIG.VALUE_BIG;
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
        return getNameId();
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Integer component3() {
        return getLangId();
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public byte[] component4() {
        return getValue();
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public byte[] component5() {
        return getValueBig();
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
        return getNameId();
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Integer value3() {
        return getLangId();
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public byte[] value4() {
        return getValue();
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public byte[] value5() {
        return getValueBig();
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public OtalanguagevalueNewBigRecord value1(Integer value) {
        setId(value);
        return this;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public OtalanguagevalueNewBigRecord value2(Integer value) {
        setNameId(value);
        return this;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public OtalanguagevalueNewBigRecord value3(Integer value) {
        setLangId(value);
        return this;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public OtalanguagevalueNewBigRecord value4(byte... value) {
        setValue(value);
        return this;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public OtalanguagevalueNewBigRecord value5(byte... value) {
        setValueBig(value);
        return this;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public OtalanguagevalueNewBigRecord values(Integer value1, Integer value2, Integer value3, byte[] value4, byte[] value5) {
        value1(value1);
        value2(value2);
        value3(value3);
        value4(value4);
        value5(value5);
        return this;
    }

    // -------------------------------------------------------------------------
    // Constructors
    // -------------------------------------------------------------------------

    /**
     * Create a detached OtalanguagevalueNewBigRecord
     */
    public OtalanguagevalueNewBigRecord() {
        super(OtalanguagevalueNewBig.OTALANGUAGEVALUE_NEW_BIG);
    }

    /**
     * Create a detached, initialised OtalanguagevalueNewBigRecord
     */
    public OtalanguagevalueNewBigRecord(Integer id, Integer nameId, Integer langId, byte[] value, byte[] valueBig) {
        super(OtalanguagevalueNewBig.OTALANGUAGEVALUE_NEW_BIG);

        set(0, id);
        set(1, nameId);
        set(2, langId);
        set(3, value);
        set(4, valueBig);
    }
}