package com.branden;

import java.util.HashMap;
import java.util.Observable;
import java.util.Observer;

/**
 * Created by badams on 3/24/16.
 */
public class EggCounter implements Observer {
    private HashMap<Chicken, Integer> eggCount = new HashMap<>();

    public void update(Observable chicken, Object arg) {
        if ( ((Chicken)chicken).laidEgg() ){
            // if there is not a chicken object found then add a new one with a count of 1
            // if found then increment the tempCount
            if ( !this.eggCount.containsKey( chicken) ){
                this.eggCount.put( (Chicken)chicken, 1  );
            } else{
                int tempCount = this.eggCount.get(chicken);
                this.eggCount.put( (Chicken)chicken, ++tempCount  );

            }
        }
    }
    public String toString(){
        // outString to build by looping through all the objects
        String outString ="";
        // get the chicken object from the keyset of hash value ( Chicken, int )
        for (Chicken ch: eggCount.keySet()) {
            // chicken toString return the name, eggCount.get(ch) returns an int
            outString += ch.toString() + " laid " + eggCount.get(ch)+"\n";
        }
         return outString;
    }

}
