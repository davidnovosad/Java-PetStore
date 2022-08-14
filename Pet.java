package Assignment2;

public class Pet {
	//declared variables with variable type
	private String petType, petName;
	private int petAge, daysStay, dogSpaces, catSpaces;
	private double amountDue;
	
	public Pet() {
		petType = "unknown";
		petName = "unknown";
		petAge = -1;
		daysStay = -1;
	}
	
	//Mutator ("setter") method for petType
	public void setPetType(String typeOfPet) {
		petType = typeOfPet;
	}
	
	//Accessor ("getter") method for petType
	public String getPetType() {
		return petType;
	}
	
	//Mutator ("setter") method for petName
	public void setPetName(String nameOfPet) {
		petName = nameOfPet;
	}
	
	//Accessor ("getter") method for petName
	public String getPetName() {
		return petName;
	}
	
	//Mutator ("setter") method for petAge
	public void setPetAge(int ageOfPet) {
		petAge = ageOfPet;
	}
	
	//Accessor ("getter") method for petAge
	public int getPetAge() {
		return petAge;
	}
	
	//Mutator ("setter") method for dogSpaces
	public void setDogSpaces(int availableDogSpaces) {
		dogSpaces = availableDogSpaces;
	}
	
	//Accessor ("getter") method for dogSpaces
	public int getDogSpaces() {
		return dogSpaces;
	}
	
	//Mutator ("setter") method for catSpaces
	public void setCatSpaces(int availableCatSpaces) {
		catSpaces = availableCatSpaces;
	}
	
	//Accessor ("getter") method for catSpaces
	public int getCatSpaces() {
		return catSpaces;
	}
	
	//Mutator ("setter") method for daysStay
	public void setDaysStay(int amountDaysStay) {
		daysStay = amountDaysStay;
	}
	
	//Accessor ("getter") method for daysStay
		public int getDaysStay() {
			return daysStay;
	}
	
	//Mutator ("setter") method for amountDue
	public void setAmountDue(double dueAmount) {
		amountDue = dueAmount;
	}
	
	//Accessor ("getter") method for amountDue
	public double getAmountDue() {
		return amountDue;
	}
}