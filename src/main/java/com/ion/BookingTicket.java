package com.ion;

public class BookingTicket {
    public static int totalSeats = 50;
    public static int bookedSeats = 0;
    public static int totalAvailableSeats = totalSeats - bookedSeats;
    public static boolean bookTicket(String name,int num){
        if((num <= totalAvailableSeats) && num>0){
            bookedSeats+=num;
            totalAvailableSeats-=num;
            System.out.println(totalAvailableSeats);
        }else{
            return false;
        }
        return true;
    }
}
