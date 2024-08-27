package org.example.design_pattern.factory_4.framework;

public abstract class Factory {

    // 상품을 만드는 과정을 추상화를 통해 미리 순서를 정할 수 있음

    public final Product create(String owner) {
        Product p = createProduct(owner);
        registerProduct(p);
        return p;
    }

    public abstract Product createProduct(String owner);
    public abstract void registerProduct(Product product);

}
