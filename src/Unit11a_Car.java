//(c) A+ Computer Science
//www.apluscompsci.com
//Name -

//design your Car class
//write all code for your Car class here
//test your Car class with the CarRunner
class Unit11a_Car{

    private int miles;
    private int oil;


    public Unit11a_Car(int a, int b){
        miles = a;
        oil = b;

    }

    public boolean timeForOilChange(){
        if(miles >= oil){
            setMiles(0);
            return true;
        }
        return false;
    }

    public void setMiles(int a){
        miles = a;
    }

    public void addMiles(int a){
        miles += a;
    }


}

/*

© A+ Computer Science – Classes - www.apluscompsci.com
Lab Goal : This lab was designed to teach you more designing and writing classes. Use the same runner
code below and associated comments to create a Car class.
Lab Description : Write a Car class that will keep track of miles driven and when you need to change
your oil.
Sample Runner Code :
Car c = new Car( 9000, 3000 ); //single constructor that takes in miles
//driven and when to change the oil
//assumes car has never had an oil change
//sets last oil change mileage to 0
System.out.println( c.timeForOilChange( ) ); //checks if it is time to change oil
//returns true as 9000 is >= 3000
//resets last oil change mileage to 0
c.addMiles( 2000 ); //add 2000 miles to miles driven
System.out.println( c.timeForOilChange( ) ); //checks if it is time to change oil
//car has driven 2000 miles since
//last oil change – returns false
c.addMiles( 2000 ); //add 2000 miles to miles driven
System.out.println( c.timeForOilChange( ) ); //checks if it is time to change oil
//car has now driven 4000 miles since
//last oil change – return true
//4000 is >= 3000 so time to change oil
Sample Output :
true
false
true
Files Needed ::
Car.java
CarRunner.java
A+ Computer Science CAR

 */