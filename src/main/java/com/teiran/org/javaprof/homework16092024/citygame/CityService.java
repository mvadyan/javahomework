package com.teiran.org.javaprof.homework16092024.citygame;

import java.util.Map;

public class CityService {

    public void addCity(Map<City, Integer> cityIntegerMap, String cityName) {
        City city = new City(cityName);

        if (!cityIntegerMap.containsKey(city)) {
            cityIntegerMap.put(city, 1);
        } else {
            Integer count = cityIntegerMap.get(city);
            count++;
            cityIntegerMap.put(city, count);
        }
    }

    public boolean check(Map<City, Integer> cityIntegerMap) {
        return cityIntegerMap.containsValue(5);
    }

    public void printCities(Map<City, Integer> cityIntegerMap) {

        cityIntegerMap.forEach((k, v) -> {
            System.out.println(k.getName() + " = " + v);
        });
    }

    public void printCities(Map<City, Integer> cityIntegerMap, Integer countOfCities) {

        cityIntegerMap.forEach((k, v) -> {
            if (v >= 2) {
                System.out.println(k.getName() + " = " + v);
            }
        });
    }
}
