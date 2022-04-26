/** This class is used to determine weight to be used to calculate shipping costs**/

public class Weight
{
    private int pounds;
    private double ounces;
    private final int OUNCES_IN_POUND = 16;
    
    
    //Constructor for pounds and ounces
    public Weight(int pounds, double ounces) {
        this.pounds = pounds;
        this.ounces = ounces;
    }
    
    
    //public method to compare object weight against input weight
    public boolean lessThan(int poundsTwo, double ouncesTwo) {
        boolean compare;
        
        if (pounds < poundsTwo) {
            compare = true;
            System.out.println(compare);
        }
        
        else {
            compare = false;
            System.out.println(compare);
        }
        
        
        if (ounces < ouncesTwo) {
            compare = true;
            System.out.println(compare);
        }
        
        else {
            compare = false;
            System.out.println(compare);
        }
    }
    
    
    //A public method used by objects of type Weight to add to pound/ounces attributes
    public double int addsTo(int addPounds, double addOunces) {
        pounds = pounds + addPounds;
        ounces = ounces + addOunces;
        
        return pounds;
        return ounces;
    }
    
    
    //A public method used to display a string of the weight object's pounds and ounces 
    public String toString(int poundsThree, double ouncesThree) {
        System.out.print(poundsThree + " pounds ");
        System.out.printf(%.2f, ouncesThree + " ounces ");
        System.out.println();
    }
    
    
    //A private method within the class to convert total weight entered to ounces.
    private double toOunces(int poundsFour, double ouncesFour) {
        int poundsToOunces = poundsFour * OUNCES_IN_POUND;
        double totalOunces;
        totalOunces = poundsToOunces + ouncesFour;
        return totalOunces;
    }
    
    
    //A private method that normalizes the weight
    private boolean normalize(double ounces) {
        System.out.println("Is the amount of ounces entered less than a pound, true is yes and false is no.");
        
        boolean lessThanAPound;
        int newPoundsAdded;
        double ouncesLeft;
        
        
        if (ounces > 0 && ounces < 16) {
            lessThanAPound = true;
            System.println("Valid Ounces");
        }
        
        
        else if (ounces < 0) {
            System.out.println("This is not a valid number");
        }
        
        
        else (ounces >= 16) {
            lessThanAPound = false;
            newPoundsAdded = ounces / 16;
            ouncesLeft = ounces % 16;
            
            System.out.println("Pounds to be added = " + newPoundsAdded);
            System.out.println("Ounces to be added = " + ouncesLeft);
            
            this.pounds = pounds + newPoundsAdded;
            this.ounces = ounces + ouncesLeft;
            
        }
        
        return lessThanAPound;
    }
    
    
    
    

}