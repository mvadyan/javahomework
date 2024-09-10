package com.teiran.org.javaprof.homework21082024.bunsmachine.model.machine;

import com.teiran.org.javaprof.homework21082024.bunsmachine.interfaces.Bun;
import com.teiran.org.javaprof.homework21082024.bunsmachine.interfaces.BunsTypeImpl;
import com.teiran.org.javaprof.homework21082024.bunsmachine.enums.JamBunsType;
import com.teiran.org.javaprof.homework21082024.bunsmachine.model.bun.CheryJam;
import com.teiran.org.javaprof.homework21082024.bunsmachine.model.bun.RaspberryJam;
import com.teiran.org.javaprof.homework21082024.bunsmachine.model.bun.StrawberryJam;

import static com.teiran.org.javaprof.homework21082024.bunsmachine.enums.JamBunsType.*;
import static com.teiran.org.javaprof.homework21082024.bunsmachine.enums.JamBunsType.RASPBERRYJAMBUN;

public class JamBun extends BunMachine {

    public JamBun() {
        init();
    }

    public void printAllBunType() {
        for (JamBunsType type : values()) {
            System.out.println(type.ordinal() + 1 + ". " + type.getDescription());
        }
    }


    public void init() {
        supportedBunsTypes.clear();
        for (JamBunsType type : values()) {
            supportedBunsTypes.add(type);
        }
    }

    @Override
    public Bun makeBun(BunsTypeImpl choise) {
        switch (choise) {
            case STRAWBERRYJAMBUN:
                new StrawberryJam(STRAWBERRYJAMBUN).toString();
                break;
            case CHERYJAMBUN:
                new CheryJam(CHERYJAMBUN).toString();
                break;
            case RASPBERRYJAMBUN:
                new RaspberryJam(RASPBERRYJAMBUN).toString();
                break;
            default:
                return null;
        }
        return null;
    }
}
