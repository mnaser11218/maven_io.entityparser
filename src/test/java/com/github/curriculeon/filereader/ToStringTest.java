package com.github.curriculeon.filereader;

import com.github.curriculeon.FileReader;
import org.junit.Assert;
import org.junit.Test;

import java.io.FileNotFoundException;
import java.util.StringJoiner;

/**
 * Created by leon on 1/8/2020.
 */
public class ToStringTest {
    // given
    private void test(String filePath, String expectedContent) throws FileNotFoundException {
        FileReader fileReader = new FileReader(filePath);

        // when
        String actualContent = fileReader.toString();

        // then
        Assert.assertEquals(expectedContent, actualContent);
    }

    @Test
    public void test0() throws FileNotFoundException {
        test("src/main/resources/anthropoid/leon.person", "0\nleon\nhunter");
    }

    @Test
    public void test1() throws FileNotFoundException {
        test("src/main/resources/anthropoid/bezawit.person", "1\nbezawit\nmaine");
    }

    @Test
    public void test2() throws FileNotFoundException {
        test("src/main/resources/anthropoid/ali.person", "2\nali\nhyman");
    }

    @Test
    public void test3() throws FileNotFoundException {
        test("src/main/resources/anthropoid/allstaff.people", new StringJoiner("\n")
                .add("0\nleon\nhunter")
                .add("1\nbezawit\nmaine")
                .add("2\nali\nhyman")
                .toString());
    }

}
