package org.example.design_pattern._20_flyweight;

public class Main {
    private static BigString[] bsarray = new BigString[10000];
    public static void main(String[] args) {

        boolean shared = false;

       test(true);
       test(false);

//        BigString bs = new BigString("120120012");
//        bs.print();
    }
    static void test(boolean shared) {
        for (int i = 0; i < bsarray.length; i++) {
            bsarray[i] = new BigString("0101012",shared);
        }
        if(true) {
            System.out.println("공유한 경우:");
        } else {
            System.out.println("공유하지 않은 경우:");
        }

        Runtime.getRuntime().gc();
        long used = Runtime.getRuntime().totalMemory() - Runtime.getRuntime().freeMemory();
        System.out.println("사용 메모리 = " + used);
    }
}
