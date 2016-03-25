package com.branden;

public class TestObserver {

    public static void main(String[] args) {
        // initiate counter and alert, the update function inside these classes is called when
        // notifyObservers() is called;
        //

        EggAlert eggMonitor = new EggAlert();
        EggCounter eggCounter = new EggCounter();

        Chicken a = new Chicken("Mavis");

        // takes an observe object and makes a list of their update methods.
        // When notifyObservers  is called these the list of methods is called.
        a.addObserver(eggMonitor);
        a.addObserver(eggCounter);

        Chicken b = new Chicken("Betty");
        b.addObserver(eggMonitor);
        b.addObserver(eggCounter);

        Chicken c = new Chicken("Ellen");
        c.addObserver(eggMonitor);
        c.addObserver(eggCounter);

        Chicken d = new Chicken("Mary Joe");
        d.addObserver(eggMonitor);
        d.addObserver(eggCounter);

        Chicken e = new Chicken("Marge");
        e.addObserver(eggMonitor);
        e.addObserver(eggCounter);

        a.layEgg();
        b.layEgg();
        a.layEgg();
        a.layEgg();
        d.layEgg();
        e.layEgg();
        c.layEgg();
        b.layEgg();
        a.layEgg();
        System.out.println(eggCounter);

    }

}
