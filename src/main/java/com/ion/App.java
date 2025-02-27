package com.ion;


public class App {
    public static void main( String[] args ){
        // System.out.print("0");
        // Passenger kPassenger = new Passenger();
        Passenger kanavPassenger = new Passenger();
        kanavPassenger.setAge(21);
        kanavPassenger.setName("Kanav");
        kanavPassenger.setVip(false);
        kanavPassenger.setTickets(5);

        Passenger notPassenger = new Passenger();
        notPassenger.setAge(22);
        notPassenger.setName("notKanav");
        notPassenger.setVip(true);
        notPassenger.setTickets(10);

        BookingThread kanavThread = new BookingThread(kanavPassenger);
        BookingThread kanaThread2 = new BookingThread(notPassenger);
        kanavThread.start();
        kanaThread2.start();

        // kanavThread.join();
        // kanaThread2.join();

        // BookingTicket.bookTicket(kanavPassenger.getName(), kanavPassenger.getTickets());
    }
}
