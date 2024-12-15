package org.example.design_pattern._2_adapter.ex_program;

public class Main {
    public static void main(String[] args) {

        Print p = new PrintBanner("Hello");

        p.printWeak();
        p.printStrong();
    }
}
