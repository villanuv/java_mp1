package mp1;

import domain.GalaxyTablet;
import domain.NexusTablet;
import domain.Tablet;
import domain.iPadTablet;
import java.util.Random;

/**
 *
 * @author Patrick Villanueva
 */
//driver class
public class Mp1 {

    /**
     * @param args the command line arguments
     */
    private static final int MAX_OBJS = 20;
    private static final int MAX_TYPES = 3;
    private static String [] manufacturers = {"Apple", "Samsung", "Google"};
    private static Tablet [] tablets = new Tablet[MAX_OBJS];

    public static void main(String[] args) {
        // random 20 tablet subclass instances
        for (int i = 0; i < MAX_OBJS; i++) {

            Random rnd = new Random();
            int idx = rnd.nextInt(MAX_TYPES);
            
            String manufacturer = manufacturers[idx];
            
            switch(manufacturer) {
                case "Apple":
                    tablets[i] = new iPadTablet();
                    break;
                case "Samsung":
                    tablets[i] = new GalaxyTablet();
                    break;
                case "Google":
                    tablets[i] = new NexusTablet();
                    break;
                default:
                    break;
            }
            // displays all created tablets data using toString() method from array
            System.out.println(tablets[i]);
        }
        
        // populates each subclass with its type data randomly
        //      have a string. 3 arrays of strings
        //      we have 8 fields
        //      we can preset up data to throw in full argument constructor before created

        
        

        // displays all interface method results using array as argument
        System.out.println(tablets[0].FindLargestDisplayTablet(tablets));
        System.out.println(tablets[0].FindLowestCostTablet(tablets));
        System.out.println(tablets[0].FindLightestWeightTabletType(tablets));
        System.out.println(tablets[0].FindNumberOfCreatedTabletTypes(tablets));


    }
}
