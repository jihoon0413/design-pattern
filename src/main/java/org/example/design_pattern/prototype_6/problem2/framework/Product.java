package org.example.design_pattern.prototype_6.problem2.framework;

public interface Product{
    public abstract void use(String s);
    public abstract Product createCopy();
}
