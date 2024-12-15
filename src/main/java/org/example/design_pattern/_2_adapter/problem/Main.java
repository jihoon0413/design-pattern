package org.example.design_pattern._2_adapter.problem;

import java.io.IOException;

public class Main {
    public static void main(String[] args) {
        FileIO f = new FileProperties();
        try{
            f.readFromFile("file.txt");
            f.setValue("width","1024");
            f.setValue("height", "512");
            f.setValue("depth", "32");
            f.writeToFile("newFile.txt");
            System.out.println("newFile.txt is created");
        } catch (IOException e) {
            throw new RuntimeException(e);
        }

    }
}
