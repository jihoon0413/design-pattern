package org.example.design_pattern._23_Interpreter;

// <primitive command> ::= go | right | left
public class PrimitiveCommandNode extends Node{
    String name;

    @Override
    public void parse(Context context) throws ParseException {
        name = context.currentToken();
        if(name == null) {
            throw new ParseException("Error: Missing <primitive command>");
        } else if (!name.equals("go") && !name.equals("right") && !name.equals("left")) {
            throw new ParseException("Error: Unknown <primitive command>: '" + name + "'");
        }
        context.skipToken(name);
    }

    @Override
    public String toString() {
        return name;
    }
}
