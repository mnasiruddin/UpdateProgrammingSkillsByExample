/*
 * This file is generated by jOOQ.
 */
package jooq.cartrawler_dev_internal.dbo.tables.records;


import javax.annotation.Generated;

import jooq.cartrawler_dev_internal.dbo.tables.Syncobj_0x4333424344323636;

import org.jooq.Field;
import org.jooq.Record3;
import org.jooq.Row3;
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
public class Syncobj_0x4333424344323636Record extends TableRecordImpl<Syncobj_0x4333424344323636Record> implements Record3<Integer, Integer, String> {

    private static final long serialVersionUID = 1817661261;

    /**
     * Setter for <code>Cartrawler_dev_internal.dbo.syncobj_0x4333424344323636.id</code>.
     */
    public void setId(Integer value) {
        set(0, value);
    }

    /**
     * Getter for <code>Cartrawler_dev_internal.dbo.syncobj_0x4333424344323636.id</code>.
     */
    public Integer getId() {
        return (Integer) get(0);
    }

    /**
     * Setter for <code>Cartrawler_dev_internal.dbo.syncobj_0x4333424344323636.fk_fom_data</code>.
     */
    public void setFkFomData(Integer value) {
        set(1, value);
    }

    /**
     * Getter for <code>Cartrawler_dev_internal.dbo.syncobj_0x4333424344323636.fk_fom_data</code>.
     */
    public Integer getFkFomData() {
        return (Integer) get(1);
    }

    /**
     * Setter for <code>Cartrawler_dev_internal.dbo.syncobj_0x4333424344323636.ps_order_id</code>.
     */
    public void setPsOrderId(String value) {
        set(2, value);
    }

    /**
     * Getter for <code>Cartrawler_dev_internal.dbo.syncobj_0x4333424344323636.ps_order_id</code>.
     */
    public String getPsOrderId() {
        return (String) get(2);
    }

    // -------------------------------------------------------------------------
    // Record3 type implementation
    // -------------------------------------------------------------------------

    /**
     * {@inheritDoc}
     */
    @Override
    public Row3<Integer, Integer, String> fieldsRow() {
        return (Row3) super.fieldsRow();
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Row3<Integer, Integer, String> valuesRow() {
        return (Row3) super.valuesRow();
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Field<Integer> field1() {
        return Syncobj_0x4333424344323636.SYNCOBJ_0X4333424344323636.ID;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Field<Integer> field2() {
        return Syncobj_0x4333424344323636.SYNCOBJ_0X4333424344323636.FK_FOM_DATA;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Field<String> field3() {
        return Syncobj_0x4333424344323636.SYNCOBJ_0X4333424344323636.PS_ORDER_ID;
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
        return getFkFomData();
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public String component3() {
        return getPsOrderId();
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
        return getFkFomData();
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public String value3() {
        return getPsOrderId();
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Syncobj_0x4333424344323636Record value1(Integer value) {
        setId(value);
        return this;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Syncobj_0x4333424344323636Record value2(Integer value) {
        setFkFomData(value);
        return this;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Syncobj_0x4333424344323636Record value3(String value) {
        setPsOrderId(value);
        return this;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Syncobj_0x4333424344323636Record values(Integer value1, Integer value2, String value3) {
        value1(value1);
        value2(value2);
        value3(value3);
        return this;
    }

    // -------------------------------------------------------------------------
    // Constructors
    // -------------------------------------------------------------------------

    /**
     * Create a detached Syncobj_0x4333424344323636Record
     */
    public Syncobj_0x4333424344323636Record() {
        super(Syncobj_0x4333424344323636.SYNCOBJ_0X4333424344323636);
    }

    /**
     * Create a detached, initialised Syncobj_0x4333424344323636Record
     */
    public Syncobj_0x4333424344323636Record(Integer id, Integer fkFomData, String psOrderId) {
        super(Syncobj_0x4333424344323636.SYNCOBJ_0X4333424344323636);

        set(0, id);
        set(1, fkFomData);
        set(2, psOrderId);
    }
}