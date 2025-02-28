package org.example.design_pattern._23_Interpreter;

public abstract class Node {
    public abstract void parse(Context context) throws ParseException;
}
