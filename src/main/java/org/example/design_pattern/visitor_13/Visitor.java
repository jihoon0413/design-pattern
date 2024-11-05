package org.example.design_pattern.visitor_13;

public abstract class Visitor {
    public abstract void visit(File file);
    public abstract void visit(Directory directory);
}
