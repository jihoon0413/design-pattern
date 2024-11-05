package org.example.design_pattern.Decorator_12;

import java.util.ArrayList;
import java.util.List;

public class MultiStringDisplay extends Display{

    private List<String> multiString = new ArrayList<>();
    private int length = 0;
    @Override
    public int getColumns() {
        return length;
    }

    @Override
    public int getRows() {
        return multiString.size();
    }

    @Override
    public String getRowText(int row) {
        return multiString.get(row);
    }

    public void add(String string) {
        multiString.add(string);
        length = Math.max(length, string.length());
        updatePadding();
    }

    public void updatePadding() {
        for (int i = 0; i < multiString.size(); i++) {
            String line = multiString.get(i);
            int padding = length - line.length();
            multiString.set(i,line+ makeSpace(padding));
        }
    }

    public String makeSpace(int count) {
        StringBuilder sb = new StringBuilder();
        for (int i = 0; i < count; i++) {
            sb.append(' ');
        }
        return sb.toString();
    }
}
