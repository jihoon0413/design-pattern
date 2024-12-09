package org.example.design_pattern.visitor_13;

public abstract class Entry implements Element {
    public abstract String getName();
    public abstract int getSize();

    @Override
    public String toString() {
        return getName() + "(" + getSize() + ")";
    }
}
