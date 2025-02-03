package org.example.design_pattern._18_memento.game;

import java.util.ArrayList;
import java.util.List;

public class Memento {

    private int money;
    private List<String> fruits;

    public int getMoney() {
        return money;
    }

    Memento(int money) {
        this.money = money;
        this.fruits = new ArrayList<>();
    }

    void addFruits(String fruit) {
        fruits.add(fruit);
    }

    List<String> getFruits() {
        return new ArrayList<>(fruits);
    }

}
