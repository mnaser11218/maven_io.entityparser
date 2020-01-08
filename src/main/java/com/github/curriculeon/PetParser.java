package com.github.curriculeon;

import java.io.File;

/**
 * Created by leon on 1/8/2020.
 */
public class PetParser implements Parser<Pet> {
    @Override
    public Pet parseString(String data) {
        return null;
    }

    @Override
    public Pet[] parseStrings(String[] data) {
        return new Pet[0];
    }

    @Override
    public Pet[] parseFile(File data) {
        return new Pet[0];
    }
}
