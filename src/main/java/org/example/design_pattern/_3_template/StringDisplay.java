package org.example.design_pattern._3_template;

public class StringDisplay extends AbstractDisplay{

    private String str;
    private int length;

    public StringDisplay(String str) {
        this.str = str;
        this.length = str.length();
    }

    @Override
    public void open() {
        printLine();
    }

    @Override
    public void print() {
        System.out.println("| " + str + " |");
    }

    @Override
    public void close() {
        printLine();
    }

    public void printLine() {
        System.out.print("+");
        for (int i = 0; i < length; i++) {
            System.out.print("-");
        }
        System.out.println("+");
    }

}
