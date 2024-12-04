//(c) A+ Computer Science
//www.apluscompsci.com
//Name -

//design your CookieJar class
//write all code for your CookieJar class here
//test your CookieJar class with the CookieJarRunner

class Unit11a_CookieJar {

  private int capacity;
  private int currentAmount;

  public Unit11a_CookieJar(int a) {
    capacity = a;
  }

  public boolean isFull() {
    return currentAmount >= capacity;
  }

  public int addStuff(int amount) {
    if (currentAmount + amount <= capacity) {
      currentAmount += amount;
      return -capacity + currentAmount;
    } else {
      int overflow = (currentAmount + amount) - capacity;
      currentAmount = capacity;
      return overflow;
    }
  }

  public int spaceLeft() {
    return capacity - currentAmount;
  }
}
/*

© A+ Computer Science – Classes - www.apluscompsci.com
Lab Goal : This lab was designed to teach you more about designing and writing classes. Use the same
runner code below and associated comments to create a CookieJar class.
Lab Description : Write a CookieJar class that will is set to a capacity and tracks how much stuff the
CookieJar is storing.
Sample Runner Code :
CookieJar c = new CookieJar( 3000 ); //sets capacity to 3000
System.out.println( c.isFull( ) ); //cookiejar is not full
c.addStuff( 500 ); //add 500 items
//returns -2500 as space is 2500
System.out.println( c.isFull( ) ); //cookiejar is not full
System.out.println( c.addStuff( 2000 ) ); //add 2000 items
//returns -500 as space is 500
System.out.println( c.spaceLeft( ) ); //space left is 500
System.out.println( c.isFull( ) ); //cookiejar is not full
System.out.println( c.addStuff( 2000 ) ); //attempt to add 2000
//adds 500 and returns 1500
//1500 was amount left
//that could not be added
System.out.println( c.spaceLeft( ) ); //no space left – returns 0
System.out.println( c.isFull( ) ); //returns true
Sample Output :
false
false
-500
500
false
1500
0
true
Files Needed ::
CookieJar.java
CookieJarRunner.java
A+ Computer Science COOKIEJAR

 */
