package com.teiran.org.javaprof.homework21082024.bunsmachine.services;

import com.teiran.org.javaprof.homework21082024.bunsmachine.BunController;
import com.teiran.org.javaprof.homework21082024.bunsmachine.interfaces.BunsTypeImpl;
import com.teiran.org.javaprof.homework21082024.bunsmachine.model.machine.BunMachine;
import com.teiran.org.javaprof.homework21082024.bunsmachine.model.machine.CreamBun;
import com.teiran.org.javaprof.homework21082024.bunsmachine.model.machine.JamBun;
import com.teiran.org.javaprof.homework21082024.bunsmachine.model.machine.MeatBun;

import static com.teiran.org.javaprof.homework21082024.bunsmachine.enums.BunType.*;
import static com.teiran.org.javaprof.homework21082024.bunsmachine.enums.CreamBunsType.*;
import static com.teiran.org.javaprof.homework21082024.bunsmachine.enums.JamBunsType.*;
import static com.teiran.org.javaprof.homework21082024.bunsmachine.enums.MeatBunsType.*;

public class Stove {
    public void makeBun(BunsTypeImpl bunType) {
        switch (bunType) {
            case JAMBUN:
                new BunController().start(new JamBun());
                break;
            case MEATBUN:
                new BunController().start(new MeatBun());
                break;
            case CREAMBUN:
                new BunController().start(new CreamBun());
                break;
            case STRAWBERRYJAMBUN:
                new JamBun().makeBun(STRAWBERRYJAMBUN);
                break;
            case CHERYJAMBUN:
                new JamBun().makeBun(CHERYJAMBUN);
                break;
            case RASPBERRYJAMBUN:
                new JamBun().makeBun(RASPBERRYJAMBUN);
                break;
            case BACONBUN:
                new MeatBun().makeBun(BACONBUN);
                break;
            case CHICKENBUN:
                new MeatBun().makeBun(CHICKENBUN);
                break;
            case CUSTARDBUN:
                new CreamBun().makeBun(CUSTARDBUN);
                break;
            case EGGCREAMBUN:
                new CreamBun().makeBun(EGGCREAMBUN);
                break;
            default:
                new BunController().start(new BunMachine());
        }
    }
}
