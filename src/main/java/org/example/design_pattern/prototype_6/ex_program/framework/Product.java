package org.example.design_pattern.prototype_6.ex_program.framework;

public interface Product extends Cloneable{
    public abstract void use(String s);
    public abstract Product createCopy();
}
