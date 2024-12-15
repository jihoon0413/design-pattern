package org.example.design_pattern._5_singleton.ex_program;

public class Main {
    public static void main(String[] args) {

        System.out.println("Start");

        Singleton obj1 = Singleton.getInstance();
        Singleton obj2 = Singleton.getInstance();

        if(obj1 == obj2) {
            System.out.println("same instance");
        } else {
            System.out.println("not same instance");
        }

        System.out.println("end");
    }
}
