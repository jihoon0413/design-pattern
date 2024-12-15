package org.example.design_pattern._6_prototype.problem2.framework;

public interface Product{
    public abstract void use(String s);
    public abstract Product createCopy();
}
