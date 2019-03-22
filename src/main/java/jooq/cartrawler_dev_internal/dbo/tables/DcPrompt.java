/*
 * This file is generated by jOOQ.
 */
package jooq.cartrawler_dev_internal.dbo.tables;


import java.util.Arrays;
import java.util.List;
import java.util.UUID;

import javax.annotation.Generated;

import jooq.cartrawler_dev_internal.dbo.Dbo;
import jooq.cartrawler_dev_internal.dbo.Indexes;
import jooq.cartrawler_dev_internal.dbo.Keys;
import jooq.cartrawler_dev_internal.dbo.tables.records.DcPromptRecord;

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
public class DcPrompt extends TableImpl<DcPromptRecord> {

    private static final long serialVersionUID = 1896391422;

    /**
     * The reference instance of <code>Cartrawler_dev_internal.dbo.dc_prompt</code>
     */
    public static final DcPrompt DC_PROMPT = new DcPrompt();

    /**
     * The class holding records for this type
     */
    @Override
    public Class<DcPromptRecord> getRecordType() {
        return DcPromptRecord.class;
    }

    /**
     * The column <code>Cartrawler_dev_internal.dbo.dc_prompt.guid</code>.
     */
    public final TableField<DcPromptRecord, UUID> GUID = createField("guid", org.jooq.impl.SQLDataType.UUID.nullable(false).defaultValue(org.jooq.impl.DSL.field("(newid())", org.jooq.impl.SQLDataType.UUID)), this, "");

    /**
     * The column <code>Cartrawler_dev_internal.dbo.dc_prompt.id</code>.
     */
    public final TableField<DcPromptRecord, Integer> ID = createField("id", org.jooq.impl.SQLDataType.INTEGER.nullable(false).identity(true), this, "");

    /**
     * The column <code>Cartrawler_dev_internal.dbo.dc_prompt.significance</code>.
     */
    public final TableField<DcPromptRecord, Integer> SIGNIFICANCE = createField("significance", org.jooq.impl.SQLDataType.INTEGER.defaultValue(org.jooq.impl.DSL.field("((0))", org.jooq.impl.SQLDataType.INTEGER)), this, "");

    /**
     * The column <code>Cartrawler_dev_internal.dbo.dc_prompt.recommendation</code>.
     */
    public final TableField<DcPromptRecord, String> RECOMMENDATION = createField("recommendation", org.jooq.impl.SQLDataType.VARCHAR(128), this, "");

    /**
     * The column <code>Cartrawler_dev_internal.dbo.dc_prompt.shortform</code>.
     */
    public final TableField<DcPromptRecord, String> SHORTFORM = createField("shortform", org.jooq.impl.SQLDataType.VARCHAR(128).nullable(false), this, "");

    /**
     * The column <code>Cartrawler_dev_internal.dbo.dc_prompt.prompt</code>.
     */
    public final TableField<DcPromptRecord, String> PROMPT = createField("prompt", org.jooq.impl.SQLDataType.VARCHAR(256), this, "");

    /**
     * Create a <code>Cartrawler_dev_internal.dbo.dc_prompt</code> table reference
     */
    public DcPrompt() {
        this(DSL.name("dc_prompt"), null);
    }

    /**
     * Create an aliased <code>Cartrawler_dev_internal.dbo.dc_prompt</code> table reference
     */
    public DcPrompt(String alias) {
        this(DSL.name(alias), DC_PROMPT);
    }

    /**
     * Create an aliased <code>Cartrawler_dev_internal.dbo.dc_prompt</code> table reference
     */
    public DcPrompt(Name alias) {
        this(alias, DC_PROMPT);
    }

    private DcPrompt(Name alias, Table<DcPromptRecord> aliased) {
        this(alias, aliased, null);
    }

    private DcPrompt(Name alias, Table<DcPromptRecord> aliased, Field<?>[] parameters) {
        super(alias, null, aliased, parameters, DSL.comment(""));
    }

    public <O extends Record> DcPrompt(Table<O> child, ForeignKey<O, DcPromptRecord> key) {
        super(child, key, DC_PROMPT);
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
        return Arrays.<Index>asList(Indexes.DC_PROMPT_DC_UNIQUE_PROMPT_TEXT, Indexes.DC_PROMPT_PK__DC_PROMPT__153CB68D);
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Identity<DcPromptRecord, Integer> getIdentity() {
        return Keys.IDENTITY_DC_PROMPT;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public UniqueKey<DcPromptRecord> getPrimaryKey() {
        return Keys.PK__DC_PROMPT__153CB68D;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public List<UniqueKey<DcPromptRecord>> getKeys() {
        return Arrays.<UniqueKey<DcPromptRecord>>asList(Keys.PK__DC_PROMPT__153CB68D, Keys.DC_UNIQUE_PROMPT_TEXT);
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public DcPrompt as(String alias) {
        return new DcPrompt(DSL.name(alias), this);
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public DcPrompt as(Name alias) {
        return new DcPrompt(alias, this);
    }

    /**
     * Rename this table
     */
    @Override
    public DcPrompt rename(String name) {
        return new DcPrompt(DSL.name(name), null);
    }

    /**
     * Rename this table
     */
    @Override
    public DcPrompt rename(Name name) {
        return new DcPrompt(name, null);
    }
}