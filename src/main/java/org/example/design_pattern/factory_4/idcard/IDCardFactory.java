package org.example.design_pattern.factory_4.idcard;

import org.example.design_pattern.factory_4.framework.Factory;
import org.example.design_pattern.factory_4.framework.Product;

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
