package org.example.design_pattern.visitor_13.ex_program;

public class SizeVisitor extends Visitor{

    int size = 0;

    @Override
    public void visit(File file) {
        size += file.getSize();
    }

    @Override
    public void visit(Directory directory) {
        for (Entry entry : directory) {
            entry.accept(this);
        }
    }

    public int getSize() {
        return size;
    }
}
