package org.example.design_pattern.bridge_9;

import java.util.Random;

public class RandomCountDisplay extends CountDisplay{

    Random random = new Random();

    public RandomCountDisplay(DisplayImpl impl) {
        super(impl);
    }

    public void randomDisplay(int times) {
        multiDisplay(random.nextInt(times));
    }
}
