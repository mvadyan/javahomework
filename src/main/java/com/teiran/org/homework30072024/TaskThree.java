package com.teiran.org.homework30072024;

public class TaskThree {
    public static void main(String[] args) {
        CarsInitialization cars = new CarsInitialization();
        Car[] initCars = cars.init();

        for (int i = 0; i < initCars.length; i++) {
            for (int j = 0; j < initCars.length - 1 - i; j++) {
                int one = initCars[j].model.charAt(0);
                int two = initCars[j + 1].model.charAt(0);

                if (one > two) {
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
