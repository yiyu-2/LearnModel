package org.example.gamedesign.ComandModel;

import java.util.Stack;

public class User {
    private Stack<Command> stack=new Stack<>();

    public Stack<Command> getStack() {
        return stack;
    }

    public void setStack(Stack<Command> stack) {
        this.stack = stack;
    }
}
