package com.ion;


public class App 
{
    public static void main( String[] args )
    {
        Passenger kanavPassenger = new Passenger();
        kanavPassenger.setAge(21);
        kanavPassenger.setName("Kanav");
        kanavPassenger.setVip(false);
        // kanavPassenger.bookTicket("kanav",5);
        BookingTicket.bookTicket(kanavPassenger.getName(), 5);
    }
}
