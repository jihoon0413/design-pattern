package org.example.design_pattern.adapter_2.problem;

import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.util.Properties;

public class FileProperties implements  FileIO {

    Properties p = new Properties();

    @Override
    public void readFromFile(String filename) throws IOException {
        p.load(new FileReader(filename));
    }

    @Override
    public void writeToFile(String filename) throws IOException {
        p.store(new FileWriter(filename), "written by FileProperties");
    }

    @Override
    public void setValue(String key, String value) {
        p.setProperty(key, value);
    }

    @Override
    public String getValue(String key) {
        return p.getProperty(key,"");
    }
}
