package com.teiran.org.javaprof.homework09092024.carstore.model;

import com.teiran.org.javaprof.homework09092024.carstore.enums.Color;
import com.teiran.org.javaprof.homework09092024.carstore.enums.Model;
import lombok.*;

import java.util.Collection;
import java.util.Objects;

@Getter
@ToString
public class Car  {

    Model model;

    @Setter
    Color color;

    String vin;

    @Setter
    String regNum;

    public Car(Model model, Color color, String vin) {
        this.model = model;
        this.color = color;
        this.vin = vin;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Car car = (Car) o;
        return  Objects.equals(vin, car.vin);
    }

    @Override
    public int hashCode() {
        return Objects.hash(vin);
    }
}
