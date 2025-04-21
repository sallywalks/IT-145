/*
 *JoAnn Olney
 * project 2
*/

public class Monkey extends RescueAnimal { //create the class monkey that extends off rescue animal
	
	//instance variables 
	private String tailLength;
	private String height;
	private String bodyLength;
	private String species;

	// constructor monkey
	public Monkey(String species2, String name, String tailLength2, String height2, String bodyLength2, String gender,
			String age, String weight, String acquisitionDate, String acquisitionCountry, String trainingStatus,
			boolean reserved, String inServiceCountry) {
		setTailLength(tailLength);
		setHeight(height);
		setBodyLength(bodyLength);
		setSpecies(species);
		setName(name);
		setGender(gender);
		setAge(age);
		setWeight(weight);
		setAcquisitionDate(acquisitionDate);
		setAcquisitionCountry(acquisitionCountry);
		setTrainingStatus(trainingStatus);
		setReserved(reserved);
		setInServiceCountry(inServiceCountry);
	}

	//getter for monkey tail length
	public String getTailLength() {
		return tailLength;
	}
	
	//setter for monkey tail length
	public void setTailLength(String tailLength) {
		this.tailLength = tailLength;
	}
	
	//getter for monkey height
	public String getHeight() {
		return height;
	}
	
	//setter for monkey height
	public void setHeight(String height) {
		this.height = height;
	}
	
	//getter for monkey body length
	public String getBodyLength() {
		return bodyLength;
	}
	
	//setter for monkey body length
	public void setBodyLength(String bodyLength) {
		this.bodyLength = bodyLength;
	}
	
	//getter for monkey species 
	public String getSpecies() {
		return species;
	}
	
	//setter for monkey species 
	public void setSpecies(String species) {
		this.species = species;
	}	
}	