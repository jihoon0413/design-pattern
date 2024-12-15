package org.example.design_pattern._13_visitor.ex_program;

public abstract class Visitor {
    public abstract void visit(File file);
    public abstract void visit(Directory directory);
}
