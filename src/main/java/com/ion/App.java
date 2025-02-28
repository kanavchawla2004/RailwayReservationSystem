package com.ion;
import java.util.LinkedList;
import java.util.Queue;

public class App {
    public static void main( String[] args ) throws InterruptedException {
        Passenger kanavPassenger = new Passenger();
        kanavPassenger.setAge(21);
        kanavPassenger.setName("Kanav");
        kanavPassenger.setVip(false);
        kanavPassenger.setTickets(5);

        Passenger notPassenger = new Passenger();
        notPassenger.setAge(22);
        notPassenger.setName("VipKanav");
        notPassenger.setVip(true);
        notPassenger.setTickets(10);

        Passenger anish = new Passenger();
        anish.setAge(21);
        anish.setName("VipAnish");
        anish.setVip(true);
        anish.setTickets(15);

        BookingTicket.populateQueue(kanavPassenger);
        BookingTicket.populateQueue(notPassenger);
        BookingTicket.populateQueue(anish);

        BookingThread kanavThread = new BookingThread(kanavPassenger);
        BookingThread kanaThread2 = new BookingThread(notPassenger);
        BookingThread AnishThread =  new BookingThread(anish);
        kanavThread.start();
        kanaThread2.start();
        AnishThread.start();


    }
}
