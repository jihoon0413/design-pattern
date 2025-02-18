package org.example.design_pattern._20_flyweight;

public class BigString {
    private BigChar[] bigChars;

    public BigString(String string) {
        BigCharFactory factory = BigCharFactory.getInstance();
        bigChars = new BigChar[string.length()];
        for (int i = 0; i < bigChars.length; i++) {
            bigChars[i] = factory.getBigChar(string.charAt(i));
        }
    }

    public BigString (String string, Boolean bool) {
        bigChars = new BigChar[string.length()];
        if(bool) {
            BigCharFactory factory = BigCharFactory.getInstance();
            for (int i = 0; i < bigChars.length; i++) {
                bigChars[i] = factory.getBigChar(string.charAt(i));
            }
        } else {
            for (int i = 0; i < bigChars.length; i++) {
                bigChars[i] = new BigChar(string.charAt(i));
            }
        }
    }

    public void print() {
        for(BigChar bc : bigChars) {
            bc.print();
        }
    }
}
