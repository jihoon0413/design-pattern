package org.example.design_pattern.singleton_5.problem1;

public class TicketMaker {
    public static TicketMaker ticketMaker = new TicketMaker();
    private int ticket = 1000;

    private TicketMaker() {
        System.out.println("TicketMaker 를 생성했습니다. ");
    }

    public static TicketMaker getInstance() {
        return ticketMaker;
    }

    public int getNextTicketNumber() {
        return ticket++;
    }

}
