package com.github.curriculeon.personparser;

import com.github.curriculeon.Person;
import com.github.curriculeon.PersonParser;
import org.junit.Assert;
import org.junit.Test;

import java.util.StringJoiner;

/**
 * Created by leon on 1/8/2020.
 */
public class ParseStringTest {
    // given
    private void test(String data, Person expectedPerson) {
        PersonParser parser = new PersonParser();

        // when
        Person actualPerson = parser.parseString(data);

        // then
        Assert.assertEquals(expectedPerson, actualPerson);
    }

    @Test
    public void test0() {
        Long id = 0L;
        String firstName = "Leon";
        String lastName = "Hunter";
        String personData = new StringJoiner("\n")
                .add(id.toString())
                .add(firstName)
                .add(lastName)
                .toString();

        Person expectedPerson = new Person(id, firstName, lastName);
        test(personData, expectedPerson);
    }


    @Test
    public void test1() {
        Long id = 1L;
        String firstName = "Ali";
        String lastName = "Hyman";
        String personData = new StringJoiner("\n")
                .add(id.toString())
                .add(firstName)
                .add(lastName)
                .toString();

        Person expectedPerson = new Person(id, firstName, lastName);
        test(personData, expectedPerson);
    }


    @Test
    public void test2() {
        Long id = 2L;
        String firstName = "Bezawit";
        String lastName = "Maine";
        String personData = new StringJoiner("\n")
                .add(id.toString())
                .add(firstName)
                .add(lastName)
                .toString();

        Person expectedPerson = new Person(id, firstName, lastName);
        test(personData, expectedPerson);
    }
}
