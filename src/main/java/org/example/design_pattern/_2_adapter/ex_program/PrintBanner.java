package org.example.design_pattern._2_adapter.ex_program;

public class PrintBanner extends Banner implements Print{ // Adapter 역할을 함 사용방법이 다른 Print 와 Banner 사이에서 중간 역할을 함
    public PrintBanner(String string) {
        super(string);
    }

    @Override
    public void printWeak() {
        showWithParen();
    }

    @Override
    public void printStrong() {
        showWithAster();
    }

}
