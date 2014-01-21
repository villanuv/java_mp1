package domain;

/**
 *
 * @author Patrick Villanueva
 */

//described further in tablet class
public interface TabletRelatable {
 
    public String FindLargestDisplayTablet(Tablet[] tablets);
    public String FindLowestCostTablet(Tablet[] tablets);
    public String FindNumberOfCreatedTabletTypes(Tablet[] tablets);    
    public String FindLightestWeightTabletType(Tablet[] tablets);
    
}