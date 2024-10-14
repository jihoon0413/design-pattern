package org.example.design_pattern.bridge_9;

public class Main {
    public static void main(String[] args) {

        Display d1 = new Display(new StringDisplayImpl("Hello, Korea"));
        Display d2 = new CountDisplay(new StringDisplayImpl("Hello world"));
        CountDisplay d3 = new CountDisplay(new StringDisplayImpl("Hello, Universe."));
        RandomCountDisplay d4 = new RandomCountDisplay(new StringDisplayImpl("new Function"));
        CountDisplay d5 = new CountDisplay(new FileDisplayImpl("design-pattern 폴더 아래에 파일 추가"));
        IncreaseDisplay d6 = new IncreaseDisplay(new CharDisplayImpl('<','*','>'),3);
        IncreaseDisplay d7 = new IncreaseDisplay(new CharDisplayImpl('|','#','-'),3);
        d1.display();
        d2.display();
        d3.display();
        d3.multiDisplay(5);
        d4.randomDisplay(5);
        d5.multiDisplay(1);
        d6.increaseDisplay(4);
        d7.increaseDisplay(6);
    }
}
