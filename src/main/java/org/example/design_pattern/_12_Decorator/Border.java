package org.example.design_pattern._12_Decorator;

public abstract class Border extends Display{
    protected Display display;

    protected Border(Display display) {
        this.display = display;
    }
}
