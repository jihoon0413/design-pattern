package org.example.design_pattern._17_observer;

import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class FrameObserver extends Frame implements Observer, ActionListener {

    static class GraphText extends TextField implements Observer {
        public GraphText(int columns) {
            super(columns);
        }

        @Override
        public void update(NumberGenerator generator) {
            int number = generator.getNumber();
            StringBuilder text = new StringBuilder(number + ":");
            for (int i = 0; i < number; i++) {
                text.append('*');
            }
            setText(text.toString());
        }
    }


    @Override
    public void actionPerformed(ActionEvent e) {

    }

    @Override
    public void update(NumberGenerator generator) {

    }
}
