package com.teiran.org.javaprof.homework21082024.bunsmachine;

import com.teiran.org.javaprof.homework21082024.bunsmachine.model.machine.BunMachine;

public class BunApp {
    public static void main(String[] args) {
         new BunController().start(new BunMachine());
    }
}
