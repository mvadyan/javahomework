package com.teiran.org.javaprof.homework21082024.bunsmachine.model.machine;

import com.teiran.org.javaprof.homework21082024.bunsmachine.interfaces.Bun;
import com.teiran.org.javaprof.homework21082024.bunsmachine.interfaces.BunsTypeImpl;
import com.teiran.org.javaprof.homework21082024.bunsmachine.enums.MeatBunsType;
import com.teiran.org.javaprof.homework21082024.bunsmachine.model.bun.Bacon;

import static com.teiran.org.javaprof.homework21082024.bunsmachine.enums.MeatBunsType.BACONBUN;
import static com.teiran.org.javaprof.homework21082024.bunsmachine.enums.MeatBunsType.CHICKENBUN;

public class MeatBun extends BunMachine {

    public MeatBun() {
        init();
    }

    public void printAllBunType() {
        for (MeatBunsType type : MeatBunsType.values()) {
            System.out.println(type.ordinal() + 1 + ". " + type.getDescription());
        }
    }

    public void init() {
        supportedBunsTypes.clear();
        for (MeatBunsType type : MeatBunsType.values()) {
            supportedBunsTypes.add(type);
        }
    }

    @Override
    public Bun makeBun(BunsTypeImpl choise) {

        switch (choise) {
            case BACONBUN:
                new Bacon(BACONBUN).toString();
                break;
            case CHICKENBUN:
                new Bacon(CHICKENBUN).toString();
                break;
            default:
                return null;
        }
        return null;
    }
}
