/*
 * This file is generated by jOOQ.
 */
package jooq.cartrawler_dev_internal.dbo.tables;


import java.sql.Timestamp;

import javax.annotation.Generated;

import jooq.cartrawler_dev_internal.dbo.Dbo;
import jooq.cartrawler_dev_internal.dbo.tables.records.RemoteQueriesBcpRecord;

import org.jooq.Field;
import org.jooq.ForeignKey;
import org.jooq.Name;
import org.jooq.Record;
import org.jooq.Schema;
import org.jooq.Table;
import org.jooq.TableField;
import org.jooq.impl.DSL;
import org.jooq.impl.TableImpl;
import org.jooq.types.UByte;


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
public class RemoteQueriesBcp extends TableImpl<RemoteQueriesBcpRecord> {

    private static final long serialVersionUID = 1659483487;

    /**
     * The reference instance of <code>Cartrawler_dev_internal.dbo.remote_queries_bcp</code>
     */
    public static final RemoteQueriesBcp REMOTE_QUERIES_BCP = new RemoteQueriesBcp();

    /**
     * The class holding records for this type
     */
    @Override
    public Class<RemoteQueriesBcpRecord> getRecordType() {
        return RemoteQueriesBcpRecord.class;
    }

    /**
     * The column <code>Cartrawler_dev_internal.dbo.remote_queries_bcp.ref</code>.
     */
    public final TableField<RemoteQueriesBcpRecord, Long> REF = createField("ref", org.jooq.impl.SQLDataType.BIGINT.nullable(false), this, "");

    /**
     * The column <code>Cartrawler_dev_internal.dbo.remote_queries_bcp.pickupLoc</code>.
     */
    public final TableField<RemoteQueriesBcpRecord, Integer> PICKUPLOC = createField("pickupLoc", org.jooq.impl.SQLDataType.INTEGER.nullable(false), this, "");

    /**
     * The column <code>Cartrawler_dev_internal.dbo.remote_queries_bcp.dropoffLoc</code>.
     */
    public final TableField<RemoteQueriesBcpRecord, Integer> DROPOFFLOC = createField("dropoffLoc", org.jooq.impl.SQLDataType.INTEGER.nullable(false), this, "");

    /**
     * The column <code>Cartrawler_dev_internal.dbo.remote_queries_bcp.pickupDateTime</code>.
     */
    public final TableField<RemoteQueriesBcpRecord, Timestamp> PICKUPDATETIME = createField("pickupDateTime", org.jooq.impl.SQLDataType.TIMESTAMP.nullable(false), this, "");

    /**
     * The column <code>Cartrawler_dev_internal.dbo.remote_queries_bcp.dropoffDateTime</code>.
     */
    public final TableField<RemoteQueriesBcpRecord, Timestamp> DROPOFFDATETIME = createField("dropoffDateTime", org.jooq.impl.SQLDataType.TIMESTAMP.nullable(false), this, "");

    /**
     * The column <code>Cartrawler_dev_internal.dbo.remote_queries_bcp.source</code>.
     */
    public final TableField<RemoteQueriesBcpRecord, Integer> SOURCE = createField("source", org.jooq.impl.SQLDataType.INTEGER, this, "");

    /**
     * The column <code>Cartrawler_dev_internal.dbo.remote_queries_bcp.cartype</code>.
     */
    public final TableField<RemoteQueriesBcpRecord, String> CARTYPE = createField("cartype", org.jooq.impl.SQLDataType.CHAR(4).nullable(false), this, "");

    /**
     * The column <code>Cartrawler_dev_internal.dbo.remote_queries_bcp.queryDate</code>.
     */
    public final TableField<RemoteQueriesBcpRecord, Timestamp> QUERYDATE = createField("queryDate", org.jooq.impl.SQLDataType.TIMESTAMP.nullable(false), this, "");

    /**
     * The column <code>Cartrawler_dev_internal.dbo.remote_queries_bcp.customer_country</code>.
     */
    public final TableField<RemoteQueriesBcpRecord, String> CUSTOMER_COUNTRY = createField("customer_country", org.jooq.impl.SQLDataType.CHAR(2), this, "");

    /**
     * The column <code>Cartrawler_dev_internal.dbo.remote_queries_bcp.parent_id</code>.
     */
    public final TableField<RemoteQueriesBcpRecord, Integer> PARENT_ID = createField("parent_id", org.jooq.impl.SQLDataType.INTEGER, this, "");

    /**
     * The column <code>Cartrawler_dev_internal.dbo.remote_queries_bcp.resultCount</code>.
     */
    public final TableField<RemoteQueriesBcpRecord, Integer> RESULTCOUNT = createField("resultCount", org.jooq.impl.SQLDataType.INTEGER, this, "");

    /**
     * The column <code>Cartrawler_dev_internal.dbo.remote_queries_bcp.age</code>.
     */
    public final TableField<RemoteQueriesBcpRecord, UByte> AGE = createField("age", org.jooq.impl.SQLDataType.TINYINTUNSIGNED, this, "");

    /**
     * The column <code>Cartrawler_dev_internal.dbo.remote_queries_bcp.ipaddress</code>.
     */
    public final TableField<RemoteQueriesBcpRecord, Integer> IPADDRESS = createField("ipaddress", org.jooq.impl.SQLDataType.INTEGER, this, "");

    /**
     * The column <code>Cartrawler_dev_internal.dbo.remote_queries_bcp.consumerip</code>.
     */
    public final TableField<RemoteQueriesBcpRecord, Integer> CONSUMERIP = createField("consumerip", org.jooq.impl.SQLDataType.INTEGER, this, "");

    /**
     * The column <code>Cartrawler_dev_internal.dbo.remote_queries_bcp.proxyclientip</code>.
     */
    public final TableField<RemoteQueriesBcpRecord, Integer> PROXYCLIENTIP = createField("proxyclientip", org.jooq.impl.SQLDataType.INTEGER, this, "");

    /**
     * The column <code>Cartrawler_dev_internal.dbo.remote_queries_bcp.responseTime</code>.
     */
    public final TableField<RemoteQueriesBcpRecord, Integer> RESPONSETIME = createField("responseTime", org.jooq.impl.SQLDataType.INTEGER, this, "");

    /**
     * The column <code>Cartrawler_dev_internal.dbo.remote_queries_bcp.physicalIP</code>.
     */
    public final TableField<RemoteQueriesBcpRecord, Integer> PHYSICALIP = createField("physicalIP", org.jooq.impl.SQLDataType.INTEGER, this, "");

    /**
     * The column <code>Cartrawler_dev_internal.dbo.remote_queries_bcp.fk_plan</code>.
     */
    public final TableField<RemoteQueriesBcpRecord, Integer> FK_PLAN = createField("fk_plan", org.jooq.impl.SQLDataType.INTEGER, this, "");

    /**
     * The column <code>Cartrawler_dev_internal.dbo.remote_queries_bcp.fk_engineTitles</code>.
     */
    public final TableField<RemoteQueriesBcpRecord, Integer> FK_ENGINETITLES = createField("fk_engineTitles", org.jooq.impl.SQLDataType.INTEGER, this, "");

    /**
     * The column <code>Cartrawler_dev_internal.dbo.remote_queries_bcp.svn_version</code>.
     */
    public final TableField<RemoteQueriesBcpRecord, Integer> SVN_VERSION = createField("svn_version", org.jooq.impl.SQLDataType.INTEGER, this, "");

    /**
     * The column <code>Cartrawler_dev_internal.dbo.remote_queries_bcp.pickup_agentLoc</code>.
     */
    public final TableField<RemoteQueriesBcpRecord, Integer> PICKUP_AGENTLOC = createField("pickup_agentLoc", org.jooq.impl.SQLDataType.INTEGER, this, "");

    /**
     * The column <code>Cartrawler_dev_internal.dbo.remote_queries_bcp.dropoff_agentLoc</code>.
     */
    public final TableField<RemoteQueriesBcpRecord, Integer> DROPOFF_AGENTLOC = createField("dropoff_agentLoc", org.jooq.impl.SQLDataType.INTEGER, this, "");

    /**
     * The column <code>Cartrawler_dev_internal.dbo.remote_queries_bcp.flags</code>.
     */
    public final TableField<RemoteQueriesBcpRecord, Integer> FLAGS = createField("flags", org.jooq.impl.SQLDataType.INTEGER, this, "");

    /**
     * The column <code>Cartrawler_dev_internal.dbo.remote_queries_bcp.testToken</code>.
     */
    public final TableField<RemoteQueriesBcpRecord, UByte> TESTTOKEN = createField("testToken", org.jooq.impl.SQLDataType.TINYINTUNSIGNED, this, "");

    /**
     * The column <code>Cartrawler_dev_internal.dbo.remote_queries_bcp.queryID</code>.
     */
    public final TableField<RemoteQueriesBcpRecord, Long> QUERYID = createField("queryID", org.jooq.impl.SQLDataType.BIGINT, this, "");

    /**
     * The column <code>Cartrawler_dev_internal.dbo.remote_queries_bcp.fk_clientTouchpoint</code>.
     */
    public final TableField<RemoteQueriesBcpRecord, Short> FK_CLIENTTOUCHPOINT = createField("fk_clientTouchpoint", org.jooq.impl.SQLDataType.SMALLINT, this, "");

    /**
     * The column <code>Cartrawler_dev_internal.dbo.remote_queries_bcp.flags2</code>.
     */
    public final TableField<RemoteQueriesBcpRecord, Integer> FLAGS2 = createField("flags2", org.jooq.impl.SQLDataType.INTEGER, this, "");

    /**
     * The column <code>Cartrawler_dev_internal.dbo.remote_queries_bcp.otasvn</code>.
     */
    public final TableField<RemoteQueriesBcpRecord, Integer> OTASVN = createField("otasvn", org.jooq.impl.SQLDataType.INTEGER, this, "");

    /**
     * The column <code>Cartrawler_dev_internal.dbo.remote_queries_bcp.test_name</code>.
     */
    public final TableField<RemoteQueriesBcpRecord, String> TEST_NAME = createField("test_name", org.jooq.impl.SQLDataType.VARCHAR(255), this, "");

    /**
     * The column <code>Cartrawler_dev_internal.dbo.remote_queries_bcp.transaction_id</code>.
     */
    public final TableField<RemoteQueriesBcpRecord, String> TRANSACTION_ID = createField("transaction_id", org.jooq.impl.SQLDataType.VARCHAR(255), this, "");

    /**
     * Create a <code>Cartrawler_dev_internal.dbo.remote_queries_bcp</code> table reference
     */
    public RemoteQueriesBcp() {
        this(DSL.name("remote_queries_bcp"), null);
    }

    /**
     * Create an aliased <code>Cartrawler_dev_internal.dbo.remote_queries_bcp</code> table reference
     */
    public RemoteQueriesBcp(String alias) {
        this(DSL.name(alias), REMOTE_QUERIES_BCP);
    }

    /**
     * Create an aliased <code>Cartrawler_dev_internal.dbo.remote_queries_bcp</code> table reference
     */
    public RemoteQueriesBcp(Name alias) {
        this(alias, REMOTE_QUERIES_BCP);
    }

    private RemoteQueriesBcp(Name alias, Table<RemoteQueriesBcpRecord> aliased) {
        this(alias, aliased, null);
    }

    private RemoteQueriesBcp(Name alias, Table<RemoteQueriesBcpRecord> aliased, Field<?>[] parameters) {
        super(alias, null, aliased, parameters, DSL.comment(""));
    }

    public <O extends Record> RemoteQueriesBcp(Table<O> child, ForeignKey<O, RemoteQueriesBcpRecord> key) {
        super(child, key, REMOTE_QUERIES_BCP);
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Schema getSchema() {
        return Dbo.DBO;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public RemoteQueriesBcp as(String alias) {
        return new RemoteQueriesBcp(DSL.name(alias), this);
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public RemoteQueriesBcp as(Name alias) {
        return new RemoteQueriesBcp(alias, this);
    }

    /**
     * Rename this table
     */
    @Override
    public RemoteQueriesBcp rename(String name) {
        return new RemoteQueriesBcp(DSL.name(name), null);
    }

    /**
     * Rename this table
     */
    @Override
    public RemoteQueriesBcp rename(Name name) {
        return new RemoteQueriesBcp(name, null);
    }
}