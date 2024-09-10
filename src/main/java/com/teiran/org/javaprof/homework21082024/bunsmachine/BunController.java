package com.teiran.org.javaprof.homework21082024.bunsmachine;

import com.teiran.org.javaprof.homework21082024.bunsmachine.interfaces.BunsTypeImpl;
import com.teiran.org.javaprof.homework21082024.bunsmachine.model.machine.BunMachine;
import com.teiran.org.javaprof.homework21082024.bunsmachine.services.Menu;
import com.teiran.org.javaprof.homework21082024.bunsmachine.services.Stove;

public class BunController {

    public void start(BunMachine machine) {
        Menu menu = new Menu();
        menu.printMenu(machine);

        BunsTypeImpl nameBun = menu.getNameBun(machine);;
        this.cookBun(nameBun);
    }

    private void cookBun(BunsTypeImpl nameBun) {
        Stove stove = new Stove();
        stove.makeBun(nameBun);

        new BunController().start(new BunMachine());
    }

}
