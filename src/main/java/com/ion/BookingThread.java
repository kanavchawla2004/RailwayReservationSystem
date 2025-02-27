package com.ion;

public class BookingThread extends Thread{
    Passenger passenger;
    BookingTicket bookingTicket;
    int seatsToBeBooeked;
    BookingThread(Passenger passenger){
        this.passenger = passenger;
        this.setName(passenger.getName());
        seatsToBeBooeked = passenger.getTickets();
    }

    @Override
    public void run(){
        boolean success = bookingTicket.bookTicket(passenger.getName(), seatsToBeBooeked);
        if(success){
            System.out.println("Booked");
        }else{
            System.out.println("Not Booked");
        }
    }
    
}
    

