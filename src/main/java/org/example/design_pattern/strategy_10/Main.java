package org.example.design_pattern.strategy_10;

import java.util.Arrays;
import java.util.Comparator;
import java.util.List;

public class Main {
    public static void main(String[] args) {

//        if(args.length != 2) {
//            System.out.println("Usage: java Main randomseed1 randomseed2");
//            System.exit(0);
//        }
//        int seed1 = Integer.parseInt(args[0]);
//        int seed2 = Integer.parseInt(args[1]);
//        Player player1 = new Player("KIM", new WinningStrategy(seed1));
//        Player player2 = new Player("SHIN", new WinningStrategy(seed2));
//
//        for (int i = 0; i < 10000; i++) {
//            Hand nextHand1 = player1.nexthand();
//            Hand nextHand2 = player2.nexthand();
//            if(nextHand1.isWeakerThan(nextHand2)) {
//                System.out.println("Winner : " + player1);
//                player1.win();
//                player2.lose();
//            } else if (nextHand2.isWeakerThan(nextHand1)) {
//                System.out.println("Winner : " + player2);
//                player2.win();
//                player1.lose();
//            } else {
//                System.out.println("Even... ");
//                player1.even();
//                player2.even();
//            }
//        }
//        System.out.println("Total result : ");
//        System.out.println(player1);
//        System.out.println(player2);

        List<String> list = Arrays.asList("D","B","C","E","A");

        // 사전순으로 작은 순서
        list.sort((a,b) -> a.compareTo(b));
        System.out.println(list);

        // 사전순으로 큰 순서
        list.sort((a,b) -> b.compareTo(a));
        System.out.println(list);
    }
}
