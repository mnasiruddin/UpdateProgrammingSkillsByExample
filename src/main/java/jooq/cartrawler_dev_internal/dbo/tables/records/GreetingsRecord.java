/*
 * This file is generated by jOOQ.
 */
package jooq.cartrawler_dev_internal.dbo.tables.records;


import javax.annotation.Generated;

import jooq.cartrawler_dev_internal.dbo.tables.Greetings;

import org.jooq.Field;
import org.jooq.Record1;
import org.jooq.Record7;
import org.jooq.Row7;
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
public class GreetingsRecord extends UpdatableRecordImpl<GreetingsRecord> implements Record7<Integer, String, String, byte[], Boolean, String, String> {

    private static final long serialVersionUID = -1248641776;

    /**
     * Setter for <code>Cartrawler_dev_internal.dbo.Greetings.Greeting_ID</code>.
     */
    public void setGreetingId(Integer value) {
        set(0, value);
    }

    /**
     * Getter for <code>Cartrawler_dev_internal.dbo.Greetings.Greeting_ID</code>.
     */
    public Integer getGreetingId() {
        return (Integer) get(0);
    }

    /**
     * Setter for <code>Cartrawler_dev_internal.dbo.Greetings.Greeting_Name</code>.
     */
    public void setGreetingName(String value) {
        set(1, value);
    }

    /**
     * Getter for <code>Cartrawler_dev_internal.dbo.Greetings.Greeting_Name</code>.
     */
    public String getGreetingName() {
        return (String) get(1);
    }

    /**
     * Setter for <code>Cartrawler_dev_internal.dbo.Greetings.Intro_Text</code>.
     */
    public void setIntroText(String value) {
        set(2, value);
    }

    /**
     * Getter for <code>Cartrawler_dev_internal.dbo.Greetings.Intro_Text</code>.
     */
    public String getIntroText() {
        return (String) get(2);
    }

    /**
     * Setter for <code>Cartrawler_dev_internal.dbo.Greetings.Greeting_Image</code>.
     */
    public void setGreetingImage(byte... value) {
        set(3, value);
    }

    /**
     * Getter for <code>Cartrawler_dev_internal.dbo.Greetings.Greeting_Image</code>.
     */
    public byte[] getGreetingImage() {
        return (byte[]) get(3);
    }

    /**
     * Setter for <code>Cartrawler_dev_internal.dbo.Greetings.Status</code>.
     */
    public void setStatus(Boolean value) {
        set(4, value);
    }

    /**
     * Getter for <code>Cartrawler_dev_internal.dbo.Greetings.Status</code>.
     */
    public Boolean getStatus() {
        return (Boolean) get(4);
    }

    /**
     * Setter for <code>Cartrawler_dev_internal.dbo.Greetings.Image_Width</code>.
     */
    public void setImageWidth(String value) {
        set(5, value);
    }

    /**
     * Getter for <code>Cartrawler_dev_internal.dbo.Greetings.Image_Width</code>.
     */
    public String getImageWidth() {
        return (String) get(5);
    }

    /**
     * Setter for <code>Cartrawler_dev_internal.dbo.Greetings.Image_Height</code>.
     */
    public void setImageHeight(String value) {
        set(6, value);
    }

    /**
     * Getter for <code>Cartrawler_dev_internal.dbo.Greetings.Image_Height</code>.
     */
    public String getImageHeight() {
        return (String) get(6);
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
    // Record7 type implementation
    // -------------------------------------------------------------------------

    /**
     * {@inheritDoc}
     */
    @Override
    public Row7<Integer, String, String, byte[], Boolean, String, String> fieldsRow() {
        return (Row7) super.fieldsRow();
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Row7<Integer, String, String, byte[], Boolean, String, String> valuesRow() {
        return (Row7) super.valuesRow();
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Field<Integer> field1() {
        return Greetings.GREETINGS.GREETING_ID;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Field<String> field2() {
        return Greetings.GREETINGS.GREETING_NAME;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Field<String> field3() {
        return Greetings.GREETINGS.INTRO_TEXT;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Field<byte[]> field4() {
        return Greetings.GREETINGS.GREETING_IMAGE;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Field<Boolean> field5() {
        return Greetings.GREETINGS.STATUS;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Field<String> field6() {
        return Greetings.GREETINGS.IMAGE_WIDTH;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Field<String> field7() {
        return Greetings.GREETINGS.IMAGE_HEIGHT;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Integer component1() {
        return getGreetingId();
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public String component2() {
        return getGreetingName();
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public String component3() {
        return getIntroText();
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public byte[] component4() {
        return getGreetingImage();
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Boolean component5() {
        return getStatus();
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public String component6() {
        return getImageWidth();
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public String component7() {
        return getImageHeight();
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Integer value1() {
        return getGreetingId();
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public String value2() {
        return getGreetingName();
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public String value3() {
        return getIntroText();
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public byte[] value4() {
        return getGreetingImage();
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Boolean value5() {
        return getStatus();
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public String value6() {
        return getImageWidth();
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public String value7() {
        return getImageHeight();
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public GreetingsRecord value1(Integer value) {
        setGreetingId(value);
        return this;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public GreetingsRecord value2(String value) {
        setGreetingName(value);
        return this;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public GreetingsRecord value3(String value) {
        setIntroText(value);
        return this;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public GreetingsRecord value4(byte... value) {
        setGreetingImage(value);
        return this;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public GreetingsRecord value5(Boolean value) {
        setStatus(value);
        return this;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public GreetingsRecord value6(String value) {
        setImageWidth(value);
        return this;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public GreetingsRecord value7(String value) {
        setImageHeight(value);
        return this;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public GreetingsRecord values(Integer value1, String value2, String value3, byte[] value4, Boolean value5, String value6, String value7) {
        value1(value1);
        value2(value2);
        value3(value3);
        value4(value4);
        value5(value5);
        value6(value6);
        value7(value7);
        return this;
    }

    // -------------------------------------------------------------------------
    // Constructors
    // -------------------------------------------------------------------------

    /**
     * Create a detached GreetingsRecord
     */
    public GreetingsRecord() {
        super(Greetings.GREETINGS);
    }

    /**
     * Create a detached, initialised GreetingsRecord
     */
    public GreetingsRecord(Integer greetingId, String greetingName, String introText, byte[] greetingImage, Boolean status, String imageWidth, String imageHeight) {
        super(Greetings.GREETINGS);

        set(0, greetingId);
        set(1, greetingName);
        set(2, introText);
        set(3, greetingImage);
        set(4, status);
        set(5, imageWidth);
        set(6, imageHeight);
    }
}