package org.example.design_pattern._18_memento;

import org.example.design_pattern._18_memento.game.Gamer;
import org.example.design_pattern._18_memento.game.Memento;

public class Main {
    public static final String SAVEFILENAME = "game.dat";
    public static void main(String[] args) {

        Gamer gamer = new Gamer(100);

        Memento memento = Memento.loadFromFile(SAVEFILENAME);

//        Memento memento = gamer.createMemento();


        if(memento == null) {
            System.out.println("새로 시작합니다.");
            memento = gamer.createMemento();
        } else {
            System.out.println("이전에 저장한 결과부터 시작합니다.");
            gamer.restoreMemento(memento);
        }


        for (int i = 0; i < 100; i++) {
            System.out.println("====" + i);
            System.out.println("상태:" + gamer);

            gamer.bet();

            System.out.println("소지금은 " + gamer.getMoney() + "원이 되었습니다.");

            if(gamer.getMoney() > memento.getMoney()) {
                System.out.println("*많이 늘었으니 현재 상태를 저장하자!");
                memento = gamer.createMemento();
                if(Memento.saveToFile(SAVEFILENAME, memento)) {
                    System.out.println("현재 상태를 파일로 저장했습니다.");
                }
            } else if (gamer.getMoney() < memento.getMoney() / 2) {
                System.out.println("*많이 줄었으니 이전 상태를 복원하자!");
                gamer.restoreMemento(memento);
            }

            try{
                Thread.sleep(1000);
            } catch (InterruptedException e) {
            }
            System.out.println();

        }

    }
}
