package org.example.design_pattern.singleton_5;

public class Singleton {

    public static Singleton singleton = new Singleton();

    private Singleton() {
        System.out.println("인스턴스를 생성하였습니다.");
    }

    public static Singleton getInstance() {
        return singleton;
    }

}