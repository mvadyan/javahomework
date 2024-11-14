package com.teiran.org.javaprof.homework16092024.citygame;

import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;

public class CItyApp {

    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        Map<City, Integer> cityIntegerMap = new HashMap<>();

        CityService cityService = new CityService();

        while (!cityService.check(cityIntegerMap)) {
            System.out.println(" Gamer one, please, input name of city");
            String cityOne = scanner.next();
            cityService.addCity(cityIntegerMap, cityOne);


            System.out.println(" Gamer two, please, input name of city");
            String cityTwo = scanner.next();
            cityService.addCity(cityIntegerMap, cityTwo);
        }
        System.out.println("print all cities");
        cityService.printCities(cityIntegerMap);

        System.out.println("print cities contains two and more times");
        cityService.printCities(cityIntegerMap, 2);

    }
}
