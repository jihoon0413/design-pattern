package org.example.design_pattern._23_Interpreter;

// <repeat command> ::= repeat <number> <command list>
public class RepeatCommandNode extends Node{

    private int number;
    private Node commandListNode;

    @Override
    public void parse(Context context) throws ParseException {
        context.skipToken("repeat");
        number = context.currentNumber();
        context.nextToken();
        commandListNode = new CommandListNode();
        commandListNode.parse(context);
    }

    @Override
    public String toString() {
        return "[repeat " + number + " " + commandListNode + "]";
    }
}
