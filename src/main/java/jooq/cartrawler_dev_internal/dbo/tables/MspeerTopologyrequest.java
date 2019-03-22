/*
 * This file is generated by jOOQ.
 */
package jooq.cartrawler_dev_internal.dbo.tables;


import java.sql.Timestamp;

import javax.annotation.Generated;

import jooq.cartrawler_dev_internal.dbo.Dbo;
import jooq.cartrawler_dev_internal.dbo.Keys;
import jooq.cartrawler_dev_internal.dbo.tables.records.MspeerTopologyrequestRecord;

import org.jooq.Field;
import org.jooq.ForeignKey;
import org.jooq.Identity;
import org.jooq.Name;
import org.jooq.Record;
import org.jooq.Schema;
import org.jooq.Table;
import org.jooq.TableField;
import org.jooq.impl.DSL;
import org.jooq.impl.TableImpl;


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
public class MspeerTopologyrequest extends TableImpl<MspeerTopologyrequestRecord> {

    private static final long serialVersionUID = -129648776;

    /**
     * The reference instance of <code>Cartrawler_dev_internal.dbo.MSpeer_topologyrequest</code>
     */
    public static final MspeerTopologyrequest MSPEER_TOPOLOGYREQUEST = new MspeerTopologyrequest();

    /**
     * The class holding records for this type
     */
    @Override
    public Class<MspeerTopologyrequestRecord> getRecordType() {
        return MspeerTopologyrequestRecord.class;
    }

    /**
     * The column <code>Cartrawler_dev_internal.dbo.MSpeer_topologyrequest.id</code>.
     */
    public final TableField<MspeerTopologyrequestRecord, Integer> ID = createField("id", org.jooq.impl.SQLDataType.INTEGER.nullable(false).identity(true), this, "");

    /**
     * The column <code>Cartrawler_dev_internal.dbo.MSpeer_topologyrequest.publication</code>.
     */
    public final TableField<MspeerTopologyrequestRecord, String> PUBLICATION = createField("publication", org.jooq.impl.SQLDataType.NVARCHAR(128).nullable(false), this, "");

    /**
     * The column <code>Cartrawler_dev_internal.dbo.MSpeer_topologyrequest.sent_date</code>.
     */
    public final TableField<MspeerTopologyrequestRecord, Timestamp> SENT_DATE = createField("sent_date", org.jooq.impl.SQLDataType.TIMESTAMP.defaultValue(org.jooq.impl.DSL.field("(getdate())", org.jooq.impl.SQLDataType.TIMESTAMP)), this, "");

    /**
     * Create a <code>Cartrawler_dev_internal.dbo.MSpeer_topologyrequest</code> table reference
     */
    public MspeerTopologyrequest() {
        this(DSL.name("MSpeer_topologyrequest"), null);
    }

    /**
     * Create an aliased <code>Cartrawler_dev_internal.dbo.MSpeer_topologyrequest</code> table reference
     */
    public MspeerTopologyrequest(String alias) {
        this(DSL.name(alias), MSPEER_TOPOLOGYREQUEST);
    }

    /**
     * Create an aliased <code>Cartrawler_dev_internal.dbo.MSpeer_topologyrequest</code> table reference
     */
    public MspeerTopologyrequest(Name alias) {
        this(alias, MSPEER_TOPOLOGYREQUEST);
    }

    private MspeerTopologyrequest(Name alias, Table<MspeerTopologyrequestRecord> aliased) {
        this(alias, aliased, null);
    }

    private MspeerTopologyrequest(Name alias, Table<MspeerTopologyrequestRecord> aliased, Field<?>[] parameters) {
        super(alias, null, aliased, parameters, DSL.comment(""));
    }

    public <O extends Record> MspeerTopologyrequest(Table<O> child, ForeignKey<O, MspeerTopologyrequestRecord> key) {
        super(child, key, MSPEER_TOPOLOGYREQUEST);
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
    public Identity<MspeerTopologyrequestRecord, Integer> getIdentity() {
        return Keys.IDENTITY_MSPEER_TOPOLOGYREQUEST;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public MspeerTopologyrequest as(String alias) {
        return new MspeerTopologyrequest(DSL.name(alias), this);
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public MspeerTopologyrequest as(Name alias) {
        return new MspeerTopologyrequest(alias, this);
    }

    /**
     * Rename this table
     */
    @Override
    public MspeerTopologyrequest rename(String name) {
        return new MspeerTopologyrequest(DSL.name(name), null);
    }

    /**
     * Rename this table
     */
    @Override
    public MspeerTopologyrequest rename(Name name) {
        return new MspeerTopologyrequest(name, null);
    }
}