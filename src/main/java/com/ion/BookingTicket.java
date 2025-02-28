package com.ion;
import java.util.concurrent.locks.Lock;
import java.util.concurrent.locks.ReentrantLock;
import java.util.LinkedList;
import java.util.Queue;

public class BookingTicket {

    public static Queue <Passenger> normal = new LinkedList<>();
    public static Queue <Passenger> vip = new LinkedList<>();

    public static void populateQueue(Passenger passenger){
        if(passenger.isVip()) vip.add(passenger);
        else normal.add(passenger);
    }

    public static int totalSeats = 50;
    public static int bookedSeats = 0;
    public static int totalAvailableSeats = totalSeats - bookedSeats;

    public static Lock lock = new ReentrantLock();
    public static void bookTicket(Queue normal,Queue vip,int num){
        while (true) {
            if(!vip.isEmpty()){
                lock.lock();
//                try{
                if((num <= totalAvailableSeats) && num>0){
                    Passenger ex = (Passenger)vip.poll();
                    bookedSeats+=ex.getTickets();
                    totalAvailableSeats-=ex.getTickets();
                    System.out.println(totalAvailableSeats);
                    System.out.println(ex.getName());
                    lock.unlock();
                    continue;
                }
//                }finally{
//                    lock.unlock();
//                }
            }else if(!normal.isEmpty()){
                lock.lock();
                try{
                if((num <= totalAvailableSeats) && num>0){
                    Passenger ex = (Passenger)normal.poll();
                    bookedSeats+=ex.getTickets();
                    totalAvailableSeats-=ex.getTickets();
                    System.out.println(totalAvailableSeats);
                    System.out.println(ex.getName());
                }}finally{
                    lock.unlock();
                }
            }

            if( totalAvailableSeats == 0 || (vip.isEmpty() && normal.isEmpty())) break;
        }
    }
}
