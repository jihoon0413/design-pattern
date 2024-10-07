package org.example.design_pattern.strategy_10;

public interface Strategy {
    public abstract Hand nextHand();
    public abstract void study(boolean win);
}
