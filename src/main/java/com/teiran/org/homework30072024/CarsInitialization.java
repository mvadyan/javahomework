package com.teiran.org.homework30072024;

public class CarsInitialization {

    public Car[] init() {
        Car[] cars = new Car[5];

        Car carOne = new Car();
        carOne.model = "BMW";
        carOne.price = 60.5;

        cars[0] = carOne;

        Car carTwo = new Car();
        carTwo.model = "Ferrari";
        carTwo.price = 120.15;

        cars[1] = carTwo;

        Car carThree = new Car();
        carThree.model = "Fiat";
        carThree.price = 18.7;

        cars[2] = carThree;

        Car carFour = new Car();
        carFour.model = "Mercedes";
        carFour.price = 85.4;

        cars[3] = carFour;

        Car carFive = new Car();
        carFive.model = "Audi";
        carFive.price = 60.0;

        cars[4] = carFive;

        return cars;
    }
}
