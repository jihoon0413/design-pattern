package org.example.design_pattern._16_mediator;

public interface Colleague {
    public abstract void setMediator(Mediator mediator);

    public abstract void setColleagueEnabled(boolean enabled);
}
