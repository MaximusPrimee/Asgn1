/**This class is used to determine weight to be used to calculate shipping costs**/

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
    public boolean lessThan(Weight objOne) {
        
        if (this.pounds < objOne.pounds) {
            return true;
        }
        
        else if (this.pounds > objOne.pounds) {
            return false;
        }
        
        else {
            
            if (this.ounces < objOne.ounces) {
                return true;
            }
            
            else {
                return false;
            }
        }
    }
    
    
    //A public method used by objects of type Weight to add to pound/ounces attributes
    public void addsTo(Weight objTwo) {
        this.pounds += objTwo.pounds;
        this.ounces += objTwo.ounces;
        normalize();
    }
    
    
    //A public method used to display a string of the weight object's pounds and ounces 
    public String toString() {
        return this.pounds + " lbs" + this.ounces + " oz";
    }
    
    
    //A private method within the class to convert total weight entered to ounces.
    private double toOunces() {
        return this.pounds * this.OUNCES_IN_POUND + this.ounces;
    }
    
    
    //A private method that normalizes the weight
    private boolean normalize(double ounces) {
        while(this.ounces > this.OUNCES_IN_POUND) {
            this.ounces -= this.OUNCES_IN_POUND;
            this.pounds++;
        } 
    }
    
}
