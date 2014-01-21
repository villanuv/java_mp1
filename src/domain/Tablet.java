package domain;

/**
 *
 * @author Patrick Villanueva
 */

//Abstract Class
//Note: This means we cannot instantiate/create object of Tablet
public abstract class Tablet implements TabletRelatable, InstanceCountable {

    //fields
    //Note for self: protected to inherit, public for driver
    protected String manufacturer;
    protected String modelNumber;
    protected double displaySize;
    protected short memory;
    protected boolean hasWifi;
    protected boolean hasMobileCarrier;
    protected double weight;
    protected float cost;

    
    //default constructor
    public Tablet() {
        manufacturer = "Generic";
        modelNumber = "N/A";
        displaySize = 13.1;
        memory = 16;
        hasWifi = true;
        hasMobileCarrier = false;
        weight = 5.1;
        cost = 1.00F;
    }
    
    //full-arg constructor
    public Tablet(String manufacturer, String modelNumber, double displaySize, short memory, boolean hasWifi, boolean hasMobileCarrier, double weight, float cost) {
        this.manufacturer = manufacturer;
        this.modelNumber = modelNumber;
        this.displaySize = displaySize;
        this.memory = memory;
        this.hasWifi = hasWifi;
        this.hasMobileCarrier = hasMobileCarrier;
        this.weight = weight;
        this.cost = cost;
    }

    
    //getters and setters
    //for manufacturer
    public String getManufacturer() {
        return manufacturer;
    }

    public void setManufacturer(String manufacturer) {
        this.manufacturer = manufacturer;
    }

    //for model number
    public String getModelNumber() {
        return modelNumber;
    }

    public void setModelNumber(String modelNumber) {
        this.modelNumber = modelNumber;
    }

    //for display size
    public double getDisplaySize() {
        return displaySize;
    }

    public void setDisplaySize(double displaySize) {
        this.displaySize = displaySize;
    }

    //for memory spec
    public short getMemory() {
        return memory;
    }

    public void setMemory(short memory) {
        this.memory = memory;
    }

    //for wifi spec
    public boolean getHasWifi() {
        return hasWifi;
    }

    public void setHasWifi(boolean hasWifi) {
        this.hasWifi = hasWifi;
    }

    //for mobile carrier spec
    public boolean getHasMobileCarrier() {
        return hasMobileCarrier;
    }

    public void setHasMobileCarrier(boolean hasMobileCarrier) {
        this.hasMobileCarrier = hasMobileCarrier;
    }

    //for weight
    public double getWeight() {
        return weight;
    }

    public void setWeight(double weight) {
        this.weight = weight;
    }

    //for cost
    public float getCost() {
        return cost;
    }

    public void setCost(float cost) {
        this.cost = cost;
    }
    
    //Finds largest display
    @Override
    public String FindLargestDisplayTablet(Tablet[] tablets) {
       double largestdisplay = 0.0;
       for (int i = 0; i < tablets.length; i++) {
           largestdisplay = Math.max(tablets[i].getDisplaySize(),largestdisplay);
       }
       return "\nOf the 20 selected, the largest display is: " + largestdisplay + "\"";
    }
    
    //Finds lowest cost
    @Override
    public String FindLowestCostTablet(Tablet[] tablets) {
       float lowestcost = 1000.0f;
       for (int i = 0; i < tablets.length; i++) {
           lowestcost = Math.min(tablets[i].getCost(),lowestcost);
       }
       return "     The lowest cost: $" + lowestcost;
    }

    //Finds total tablets created
    @Override    
    public String FindNumberOfCreatedTabletTypes(Tablet[] tablets) {
        return 
                "\nTotal tablets: " + tablets.length + "\n" +
                "iPads selected: " + iPadTablet.getCounter() + "\n" +
                "Galaxies selected: " + GalaxyTablet.getCounter() + "\n" +
                "Nexuses selected: " + NexusTablet.getCounter();            
    }
     
    //Finds lightest weight
    @Override
    public String FindLightestWeightTabletType(Tablet[] tablets) {
       double lightestweight = 1000.0;
       for (int i = 0; i < tablets.length; i++) {
           lightestweight = Math.min(tablets[i].getWeight(),lightestweight);
       }
       return "     The lightest weight: " + lightestweight + "lbs.";
    }
    
    
    //toString() method
    @Override
    public String toString() {
        return "Tablet{" + "manufacturer=" + manufacturer + ", model=" + modelNumber + ", displaySize=" + displaySize + "\", memory=" + memory + "GB, hasWifi=" + hasWifi + ", hasMobileCarrier=" + hasMobileCarrier + ", weight=" + weight + "lbs, cost=$" + cost + '}';
    }
   
    
    
}



