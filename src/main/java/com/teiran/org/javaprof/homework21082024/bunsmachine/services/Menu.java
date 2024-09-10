package com.teiran.org.javaprof.homework21082024.bunsmachine.services;

import com.teiran.org.javaprof.homework21082024.bunsmachine.BunController;
import com.teiran.org.javaprof.homework21082024.bunsmachine.interfaces.BunsTypeImpl;
import com.teiran.org.javaprof.homework21082024.bunsmachine.model.machine.BunMachine;

import java.util.Scanner;

public class Menu {

    public void printMenu(BunMachine machine) {
        machine.printAllBunType();
    }


    public BunsTypeImpl getNameBun( BunMachine machine) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Please, make a choice");
        int choice = scanner.nextInt();

        BunsTypeImpl nameBun = null;

        if (choice > machine.supportedBunsTypes.size()) {
            System.out.println("Out of stock. Please make another choice ");
            new BunController().start(new BunMachine());
        }

        for (int i = 1; i <= machine.supportedBunsTypes.size(); i++) {
            if (choice == i) {
                 nameBun = machine.supportedBunsTypes.get(i - 1);
                 return nameBun;
            }
        }
        return nameBun;
    }
}
