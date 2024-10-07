package com.teiran.org.javaprof.homework09092024.carstore;

import com.teiran.org.javaprof.homework09092024.carstore.enums.Color;
import com.teiran.org.javaprof.homework09092024.carstore.model.Car;
import lombok.AllArgsConstructor;

import java.util.Set;

@AllArgsConstructor
public class StoreService {

    CarStore carStore;

    public void changeColor(String vin, Color color) {

        for (Car car : carStore.getCarList()) {
            if (vin.equals(car.getVin())) {
                car.setColor(color);
                break;
            }
        }

        for (Car car : carStore.getSoldCarsList()) {
            if (vin.equals(car.getVin())) {
                car.setColor(color);
                break;
            }
        }
    }

    public void changeRegNum(String vin, String regNum) {

        for (Car car : carStore.getCarList()) {
            if (vin.equals(car.getVin())) {
                car.setRegNum(regNum);
                break;
            }
        }

        for (Car car : carStore.getSoldCarsList()) {
            if (vin.equals(car.getVin())) {
                car.setRegNum(regNum);
                break;
            }
        }
    }

    public void sellCar(String vin, String regNum, boolean leasing) {
        for (Car car : carStore.getCarList()) {
            if (vin.equals(car.getVin()) && leasing) {

                carStore.getSoldCarsList().add(car);
                carStore.getLeasingCarsList().add(car);
                car.setRegNum(regNum);
                carStore.getCarList().remove(car);
                break;
            }

            if (vin.equals(car.getVin()) && !leasing) {
                carStore.getSoldCarsList().add(car);
                car.setRegNum(regNum);
                carStore.getCarList().remove(car);
                break;
            }
        }
    }

    public void printSoldCars() {
        for (Car car : carStore.getSoldCarsList()) {

            System.out.println(car + " " +
                    ((carStore.getLeasingCarsList().contains(car)) ? "leasing car" : "")
            );
        }
    }

}
