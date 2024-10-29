package org.example.design_pattern.composite_11;

import org.w3c.dom.ls.LSOutput;

public abstract class Entry {
    private Entry parent;

    public void setParent(Entry parent) {
        this.parent = parent;
    }

    public abstract String getName();

    public abstract int getSize();

    public void printList() {
        printList("");
    }

    protected abstract void printList(String prefix);

    @Override
    public String toString() {
        return getName() + " (" + getSize() + ")";
    }

    public void getFullName() {
        StringBuilder sb = new StringBuilder();
        Entry entry = this;
        while (entry != null) {
            sb.insert(0,entry.getName());
            sb.insert(0,"/");
            entry = entry.parent;
        }
        System.out.println(sb);
    }
}
