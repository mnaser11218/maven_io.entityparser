package com.github.curriculeon;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.nio.charset.Charset;
import java.nio.file.Files;
import java.nio.file.Paths;
import java.util.Scanner;


/**
 * Created by leon on 1/8/2020.
 */
public class FileReader {
    private final String filename;
    private FileInputStream filereader;

    public FileReader(String filename) throws FileNotFoundException {
//        if (new File(filename).exists()){
//            System.out.println("this file exist");
//        }else{
//            System.out.println("this file doesnt exist");
//        }
        this.filename = filename;
        this.filereader = new FileInputStream(new File(filename));
    }

    @Override
    public String toString(){


            try{
            int i;
            String results  ="";
            while((i=filereader.read()) != -1){
                results += (char) i;
            }
                System.out.println(results);
           // String file = filereader.read();
     String normalizedStr2 = results.replaceAll("\\r\\n", "\n");

                return normalizedStr2.toString();
        }catch(IOException e){
                throw new RuntimeException(e);
        }

    }

}
