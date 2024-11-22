//(c) A+ Computer Science
//www.apluscompsci.com

public class Unit3a_Dog
{
  private int age;
  private String name;
	
  public Unit3a_Dog(String n )
  {
    age = 1;
    name = n;
  }
  
	public Unit3a_Dog(String n, int a )
	{
 	  age = a;
      name = n;
	}
  
  public void increaseAgeByOne()
  {
  	age += 1;
  }
  
  public int getPeopleAge( int val )
  {
  	 return val*age;
  }
	
  public int getAge()    {
    return age;
  }
	
  public String getName()    {
    return name;
  }
	
  public String toString()    {
    return "Dog - " + name + " " + age;
  }
}
