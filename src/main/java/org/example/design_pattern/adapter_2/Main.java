package org.example.design_pattern.adapter_2;

public class Main {
    public static void main(String[] args) {

        Print p = new PrintBanner("Hello");

        p.printWeak();
        p.printStrong();
    }
}
