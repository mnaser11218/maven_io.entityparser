package com.github.curriculeon;

import java.io.File;

/**
 * Created by leon on 1/8/2020.
 */
public class PersonParser implements Parser<Person> {
    @Override
    public Person parseString(String data) {
        String[] dataArray = data.split("\n");
        Person person = new Person(Long.parseLong(dataArray[0],10),dataArray[1], dataArray[2]);
        System.out.println("data: ");
        return person;
    }

    @Override
    public Person[] parseStrings(String[] data) {
        Person [] results = new Person[data.length];

        for(int i=0; i<data.length; i++){
            results[i]= parseString(data[i]);
        }
        return results;
    }

    @Override
    public Person[] parseFile(File data) {
        return new Person[0];
    }
}
