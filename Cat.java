package Assignment2;

public class Cat {
	//declared variable
	private int catSpaceNumber;
	
	//constructor method that initializes the values
	public Cat()
	{
		catSpaceNumber = 0;
	}
	
	//Mutator ("setter") method for catSpaceNumber
	public void setCatSpaceNumber( int assignedCatSpaceNum)
	{
		catSpaceNumber = assignedCatSpaceNum;
	}
	
	//Accessor ("getter") method for catSpaceNumber
	public int getCatSpaceNumber()
	{
		return catSpaceNumber;
	}
}
