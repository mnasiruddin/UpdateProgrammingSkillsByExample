/*
 * This file is generated by jOOQ.
 */
package jooq.cartrawler_dev_internal.dbo.tables.records;


import java.sql.Timestamp;

import javax.annotation.Generated;

import jooq.cartrawler_dev_internal.dbo.tables.CustomerIndex;

import org.jooq.Field;
import org.jooq.Record1;
import org.jooq.Record6;
import org.jooq.Row6;
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
public class CustomerIndexRecord extends UpdatableRecordImpl<CustomerIndexRecord> implements Record6<Integer, String, String, Integer, Integer, Timestamp> {

    private static final long serialVersionUID = 734296914;

    /**
     * Setter for <code>Cartrawler_dev_internal.dbo.customer_index.id</code>.
     */
    public void setId(Integer value) {
        set(0, value);
    }

    /**
     * Getter for <code>Cartrawler_dev_internal.dbo.customer_index.id</code>.
     */
    public Integer getId() {
        return (Integer) get(0);
    }

    /**
     * Setter for <code>Cartrawler_dev_internal.dbo.customer_index.matcher_type</code>.
     */
    public void setMatcherType(String value) {
        set(1, value);
    }

    /**
     * Getter for <code>Cartrawler_dev_internal.dbo.customer_index.matcher_type</code>.
     */
    public String getMatcherType() {
        return (String) get(1);
    }

    /**
     * Setter for <code>Cartrawler_dev_internal.dbo.customer_index.matcher_value</code>.
     */
    public void setMatcherValue(String value) {
        set(2, value);
    }

    /**
     * Getter for <code>Cartrawler_dev_internal.dbo.customer_index.matcher_value</code>.
     */
    public String getMatcherValue() {
        return (String) get(2);
    }

    /**
     * Setter for <code>Cartrawler_dev_internal.dbo.customer_index.fk_customer</code>.
     */
    public void setFkCustomer(Integer value) {
        set(3, value);
    }

    /**
     * Getter for <code>Cartrawler_dev_internal.dbo.customer_index.fk_customer</code>.
     */
    public Integer getFkCustomer() {
        return (Integer) get(3);
    }

    /**
     * Setter for <code>Cartrawler_dev_internal.dbo.customer_index.fk_client</code>.
     */
    public void setFkClient(Integer value) {
        set(4, value);
    }

    /**
     * Getter for <code>Cartrawler_dev_internal.dbo.customer_index.fk_client</code>.
     */
    public Integer getFkClient() {
        return (Integer) get(4);
    }

    /**
     * Setter for <code>Cartrawler_dev_internal.dbo.customer_index.created_date</code>.
     */
    public void setCreatedDate(Timestamp value) {
        set(5, value);
    }

    /**
     * Getter for <code>Cartrawler_dev_internal.dbo.customer_index.created_date</code>.
     */
    public Timestamp getCreatedDate() {
        return (Timestamp) get(5);
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
    // Record6 type implementation
    // -------------------------------------------------------------------------

    /**
     * {@inheritDoc}
     */
    @Override
    public Row6<Integer, String, String, Integer, Integer, Timestamp> fieldsRow() {
        return (Row6) super.fieldsRow();
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Row6<Integer, String, String, Integer, Integer, Timestamp> valuesRow() {
        return (Row6) super.valuesRow();
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Field<Integer> field1() {
        return CustomerIndex.CUSTOMER_INDEX.ID;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Field<String> field2() {
        return CustomerIndex.CUSTOMER_INDEX.MATCHER_TYPE;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Field<String> field3() {
        return CustomerIndex.CUSTOMER_INDEX.MATCHER_VALUE;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Field<Integer> field4() {
        return CustomerIndex.CUSTOMER_INDEX.FK_CUSTOMER;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Field<Integer> field5() {
        return CustomerIndex.CUSTOMER_INDEX.FK_CLIENT;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Field<Timestamp> field6() {
        return CustomerIndex.CUSTOMER_INDEX.CREATED_DATE;
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
        return getMatcherType();
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public String component3() {
        return getMatcherValue();
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Integer component4() {
        return getFkCustomer();
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Integer component5() {
        return getFkClient();
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Timestamp component6() {
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
    public String value2() {
        return getMatcherType();
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public String value3() {
        return getMatcherValue();
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Integer value4() {
        return getFkCustomer();
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Integer value5() {
        return getFkClient();
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Timestamp value6() {
        return getCreatedDate();
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public CustomerIndexRecord value1(Integer value) {
        setId(value);
        return this;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public CustomerIndexRecord value2(String value) {
        setMatcherType(value);
        return this;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public CustomerIndexRecord value3(String value) {
        setMatcherValue(value);
        return this;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public CustomerIndexRecord value4(Integer value) {
        setFkCustomer(value);
        return this;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public CustomerIndexRecord value5(Integer value) {
        setFkClient(value);
        return this;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public CustomerIndexRecord value6(Timestamp value) {
        setCreatedDate(value);
        return this;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public CustomerIndexRecord values(Integer value1, String value2, String value3, Integer value4, Integer value5, Timestamp value6) {
        value1(value1);
        value2(value2);
        value3(value3);
        value4(value4);
        value5(value5);
        value6(value6);
        return this;
    }

    // -------------------------------------------------------------------------
    // Constructors
    // -------------------------------------------------------------------------

    /**
     * Create a detached CustomerIndexRecord
     */
    public CustomerIndexRecord() {
        super(CustomerIndex.CUSTOMER_INDEX);
    }

    /**
     * Create a detached, initialised CustomerIndexRecord
     */
    public CustomerIndexRecord(Integer id, String matcherType, String matcherValue, Integer fkCustomer, Integer fkClient, Timestamp createdDate) {
        super(CustomerIndex.CUSTOMER_INDEX);

        set(0, id);
        set(1, matcherType);
        set(2, matcherValue);
        set(3, fkCustomer);
        set(4, fkClient);
        set(5, createdDate);
    }
}