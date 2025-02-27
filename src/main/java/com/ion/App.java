package com.ion;


public class App {
    public static void main( String[] args ){
        // System.out.print("0");
        Passenger kanavPassenger = new Passenger();
        kanavPassenger.setAge(21);
        kanavPassenger.setName("Kanav");
        kanavPassenger.setVip(false);
        kanavPassenger.setTickets(5);

        BookingThread kanavThread = new BookingThread(kanavPassenger);
        kanavThread.start();
        // kanavThread.start();
        // Passenger kanav2Passenger = new Passenger();
        // kanavPassenger.setAge(21);
        // kanavPassenger.setName("Kanav2");
        // kanavPassenger.setVip(true);
        // kanavPassenger.bookTicket("kanav",5);

        // BookingTicket.bookTicket(kanavPassenger.getName(), kanavPassenger.getTickets());
    }
}
