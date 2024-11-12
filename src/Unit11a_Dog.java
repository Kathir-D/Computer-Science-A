//(c) A+ Computer Science
//www.apluscompsci.com

public class Unit11a_Dog
{
  private int age;
  private String name;
	
  public Unit11a_Dog( String n )
  {
    age = 1;
    name = n;
  }
  
	public Unit11a_Dog( String n, int a )
	{
 	  age = a;
      name = n;
	}
  
  public void increaseAgeByOne()
  {
  	 age++;
  }
  
  public int getPeopleAge( int val )
  {

  	 return age*val;
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

/*

Computer Science – Class Basics - © A+ Computer Science
Lab Goal : This lab was designed to teach you the basics of class creation. You will complete a provided
class by filling in some empty methods and calling other constructors and methods.
Lab Description : Fill in the class code and runner provided so that the runner produces the output shown
below.
Typically, one dog year is 7 people years. So, a dog that is 7 years old is 49 in people years. For this program,
one day year is worth x number of people years. The value of each dog year will be provided via a parameter to
the getPeopleAge method.
For a dog that was 5 years old, his people age would be 60 if the people age value passed in was 12.
Sample Runner Code :
Dog d = new Dog( "rover" );
System.out.println( d.getPeopleAge( 7 ) );
d.increaseAgeByOne();
d.increaseAgeByOne();
System.out.println( d.getPeopleAge( 11 ) );
System.out.println( d.getName() );
d.increaseAgeByOne();
d.increaseAgeByOne();
d.increaseAgeByOne();
d.increaseAgeByOne();
System.out.println( d.getPeopleAge( 8 ) );
Dog g = new Dog( "bob", 3 );
System.out.println( g.getName() );
System.out.println( g.getPeopleAge( 5 ) );
Sample Output :
7
33
rover
56
bob
15
Files Needed ::
Dog.java
DogRunner.java
A+ Computer Science THE
DOG

 */