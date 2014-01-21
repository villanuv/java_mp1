package domain;

import java.util.Random;

    
/**
 *
 * @author Patrick Villanueva
 */

public class iPadTablet extends Tablet {

    private static int counter;
    
    //constructor
    public iPadTablet() {
        short[] mem = {16, 32, 64};    
        Random rnd = new Random();
        int idx = rnd.nextInt(3);
        int idw = rnd.nextInt(3);

        short mems = mem[idx];
        int wire = idw;
        
        manufacturer = "Apple";
        memory = mems;
        modelNumber = "iPad " + memory + "GB";
        displaySize = 9.7;
        cost = 499.99F;
        weight = 1.44;
        hasWifi = true;
        hasMobileCarrier = false;
        counter++;
        
        //assigns cost based on memory
        switch(mems) {
            case 16:
                break;
            case 32:
                cost = cost + 100F;
                break;
            case 64:
                cost = cost + 200F;
                break;
            default:
                break;
        }
        
        //assigns fields based on cellular network feature
        switch(wire) {
            case 1:
                modelNumber = modelNumber + "+3G";
                hasMobileCarrier = true;
                cost = cost + 130F;
                weight = weight + 0.02;
            case 2:
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
