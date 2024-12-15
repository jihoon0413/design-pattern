package org.example.design_pattern._4_factory.idcard;

import org.example.design_pattern._4_factory.framework.Factory;
import org.example.design_pattern._4_factory.framework.Product;

public class IDCardFactory extends Factory {

    private int serial = 100;

    @Override
    public Product createProduct(String owner) {
        return new IDCard(owner,serial++);
    }

    @Override
    public void registerProduct(Product product) {
        System.out.println(product + "을 등록했습니다.");
    }

}
