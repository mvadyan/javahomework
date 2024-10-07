package com.teiran.org.javaprof.homework09092024.carstore;

import com.teiran.org.javaprof.homework09092024.carstore.enums.Color;
import com.teiran.org.javaprof.homework09092024.carstore.enums.Model;
import com.teiran.org.javaprof.homework09092024.carstore.model.Car;
import lombok.Getter;

import java.util.ArrayList;
import java.util.HashSet;
import java.util.List;
import java.util.Objects;

@Getter
public class CarStore {
    private HashSet<Car> carList;
    private List<Car> soldCarsList;
    private HashSet<Car> leasingCarsList;

    public CarStore() {
        this.init();
    }

    private void init() {

        if (Objects.isNull(carList)) {
            carList = new HashSet<>();
        }

        if (Objects.isNull(soldCarsList)) {
            soldCarsList = new ArrayList<>();
        }

        if (Objects.isNull(leasingCarsList)) {
            leasingCarsList = new HashSet<>();
        }

        carList.add( new Car(Model.BMW, Color.BLACK, "11111111111111111111111"));
        carList.add( new Car(Model.MERCEDES, Color.BLACK, "222222222222222222222222"));
        carList.add( new Car(Model.BMW, Color.SILVER, "333333333333333333333333"));
        carList.add( new Car(Model.AUDI, Color.BLUE, "4444444444444444444444444"));
        carList.add( new Car(Model.OPEL, Color.WHITE, "5555555555555555555555555"));
        carList.add( new Car(Model.TOYOTA, Color.YELLOW, "6666666666666666666666666"));
        carList.add( new Car(Model.VOLKSWAGEN, Color.GREEN, "7777777777777777777777777"));
        carList.add( new Car(Model.MERCEDES, Color.WHITE, "8888888888888888888888888"));
        carList.add( new Car(Model.AUDI, Color.SILVER, "9999999999999999999999999"));
        carList.add( new Car(Model.OPEL, Color.GREEN, "1111111111111111111111110"));
    }
}
