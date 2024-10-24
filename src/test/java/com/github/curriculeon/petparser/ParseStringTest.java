package com.github.curriculeon.petparser;

import com.github.curriculeon.*;
import org.junit.Assert;
import org.junit.Test;

import java.util.Date;
import java.util.StringJoiner;

/**
 * Created by leon on 1/8/2020.
 */
public class ParseStringTest {

    // given
    private void test(String data, Pet expected) {
        PetParser parser = new PetParser();

        // when
        Pet actual = parser.parseString(data);

        // then
        Assert.assertEquals(expected, actual);
    }

    @Test
    public void test0() {
        Long id = 0L;
        String name = "milo the dog";
        String dateString = "06-14-2015";
        String data = new StringJoiner("\n")
                .add(id.toString())
                .add(name)
                .add(dateString)
                .toString();

        Pet expected = new Pet(id, name, DateParser.parseDate(dateString));
        test(data, expected);
    }


    @Test
    public void test1() {
        Long id = 1L;
        String name = "sam the snake";
        String dateString = "09-07-2007";
        String data = new StringJoiner("\n")
                .add(id.toString())
                .add(name)
                .add(dateString)
                .toString();

        Pet expected = new Pet(id, name, DateParser.parseDate(dateString));
        test(data, expected);
    }

    @Test
    public void test2() {
        Long id = 2L;
        String name = "zula the kitty";
        String dateString = "01-01-2005";
        String data = new StringJoiner("\n")
                .add(id.toString())
                .add(name)
                .add(dateString)
                .toString();

        Pet expected = new Pet(id, name, DateParser.parseDate(dateString));

        test(data, expected);
    }
}
