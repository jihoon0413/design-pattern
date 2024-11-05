package org.example.design_pattern.Decorator_12;

public class UpDownBorder extends Border{
    private char chr;

    public UpDownBorder(Display display, char chr) {
        super(display);
        this.chr = chr;
    }

    @Override
    public int getColumns() {
        return display.getColumns();
    }

    @Override
    public int getRows() {
        return 1 + display.getRows() + 1;
    }

    @Override
    public String getRowText(int row) {
        if(row == 0 || row == display.getRows() + 1) {
            int length = display.getColumns();
            return makeLine(length);
        } else {
            return display.getRowText(row-1);
        }
    }

    public String makeLine(int length) {
        StringBuilder sb = new StringBuilder();

        for (int i = 0; i < length; i++) {
            sb.append(chr);
        }
        return sb.toString();
    }
}
