/*
 * This file is generated by jOOQ.
 */
package jooq.cartrawler_dev_internal.dbo.tables;


import java.util.Arrays;
import java.util.List;

import javax.annotation.Generated;

import jooq.cartrawler_dev_internal.dbo.Dbo;
import jooq.cartrawler_dev_internal.dbo.Indexes;
import jooq.cartrawler_dev_internal.dbo.Keys;
import jooq.cartrawler_dev_internal.dbo.tables.records.AbeVersionStatsRecord;

import org.jooq.Field;
import org.jooq.ForeignKey;
import org.jooq.Identity;
import org.jooq.Index;
import org.jooq.Name;
import org.jooq.Record;
import org.jooq.Schema;
import org.jooq.Table;
import org.jooq.TableField;
import org.jooq.UniqueKey;
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
public class AbeVersionStats extends TableImpl<AbeVersionStatsRecord> {

    private static final long serialVersionUID = -1209199999;

    /**
     * The reference instance of <code>Cartrawler_dev_internal.dbo.abe_version_stats</code>
     */
    public static final AbeVersionStats ABE_VERSION_STATS = new AbeVersionStats();

    /**
     * The class holding records for this type
     */
    @Override
    public Class<AbeVersionStatsRecord> getRecordType() {
        return AbeVersionStatsRecord.class;
    }

    /**
     * The column <code>Cartrawler_dev_internal.dbo.abe_version_stats.id</code>.
     */
    public final TableField<AbeVersionStatsRecord, Integer> ID = createField("id", org.jooq.impl.SQLDataType.INTEGER.nullable(false).identity(true), this, "");

    /**
     * The column <code>Cartrawler_dev_internal.dbo.abe_version_stats.fk_version_id</code>.
     */
    public final TableField<AbeVersionStatsRecord, Integer> FK_VERSION_ID = createField("fk_version_id", org.jooq.impl.SQLDataType.INTEGER, this, "");

    /**
     * The column <code>Cartrawler_dev_internal.dbo.abe_version_stats.site</code>.
     */
    public final TableField<AbeVersionStatsRecord, String> SITE = createField("site", org.jooq.impl.SQLDataType.VARCHAR(10), this, "");

    /**
     * The column <code>Cartrawler_dev_internal.dbo.abe_version_stats.loaded</code>.
     */
    public final TableField<AbeVersionStatsRecord, Long> LOADED = createField("loaded", org.jooq.impl.SQLDataType.BIGINT, this, "");

    /**
     * Create a <code>Cartrawler_dev_internal.dbo.abe_version_stats</code> table reference
     */
    public AbeVersionStats() {
        this(DSL.name("abe_version_stats"), null);
    }

    /**
     * Create an aliased <code>Cartrawler_dev_internal.dbo.abe_version_stats</code> table reference
     */
    public AbeVersionStats(String alias) {
        this(DSL.name(alias), ABE_VERSION_STATS);
    }

    /**
     * Create an aliased <code>Cartrawler_dev_internal.dbo.abe_version_stats</code> table reference
     */
    public AbeVersionStats(Name alias) {
        this(alias, ABE_VERSION_STATS);
    }

    private AbeVersionStats(Name alias, Table<AbeVersionStatsRecord> aliased) {
        this(alias, aliased, null);
    }

    private AbeVersionStats(Name alias, Table<AbeVersionStatsRecord> aliased, Field<?>[] parameters) {
        super(alias, null, aliased, parameters, DSL.comment(""));
    }

    public <O extends Record> AbeVersionStats(Table<O> child, ForeignKey<O, AbeVersionStatsRecord> key) {
        super(child, key, ABE_VERSION_STATS);
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
    public List<Index> getIndexes() {
        return Arrays.<Index>asList(Indexes.ABE_VERSION_STATS_PK_ABE_VERSION_STATS);
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Identity<AbeVersionStatsRecord, Integer> getIdentity() {
        return Keys.IDENTITY_ABE_VERSION_STATS;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public UniqueKey<AbeVersionStatsRecord> getPrimaryKey() {
        return Keys.PK_ABE_VERSION_STATS;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public List<UniqueKey<AbeVersionStatsRecord>> getKeys() {
        return Arrays.<UniqueKey<AbeVersionStatsRecord>>asList(Keys.PK_ABE_VERSION_STATS);
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public AbeVersionStats as(String alias) {
        return new AbeVersionStats(DSL.name(alias), this);
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public AbeVersionStats as(Name alias) {
        return new AbeVersionStats(alias, this);
    }

    /**
     * Rename this table
     */
    @Override
    public AbeVersionStats rename(String name) {
        return new AbeVersionStats(DSL.name(name), null);
    }

    /**
     * Rename this table
     */
    @Override
    public AbeVersionStats rename(Name name) {
        return new AbeVersionStats(name, null);
    }
}