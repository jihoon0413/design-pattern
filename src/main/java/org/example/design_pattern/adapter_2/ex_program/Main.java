package org.example.design_pattern.adapter_2.ex_program;

public class Main {
    public static void main(String[] args) {

        Print p = new PrintBanner("Hello");

        p.printWeak();
        p.printStrong();
    }
}
