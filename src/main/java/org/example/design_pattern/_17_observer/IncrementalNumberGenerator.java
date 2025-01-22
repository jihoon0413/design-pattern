package org.example.design_pattern._17_observer;

public class IncrementalNumberGenerator extends NumberGenerator{

    private int number = 0;
    private int end = 0;
    private int gap = 0;


    public IncrementalNumberGenerator(int start, int end, int gap) {
        this.number = start;
        this.end = end;
        this.gap = gap;
    }

    @Override
    public int getNumber() {
        return number;
    }

    @Override
    public void execute() {
        for (int i = number; i < end ; i+=gap) {
            number = i;
            notifyObservers();
        }
    }
}
