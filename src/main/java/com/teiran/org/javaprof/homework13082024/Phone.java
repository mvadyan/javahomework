package com.teiran.org.javaprof.homework13082024;

public class Phone {

   private int number;

    private String model;

    private double weight;

    public Phone(int number, String model, double weight) {
        this.number = number;
        this.model = model;
        this.weight = weight;
    }

    public int getNumber() {
        return number;
    }

    public void receiveCall (Person person) {
        System.out.println("Pick up the Phone! " + person.getFullName() +
                " calls,  phone number is "
                + person.getPhone().getNumber());
    }

    @Override
    public String toString() {
        return "I am phone " + model + ", my number is " + number + " and my weight is " + weight + "g";
    }
}
