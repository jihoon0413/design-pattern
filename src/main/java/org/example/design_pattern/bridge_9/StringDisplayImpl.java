package org.example.design_pattern.bridge_9;

public class StringDisplayImpl extends DisplayImpl{
    private String string;
    private int width;

    public StringDisplayImpl(String str) {
        this.string = str;
        this.width = str.length();
    }

    @Override
    public void rawOpen() {
        printLine();
    }

    @Override
    public void rawPrint() {
        System.out.println("|" + string + "|");
    }

    @Override
    public void rawClose() {
        printLine();
    }

    private void printLine() {
        System.out.print("+");
        for (int i = 0; i < width; i++) {
            System.out.print("-");
        }
        System.out.println("+");
    }
}
