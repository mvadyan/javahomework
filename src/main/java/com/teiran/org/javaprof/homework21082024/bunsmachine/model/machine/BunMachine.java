package com.teiran.org.javaprof.homework21082024.bunsmachine.model.machine;

import com.teiran.org.javaprof.homework21082024.bunsmachine.enums.BunType;
import com.teiran.org.javaprof.homework21082024.bunsmachine.interfaces.Bun;
import com.teiran.org.javaprof.homework21082024.bunsmachine.interfaces.BunMachineImpl;
import com.teiran.org.javaprof.homework21082024.bunsmachine.interfaces.BunsTypeImpl;

import java.util.ArrayList;
import java.util.List;

public class BunMachine implements BunMachineImpl {

    public List<BunsTypeImpl> supportedBunsTypes = new ArrayList<>();

    public BunMachine() {
        init();
    }

    public void printAllBunType() {
        for (BunType type : BunType.values()) {
            System.out.println(type.ordinal() + 1 + ". " + type.getDescription());
        }
    }

    public void init() {
        supportedBunsTypes.clear();
        for (BunType type : BunType.values()) {
            supportedBunsTypes.add(type);
        }
    }

    public Bun makeBun(BunsTypeImpl choise){
        return  null;
    };

}
