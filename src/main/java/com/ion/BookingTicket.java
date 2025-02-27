package com.ion;

import java.util.concurrent.locks.Lock;
import java.util.concurrent.locks.ReentrantLock;

public class BookingTicket {
    public static int totalSeats = 50;
    public static int bookedSeats = 0;
    public static int totalAvailableSeats = totalSeats - bookedSeats;
    public static Lock lock = new ReentrantLock();
    public static boolean bookTicket(String name,int num){
        lock.lock();
        try{
        if((num <= totalAvailableSeats) && num>0){
            bookedSeats+=num;
            totalAvailableSeats-=num;
            System.out.println(totalAvailableSeats);
            return true;
        }else{
            return false;
        }}finally{
            lock.unlock();
        }
        
    }
}
