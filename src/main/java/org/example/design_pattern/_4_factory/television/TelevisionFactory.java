package org.example.design_pattern._4_factory.television;

import org.example.design_pattern._4_factory.framework.Factory;
import org.example.design_pattern._4_factory.framework.Product;

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
