package org.example.design_pattern._5_singleton.problem1;

public class Main {
    public static void main(String[] args) {

        TicketMaker ticketMaker1 = TicketMaker.getInstance();
        TicketMaker ticketMaker2 = TicketMaker.getInstance();

        for (int i = 0; i < 10; i++) {
            System.out.println(i + ": " + ticketMaker2.getNextTicketNumber());
            System.out.println(i + ": " + ticketMaker1.getNextTicketNumber());
        }


    }
}
