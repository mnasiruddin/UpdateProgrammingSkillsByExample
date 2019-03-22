/*
 * This file is generated by jOOQ.
 */
package jooq.cartrawler_dev_internal.dbo.tables.records;


import javax.annotation.Generated;

import jooq.cartrawler_dev_internal.dbo.tables.Surveyquestion;

import org.jooq.Field;
import org.jooq.Record1;
import org.jooq.Record6;
import org.jooq.Row6;
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
public class SurveyquestionRecord extends UpdatableRecordImpl<SurveyquestionRecord> implements Record6<Integer, Integer, String, String, String, String> {

    private static final long serialVersionUID = -2140414138;

    /**
     * Setter for <code>Cartrawler_dev_internal.dbo.SurveyQuestion.id</code>.
     */
    public void setId(Integer value) {
        set(0, value);
    }

    /**
     * Getter for <code>Cartrawler_dev_internal.dbo.SurveyQuestion.id</code>.
     */
    public Integer getId() {
        return (Integer) get(0);
    }

    /**
     * Setter for <code>Cartrawler_dev_internal.dbo.SurveyQuestion.fk_survey</code>.
     */
    public void setFkSurvey(Integer value) {
        set(1, value);
    }

    /**
     * Getter for <code>Cartrawler_dev_internal.dbo.SurveyQuestion.fk_survey</code>.
     */
    public Integer getFkSurvey() {
        return (Integer) get(1);
    }

    /**
     * Setter for <code>Cartrawler_dev_internal.dbo.SurveyQuestion.type</code>.
     */
    public void setType(String value) {
        set(2, value);
    }

    /**
     * Getter for <code>Cartrawler_dev_internal.dbo.SurveyQuestion.type</code>.
     */
    public String getType() {
        return (String) get(2);
    }

    /**
     * Setter for <code>Cartrawler_dev_internal.dbo.SurveyQuestion.title</code>.
     */
    public void setTitle(String value) {
        set(3, value);
    }

    /**
     * Getter for <code>Cartrawler_dev_internal.dbo.SurveyQuestion.title</code>.
     */
    public String getTitle() {
        return (String) get(3);
    }

    /**
     * Setter for <code>Cartrawler_dev_internal.dbo.SurveyQuestion.verbiage</code>.
     */
    public void setVerbiage(String value) {
        set(4, value);
    }

    /**
     * Getter for <code>Cartrawler_dev_internal.dbo.SurveyQuestion.verbiage</code>.
     */
    public String getVerbiage() {
        return (String) get(4);
    }

    /**
     * Setter for <code>Cartrawler_dev_internal.dbo.SurveyQuestion.heading</code>.
     */
    public void setHeading(String value) {
        set(5, value);
    }

    /**
     * Getter for <code>Cartrawler_dev_internal.dbo.SurveyQuestion.heading</code>.
     */
    public String getHeading() {
        return (String) get(5);
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
    // Record6 type implementation
    // -------------------------------------------------------------------------

    /**
     * {@inheritDoc}
     */
    @Override
    public Row6<Integer, Integer, String, String, String, String> fieldsRow() {
        return (Row6) super.fieldsRow();
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Row6<Integer, Integer, String, String, String, String> valuesRow() {
        return (Row6) super.valuesRow();
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Field<Integer> field1() {
        return Surveyquestion.SURVEYQUESTION.ID;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Field<Integer> field2() {
        return Surveyquestion.SURVEYQUESTION.FK_SURVEY;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Field<String> field3() {
        return Surveyquestion.SURVEYQUESTION.TYPE;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Field<String> field4() {
        return Surveyquestion.SURVEYQUESTION.TITLE;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Field<String> field5() {
        return Surveyquestion.SURVEYQUESTION.VERBIAGE;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Field<String> field6() {
        return Surveyquestion.SURVEYQUESTION.HEADING;
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
    public Integer component2() {
        return getFkSurvey();
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public String component3() {
        return getType();
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public String component4() {
        return getTitle();
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public String component5() {
        return getVerbiage();
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public String component6() {
        return getHeading();
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
    public Integer value2() {
        return getFkSurvey();
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public String value3() {
        return getType();
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public String value4() {
        return getTitle();
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public String value5() {
        return getVerbiage();
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public String value6() {
        return getHeading();
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public SurveyquestionRecord value1(Integer value) {
        setId(value);
        return this;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public SurveyquestionRecord value2(Integer value) {
        setFkSurvey(value);
        return this;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public SurveyquestionRecord value3(String value) {
        setType(value);
        return this;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public SurveyquestionRecord value4(String value) {
        setTitle(value);
        return this;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public SurveyquestionRecord value5(String value) {
        setVerbiage(value);
        return this;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public SurveyquestionRecord value6(String value) {
        setHeading(value);
        return this;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public SurveyquestionRecord values(Integer value1, Integer value2, String value3, String value4, String value5, String value6) {
        value1(value1);
        value2(value2);
        value3(value3);
        value4(value4);
        value5(value5);
        value6(value6);
        return this;
    }

    // -------------------------------------------------------------------------
    // Constructors
    // -------------------------------------------------------------------------

    /**
     * Create a detached SurveyquestionRecord
     */
    public SurveyquestionRecord() {
        super(Surveyquestion.SURVEYQUESTION);
    }

    /**
     * Create a detached, initialised SurveyquestionRecord
     */
    public SurveyquestionRecord(Integer id, Integer fkSurvey, String type, String title, String verbiage, String heading) {
        super(Surveyquestion.SURVEYQUESTION);

        set(0, id);
        set(1, fkSurvey);
        set(2, type);
        set(3, title);
        set(4, verbiage);
        set(5, heading);
    }
}