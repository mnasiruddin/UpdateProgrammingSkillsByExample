/*
 * This file is generated by jOOQ.
 */
package jooq.cartrawler_dev_internal.dbo.tables.records;


import javax.annotation.Generated;

import jooq.cartrawler_dev_internal.dbo.tables.Virtuallocations;

import org.jooq.Field;
import org.jooq.Record1;
import org.jooq.Record10;
import org.jooq.Row10;
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
public class VirtuallocationsRecord extends UpdatableRecordImpl<VirtuallocationsRecord> implements Record10<Integer, String, Boolean, String, String, Integer, Integer, Integer, Boolean, Integer> {

    private static final long serialVersionUID = 1011256946;

    /**
     * Setter for <code>Cartrawler_dev_internal.dbo.VirtualLocations.ID</code>.
     */
    public void setId(Integer value) {
        set(0, value);
    }

    /**
     * Getter for <code>Cartrawler_dev_internal.dbo.VirtualLocations.ID</code>.
     */
    public Integer getId() {
        return (Integer) get(0);
    }

    /**
     * Setter for <code>Cartrawler_dev_internal.dbo.VirtualLocations.name</code>.
     */
    public void setName(String value) {
        set(1, value);
    }

    /**
     * Getter for <code>Cartrawler_dev_internal.dbo.VirtualLocations.name</code>.
     */
    public String getName() {
        return (String) get(1);
    }

    /**
     * Setter for <code>Cartrawler_dev_internal.dbo.VirtualLocations.displayOnEngine</code>.
     */
    public void setDisplayonengine(Boolean value) {
        set(2, value);
    }

    /**
     * Getter for <code>Cartrawler_dev_internal.dbo.VirtualLocations.displayOnEngine</code>.
     */
    public Boolean getDisplayonengine() {
        return (Boolean) get(2);
    }

    /**
     * Setter for <code>Cartrawler_dev_internal.dbo.VirtualLocations.countryCodeForEngine</code>.
     */
    public void setCountrycodeforengine(String value) {
        set(3, value);
    }

    /**
     * Getter for <code>Cartrawler_dev_internal.dbo.VirtualLocations.countryCodeForEngine</code>.
     */
    public String getCountrycodeforengine() {
        return (String) get(3);
    }

    /**
     * Setter for <code>Cartrawler_dev_internal.dbo.VirtualLocations.relatedCountry</code>.
     */
    public void setRelatedcountry(String value) {
        set(4, value);
    }

    /**
     * Getter for <code>Cartrawler_dev_internal.dbo.VirtualLocations.relatedCountry</code>.
     */
    public String getRelatedcountry() {
        return (String) get(4);
    }

    /**
     * Setter for <code>Cartrawler_dev_internal.dbo.VirtualLocations.fk_user</code>.
     */
    public void setFkUser(Integer value) {
        set(5, value);
    }

    /**
     * Getter for <code>Cartrawler_dev_internal.dbo.VirtualLocations.fk_user</code>.
     */
    public Integer getFkUser() {
        return (Integer) get(5);
    }

    /**
     * Setter for <code>Cartrawler_dev_internal.dbo.VirtualLocations.fk_org</code>.
     */
    public void setFkOrg(Integer value) {
        set(6, value);
    }

    /**
     * Getter for <code>Cartrawler_dev_internal.dbo.VirtualLocations.fk_org</code>.
     */
    public Integer getFkOrg() {
        return (Integer) get(6);
    }

    /**
     * Setter for <code>Cartrawler_dev_internal.dbo.VirtualLocations.amendedBy</code>.
     */
    public void setAmendedby(Integer value) {
        set(7, value);
    }

    /**
     * Getter for <code>Cartrawler_dev_internal.dbo.VirtualLocations.amendedBy</code>.
     */
    public Integer getAmendedby() {
        return (Integer) get(7);
    }

    /**
     * Setter for <code>Cartrawler_dev_internal.dbo.VirtualLocations.negativeList</code>.
     */
    public void setNegativelist(Boolean value) {
        set(8, value);
    }

    /**
     * Getter for <code>Cartrawler_dev_internal.dbo.VirtualLocations.negativeList</code>.
     */
    public Boolean getNegativelist() {
        return (Boolean) get(8);
    }

    /**
     * Setter for <code>Cartrawler_dev_internal.dbo.VirtualLocations.writeProtectedByUser</code>.
     */
    public void setWriteprotectedbyuser(Integer value) {
        set(9, value);
    }

    /**
     * Getter for <code>Cartrawler_dev_internal.dbo.VirtualLocations.writeProtectedByUser</code>.
     */
    public Integer getWriteprotectedbyuser() {
        return (Integer) get(9);
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
    // Record10 type implementation
    // -------------------------------------------------------------------------

    /**
     * {@inheritDoc}
     */
    @Override
    public Row10<Integer, String, Boolean, String, String, Integer, Integer, Integer, Boolean, Integer> fieldsRow() {
        return (Row10) super.fieldsRow();
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Row10<Integer, String, Boolean, String, String, Integer, Integer, Integer, Boolean, Integer> valuesRow() {
        return (Row10) super.valuesRow();
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Field<Integer> field1() {
        return Virtuallocations.VIRTUALLOCATIONS.ID;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Field<String> field2() {
        return Virtuallocations.VIRTUALLOCATIONS.NAME;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Field<Boolean> field3() {
        return Virtuallocations.VIRTUALLOCATIONS.DISPLAYONENGINE;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Field<String> field4() {
        return Virtuallocations.VIRTUALLOCATIONS.COUNTRYCODEFORENGINE;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Field<String> field5() {
        return Virtuallocations.VIRTUALLOCATIONS.RELATEDCOUNTRY;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Field<Integer> field6() {
        return Virtuallocations.VIRTUALLOCATIONS.FK_USER;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Field<Integer> field7() {
        return Virtuallocations.VIRTUALLOCATIONS.FK_ORG;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Field<Integer> field8() {
        return Virtuallocations.VIRTUALLOCATIONS.AMENDEDBY;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Field<Boolean> field9() {
        return Virtuallocations.VIRTUALLOCATIONS.NEGATIVELIST;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Field<Integer> field10() {
        return Virtuallocations.VIRTUALLOCATIONS.WRITEPROTECTEDBYUSER;
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
        return getName();
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Boolean component3() {
        return getDisplayonengine();
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public String component4() {
        return getCountrycodeforengine();
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public String component5() {
        return getRelatedcountry();
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Integer component6() {
        return getFkUser();
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Integer component7() {
        return getFkOrg();
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Integer component8() {
        return getAmendedby();
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Boolean component9() {
        return getNegativelist();
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Integer component10() {
        return getWriteprotectedbyuser();
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
        return getName();
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Boolean value3() {
        return getDisplayonengine();
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public String value4() {
        return getCountrycodeforengine();
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public String value5() {
        return getRelatedcountry();
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Integer value6() {
        return getFkUser();
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Integer value7() {
        return getFkOrg();
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Integer value8() {
        return getAmendedby();
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Boolean value9() {
        return getNegativelist();
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Integer value10() {
        return getWriteprotectedbyuser();
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public VirtuallocationsRecord value1(Integer value) {
        setId(value);
        return this;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public VirtuallocationsRecord value2(String value) {
        setName(value);
        return this;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public VirtuallocationsRecord value3(Boolean value) {
        setDisplayonengine(value);
        return this;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public VirtuallocationsRecord value4(String value) {
        setCountrycodeforengine(value);
        return this;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public VirtuallocationsRecord value5(String value) {
        setRelatedcountry(value);
        return this;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public VirtuallocationsRecord value6(Integer value) {
        setFkUser(value);
        return this;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public VirtuallocationsRecord value7(Integer value) {
        setFkOrg(value);
        return this;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public VirtuallocationsRecord value8(Integer value) {
        setAmendedby(value);
        return this;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public VirtuallocationsRecord value9(Boolean value) {
        setNegativelist(value);
        return this;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public VirtuallocationsRecord value10(Integer value) {
        setWriteprotectedbyuser(value);
        return this;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public VirtuallocationsRecord values(Integer value1, String value2, Boolean value3, String value4, String value5, Integer value6, Integer value7, Integer value8, Boolean value9, Integer value10) {
        value1(value1);
        value2(value2);
        value3(value3);
        value4(value4);
        value5(value5);
        value6(value6);
        value7(value7);
        value8(value8);
        value9(value9);
        value10(value10);
        return this;
    }

    // -------------------------------------------------------------------------
    // Constructors
    // -------------------------------------------------------------------------

    /**
     * Create a detached VirtuallocationsRecord
     */
    public VirtuallocationsRecord() {
        super(Virtuallocations.VIRTUALLOCATIONS);
    }

    /**
     * Create a detached, initialised VirtuallocationsRecord
     */
    public VirtuallocationsRecord(Integer id, String name, Boolean displayonengine, String countrycodeforengine, String relatedcountry, Integer fkUser, Integer fkOrg, Integer amendedby, Boolean negativelist, Integer writeprotectedbyuser) {
        super(Virtuallocations.VIRTUALLOCATIONS);

        set(0, id);
        set(1, name);
        set(2, displayonengine);
        set(3, countrycodeforengine);
        set(4, relatedcountry);
        set(5, fkUser);
        set(6, fkOrg);
        set(7, amendedby);
        set(8, negativelist);
        set(9, writeprotectedbyuser);
    }
}