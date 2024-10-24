package com.github.curriculeon;

import java.io.File;
import java.text.ParseException;

public interface Parser<SomeType> {
    SomeType parseString(String data);

    SomeType[] parseStrings(String[] data);

    SomeType[] parseFile(File data);
}
