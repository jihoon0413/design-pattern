package org.example.design_pattern._20_flyweight;

import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;

public class BigChar {
    private char charname;

    private String fontdata;

    public BigChar(char charname) {
        this.charname = charname;
        try{
            String filename = "20flyweight/big" + charname + ".txt";
            StringBuilder sb = new StringBuilder();
            for(String line : Files.readAllLines(Path.of(filename))) {
                sb.append(line).append("\n");
            }
            this.fontdata = sb.toString();
        } catch (IOException e) {
            this.fontdata = charname + "?";
        }
    }

    public void print() {
        System.out.print(fontdata);
    }
}
