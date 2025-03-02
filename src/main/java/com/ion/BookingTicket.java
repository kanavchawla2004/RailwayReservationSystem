package com.ion;
import java.util.concurrent.locks.Lock;
import java.util.concurrent.locks.ReentrantLock;
import java.util.LinkedList;
import java.util.Queue;
import java.util.*;

public class BookingTicket {

//    public static Queue <Passenger> normal = new LinkedList<>();
//    public static Queue <Passenger> vip = new LinkedList<>();

    public static  PriorityQueue <Passenger> line = new PriorityQueue<>(new VipCompare());
    static class VipCompare implements Comparator<Passenger> {
        @Override
        public int compare(Passenger passenger1,Passenger passenger2)
        {
            if(passenger1.isVip() && passenger2.isVip()){
                if(passenger1.id<passenger2.id) return -1;
                else return 1;
            }
            if(passenger1.isVip()) return -1;
            if(passenger2.isVip()) return -1;
            return 1;
        }
    }


    public static void populateQueue(Passenger passenger){
        line.add(passenger);
    }

    public static int totalSeats = 50;
    public static int bookedSeats = 0;
    public static int totalAvailableSeats = totalSeats - bookedSeats;

    public static Lock lock = new ReentrantLock();
    public static void bookTicket(PriorityQueue <Passenger> line ){
        Passenger passenger = line.poll();
        int numOfTickets = passenger.getTickets();
        if(numOfTickets>0 && (totalAvailableSeats - numOfTickets >= 0)){
            lock.lock();
            totalAvailableSeats-=passenger.getTickets();
            bookedSeats += passenger.getTickets();
            System.out.println(passenger.getName());
            System.out.println(totalAvailableSeats);
            lock.unlock();
        }
    }
}
