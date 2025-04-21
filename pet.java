/* 
 * JoAnn Olney
 * Project 1- Mod 4
 *IT-145 
 */

package PetBAG; //create package PetBAG
import java.util.Scanner; //import Scanner class


public class Pet { //class Pet created
	//attributes of class Pet 
	private String petType;
	private String petName;
	private int petAge;
	private int dogSpaces;
	private int catSpaces;
	private int daysStay;
	private double amountDue;
	
	//default constructor for the instance variables of class Pet with no parameters
	//-1 and 0.0 used to show that no integers have been set yet
	public Pet() {
		petType = "";
		petName = "";
		petAge = 0;
		dogSpaces = 30;
		catSpaces = 12;
		daysStay = -1;
		amountDue = 0.0;
	}
	
	//getter for petType
	public String getPetType() {
		return petType;
	}
	
	//setter for petType
	public void setPetType(String petType) {
		this.petType = petType;
		System.out.println("You have selected" + this.petType + "as the type of pet for Pet BAG."); //output for selecting petType
	}		
	
	//getter for petName
	public String getPetName() {
		return petName;
	}
	
	//setter for petName 
	public void setPetName(String petName) {
		this.petName = petName;
		System.out.println("The pets name is set as: " + getPetName()); //output what the pets name is 	
	}
	
	//getter for petAge
	public int getPetAge() {
		return petAge;
	}
	
	//setter for petAge
	public void setPetAge(int petAge) {
		this.petAge = petAge;
		System.out.println("The pets age is: " + petAge);
	}

	//getter for dogSpaces
	public int getDogSpaces() {
		return dogSpaces;
	}
	
	//setter for dogSpaces
	public void setDogSpaces(int dogSpaces) {	
		this.dogSpaces = dogSpaces;
		System.out.println("The number of dog spaces is: " + dogSpaces); //output for the number of dogSpaces
	}
	
	//getter for catSpaces
	public int getCatSpaces() {
		return catSpaces;
	}
	
	//setter for catSpaces
	public void setCatSpaces(int catSpaces) {
		this.catSpaces = catSpaces;
		System.out.println("The number of cat spaces is: " + catSpaces); //output for the number of catSpaces
	}
	
	//getter for daysStay
	public int getDaysStay() {
		return daysStay;
	}
	
	//setter for daysStay 
	public void setDaysStay(int daysStay) {
		this.daysStay = daysStay;
		if (daysStay >= 0) { // number of days the pet stays must be validated to greater or equal to 0
			System.out.println("The number of days stayed will be: " + daysStay);  		
		}
	}

	//getter for amountDue
	public double getAmountDue() {
		return amountDue;
	}
	
	//setter for amountDue
	public void setAmountDue(double amountDue) {
		this.amountDue = amountDue;
		if (amountDue >= 0.0) { //amount due must be equal or greater than 0.0, checking that
			System.out.println("The amount due is: " + amountDue);
		}
	}	
}