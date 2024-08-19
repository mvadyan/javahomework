package com.teiran.org.javaprof.homework13082024;

public class PhoneApp {

    public static void main(String[] args) {
        Phone phoneOne = new Phone(1234564, "Samsung", 150.4);
        System.out.println(phoneOne);

        Phone phoneTwo = new Phone(3452345, "siemens", 75);
        System.out.println(phoneTwo);

        Phone phoneThree = new Phone(3453485, "nokia3310", 100.25);
        System.out.println(phoneThree);

        Person personOne = new Person("Alex", phoneOne);

        Person personTwo = new Person("Donald Tramp", phoneTwo);

        personOne.getPhone().receiveCall(personTwo);


    }
}
