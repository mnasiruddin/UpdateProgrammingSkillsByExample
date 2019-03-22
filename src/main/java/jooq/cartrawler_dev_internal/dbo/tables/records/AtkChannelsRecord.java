/*
 * This file is generated by jOOQ.
 */
package jooq.cartrawler_dev_internal.dbo.tables.records;


import javax.annotation.Generated;

import jooq.cartrawler_dev_internal.dbo.tables.AtkChannels;

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
public class AtkChannelsRecord extends TableRecordImpl<AtkChannelsRecord> implements Record4<Integer, String, String, String> {

    private static final long serialVersionUID = -1225343395;

    /**
     * Setter for <code>Cartrawler_dev_internal.dbo.ATK_Channels.client_id</code>.
     */
    public void setClientId(Integer value) {
        set(0, value);
    }

    /**
     * Getter for <code>Cartrawler_dev_internal.dbo.ATK_Channels.client_id</code>.
     */
    public Integer getClientId() {
        return (Integer) get(0);
    }

    /**
     * Setter for <code>Cartrawler_dev_internal.dbo.ATK_Channels.Finance_Channel</code>.
     */
    public void setFinanceChannel(String value) {
        set(1, value);
    }

    /**
     * Getter for <code>Cartrawler_dev_internal.dbo.ATK_Channels.Finance_Channel</code>.
     */
    public String getFinanceChannel() {
        return (String) get(1);
    }

    /**
     * Setter for <code>Cartrawler_dev_internal.dbo.ATK_Channels.ATK_Channel</code>.
     */
    public void setAtkChannel(String value) {
        set(2, value);
    }

    /**
     * Getter for <code>Cartrawler_dev_internal.dbo.ATK_Channels.ATK_Channel</code>.
     */
    public String getAtkChannel() {
        return (String) get(2);
    }

    /**
     * Setter for <code>Cartrawler_dev_internal.dbo.ATK_Channels.touchpoint</code>.
     */
    public void setTouchpoint(String value) {
        set(3, value);
    }

    /**
     * Getter for <code>Cartrawler_dev_internal.dbo.ATK_Channels.touchpoint</code>.
     */
    public String getTouchpoint() {
        return (String) get(3);
    }

    // -------------------------------------------------------------------------
    // Record4 type implementation
    // -------------------------------------------------------------------------

    /**
     * {@inheritDoc}
     */
    @Override
    public Row4<Integer, String, String, String> fieldsRow() {
        return (Row4) super.fieldsRow();
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Row4<Integer, String, String, String> valuesRow() {
        return (Row4) super.valuesRow();
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Field<Integer> field1() {
        return AtkChannels.ATK_CHANNELS.CLIENT_ID;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Field<String> field2() {
        return AtkChannels.ATK_CHANNELS.FINANCE_CHANNEL;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Field<String> field3() {
        return AtkChannels.ATK_CHANNELS.ATK_CHANNEL;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Field<String> field4() {
        return AtkChannels.ATK_CHANNELS.TOUCHPOINT;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Integer component1() {
        return getClientId();
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public String component2() {
        return getFinanceChannel();
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public String component3() {
        return getAtkChannel();
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public String component4() {
        return getTouchpoint();
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Integer value1() {
        return getClientId();
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public String value2() {
        return getFinanceChannel();
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public String value3() {
        return getAtkChannel();
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public String value4() {
        return getTouchpoint();
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public AtkChannelsRecord value1(Integer value) {
        setClientId(value);
        return this;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public AtkChannelsRecord value2(String value) {
        setFinanceChannel(value);
        return this;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public AtkChannelsRecord value3(String value) {
        setAtkChannel(value);
        return this;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public AtkChannelsRecord value4(String value) {
        setTouchpoint(value);
        return this;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public AtkChannelsRecord values(Integer value1, String value2, String value3, String value4) {
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
     * Create a detached AtkChannelsRecord
     */
    public AtkChannelsRecord() {
        super(AtkChannels.ATK_CHANNELS);
    }

    /**
     * Create a detached, initialised AtkChannelsRecord
     */
    public AtkChannelsRecord(Integer clientId, String financeChannel, String atkChannel, String touchpoint) {
        super(AtkChannels.ATK_CHANNELS);

        set(0, clientId);
        set(1, financeChannel);
        set(2, atkChannel);
        set(3, touchpoint);
    }
}