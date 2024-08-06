package com.teiran.org.homework30072024;

public class TaskTwo {
    public static void main(String[] args) {

        CarsInitialization cars = new CarsInitialization();
        Car[] initCars = cars.init();

        for (int i = 0; i < initCars.length; i++) {
            for (int j = 0; j < initCars.length - 1 - i; j++) {
                double one = initCars[j].price;
                double two = initCars[j + 1].price;

                if (one < two) {
                    Car temp = initCars[j + 1];
                    initCars[j + 1] = initCars[j];
                    initCars[j] = temp;
                }
            }
        }

        for (int i = 0; i < initCars.length; i++) {
            initCars[i].printCar();
        }

    }
}
