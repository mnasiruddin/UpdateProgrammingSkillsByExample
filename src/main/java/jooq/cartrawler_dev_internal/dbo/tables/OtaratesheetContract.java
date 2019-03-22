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
import jooq.cartrawler_dev_internal.dbo.tables.records.OtaratesheetContractRecord;

import org.jooq.Field;
import org.jooq.ForeignKey;
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
public class OtaratesheetContract extends TableImpl<OtaratesheetContractRecord> {

    private static final long serialVersionUID = -186048572;

    /**
     * The reference instance of <code>Cartrawler_dev_internal.dbo.otaratesheet_contract</code>
     */
    public static final OtaratesheetContract OTARATESHEET_CONTRACT = new OtaratesheetContract();

    /**
     * The class holding records for this type
     */
    @Override
    public Class<OtaratesheetContractRecord> getRecordType() {
        return OtaratesheetContractRecord.class;
    }

    /**
     * The column <code>Cartrawler_dev_internal.dbo.otaratesheet_contract.guid</code>.
     */
    public final TableField<OtaratesheetContractRecord, UUID> GUID = createField("guid", org.jooq.impl.SQLDataType.UUID.nullable(false).defaultValue(org.jooq.impl.DSL.field("(newid())", org.jooq.impl.SQLDataType.UUID)), this, "");

    /**
     * The column <code>Cartrawler_dev_internal.dbo.otaratesheet_contract.ratesheet_id</code>.
     */
    public final TableField<OtaratesheetContractRecord, Integer> RATESHEET_ID = createField("ratesheet_id", org.jooq.impl.SQLDataType.INTEGER.nullable(false), this, "");

    /**
     * The column <code>Cartrawler_dev_internal.dbo.otaratesheet_contract.contract_id</code>.
     */
    public final TableField<OtaratesheetContractRecord, Integer> CONTRACT_ID = createField("contract_id", org.jooq.impl.SQLDataType.INTEGER, this, "");

    /**
     * Create a <code>Cartrawler_dev_internal.dbo.otaratesheet_contract</code> table reference
     */
    public OtaratesheetContract() {
        this(DSL.name("otaratesheet_contract"), null);
    }

    /**
     * Create an aliased <code>Cartrawler_dev_internal.dbo.otaratesheet_contract</code> table reference
     */
    public OtaratesheetContract(String alias) {
        this(DSL.name(alias), OTARATESHEET_CONTRACT);
    }

    /**
     * Create an aliased <code>Cartrawler_dev_internal.dbo.otaratesheet_contract</code> table reference
     */
    public OtaratesheetContract(Name alias) {
        this(alias, OTARATESHEET_CONTRACT);
    }

    private OtaratesheetContract(Name alias, Table<OtaratesheetContractRecord> aliased) {
        this(alias, aliased, null);
    }

    private OtaratesheetContract(Name alias, Table<OtaratesheetContractRecord> aliased, Field<?>[] parameters) {
        super(alias, null, aliased, parameters, DSL.comment(""));
    }

    public <O extends Record> OtaratesheetContract(Table<O> child, ForeignKey<O, OtaratesheetContractRecord> key) {
        super(child, key, OTARATESHEET_CONTRACT);
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
        return Arrays.<Index>asList(Indexes.OTARATESHEET_CONTRACT_PK_OTARATESHEET_CONTRACT);
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public UniqueKey<OtaratesheetContractRecord> getPrimaryKey() {
        return Keys.PK_OTARATESHEET_CONTRACT;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public List<UniqueKey<OtaratesheetContractRecord>> getKeys() {
        return Arrays.<UniqueKey<OtaratesheetContractRecord>>asList(Keys.PK_OTARATESHEET_CONTRACT);
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public OtaratesheetContract as(String alias) {
        return new OtaratesheetContract(DSL.name(alias), this);
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public OtaratesheetContract as(Name alias) {
        return new OtaratesheetContract(alias, this);
    }

    /**
     * Rename this table
     */
    @Override
    public OtaratesheetContract rename(String name) {
        return new OtaratesheetContract(DSL.name(name), null);
    }

    /**
     * Rename this table
     */
    @Override
    public OtaratesheetContract rename(Name name) {
        return new OtaratesheetContract(name, null);
    }
}