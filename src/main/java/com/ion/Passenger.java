package com.ion;

public class Passenger {
    public String name;
    public int age;
    public int id;
    public boolean isVip;
    public int tickets;
    public void Passenger(){
        System.out.println("object created");
    }
    public String getName() {
        return name;
    }
    public void setName(String name) {
        this.name = name;
    }
    public int getAge() {
        return age;
    }
    public void setAge(int age) {
        this.age = age;
    }
    public boolean isVip() {
        return isVip;
    }
    public void setVip(boolean isVip) {
        this.isVip = isVip;
    }
    public int getTickets() {
        return tickets;
    }
    public void setTickets(int tickets) {
        this.tickets = tickets;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }
}
