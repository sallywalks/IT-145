/*
 * JoAnn Olney
 * project 2
 */

import java.util.ArrayList;
import java.util.Scanner;

public class Driver {
    private static ArrayList<Dog> dogList = new ArrayList<Dog>();
    private static ArrayList<Monkey> monkeyList = new ArrayList<Monkey>(); //added monkey private static array list
    private static ArrayList<String> speciesList = new ArrayList<String>(6); //6 kinds of monkeys 
    // Instance variables (if needed)
    String name;
    String breed;
    String gender;
    String age;
    String weight;
    String acquisitionDate;
    String acquisitionCountry;
    boolean reserved;
    String inServiceCountry;

    public static void main(String[] args) {
    	//The 6 species of monkeys given from the Grazioso Salvare spec doc.
    	speciesList.add("Capuchin");
    	speciesList.add("Guenon");
    	speciesList.add("Macaque");
    	speciesList.add("Marmoset");
    	speciesList.add("Squirrel Monkey");
    	speciesList.add("Tamarin");

        initializeDogList();
        initializeMonkeyList();
        
        // Add a loop that displays the menu, accepts the users input
        // and takes the appropriate action.
	// For the project submission you must also include input validation
        // and appropriate feedback to the user.
        // Hint: create a Scanner and pass it to the necessary
        // methods 
	// Hint: Menu options 4, 5, and 6 should all connect to the printAnimals() method.
        //initialize the input to be 0 and input1 variable 1 also as 0
        String option;
        boolean repeat = true;
        //create scanner to receive input 
        Scanner scnr = new Scanner(System.in);
        
        while(repeat) {
        	displayMenu(); // this will display the menu to the user 
        option = scnr.nextLine().toLowerCase(); //use the to lower case to keep the stored user inputs the same
        
        //will pass the user input that has been already stored in prev line to the switch
        switch(option) { //will take the users input in that is stored in the variable to the switch statemnt
        
        //use cases & "breaks"
        case "1":
        	intakeNewDog(scnr); //method to in take a new dog
        	break;
        	
        case "2":
        	intakeNewMonkey(scnr); //method to in take a new monkey
        	break;
        	 
        case "3":
        	reserveAnimal(scnr); //method to reserve an animal
        	
        case "4":
        	printAnimals("dog"); //print dog
        	break;
        		
        case "5":
        	printAnimals("monkey"); //print monkey
        	break;
        	
        case "6":
        	printAnimals("available"); // print available animals 
        	break;
        	
        case "f":
        	repeat = false; // error not a valid input broke loop 
        break;
        
        default:
        	System.out.println("Try Again, ERROR!"); //not a valid input 
        	break;
        }   
        } 
}       

    // This method prints the menu options
    public static void displayMenu() {
        System.out.println("\n\n");
        System.out.println("\t\t\t\tRescue Animal System Menu");
        System.out.println("[1] Intake a new dog");
        System.out.println("[2] Intake a new monkey");
        System.out.println("[3] Reserve an animal");
        System.out.println("[4] Print a list of all dogs");
        System.out.println("[5] Print a list of all monkeys");
        System.out.println("[6] Print a list of all animals that are not reserved");
        System.out.println("[q] Quit application");
        System.out.println();
        System.out.println("Enter a menu selection");
    }


    // Adds dogs to a list for testing
    public static void initializeDogList() {
        Dog dog1 = new Dog("Spot", "German Shepherd", "male", "1", "25.6", "05-12-2019", "United States", "intake", false, "United States");
        Dog dog2 = new Dog("Rex", "Great Dane", "male", "3", "35.2", "02-03-2020", "United States", "Phase I", false, "United States");
        Dog dog3 = new Dog("Bella", "Chihuahua", "female", "4", "25.6", "12-12-2019", "Canada", "in service", true, "Canada");

        dogList.add(dog1);
        dogList.add(dog2);
        dogList.add(dog3);
    }


    // Adds monkeys to a list for testing
    //Optional for testing
    public static void initializeMonkeyList() {
	    public static void initializeMonkeyList() {
		Monkey monkey1 = new Monkey("Squirrel Monkey", "Schur", "4.1", "6.2", "18.4", "male", "4", "3.5", "07-04-2021", "Australia", "Phase III", "false", "Australia");
		Monkey monkey2 = new Monkey("Tamarin", "damienfarron", "5.2", "5.8", "20.2", "female", "2", "02-24-2023", "United States", "Phase I", "true", "United States");
		Monkey monkey3 = new Monkey("Marmoset", "ConnorrrMac", "7.8", "12.4", "19.4", "male", "6", "06-14-2019", "China", "Phase V", "false", "China");
		monkeyList.add(monkey1);
		monkeyList.add(monkey2);
		monkeyList.add(monkey3);
    }


    // Complete the intakeNewDog method
    // The input validation to check that the dog is not already in the list
    // is done for you
    public static void intakeNewDog(Scanner scanner) {
        System.out.println("What is the dog's name?");
        String name = scanner.nextLine();
        for(Dog dog: dogList) {
            if(dog.getName().equalsIgnoreCase(name)) {
                System.out.println("\n\nThis dog is already in our system\n\n");
                return; //returns to menu
            }
        }

        // Add the code to instantiate a new dog and add it to the appropriate list
     System.out.println("What breed of dog is being entered?"); //get the dogs breed 
    	String breed = scanner.nextLine(); //gets the users data and stores in a variable
    	
    	System.out.println("what is the gender of the dog?"); //get the gender of the dog
    	String gender = scanner.nextLine();
    	
    	System.out.println("What is the dogs age?"); //get the dogs age
    	String age = scanner.nextLine();
    	
    	System.out.println("What is the dogs weight?"); //get the dogs weight
    	String weight = scanner.nextLine();
    	
    	System.out.println("What is the dogs acquisition date?"); //get the dogs acquisition date
    	String acquisitionDate = scanner.nextLine();
    	
    	System.out.println("what is the dogs acquisition country?"); //get the dogs acquisition country 
    	String acquisitionCountry = scanner.nextLine();
    	
    	System.out.println("What is the dogs training status?"); //get the dogs training status 
    	String trainingStatus = scanner.nextLine();
    	
    	System.out.println("Is the dog reserved?"); //is the dog reserved
    	boolean reserved = scanner.nextBoolean();
    	scanner.nextLine();
    	
    	System.out.println("What country will the dog be servicing?"); //get what country the dog will be servicing 
    	String inServiceCountry = scanner.nextLine();
    
    	//a new dog with attributes 
    	Dog newDog = new Dog(name, gender, breed, age, weight, acquisitionDate, acquisitionCountry, trainingStatus, reserved, inServiceCountry);
    	dogList.add(newDog); //add the attributes to the dog list 
    }
    
        // Complete intakeNewMonkey
	//Instantiate and add the new monkey to the appropriate list
        // For the project submission you must also  validate the input
	// to make sure the monkey doesn't already exist and the species type is allowed
        public static void intakeNewMonkey(Scanner scanner) {
            System.out.println("The method intakeNewMonkey needs to be implemented");
        
            System.out.println("What speecies of monkey is being entered?");
        	String species = scanner.nextLine();
        	//check if the monkey is one of the species in the avl list
        	boolean ans = speciesList.contains(species);
        	if (! ans) {
        		System.out.println("The species you have entered is not allowed");
        		return; //return to menu
        	}
        	
        	System.out.println("what is the monkeys name?");
        	String name = scanner.nextLine();
        	//check if the monkey is already in the system 
        	for (Monkey monkey: monkeyList) {
        		if (monkey.getName().equalsIgnoreCase(name)) {
        			System.out.println("The monkey has already been entered in the system before");
        			return; //return to the menu
        		}
        	}
        	
        	System.out.println("What is the monkeys tail length");
        	String tailLength = scanner.nextLine();
        	
        	System.out.println("What is monkeys height?");
        	String height = scanner.nextLine();
        	
        	System.out.println("What is monkeys body length?");
        	String bodyLength = scanner.nextLine();
        	
        	System.out.println("What is the monkeys gender?");
        	String gender = scanner.nextLine();
        	
        	System.out.println("What is the monkeys age?");
        	String age = scanner.nextLine();
        	
        	System.out.println("What is the monkeys weight?");
        	String weight = scanner.nextLine();
        	
        	System.out.println("What is the monkeys acquisition date?");
        	String acquisitionDate = scanner.nextLine();
        	
        	System.out.println("What is the monkeys acquisition country?");
        	String acquisitionCountry = scanner.nextLine();
        	
        	System.out.println("What is the monkeys training status?");
        	String trainingStatus = scanner.nextLine();
        	
        	System.out.println("Is the monkey reserved?");
        	boolean reserved = scanner.nextBoolean();
        	scanner.nextLine();
        	
        	System.out.println("What country will the monkey be servicing?");
        	String inServiceCountry = scanner.nextLine();
        	
        	Monkey newMonkey = new Monkey(species, name, tailLength, height, bodyLength, gender, age, weight, acquisitionDate, acquisitionCountry, trainingStatus, reserved, inServiceCountry); //a new monkey with attributes
        	monkeyList.add(newMonkey);
        }

        // Complete reserveAnimal
        // You will need to find the animal by animal type and in service country
        public static void reserveAnimal(Scanner scanner) {
            System.out.println("The method reserveAnimal needs to be implemented");
            String species = "";
            String name;
            String updateStatus = null;
            boolean newStatusBoolean;
            int animalFound = 0;
            
            //validate input and prompt input 
            while ((!species.equals("monkey")) && (!species.equals("dog"))) {
            	System.out.println("Enter dog or monkey");
            	species = scanner.nextLine();
            }
            //get the animals name 
            System.out.println("What is the name of the " + species + "you would like to reserve?");
            name = scanner.nextLine();
            //check if the name already exists
            switch (species) {
            //case monkey
            case "monkey":
            	//try and match the name 
            	// if a match is found save a value in animalFound 
            	for(Monkey mon : monkeyList) { //scan monkeyList
            		if (mon.getName().equalsIgnoreCase(name)) {
            			animalFound++;
            			//print output 
            			System.out.println("the reserved status of " + mon.getName() + "is: " + mon.getReserved());
            			//change reserved status??
            			System.out.println("Would you like to change the reserved status of this animal? yes or no");
            			updateStatus = scanner.nextLine().toLowerCase();
            			
            			while ((!updateStatus.equals("yes")) && (!updateStatus.equals("no"))) { // would the user like to update the status
            				System.out.println("Enter yes or no"); //prompt the user 
            				updateStatus = scanner.nextLine().toLowerCase();
            			}
            		if (updateStatus.equals("yes")) { 
            			//get the current status 
            			//flip what the current status is 
            			newStatusBoolean = mon.getReserved() ? false : true;
            			//set reserved 
            			mon.setReserved(newStatusBoolean);
            			System.out.println(mon.getName() + "now has a new reserved status of: " + newStatusBoolean); //output the new status change 
            			scanner.nextLine();
            		}
            		
            		else { // no change wanted to the reserved status 
            			return;
            		}
            	}
            }
            //if a monkey with that name isn't found show a warning to user 
            	if (animalFound == 0) {
            		System.out.println("We can not find a monkey matching that name.");
            		scanner.nextLine();
            		return;
            		
            	}
            //case dog
            case "dog":
            	//try and match the name to a dog 
            	//if a match is found save value in animalFound
            	for (Dog resDog : dogList) {
            		if (resDog.getName().equalsIgnoreCase(name)) {
            			animalFound++; //add value to animal found if name is found 
            			System.out.println("The reserved status of" + resDog.getName() + "is:" + resDog.getReserved()); //print output 
            			//change reserve status?
            			while ((!updateStatus.equals("yes")) && (!updateStatus.equals("no"))) {
            				System.out.println("Enter yes or no"); //prompt the user would they like to update reserve status
            				updateStatus = scanner.nextLine().toLowerCase();   				
            			}
            			//we want to update the reserved status, flip t vs f 
            			if (updateStatus.equals("yes")) {
            				//flip the status
            				newStatusBoolean = resDog.getReserved() ? false : true;
            				resDog.setReserved(newStatusBoolean);
            				
            				//print out put for the user 
            				System.out.println(resDog.getName() + "now has a new reserved status of: " + newStatusBoolean);
            				scanner.nextLine();
            			}
            			else { //no change wanted to the reserve status 
            				return;
            			}
            		}
            	}
            	// if a dog with that name isn't found present a warning to user 
            	if (animalFound == 0) { 
            		System.out.println("We can not find a dog with that name.");
            		scanner.nextLine();
            		return;
            	}
            }
            
        }

        // Complete printAnimals
        // Include the animal name, status, acquisition country and if the animal is reserved.
	// Remember that this method connects to three different menu items.
        // The printAnimals() method has three different outputs
        // based on the listType parameter
        // dog - prints the list of dogs
        // monkey - prints the list of monkeys
        // available - prints a combined list of all animals that are
        // fully trained ("in service") but not reserved 
	// Remember that you only have to fully implement ONE of these lists. 
	// The other lists can have a print statement saying "This option needs to be implemented".
	// To score "exemplary" you must correctly implement the "available" list.
        public static void printAnimals (String printAnimals, Scanner scnr) {
            System.out.println("The method printAnimals needs to be implemented");
        switch(printAnimals) {
            //print out dogs    
        case "dog":
        	for (Dog resDog : dogList) {
        		System.out.println(resDog); //print case dog 
        	}
        	break;
        	
        	//print out the monkeys 
        case "monkey": 
        	for (Monkey mon: monkeyList) {
        		System.out.println(mon); //print case monkey
        	}
        	break;
        
        	//print the dog and monkeys that are in service at the moment and not reserved
        	//start with case "dog"
        case "available":
        	for (Dog resDog : dogList) {
        		if (resDog.getTrainingStatus().equals("in-service") && !resDog.getReserved()) {
        		//print out put for user
        		System.out.println(resDog);
        	}
        }
        	//case monkey in the available 
        	for (Monkey mon: monkeyList) {
        		if (mon.getTrainingStatus().equals("in-service") && ! mon.getReserved()) {
        			//print the output for user 
        			System.out.println(mon);
        		}
        	}
        	break;
        default:
         break;
        }
     }  
}
