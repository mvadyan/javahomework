package com.teiran.org.javaprof.homework09092024.carstore;

import com.teiran.org.javaprof.homework09092024.carstore.enums.Color;
import com.teiran.org.javaprof.homework09092024.carstore.model.Car;

public class CarStoreApp {
    public static void main(String[] args) {

        CarStore carStore = new CarStore();
        StoreService storeService = new StoreService(carStore);

        storeService.sellCar("11111111111111111111111", "123AS", false);
        storeService.sellCar("222222222222222222222222", "236RF", false);
        storeService.sellCar("7777777777777777777777777", "224SF", false);
        storeService.sellCar("8888888888888888888888888", "238FF", false);
        storeService.sellCar("9999999999999999999999999", "236DE", true);
        storeService.sellCar("1111111111111111111111110", "214RU", true);

        storeService.changeColor("333333333333333333333333", Color.BLUE);
        storeService.changeColor("7777777777777777777777777", Color.BLACK);
        storeService.changeColor("1111111111111111111111110", Color.SILVER);

        storeService.changeRegNum("8888888888888888888888888", "AAAAA");
        storeService.changeRegNum("9999999999999999999999999", "BBBBB");

        storeService.printSoldCars();
    }
}
