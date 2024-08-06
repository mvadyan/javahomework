package com.teiran.org.homework30072024;

public class TaskOne {
    public static void main(String[] args) {
        CarsInitialization cars = new CarsInitialization();
        Car[] initCars = cars.init();

        for (int i = 0; i < initCars.length; i++) {
            initCars[i].printCar();
        }
    }

}
