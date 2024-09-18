package org.example.design_pattern.factory_4.television;

import org.example.design_pattern.factory_4.framework.Product;

public class Television extends Product {
    private String owner;

    Television(String owner) {
        this.owner = owner;
    }

    @Override
    public void use() {
        System.out.println(this + "예능 프로그램이 방영중입니다.");
    }

    @Override
    public String toString() {
        return "[" + owner + "]의 티비에서 ";
    }
}
