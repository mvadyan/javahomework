package com.teiran.org.javaprof.homework21082024.bunsmachine.model.machine;

import com.teiran.org.javaprof.homework21082024.bunsmachine.interfaces.Bun;
import com.teiran.org.javaprof.homework21082024.bunsmachine.interfaces.BunsTypeImpl;
import com.teiran.org.javaprof.homework21082024.bunsmachine.enums.CreamBunsType;
import com.teiran.org.javaprof.homework21082024.bunsmachine.model.bun.Custard;
import com.teiran.org.javaprof.homework21082024.bunsmachine.model.bun.EggCream;

import static com.teiran.org.javaprof.homework21082024.bunsmachine.enums.CreamBunsType.CUSTARDBUN;
import static com.teiran.org.javaprof.homework21082024.bunsmachine.enums.CreamBunsType.EGGCREAMBUN;

public class CreamBun extends BunMachine {

    public CreamBun() {
        init();
    }

    public void printAllBunType() {
        for (CreamBunsType type : CreamBunsType.values()) {
            System.out.println(type.ordinal() + 1 + ". " + type.getDescription());
        }
    }

    public void init() {
        supportedBunsTypes.clear();
        for (CreamBunsType type : CreamBunsType.values()) {
            supportedBunsTypes.add(type);
        }
    }

    @Override
    public Bun makeBun(BunsTypeImpl choise) {

        switch (choise) {
            case CUSTARDBUN:
                new Custard(CUSTARDBUN).toString();
                break;
            case EGGCREAMBUN:
                new EggCream(EGGCREAMBUN).toString();
                break;
            default:
                return null;
        }
        return null;
    }

}
