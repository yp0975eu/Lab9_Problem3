package com.branden;

import java.util.Observable;
import java.util.Observer;

/**
 * Created by badams on 3/24/16.
 */
class EggAlert implements Observer {

    // parameter 1 observable object chicken
    // parameter 2 arg2 is any additional arguments
    public void update(Observable chicken, Object arg) {

        if (( (Chicken)chicken).laidEgg() ){
            System.out.println(chicken + " has laid an egg");
        }

    }

}
