package org.example.design_pattern.Decorator_12;

public abstract class Border extends Display{
    protected Display display;

    protected Border(Display display) {
        this.display = display;
    }
}
