package Paint2;

import java.util.Scanner;
import java.lang.Math;

/*
 * JoAnn Olney
 * Mod 7
 * IT-145
 */


public class Paint2 {

    public static void main(String[] args) {
	
        Scanner scnr = new Scanner(System.in);
	//initialize variables
        double wallHeight = 0.0;
        double wallWidth = 0.0;
        double wallArea = 0.0;
        double gallonsPaintNeeded = 0.0;
        double cansNeeded;

        final double squareFeetPerGallons = 350.0; //number of sq ft per gallons of paint
        final double gallonsPerCan = 1.0; //number of gallons of paint per can
	
	while (wallHeight == 0.0) {
		try {
        // Prompt user to input wall's height
        System.out.println("Enter wall height (feet): ");
        wallHeight = scnr.nextDouble();
	
	if (wallHeight <=0) { //make sure wall height is positive
		throw new Exception("the input for the wall height must be positive");
	}
	else {
	      continue;
	      }	
      }
	// catches exceptions and print output	
        catch (InputMismatchException e) {
        	System.out.println("The input is invalid!");
        	scnr.next(); //clear invalid input
	}
    }


        // Prompt user to input wall's width

	while (wallWidth == 0.0) {
        	try {
        		System.out.println("Enter wall width (feet): "); //user input for wall width 
        		wallWidth = scnr.nextDouble();
        		
        		if (wallWidth <= 0) {
        			throw new Exception("The input must be positive");
        		}
        		else {
        			continue;
        		}
        	}
        	// catches exceptions and print output
        	catch (InputMismatchException e) {
        		System.out.println("The input is invalid!");
        		scnr.next(); //clear invalid input
        	}
        }	

        // Calculate and output wall area
        wallArea = wallHeight * wallWidth;
        System.out.println("Wall area: " + wallArea + " square feet");

        // Calculate and output the amount of paint in gallons needed to paint the wall
        gallonsPaintNeeded = wallArea / squareFeetPerGallons;
        System.out.println("Paint needed: " + gallonsPaintNeeded + " gallons");

        // Calculate and output the number of paint cans needed to paint the wall,
        // rounded up to nearest integer
        // Complete this code block
        
        cansNeeded = Math.ceil(gallonsPaintNeeded / gallonsPerCan);
        System.out.println("Cans needed: " + cansNeeded + " can(s)"); //output of the can(s) paint needed
        
	return;
    }
}
