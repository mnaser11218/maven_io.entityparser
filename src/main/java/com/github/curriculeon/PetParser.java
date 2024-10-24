package com.github.curriculeon;
import com.github.curriculeon.*;

import java.io.File;
import java.io.FileInputStream;
import java.io.IOException;
import java.text.DateFormat;
import java.text.ParseException;

import java.time.format.DateTimeParseException;
import java.text.SimpleDateFormat;
import java.util.Date;

/**
 * Created by leon on 1/8/2020.
 */
public class PetParser implements Parser<Pet> {
    @Override
    public Pet parseString(String data) {
        try{
            String[] dataArray = data.split("\n");
            Pet pet = new Pet(Long.parseLong(dataArray[0],10),dataArray[1], new SimpleDateFormat("MM-dd-yyyy").parse(dataArray[2]));
            System.out.println("data: " + pet);
            return pet;
        } catch (ParseException e) {
            throw new Error(e);
        }



    }

    @Override
    public Pet[] parseStrings(String[] data) {
        Pet [] results = new Pet[data.length];

        for(int i=0; i<data.length; i++){
            results[i]= parseString(data[i]);
        }
        return results;
    }

    @Override
    public Pet[] parseFile(File data) {
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
            return new Pet[]{parseString(fileString)};

        }catch (IOException e) {
            throw new RuntimeException(e);
        }
    }

}
