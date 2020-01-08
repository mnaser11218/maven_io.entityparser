package com.github.curriculeon.personparser;

import com.github.curriculeon.Person;
import com.github.curriculeon.PersonParser;
import org.junit.Assert;
import org.junit.Test;

import java.io.File;

/**
 * Created by leon on 1/8/2020.
 */
public class ParseFileTest {
    // given
    private void test(File fileOfData, Person[] expectedPersons) {
        PersonParser personParser = new PersonParser();

        // when
        Person[] actualPersons = personParser.parseFile(fileOfData);

        // then
        Assert.assertEquals(expectedPersons, actualPersons);
    }


    @Test
    public void test0() {
        Person person = new Person(0L, "leon", "hunter");
        Person[] expectedPersons = new Person[]{person};
        String filePath = "/anthropoid/leon.person";
        File fileOfData = new File(filePath);
        test(fileOfData, expectedPersons);
    }

    @Test
    public void test1() {
        Person person = new Person(1L, "bezawit", "maine");
        Person[] expectedPersons = new Person[]{person};
        String filePath = "/anthropoid/bezawit.person";
        File fileOfData = new File(filePath);
        test(fileOfData, expectedPersons);
    }

    @Test
    public void test2() {
        Person person = new Person(2L, "ali", "hyman");
        Person[] expectedPersons = new Person[]{person};
        String filePath = "/anthropoid/ali.person";
        File fileOfData = new File(filePath);
        test(fileOfData, expectedPersons);
    }
    
    @Test
    public void test3() {
        Person person0 = new Person(0L, "leon", "hunter");
        Person person1 = new Person(1L, "bezawit", "maine");
        Person person2 = new Person(2L, "ali", "hyman");
        Person[] expectedPersons = new Person[]{person0, person1, person2};
        
        String filePath = "/anthropoid/allstaff.people";
        File fileOfData = new File(filePath);
        test(fileOfData, expectedPersons);
        
    }
}