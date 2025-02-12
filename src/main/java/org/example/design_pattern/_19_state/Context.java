package org.example.design_pattern._19_state;

public interface Context {
    public abstract void setClock(int hour);
    public abstract void changeState(State state);
    public abstract void callSecurity(String msg);
    public abstract void recordLog(String msg);
}
