package Assignment2;

public class Dog {
	//declared variables with variable type
	private int dogSpaceNumber;
	private double dogWeight;
	private String grooming;
	
	//constructor method that initializes the values
	public Dog() 
	{
		dogSpaceNumber = 0;
		dogWeight = 0;
		grooming = "no";
		
	}
	
	//Mutator ("setter") method for dogSpaceNumber
	public void setDogSpaceNmber( int assignedDogSpaceNum)
	{
		dogSpaceNumber = assignedDogSpaceNum;
	}
	
	//Accessor ("getter") method for dogSpaceNumber
	public int getDogSpaceNumber()
	{
		return dogSpaceNumber;
	}
	
	//Mutator method for dogWeight
	public void setDogWeight( double WeightOfDog)
	{
		dogWeight = WeightOfDog;
	}
	
	//Accessor method for dogWeight
	public double getDogWeight()
	{
		return dogWeight;
	}
	
	//Mutator method for grooming
	public void setGrooming( String needsGrooming)
	{
		grooming = needsGrooming;
	}
	
	//Accessor method for grooming
	public String getGrooming()
	{
		return grooming;
	}

}
