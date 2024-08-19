package com.teiran.org.javaprof.homework13082024;

public class PersonApp {
    public static void main(String[] args) {
        Person personOne = new Person();

        personOne.setFullName("Vadym");
        personOne.setAge(38);

        personOne.talk();
        personOne.move();

        Person personTwo = new Person("John Smith", 50);
        personTwo.move();
        personTwo.talk();


    }
}
