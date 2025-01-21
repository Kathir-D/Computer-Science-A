//(c)A+ Computer Science  
//www.apluscompsci.com

public class Unit15a_Monster
{
	private int weight;
	private int height;
	private int age;
	
	public Unit15a_Monster( int a, int h, int w )
	{
		age = a;
		height = h;
		weight = w;
	}
	   
	    //height is 1st, weight is 2nd, and age is 3rd
	public boolean isBigger( Unit15a_Monster other )
	{
		if( height > other.height )
			return true;
		if( height < other.height )
			return false;
		if( weight > other.weight )
			return true;
		if( weight < other.weight )
			return false;
		if( age > other.age )
			return true;
		return false;
	}
		
	//add an isSmaller method
	
	//add in any other methods you need

	public String toString()
	{
		return ""+ height + " " + weight + " " + age;
	}
}