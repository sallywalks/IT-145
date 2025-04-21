/*
 * JoAnn Olney
 * 4/12/25
 */
package Paint1;

import java.util.InputMismatchException;
import java.util.Scanner;

public class Paint1 {

    public static void main(String[] args) {
        Scanner scnr = new Scanner(System.in);
        double wallHeight = 0.0;
        double wallWidth = 0.0;
        double wallArea = 0.0;
        double gallonsPaintNeeded = 0.0;
        
        final double squareFeetPerGallons = 350.0;
        
        // Implement a do-while loop to ensure input is valid
        // Prompt user to input wall's height
        while (wallHeight == 0.0) {
        	try {
        // the user will enter the walls height
        System.out.println("Enter wall height (feet): ");
        wallHeight = scnr.nextDouble();
        
        if (wallHeight <= 0) { //make sure that the wall height is over positive
        	System.out.println("The input must be greater 0!!");
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
        // Implement a do-while loop to ensure input is valid
        // Prompt user to input wall's width
        while (wallWidth == 0.0) {
        	try {
        		System.out.println("Enter wall width (feet): "); //user input for wall width 
        		wallWidth = scnr.nextDouble();
        		
        		if (wallWidth <= 0) {
        			System.out.println("The input must be greater than 0!!");
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
        System.out.println("Wall area:  square feet");

        // Calculate and output the amount of paint (in gallons) needed to paint the wall
        gallonsPaintNeeded = wallArea/squareFeetPerGallons;
        System.out.println("Paint needed: " + gallonsPaintNeeded + " gallons");
        
        return;
    }
}
