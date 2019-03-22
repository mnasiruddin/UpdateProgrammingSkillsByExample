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
import jooq.cartrawler_dev_internal.dbo.tables.records.ClientsortinglinesRecord;

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
public class Clientsortinglines extends TableImpl<ClientsortinglinesRecord> {

    private static final long serialVersionUID = 72935649;

    /**
     * The reference instance of <code>Cartrawler_dev_internal.dbo.ClientSortingLines</code>
     */
    public static final Clientsortinglines CLIENTSORTINGLINES = new Clientsortinglines();

    /**
     * The class holding records for this type
     */
    @Override
    public Class<ClientsortinglinesRecord> getRecordType() {
        return ClientsortinglinesRecord.class;
    }

    /**
     * The column <code>Cartrawler_dev_internal.dbo.ClientSortingLines.id</code>.
     */
    public final TableField<ClientsortinglinesRecord, Integer> ID = createField("id", org.jooq.impl.SQLDataType.INTEGER.nullable(false).identity(true), this, "");

    /**
     * The column <code>Cartrawler_dev_internal.dbo.ClientSortingLines.fk_client</code>.
     */
    public final TableField<ClientsortinglinesRecord, Integer> FK_CLIENT = createField("fk_client", org.jooq.impl.SQLDataType.INTEGER, this, "");

    /**
     * The column <code>Cartrawler_dev_internal.dbo.ClientSortingLines.supplier</code>.
     */
    public final TableField<ClientsortinglinesRecord, String> SUPPLIER = createField("supplier", org.jooq.impl.SQLDataType.VARCHAR(50), this, "");

    /**
     * The column <code>Cartrawler_dev_internal.dbo.ClientSortingLines.veh_class</code>.
     */
    public final TableField<ClientsortinglinesRecord, String> VEH_CLASS = createField("veh_class", org.jooq.impl.SQLDataType.VARCHAR(50), this, "");

    /**
     * The column <code>Cartrawler_dev_internal.dbo.ClientSortingLines.veh_sipp</code>.
     */
    public final TableField<ClientsortinglinesRecord, String> VEH_SIPP = createField("veh_sipp", org.jooq.impl.SQLDataType.VARCHAR(50), this, "");

    /**
     * The column <code>Cartrawler_dev_internal.dbo.ClientSortingLines.position</code>.
     */
    public final TableField<ClientsortinglinesRecord, Integer> POSITION = createField("position", org.jooq.impl.SQLDataType.INTEGER.nullable(false), this, "");

    /**
     * The column <code>Cartrawler_dev_internal.dbo.ClientSortingLines.line_index</code>.
     */
    public final TableField<ClientsortinglinesRecord, Integer> LINE_INDEX = createField("line_index", org.jooq.impl.SQLDataType.INTEGER.nullable(false), this, "");

    /**
     * The column <code>Cartrawler_dev_internal.dbo.ClientSortingLines.country</code>.
     */
    public final TableField<ClientsortinglinesRecord, String> COUNTRY = createField("country", org.jooq.impl.SQLDataType.VARCHAR(2), this, "");

    /**
     * The column <code>Cartrawler_dev_internal.dbo.ClientSortingLines.fk_virtualloc</code>.
     */
    public final TableField<ClientsortinglinesRecord, Integer> FK_VIRTUALLOC = createField("fk_virtualloc", org.jooq.impl.SQLDataType.INTEGER, this, "");

    /**
     * The column <code>Cartrawler_dev_internal.dbo.ClientSortingLines.residency</code>.
     */
    public final TableField<ClientsortinglinesRecord, String> RESIDENCY = createField("residency", org.jooq.impl.SQLDataType.VARCHAR(2), this, "");

    /**
     * The column <code>Cartrawler_dev_internal.dbo.ClientSortingLines.transmission</code>.
     */
    public final TableField<ClientsortinglinesRecord, String> TRANSMISSION = createField("transmission", org.jooq.impl.SQLDataType.VARCHAR(20), this, "");

    /**
     * The column <code>Cartrawler_dev_internal.dbo.ClientSortingLines.min_days</code>.
     */
    public final TableField<ClientsortinglinesRecord, Short> MIN_DAYS = createField("min_days", org.jooq.impl.SQLDataType.SMALLINT, this, "");

    /**
     * The column <code>Cartrawler_dev_internal.dbo.ClientSortingLines.max_days</code>.
     */
    public final TableField<ClientsortinglinesRecord, Short> MAX_DAYS = createField("max_days", org.jooq.impl.SQLDataType.SMALLINT, this, "");

    /**
     * Create a <code>Cartrawler_dev_internal.dbo.ClientSortingLines</code> table reference
     */
    public Clientsortinglines() {
        this(DSL.name("ClientSortingLines"), null);
    }

    /**
     * Create an aliased <code>Cartrawler_dev_internal.dbo.ClientSortingLines</code> table reference
     */
    public Clientsortinglines(String alias) {
        this(DSL.name(alias), CLIENTSORTINGLINES);
    }

    /**
     * Create an aliased <code>Cartrawler_dev_internal.dbo.ClientSortingLines</code> table reference
     */
    public Clientsortinglines(Name alias) {
        this(alias, CLIENTSORTINGLINES);
    }

    private Clientsortinglines(Name alias, Table<ClientsortinglinesRecord> aliased) {
        this(alias, aliased, null);
    }

    private Clientsortinglines(Name alias, Table<ClientsortinglinesRecord> aliased, Field<?>[] parameters) {
        super(alias, null, aliased, parameters, DSL.comment(""));
    }

    public <O extends Record> Clientsortinglines(Table<O> child, ForeignKey<O, ClientsortinglinesRecord> key) {
        super(child, key, CLIENTSORTINGLINES);
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
        return Arrays.<Index>asList(Indexes.CLIENTSORTINGLINES_PK_CLIENTSORTINGLINES);
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Identity<ClientsortinglinesRecord, Integer> getIdentity() {
        return Keys.IDENTITY_CLIENTSORTINGLINES;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public UniqueKey<ClientsortinglinesRecord> getPrimaryKey() {
        return Keys.PK_CLIENTSORTINGLINES;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public List<UniqueKey<ClientsortinglinesRecord>> getKeys() {
        return Arrays.<UniqueKey<ClientsortinglinesRecord>>asList(Keys.PK_CLIENTSORTINGLINES);
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Clientsortinglines as(String alias) {
        return new Clientsortinglines(DSL.name(alias), this);
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Clientsortinglines as(Name alias) {
        return new Clientsortinglines(alias, this);
    }

    /**
     * Rename this table
     */
    @Override
    public Clientsortinglines rename(String name) {
        return new Clientsortinglines(DSL.name(name), null);
    }

    /**
     * Rename this table
     */
    @Override
    public Clientsortinglines rename(Name name) {
        return new Clientsortinglines(name, null);
    }
}