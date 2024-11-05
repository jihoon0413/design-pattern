package org.example.design_pattern.Decorator_12;

public class Main {
    public static void main(String[] args) {
        MultiStringDisplay b1 = new MultiStringDisplay();
        b1.add("HI!");
        b1.add("Good morning");
        b1.add("Good night!");
        Display b2 = new UpDownBorder(b1, '-');
        Display b3 = new FullBorder(b2);
        b1.show();
        b2.show();
        b3.show();
        Display b4 =
            new SideBorder(
                new FullBorder(
                    new FullBorder(
                        new SideBorder(
                            new FullBorder(
                                new StringDisplay("Hello, world.")
                            ),
                            '*'
                        )
                    )
                ),
                '/'
            );
        b4.show();


    }
}
