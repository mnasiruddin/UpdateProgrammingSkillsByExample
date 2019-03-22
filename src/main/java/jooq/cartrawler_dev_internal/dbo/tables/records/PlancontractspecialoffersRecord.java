/*
 * This file is generated by jOOQ.
 */
package jooq.cartrawler_dev_internal.dbo.tables.records;


import java.math.BigDecimal;
import java.sql.Timestamp;
import java.util.UUID;

import javax.annotation.Generated;

import jooq.cartrawler_dev_internal.dbo.tables.Plancontractspecialoffers;

import org.jooq.Record1;
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
public class PlancontractspecialoffersRecord extends UpdatableRecordImpl<PlancontractspecialoffersRecord> {

    private static final long serialVersionUID = -1265481383;

    /**
     * Setter for <code>Cartrawler_dev_internal.dbo.PlanContractSpecialOffers.guid</code>.
     */
    public void setGuid(UUID value) {
        set(0, value);
    }

    /**
     * Getter for <code>Cartrawler_dev_internal.dbo.PlanContractSpecialOffers.guid</code>.
     */
    public UUID getGuid() {
        return (UUID) get(0);
    }

    /**
     * Setter for <code>Cartrawler_dev_internal.dbo.PlanContractSpecialOffers.id</code>.
     */
    public void setId(Integer value) {
        set(1, value);
    }

    /**
     * Getter for <code>Cartrawler_dev_internal.dbo.PlanContractSpecialOffers.id</code>.
     */
    public Integer getId() {
        return (Integer) get(1);
    }

    /**
     * Setter for <code>Cartrawler_dev_internal.dbo.PlanContractSpecialOffers.effectiveFrom</code>.
     */
    public void setEffectivefrom(Timestamp value) {
        set(2, value);
    }

    /**
     * Getter for <code>Cartrawler_dev_internal.dbo.PlanContractSpecialOffers.effectiveFrom</code>.
     */
    public Timestamp getEffectivefrom() {
        return (Timestamp) get(2);
    }

    /**
     * Setter for <code>Cartrawler_dev_internal.dbo.PlanContractSpecialOffers.effectiveTo</code>.
     */
    public void setEffectiveto(Timestamp value) {
        set(3, value);
    }

    /**
     * Getter for <code>Cartrawler_dev_internal.dbo.PlanContractSpecialOffers.effectiveTo</code>.
     */
    public Timestamp getEffectiveto() {
        return (Timestamp) get(3);
    }

    /**
     * Setter for <code>Cartrawler_dev_internal.dbo.PlanContractSpecialOffers.pickupFrom</code>.
     */
    public void setPickupfrom(Timestamp value) {
        set(4, value);
    }

    /**
     * Getter for <code>Cartrawler_dev_internal.dbo.PlanContractSpecialOffers.pickupFrom</code>.
     */
    public Timestamp getPickupfrom() {
        return (Timestamp) get(4);
    }

    /**
     * Setter for <code>Cartrawler_dev_internal.dbo.PlanContractSpecialOffers.pickupTo</code>.
     */
    public void setPickupto(Timestamp value) {
        set(5, value);
    }

    /**
     * Getter for <code>Cartrawler_dev_internal.dbo.PlanContractSpecialOffers.pickupTo</code>.
     */
    public Timestamp getPickupto() {
        return (Timestamp) get(5);
    }

    /**
     * Setter for <code>Cartrawler_dev_internal.dbo.PlanContractSpecialOffers.fk_virtualLocation</code>.
     */
    public void setFkVirtuallocation(Integer value) {
        set(6, value);
    }

    /**
     * Getter for <code>Cartrawler_dev_internal.dbo.PlanContractSpecialOffers.fk_virtualLocation</code>.
     */
    public Integer getFkVirtuallocation() {
        return (Integer) get(6);
    }

    /**
     * Setter for <code>Cartrawler_dev_internal.dbo.PlanContractSpecialOffers.fk_location</code>.
     */
    public void setFkLocation(Integer value) {
        set(7, value);
    }

    /**
     * Getter for <code>Cartrawler_dev_internal.dbo.PlanContractSpecialOffers.fk_location</code>.
     */
    public Integer getFkLocation() {
        return (Integer) get(7);
    }

    /**
     * Setter for <code>Cartrawler_dev_internal.dbo.PlanContractSpecialOffers.offerType</code>.
     */
    public void setOffertype(String value) {
        set(8, value);
    }

    /**
     * Getter for <code>Cartrawler_dev_internal.dbo.PlanContractSpecialOffers.offerType</code>.
     */
    public String getOffertype() {
        return (String) get(8);
    }

    /**
     * Setter for <code>Cartrawler_dev_internal.dbo.PlanContractSpecialOffers.offerText</code>.
     */
    public void setOffertext(String value) {
        set(9, value);
    }

    /**
     * Getter for <code>Cartrawler_dev_internal.dbo.PlanContractSpecialOffers.offerText</code>.
     */
    public String getOffertext() {
        return (String) get(9);
    }

    /**
     * Setter for <code>Cartrawler_dev_internal.dbo.PlanContractSpecialOffers.offerTextVerbose</code>.
     */
    public void setOffertextverbose(String value) {
        set(10, value);
    }

    /**
     * Getter for <code>Cartrawler_dev_internal.dbo.PlanContractSpecialOffers.offerTextVerbose</code>.
     */
    public String getOffertextverbose() {
        return (String) get(10);
    }

    /**
     * Setter for <code>Cartrawler_dev_internal.dbo.PlanContractSpecialOffers.fk_contract</code>.
     */
    public void setFkContract(Integer value) {
        set(11, value);
    }

    /**
     * Getter for <code>Cartrawler_dev_internal.dbo.PlanContractSpecialOffers.fk_contract</code>.
     */
    public Integer getFkContract() {
        return (Integer) get(11);
    }

    /**
     * Setter for <code>Cartrawler_dev_internal.dbo.PlanContractSpecialOffers.SIPPList</code>.
     */
    public void setSipplist(String value) {
        set(12, value);
    }

    /**
     * Getter for <code>Cartrawler_dev_internal.dbo.PlanContractSpecialOffers.SIPPList</code>.
     */
    public String getSipplist() {
        return (String) get(12);
    }

    /**
     * Setter for <code>Cartrawler_dev_internal.dbo.PlanContractSpecialOffers.minDays</code>.
     */
    public void setMindays(Integer value) {
        set(13, value);
    }

    /**
     * Getter for <code>Cartrawler_dev_internal.dbo.PlanContractSpecialOffers.minDays</code>.
     */
    public Integer getMindays() {
        return (Integer) get(13);
    }

    /**
     * Setter for <code>Cartrawler_dev_internal.dbo.PlanContractSpecialOffers.maxDays</code>.
     */
    public void setMaxdays(Integer value) {
        set(14, value);
    }

    /**
     * Getter for <code>Cartrawler_dev_internal.dbo.PlanContractSpecialOffers.maxDays</code>.
     */
    public Integer getMaxdays() {
        return (Integer) get(14);
    }

    /**
     * Setter for <code>Cartrawler_dev_internal.dbo.PlanContractSpecialOffers.amendedBy</code>.
     */
    public void setAmendedby(Integer value) {
        set(15, value);
    }

    /**
     * Getter for <code>Cartrawler_dev_internal.dbo.PlanContractSpecialOffers.amendedBy</code>.
     */
    public Integer getAmendedby() {
        return (Integer) get(15);
    }

    /**
     * Setter for <code>Cartrawler_dev_internal.dbo.PlanContractSpecialOffers.offerHtmlVerbose</code>.
     */
    public void setOfferhtmlverbose(String value) {
        set(16, value);
    }

    /**
     * Getter for <code>Cartrawler_dev_internal.dbo.PlanContractSpecialOffers.offerHtmlVerbose</code>.
     */
    public String getOfferhtmlverbose() {
        return (String) get(16);
    }

    /**
     * Setter for <code>Cartrawler_dev_internal.dbo.PlanContractSpecialOffers.offerImageURL</code>.
     */
    public void setOfferimageurl(String value) {
        set(17, value);
    }

    /**
     * Getter for <code>Cartrawler_dev_internal.dbo.PlanContractSpecialOffers.offerImageURL</code>.
     */
    public String getOfferimageurl() {
        return (String) get(17);
    }

    /**
     * Setter for <code>Cartrawler_dev_internal.dbo.PlanContractSpecialOffers.so_friendly_name</code>.
     */
    public void setSoFriendlyName(String value) {
        set(18, value);
    }

    /**
     * Getter for <code>Cartrawler_dev_internal.dbo.PlanContractSpecialOffers.so_friendly_name</code>.
     */
    public String getSoFriendlyName() {
        return (String) get(18);
    }

    /**
     * Setter for <code>Cartrawler_dev_internal.dbo.PlanContractSpecialOffers.ui_token</code>.
     */
    public void setUiToken(String value) {
        set(19, value);
    }

    /**
     * Getter for <code>Cartrawler_dev_internal.dbo.PlanContractSpecialOffers.ui_token</code>.
     */
    public String getUiToken() {
        return (String) get(19);
    }

    /**
     * Setter for <code>Cartrawler_dev_internal.dbo.PlanContractSpecialOffers.text_sub</code>.
     */
    public void setTextSub(String value) {
        set(20, value);
    }

    /**
     * Getter for <code>Cartrawler_dev_internal.dbo.PlanContractSpecialOffers.text_sub</code>.
     */
    public String getTextSub() {
        return (String) get(20);
    }

    /**
     * Setter for <code>Cartrawler_dev_internal.dbo.PlanContractSpecialOffers.supplier</code>.
     */
    public void setSupplier(String value) {
        set(21, value);
    }

    /**
     * Getter for <code>Cartrawler_dev_internal.dbo.PlanContractSpecialOffers.supplier</code>.
     */
    public String getSupplier() {
        return (String) get(21);
    }

    /**
     * Setter for <code>Cartrawler_dev_internal.dbo.PlanContractSpecialOffers.country_id</code>.
     */
    public void setCountryId(String value) {
        set(22, value);
    }

    /**
     * Getter for <code>Cartrawler_dev_internal.dbo.PlanContractSpecialOffers.country_id</code>.
     */
    public String getCountryId() {
        return (String) get(22);
    }

    /**
     * Setter for <code>Cartrawler_dev_internal.dbo.PlanContractSpecialOffers.dailyCost</code>.
     */
    public void setDailycost(BigDecimal value) {
        set(23, value);
    }

    /**
     * Getter for <code>Cartrawler_dev_internal.dbo.PlanContractSpecialOffers.dailyCost</code>.
     */
    public BigDecimal getDailycost() {
        return (BigDecimal) get(23);
    }

    /**
     * Setter for <code>Cartrawler_dev_internal.dbo.PlanContractSpecialOffers.maxCost</code>.
     */
    public void setMaxcost(BigDecimal value) {
        set(24, value);
    }

    /**
     * Getter for <code>Cartrawler_dev_internal.dbo.PlanContractSpecialOffers.maxCost</code>.
     */
    public BigDecimal getMaxcost() {
        return (BigDecimal) get(24);
    }

    /**
     * Setter for <code>Cartrawler_dev_internal.dbo.PlanContractSpecialOffers.offerCur</code>.
     */
    public void setOffercur(String value) {
        set(25, value);
    }

    /**
     * Getter for <code>Cartrawler_dev_internal.dbo.PlanContractSpecialOffers.offerCur</code>.
     */
    public String getOffercur() {
        return (String) get(25);
    }

    /**
     * Setter for <code>Cartrawler_dev_internal.dbo.PlanContractSpecialOffers.publicOffer</code>.
     */
    public void setPublicoffer(Boolean value) {
        set(26, value);
    }

    /**
     * Getter for <code>Cartrawler_dev_internal.dbo.PlanContractSpecialOffers.publicOffer</code>.
     */
    public Boolean getPublicoffer() {
        return (Boolean) get(26);
    }

    /**
     * Setter for <code>Cartrawler_dev_internal.dbo.PlanContractSpecialOffers.inFeed</code>.
     */
    public void setInfeed(Boolean value) {
        set(27, value);
    }

    /**
     * Getter for <code>Cartrawler_dev_internal.dbo.PlanContractSpecialOffers.inFeed</code>.
     */
    public Boolean getInfeed() {
        return (Boolean) get(27);
    }

    /**
     * Setter for <code>Cartrawler_dev_internal.dbo.PlanContractSpecialOffers.isOneTime</code>.
     */
    public void setIsonetime(Boolean value) {
        set(28, value);
    }

    /**
     * Getter for <code>Cartrawler_dev_internal.dbo.PlanContractSpecialOffers.isOneTime</code>.
     */
    public Boolean getIsonetime() {
        return (Boolean) get(28);
    }

    /**
     * Setter for <code>Cartrawler_dev_internal.dbo.PlanContractSpecialOffers.display_only</code>.
     */
    public void setDisplayOnly(Boolean value) {
        set(29, value);
    }

    /**
     * Getter for <code>Cartrawler_dev_internal.dbo.PlanContractSpecialOffers.display_only</code>.
     */
    public Boolean getDisplayOnly() {
        return (Boolean) get(29);
    }

    /**
     * Setter for <code>Cartrawler_dev_internal.dbo.PlanContractSpecialOffers.supOptSaleFlag</code>.
     */
    public void setSupoptsaleflag(Boolean value) {
        set(30, value);
    }

    /**
     * Getter for <code>Cartrawler_dev_internal.dbo.PlanContractSpecialOffers.supOptSaleFlag</code>.
     */
    public Boolean getSupoptsaleflag() {
        return (Boolean) get(30);
    }

    /**
     * Setter for <code>Cartrawler_dev_internal.dbo.PlanContractSpecialOffers.create_date</code>.
     */
    public void setCreateDate(Timestamp value) {
        set(31, value);
    }

    /**
     * Getter for <code>Cartrawler_dev_internal.dbo.PlanContractSpecialOffers.create_date</code>.
     */
    public Timestamp getCreateDate() {
        return (Timestamp) get(31);
    }

    /**
     * Setter for <code>Cartrawler_dev_internal.dbo.PlanContractSpecialOffers.deal_of_the_day</code>.
     */
    public void setDealOfTheDay(Boolean value) {
        set(32, value);
    }

    /**
     * Getter for <code>Cartrawler_dev_internal.dbo.PlanContractSpecialOffers.deal_of_the_day</code>.
     */
    public Boolean getDealOfTheDay() {
        return (Boolean) get(32);
    }

    /**
     * Setter for <code>Cartrawler_dev_internal.dbo.PlanContractSpecialOffers.displayOrder</code>.
     */
    public void setDisplayorder(Integer value) {
        set(33, value);
    }

    /**
     * Getter for <code>Cartrawler_dev_internal.dbo.PlanContractSpecialOffers.displayOrder</code>.
     */
    public Integer getDisplayorder() {
        return (Integer) get(33);
    }

    // -------------------------------------------------------------------------
    // Primary key information
    // -------------------------------------------------------------------------

    /**
     * {@inheritDoc}
     */
    @Override
    public Record1<UUID> key() {
        return (Record1) super.key();
    }

    // -------------------------------------------------------------------------
    // Constructors
    // -------------------------------------------------------------------------

    /**
     * Create a detached PlancontractspecialoffersRecord
     */
    public PlancontractspecialoffersRecord() {
        super(Plancontractspecialoffers.PLANCONTRACTSPECIALOFFERS);
    }

    /**
     * Create a detached, initialised PlancontractspecialoffersRecord
     */
    public PlancontractspecialoffersRecord(UUID guid, Integer id, Timestamp effectivefrom, Timestamp effectiveto, Timestamp pickupfrom, Timestamp pickupto, Integer fkVirtuallocation, Integer fkLocation, String offertype, String offertext, String offertextverbose, Integer fkContract, String sipplist, Integer mindays, Integer maxdays, Integer amendedby, String offerhtmlverbose, String offerimageurl, String soFriendlyName, String uiToken, String textSub, String supplier, String countryId, BigDecimal dailycost, BigDecimal maxcost, String offercur, Boolean publicoffer, Boolean infeed, Boolean isonetime, Boolean displayOnly, Boolean supoptsaleflag, Timestamp createDate, Boolean dealOfTheDay, Integer displayorder) {
        super(Plancontractspecialoffers.PLANCONTRACTSPECIALOFFERS);

        set(0, guid);
        set(1, id);
        set(2, effectivefrom);
        set(3, effectiveto);
        set(4, pickupfrom);
        set(5, pickupto);
        set(6, fkVirtuallocation);
        set(7, fkLocation);
        set(8, offertype);
        set(9, offertext);
        set(10, offertextverbose);
        set(11, fkContract);
        set(12, sipplist);
        set(13, mindays);
        set(14, maxdays);
        set(15, amendedby);
        set(16, offerhtmlverbose);
        set(17, offerimageurl);
        set(18, soFriendlyName);
        set(19, uiToken);
        set(20, textSub);
        set(21, supplier);
        set(22, countryId);
        set(23, dailycost);
        set(24, maxcost);
        set(25, offercur);
        set(26, publicoffer);
        set(27, infeed);
        set(28, isonetime);
        set(29, displayOnly);
        set(30, supoptsaleflag);
        set(31, createDate);
        set(32, dealOfTheDay);
        set(33, displayorder);
    }
}