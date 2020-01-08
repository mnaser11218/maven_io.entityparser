package com.github.curriculeon;

import java.io.File;

/**
 * Created by leon on 1/8/2020.
 */
public class PersonParser implements Parser<Person> {
    @Override
    public Person parseString(String data) {
        return null;
    }

    @Override
    public Person[] parseStrings(String[] data) {
        return new Person[0];
    }

    @Override
    public Person[] parseFile(File data) {
        return new Person[0];
    }
}
