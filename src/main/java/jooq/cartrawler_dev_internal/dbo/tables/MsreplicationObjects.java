/*
 * This file is generated by jOOQ.
 */
package jooq.cartrawler_dev_internal.dbo.tables;


import java.util.Arrays;
import java.util.List;

import javax.annotation.Generated;

import jooq.cartrawler_dev_internal.dbo.Dbo;
import jooq.cartrawler_dev_internal.dbo.Indexes;
import jooq.cartrawler_dev_internal.dbo.tables.records.MsreplicationObjectsRecord;

import org.jooq.Field;
import org.jooq.ForeignKey;
import org.jooq.Index;
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
public class MsreplicationObjects extends TableImpl<MsreplicationObjectsRecord> {

    private static final long serialVersionUID = -1573139884;

    /**
     * The reference instance of <code>Cartrawler_dev_internal.dbo.MSreplication_objects</code>
     */
    public static final MsreplicationObjects MSREPLICATION_OBJECTS = new MsreplicationObjects();

    /**
     * The class holding records for this type
     */
    @Override
    public Class<MsreplicationObjectsRecord> getRecordType() {
        return MsreplicationObjectsRecord.class;
    }

    /**
     * The column <code>Cartrawler_dev_internal.dbo.MSreplication_objects.publisher</code>.
     */
    public final TableField<MsreplicationObjectsRecord, String> PUBLISHER = createField("publisher", org.jooq.impl.SQLDataType.NVARCHAR(128), this, "");

    /**
     * The column <code>Cartrawler_dev_internal.dbo.MSreplication_objects.publisher_db</code>.
     */
    public final TableField<MsreplicationObjectsRecord, String> PUBLISHER_DB = createField("publisher_db", org.jooq.impl.SQLDataType.NVARCHAR(128), this, "");

    /**
     * The column <code>Cartrawler_dev_internal.dbo.MSreplication_objects.publication</code>.
     */
    public final TableField<MsreplicationObjectsRecord, String> PUBLICATION = createField("publication", org.jooq.impl.SQLDataType.NVARCHAR(128), this, "");

    /**
     * The column <code>Cartrawler_dev_internal.dbo.MSreplication_objects.object_name</code>.
     */
    public final TableField<MsreplicationObjectsRecord, String> OBJECT_NAME = createField("object_name", org.jooq.impl.SQLDataType.NVARCHAR(128).nullable(false), this, "");

    /**
     * The column <code>Cartrawler_dev_internal.dbo.MSreplication_objects.object_type</code>.
     */
    public final TableField<MsreplicationObjectsRecord, String> OBJECT_TYPE = createField("object_type", org.jooq.impl.SQLDataType.CHAR(2).nullable(false), this, "");

    /**
     * The column <code>Cartrawler_dev_internal.dbo.MSreplication_objects.article</code>.
     */
    public final TableField<MsreplicationObjectsRecord, String> ARTICLE = createField("article", org.jooq.impl.SQLDataType.NVARCHAR(128), this, "");

    /**
     * Create a <code>Cartrawler_dev_internal.dbo.MSreplication_objects</code> table reference
     */
    public MsreplicationObjects() {
        this(DSL.name("MSreplication_objects"), null);
    }

    /**
     * Create an aliased <code>Cartrawler_dev_internal.dbo.MSreplication_objects</code> table reference
     */
    public MsreplicationObjects(String alias) {
        this(DSL.name(alias), MSREPLICATION_OBJECTS);
    }

    /**
     * Create an aliased <code>Cartrawler_dev_internal.dbo.MSreplication_objects</code> table reference
     */
    public MsreplicationObjects(Name alias) {
        this(alias, MSREPLICATION_OBJECTS);
    }

    private MsreplicationObjects(Name alias, Table<MsreplicationObjectsRecord> aliased) {
        this(alias, aliased, null);
    }

    private MsreplicationObjects(Name alias, Table<MsreplicationObjectsRecord> aliased, Field<?>[] parameters) {
        super(alias, null, aliased, parameters, DSL.comment(""));
    }

    public <O extends Record> MsreplicationObjects(Table<O> child, ForeignKey<O, MsreplicationObjectsRecord> key) {
        super(child, key, MSREPLICATION_OBJECTS);
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
        return Arrays.<Index>asList(Indexes.MSREPLICATION_OBJECTS_UCMSREPLICATION_OBJECTS);
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public MsreplicationObjects as(String alias) {
        return new MsreplicationObjects(DSL.name(alias), this);
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public MsreplicationObjects as(Name alias) {
        return new MsreplicationObjects(alias, this);
    }

    /**
     * Rename this table
     */
    @Override
    public MsreplicationObjects rename(String name) {
        return new MsreplicationObjects(DSL.name(name), null);
    }

    /**
     * Rename this table
     */
    @Override
    public MsreplicationObjects rename(Name name) {
        return new MsreplicationObjects(name, null);
    }
}