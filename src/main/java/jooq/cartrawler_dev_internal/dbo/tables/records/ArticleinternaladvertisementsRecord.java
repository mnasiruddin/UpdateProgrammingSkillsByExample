/*
 * This file is generated by jOOQ.
 */
package jooq.cartrawler_dev_internal.dbo.tables.records;


import javax.annotation.Generated;

import jooq.cartrawler_dev_internal.dbo.tables.Articleinternaladvertisements;

import org.jooq.Field;
import org.jooq.Record1;
import org.jooq.Record5;
import org.jooq.Row5;
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
public class ArticleinternaladvertisementsRecord extends UpdatableRecordImpl<ArticleinternaladvertisementsRecord> implements Record5<Integer, String, String, String, String> {

    private static final long serialVersionUID = -466435467;

    /**
     * Setter for <code>Cartrawler_dev_internal.dbo.ArticleInternalAdvertisements.ArticleInternalAdvertisementID</code>.
     */
    public void setArticleinternaladvertisementid(Integer value) {
        set(0, value);
    }

    /**
     * Getter for <code>Cartrawler_dev_internal.dbo.ArticleInternalAdvertisements.ArticleInternalAdvertisementID</code>.
     */
    public Integer getArticleinternaladvertisementid() {
        return (Integer) get(0);
    }

    /**
     * Setter for <code>Cartrawler_dev_internal.dbo.ArticleInternalAdvertisements.ArticleInternalAdvertisementTitle</code>.
     */
    public void setArticleinternaladvertisementtitle(String value) {
        set(1, value);
    }

    /**
     * Getter for <code>Cartrawler_dev_internal.dbo.ArticleInternalAdvertisements.ArticleInternalAdvertisementTitle</code>.
     */
    public String getArticleinternaladvertisementtitle() {
        return (String) get(1);
    }

    /**
     * Setter for <code>Cartrawler_dev_internal.dbo.ArticleInternalAdvertisements.ArticleInternalAdvertisementURL</code>.
     */
    public void setArticleinternaladvertisementurl(String value) {
        set(2, value);
    }

    /**
     * Getter for <code>Cartrawler_dev_internal.dbo.ArticleInternalAdvertisements.ArticleInternalAdvertisementURL</code>.
     */
    public String getArticleinternaladvertisementurl() {
        return (String) get(2);
    }

    /**
     * Setter for <code>Cartrawler_dev_internal.dbo.ArticleInternalAdvertisements.ArticleInternalAdvertisementImageURL</code>.
     */
    public void setArticleinternaladvertisementimageurl(String value) {
        set(3, value);
    }

    /**
     * Getter for <code>Cartrawler_dev_internal.dbo.ArticleInternalAdvertisements.ArticleInternalAdvertisementImageURL</code>.
     */
    public String getArticleinternaladvertisementimageurl() {
        return (String) get(3);
    }

    /**
     * Setter for <code>Cartrawler_dev_internal.dbo.ArticleInternalAdvertisements.ArticleInternalAdvertisementALT</code>.
     */
    public void setArticleinternaladvertisementalt(String value) {
        set(4, value);
    }

    /**
     * Getter for <code>Cartrawler_dev_internal.dbo.ArticleInternalAdvertisements.ArticleInternalAdvertisementALT</code>.
     */
    public String getArticleinternaladvertisementalt() {
        return (String) get(4);
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
    // Record5 type implementation
    // -------------------------------------------------------------------------

    /**
     * {@inheritDoc}
     */
    @Override
    public Row5<Integer, String, String, String, String> fieldsRow() {
        return (Row5) super.fieldsRow();
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Row5<Integer, String, String, String, String> valuesRow() {
        return (Row5) super.valuesRow();
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Field<Integer> field1() {
        return Articleinternaladvertisements.ARTICLEINTERNALADVERTISEMENTS.ARTICLEINTERNALADVERTISEMENTID;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Field<String> field2() {
        return Articleinternaladvertisements.ARTICLEINTERNALADVERTISEMENTS.ARTICLEINTERNALADVERTISEMENTTITLE;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Field<String> field3() {
        return Articleinternaladvertisements.ARTICLEINTERNALADVERTISEMENTS.ARTICLEINTERNALADVERTISEMENTURL;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Field<String> field4() {
        return Articleinternaladvertisements.ARTICLEINTERNALADVERTISEMENTS.ARTICLEINTERNALADVERTISEMENTIMAGEURL;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Field<String> field5() {
        return Articleinternaladvertisements.ARTICLEINTERNALADVERTISEMENTS.ARTICLEINTERNALADVERTISEMENTALT;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Integer component1() {
        return getArticleinternaladvertisementid();
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public String component2() {
        return getArticleinternaladvertisementtitle();
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public String component3() {
        return getArticleinternaladvertisementurl();
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public String component4() {
        return getArticleinternaladvertisementimageurl();
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public String component5() {
        return getArticleinternaladvertisementalt();
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Integer value1() {
        return getArticleinternaladvertisementid();
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public String value2() {
        return getArticleinternaladvertisementtitle();
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public String value3() {
        return getArticleinternaladvertisementurl();
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public String value4() {
        return getArticleinternaladvertisementimageurl();
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public String value5() {
        return getArticleinternaladvertisementalt();
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public ArticleinternaladvertisementsRecord value1(Integer value) {
        setArticleinternaladvertisementid(value);
        return this;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public ArticleinternaladvertisementsRecord value2(String value) {
        setArticleinternaladvertisementtitle(value);
        return this;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public ArticleinternaladvertisementsRecord value3(String value) {
        setArticleinternaladvertisementurl(value);
        return this;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public ArticleinternaladvertisementsRecord value4(String value) {
        setArticleinternaladvertisementimageurl(value);
        return this;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public ArticleinternaladvertisementsRecord value5(String value) {
        setArticleinternaladvertisementalt(value);
        return this;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public ArticleinternaladvertisementsRecord values(Integer value1, String value2, String value3, String value4, String value5) {
        value1(value1);
        value2(value2);
        value3(value3);
        value4(value4);
        value5(value5);
        return this;
    }

    // -------------------------------------------------------------------------
    // Constructors
    // -------------------------------------------------------------------------

    /**
     * Create a detached ArticleinternaladvertisementsRecord
     */
    public ArticleinternaladvertisementsRecord() {
        super(Articleinternaladvertisements.ARTICLEINTERNALADVERTISEMENTS);
    }

    /**
     * Create a detached, initialised ArticleinternaladvertisementsRecord
     */
    public ArticleinternaladvertisementsRecord(Integer articleinternaladvertisementid, String articleinternaladvertisementtitle, String articleinternaladvertisementurl, String articleinternaladvertisementimageurl, String articleinternaladvertisementalt) {
        super(Articleinternaladvertisements.ARTICLEINTERNALADVERTISEMENTS);

        set(0, articleinternaladvertisementid);
        set(1, articleinternaladvertisementtitle);
        set(2, articleinternaladvertisementurl);
        set(3, articleinternaladvertisementimageurl);
        set(4, articleinternaladvertisementalt);
    }
}