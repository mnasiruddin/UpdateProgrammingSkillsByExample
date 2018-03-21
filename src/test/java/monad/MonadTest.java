/**
 * The MIT License
 * Copyright (c) 2014-2016 Ilkka Seppälä
 * <p>
 * Permission is hereby granted, free of charge, to any person obtaining a copy
 * of this software and associated documentation files (the "Software"), to deal
 * in the Software without restriction, including without limitation the rights
 * to use, copy, modify, merge, publish, distribute, sublicense, and/or sell
 * copies of the Software, and to permit persons to whom the Software is
 * furnished to do so, subject to the following conditions:
 * <p>
 * The above copyright notice and this permission notice shall be included in
 * all copies or substantial portions of the Software.
 * <p>
 * THE SOFTWARE IS PROVIDED "AS IS", WITHOUT WARRANTY OF ANY KIND, EXPRESS OR
 * IMPLIED, INCLUDING BUT NOT LIMITED TO THE WARRANTIES OF MERCHANTABILITY,
 * FITNESS FOR A PARTICULAR PURPOSE AND NONINFRINGEMENT. IN NO EVENT SHALL THE
 * AUTHORS OR COPYRIGHT HOLDERS BE LIABLE FOR ANY CLAIM, DAMAGES OR OTHER
 * LIABILITY, WHETHER IN AN ACTION OF CONTRACT, TORT OR OTHERWISE, ARISING FROM,
 * OUT OF OR IN CONNECTION WITH THE SOFTWARE OR THE USE OR OTHER DEALINGS IN
 * THE SOFTWARE.
 */
package monad;


import designpatterns.monadpattern.Sex;
import designpatterns.monadpattern.User;
import designpatterns.monadpattern.Validator;
import junit.framework.Assert;
import org.junit.Rule;
import org.junit.Test;
import org.junit.rules.ExpectedException;

import java.util.Objects;

/**
 * Test for Monad Pattern
 */
public class MonadTest {

    @Rule
    public ExpectedException thrown = ExpectedException.none();

    private static final User user = new User("Mohammed", 55, Sex.MALE, "mohammeddnasiruddin@gmail.com");

    @Test
    public void testForInvalidName() throws Throwable {
        thrown.expect(Throwable.class);
        User tom = new User(null, 21, Sex.MALE, "tom@foo.bar");
        Validator.of(tom).validate(User::getName, Objects::nonNull, "name cannot be null").get();
    }

    @Test
    public void testForInvalidAge() throws Throwable {
        thrown.expect(Throwable.class);
        User john = new User("John", 17, Sex.MALE, "john@qwe.bar");
        Validator.of(john).validate(User::getName, Objects::nonNull, "name cannot be null")
                .validate(User::getAge, age -> age > 21, "user is underaged")
                .get();
    }

    @Test
    public void testForValid() throws Throwable {
        User sarah = new User("Sarah", 42, Sex.FEMALE, "mohammed@gmail.com");
        User validated = Validator.of(sarah).validate(User::getName, Objects::nonNull, "name cannot be null")
                .validate(User::getAge, age -> age > 21, "user is underaged")
                .validate(User::getSex, sex -> sex == Sex.FEMALE, "user is not female")
                .validate(User::getEmail, email -> email.contains("@"), "email does not contain @ sign")
                .get();
        Assert.assertSame(validated, sarah);
    }

    @Test
    public void testORCase1Valid() {
        Validator<User> validator = Validator.of(user)
                .validate(User::getAge, age -> age > 21, "user is underaged")
                .OR()
                .validate(User::getSex, sex -> sex.equals(Sex.FEMALE), "sex is opposite");
        System.out.println("testORCase1Valid : " + validator.isValid());
    }

    @Test
    public void testORCase2Valid() {
        Validator<User> validator = Validator.of(user)
                .validate(User::getAge, age -> age > 21, "user is underaged")
                .OR()
                .validate(User::getSex, sex -> sex.equals(Sex.FEMALE), "sex is opposite")
                .OR()
                .validate(User::getName, name -> name.equalsIgnoreCase("Mohammed"), "invalid name");
        System.out.println("testORCase2Valid : " + validator.isValid());
    }

    @Test
    public void testORCase3Valid() {
        Validator<User> validator = Validator.of(user)
                .validate(User::getSex, sex -> sex.equals(Sex.FEMALE), "sex is opposite")
                .OR()
                .validate(User::getAge, age -> age > 21, "user is underaged")
                .OR()
                .validate(User::getName, name -> name.equalsIgnoreCase("Mohammeds"), "invalid name");
        System.out.println("testORCase3Valid : " + validator.isValid());
    }

    @Test
    public void testORCase4Valid() {
        Validator<User> validator = Validator.of(user)
                .validate(User::getSex, sex -> sex.equals(Sex.FEMALE), "sex is opposite")
                .validate(User::getAge, age -> age > 91, "user is underaged")
                .validate(User::getName, name -> name.equalsIgnoreCase("Mohammed"), "invalid name");
        System.out.println("testORCase4Valid : " + validator.isValid());
    }

    @Test
    public void testORCase5Valid() {
        Validator<User> validator = Validator.of(user)
                .validate(User::getName, name -> name.equalsIgnoreCase("Mohammed"), "invalid name")
                .validate(User::getSex, sex -> sex.equals(Sex.FEMALE), "sex is opposite")
                .validate(User::getAge, age -> age > 22, "user is underaged");
        System.out.println("testORCase5Valid : " + validator.isValid());
    }

    @Test
    public void testORCase6Valid() {
        Validator<User> validator = Validator.of(user)
                .validate(User::getName, name -> name.equalsIgnoreCase("Mohammeds"), "invalid name")
                .OR()
                .validate(User::getSex, sex -> sex.equals(Sex.FEMALE), "sex is opposite")
                .OR()
                .validate(User::getAge, age -> age > 92, "user is underaged");
        System.out.println("testORCase6Valid : " + validator.isValid());
    }

    @Test
    public void testORCase7Valid() {
        Validator<User> validator = Validator.of(user)
                .validate(User::getName, name -> name.equalsIgnoreCase("Mohammed"), "invalid name")
                .validate(User::getName, name -> name.equalsIgnoreCase("Mohammeds"), "invalid name")
                .OR()
                .validate(User::getSex, sex -> sex.equals(Sex.FEMALE), "sex is opposite")
                .validate(User::getName, name -> name.equalsIgnoreCase("Mohammed"), "invalid name");
        System.out.println("testORCase7Valid : " + validator.isValid());
    }

    @Test
    public void testORCase8Valid() {
        Validator<User> validator = Validator.of(user)
                .validate(User::getName, name -> name.equalsIgnoreCase("Mohammed"), "invalid name")
                .validate(User::getSex, sex -> sex.equals(Sex.MALE), "sex is opposite")
                .OR()
                .validate(User::getSex, sex -> sex.equals(Sex.FEMALE), "sex is opposite")
                .validate(User::getAge, age -> age > 92, "user is underaged");
        System.out.println("testORCase8Valid : " + validator.isValid());
    }

    @Test
    public void testORCase9Valid() {
        Validator<User> validator = Validator.of(user)
                .validate(User::getName, name -> name.equalsIgnoreCase("Mohammeds"), "invalid name")
                .validate(User::getSex, sex -> sex.equals(Sex.FEMALE), "sex is opposite")
                .validate(User::getSex, sex -> sex.equals(Sex.MALE), "sex is opposite")
                .OR()
                .validate(User::getAge, age -> age > 35, "user is underaged");
        System.out.println("testORCase9Valid : " + validator.isValid());
    }

    @Test
    public void testORCase10Valid() {
        Validator<User> validator = Validator.of(user)
                .validate(User::getName, name -> name.equalsIgnoreCase("Mohammed"), "invalid name")
                .validate(User::getSex, sex -> sex.equals(Sex.MALE), "sex is opposite");
        System.out.println("testORCase10Valid : " + validator.isValid());
    }

    @Test
    public void testORCase11Valid() {
        Validator<User> validator = Validator.of(user)
                .validate(User::getName, name -> name.equalsIgnoreCase("Mohammeds"), "invalid name")
                .validate(User::getSex, sex -> sex.equals(Sex.FEMALE), "sex is opposite");
        System.out.println("testORCase11Valid : " + validator.isValid());
    }
}
