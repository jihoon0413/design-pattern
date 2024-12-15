package org.example.design_pattern._6_prototype.ex_program.framework;

public interface Product extends Cloneable{
    public abstract void use(String s);
    public abstract Product createCopy();
}
