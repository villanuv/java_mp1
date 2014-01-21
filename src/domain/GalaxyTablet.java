package domain;

import java.util.Random;

/**
 *
 * @author Patrick Villanueva
 */

public class GalaxyTablet extends Tablet {

    private static int counter;
    
    //constructor
    public GalaxyTablet() {
        Random rnd = new Random();
        int idx = rnd.nextInt(7); //random
        
        manufacturer = "Samsung";
        displaySize = 7.0;
        modelNumber = "Galaxy Tab 7.0"; // Galaxy Tab 2, Galaxy Note 16GB,  Galaxy Note 32GB
        memory = 2;  //also 16, 32
        weight = 0.85; //also 0.76, 1.28
        hasWifi = true;
        hasMobileCarrier = false; //or true
        cost = 199.99F;  //also 249.99F, 349.99F, 399.99F, 499.99F, 549.99F
        counter++;
        
        /*  Samsung has no pattern for the different tablets available.
         *  All 7 models, initialized individually.
         * 
         */
        switch(idx) {
            case 1:
                hasMobileCarrier = true;
                break;
            case 2:
                hasMobileCarrier = true;
                memory = 16;
                cost = 249.99F;
                weight = 0.85;
                break;
            case 3:
                memory = 16;
                modelNumber = "Galaxy Tab 7.0 Plus " + memory + " GB" ;
                cost = 349.99F;
                weight = 0.76;
                break;
            case 4:
                memory = 32;
                modelNumber = "Galaxy Tab 7.0 Plus " + memory + " GB" ;
                cost = 449.99F;
                weight = 0.76;
                break;
            case 5:
                memory = 16;
                displaySize = 10.1;
                modelNumber = "Galaxy Tab 2";
                cost = 399.99F;
                weight = 1.28;
                break;
            case 6:
                memory = 16;
                displaySize = 10.1;
                modelNumber = "Galaxy Note " + memory + " GB" ;
                cost = 499.99F;
                weight = 1.31;
                break;
            case 7:
                memory = 32;
                displaySize = 10.1;
                modelNumber = "Galaxy Note " + memory + " GB" ;
                cost = 549.99F;
                weight = 1.31;
                break;
            default:
                break;

        }
        
    }
    
    //counts number tablets created     
    public static int getCounter() {
        return counter;
    }

    //done by Netbeans
    @Override
    public String findAllInstances(Tablet[] tablets) {
        throw new UnsupportedOperationException("Not supported yet.");
    }
       
}
