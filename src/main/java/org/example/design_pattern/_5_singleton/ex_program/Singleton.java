package org.example.design_pattern._5_singleton.ex_program;

public class Singleton {

    private static Singleton singleton = new Singleton();

    private Singleton() {
        System.out.println("인스턴스를 생성하였습니다.");
    }

    public static Singleton getInstance() {
        return singleton;
    }

}
