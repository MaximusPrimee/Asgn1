/** A Java program used to create objects of type Weight and calculate shipping costs based on weight of a package **/

import java.lang.Math.*;

public class Project1
{
	public static void main(String[] args) {
		//create three instances of the weight class
		Weight weight1 = new Weight(14, 1.2);
		Weight weight2 = new Weight(12, 7.6);
		Weight weight3 = new Weight(2, 4.1);
		
		
		//now call up different methods to find minimum, maximum, and Average
		findMinimum(weight1, weight2, weight3);
		findMaximum(weight1, weight2, weight3);
		findAverage(weight1, weight2, weight3);
		
	}
	
	
	//A private class method that takes three instances of Weight and returns minimum
	private void findMinimum(Weight objOne, Weight objTwo, Weight objThree) {
	    System.out.print("Weight One: " + objOne.toString() + " "); 
	    System.out.print("Weight Two: " + objTwo.toString() + " ");
	    System.out.println("Weight Three: " + objThree.toString() + " ");
	    
	    System.out.println("Minimum is: " + Math.min(objOne, objTwo, objThree)); 
	}
	
	
	//A private class method that takes three instances of Weight and returns maximum
	private void findMaximum(Weight objTwo, Weight objTwo, Weight objThree) {
	    System.out.print("Weight One: " + objOne.toString() + " "); 
	    System.out.print("Weight Two: " + objTwo.toString() + " ");
	    System.out.println("Weight Three: " + objThree.toString() + " ");
	    
	    System.out.println("Maximum is: " + Math.max(objOne, objTwo, objThree));
	}
	
	
	//A private class method that takes three instances of weight and returns Average
	private void findAverage(Weight objTwo, Weight objTwo, Weight objThree) {
	    System.out.print("Weight One: " + objOne.toString() + " "); 
	    System.out.print("Weight Two: " + objTwo.toString() + " ");
	    System.out.println("Weight Three: " + objThree.toString() + " ");
	    
	    Weight average = new Weight();
	    average = ((objOne + objTwo + objThree) / 3);
	    
	    System.out.println("Average is: " + average.toString());
	}
	
	
	
	
}
