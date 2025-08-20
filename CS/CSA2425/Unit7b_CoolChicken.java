package CSA2425;

public class Unit7b_CoolChicken {

  private int wingCount;
  private double speed;
  private String name;

  public Unit7b_CoolChicken(double s, int wc, String n) {
    wingCount = wc;
    speed = s;
    name = n;
  }

  public double maxSpeed() {
    return wingCount * speed; //add code
  }

  public boolean isCool() {
    if (maxSpeed() > 1000 && name.contains("cool")) {
      return true;
    }
    return false;
  }
}
/*
Lab Goal : This lab was designed to teach you more about decision making and classes.
Lab Description :
For this problem, you need to make a CoolChicken class.
The CoolChicken class must have 3 instance variables.
The first instance variable will store the speed of the chicken.
The second instance variable will store the chicken's wing count.
The third instance variable will store the name of the chicken.

The CoolChicken class will have 1 constructor that takes in values for the speed, wingCount, and name.
The CoolChicken class will have 2 methods.

The maxSpeed() method will return the wingCount multiplied by the speed.
The isCool() method will return true if the Chicken's maxSpeed is greater than 1000 and its name contains the
word "cool".

Feel free to add in a toString method to return all of the instance variables.

Runner Code :
CoolChicken a = new CoolChicken( 5.9, 7, "coolio" );
System.out.println( a.isCool() );
CoolChicken b = new CoolChicken( 150.5, 5, "foghorn" );
System.out.println( b.isCool() );
CoolChicken c = new CoolChicken( 314.1, 5, "notcool" );
System.out.println( c.isCool() );
CoolChicken d = new CoolChicken( 212, 56, "ralph" );
System.out.println( d.isCool() );
Sample Output :
false
false
true
false
 */
