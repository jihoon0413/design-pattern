package org.example.design_pattern.strategy_10;

import java.util.Random;

public class ProbStrategy implements Strategy{

    private Random random;
    private int prevhandValue = 0;
    private int currentHandValue = 0;
    private int[][] history = {
            {1, 1, 1, },
            {1, 1, 1, },
            {1, 1, 1, }
    };

    public ProbStrategy(int seed) {
        random = new Random(seed);
    }

    @Override
    public Hand nextHand() {
        int bet = random.nextInt(getSum(currentHandValue));
        int handValue = 0;
        if(bet < history[currentHandValue][0]) {
            handValue = 0;
        } else if (bet < history[currentHandValue][0] + history[currentHandValue][1]) {
            handValue = 1;
        } else {
            handValue = 2;
        }
        prevhandValue = currentHandValue;
        currentHandValue = handValue;

        return Hand.getHand(handValue);
    }

    private int getSum(int handValue) {
        int sum = 0;
        for(int i = 0 ; i < 3 ; i++) {
            sum += history[handValue][i];
        }
        return sum;
    }

    @Override
    public void study(boolean win) {
        if(win) {
            history[prevhandValue][currentHandValue]++;
        } else {
            history[prevhandValue][(currentHandValue + 1) % 3]++;
            history[prevhandValue][(currentHandValue + 2) % 3]++;
        }
    }
}
