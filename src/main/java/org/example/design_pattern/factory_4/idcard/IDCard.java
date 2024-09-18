package org.example.design_pattern.factory_4.idcard;

import org.example.design_pattern.factory_4.framework.Product;

public class IDCard extends Product {

    private String owner;
    private int serial;

    public IDCard(String owner, int serial) {
        System.out.println(owner + "의 카드(serial)를 만듭니다.");
        this.owner = owner;
        this.serial = serial;
    }

    @Override
    public void use() {
        System.out.println(this + "을 사용합니다.");
    }

    @Override
    public String toString() {
        return "[IDCard:" + owner + "(" + serial + ")]";
    }

    public String getOwner() {
        return owner;
    }

}
