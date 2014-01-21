package domain;

import java.util.Random;

/**
 *
 * @author Patrick Villanueva
 */

public class NexusTablet extends Tablet {
    
    private static int counter;
    
    //constructor
    public NexusTablet() {

        Random rnd = new Random();
        int idx = rnd.nextInt(3);
        
        manufacturer = "Google";
        modelNumber = "Nexus7";
        displaySize = 7.0;
        memory = 8; 
        hasWifi = true;
        hasMobileCarrier = false;
        weight = 0.75;
        cost = 199.00F;
        
        //sets model number/memory based on random number
        switch(idx) {
            case 1:
                modelNumber = modelNumber + " " + memory + "GB";
                break;
            case 2:
                memory = 16;
                modelNumber = modelNumber + " " + memory + "GB";
                cost = 249.00F;
                break;
            default:
                break;
        }
                
        counter++;
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
