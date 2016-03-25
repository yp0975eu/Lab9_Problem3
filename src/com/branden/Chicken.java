package com.branden;

import java.util.Observable;

/**
 * Created by badams on 3/24/16.
 */

class Chicken extends Observable {

    String name;
    boolean laidEgg = false;

    Chicken(String name){
        this.name = name;
    }

    public void layEgg(){
        this.laidEgg = true;

        // Marks this Observable object as having been changed; the hasChanged method will now return true.
        // this is needed for the notifyObserver to call observe interface method update.
        this.setChanged();

        // checks if there's been a change to the observable and calls the update method inside the observer
        this.notifyObservers();
        this.laidEgg = false;
    }

    public String toString() {
        return this.name;
    }

    public boolean laidEgg(){
        return laidEgg;
    }

}

