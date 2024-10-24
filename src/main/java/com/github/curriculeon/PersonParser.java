package com.github.curriculeon;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;

/**
 * Created by leon on 1/8/2020.
 */
public class PersonParser implements Parser<Person> {
    @Override
    public Person parseString(String data) {
        String[] dataArray = data.split("\n");
        Person person = new Person(Long.parseLong(dataArray[0],10),dataArray[1], dataArray[2]);
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
        try{
        FileInputStream filereader= new FileInputStream(data);
            int i;
            String results  ="";
            while((i=filereader.read()) != -1){
                results += (char) i;
            }
            String normalizedStr2 = results.replaceAll("\\r\\n", "\n");

           String fileString = normalizedStr2.toString();
            System.out.println(fileString);
            return new Person[]{parseString(fileString)};

        }catch (IOException e) {
            throw new RuntimeException(e);
        }
    }
}
