package org.example.design_pattern.factory_4.television;

import org.example.design_pattern.factory_4.framework.Factory;
import org.example.design_pattern.factory_4.framework.Product;

public class TelevisionFactory extends Factory {
    @Override
    public Product createProduct(String owner) {
        System.out.println(owner + "가 티비를 구매하였습니다.");
        return new Television(owner);
    }

    @Override
    public void registerProduct(Product product) {
        System.out.println("테레비전이 집에 설치되었습니다.");
    }
}
