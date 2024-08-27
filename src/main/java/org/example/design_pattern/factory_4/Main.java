package org.example.design_pattern.factory_4;

import org.example.design_pattern.factory_4.framework.Factory;
import org.example.design_pattern.factory_4.framework.Product;
import org.example.design_pattern.factory_4.idcard.IDCardFactory;

public class Main {
    public static void main(String[] args) {

        Factory factory = new IDCardFactory();
        Product card1 = factory.create("KIM");
        Product card2 = factory.create("SON");
        Product card3 = factory.create("LEE");

        card1.use();
        card2.use();
        card3.use();

    }
}
