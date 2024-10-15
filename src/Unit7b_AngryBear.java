//(c) A+ Computer Science
// www.apluscompsci.com

public class Unit7b_AngryBear 
{
    private int days;
    private int teeth;
    
    public Unit7b_AngryBear(int one, int two )
    {
    	days = one;
        teeth = two;
    }
    
    public boolean isAngry()
    {
        if (days > 3 && teeth < 10){
            return true;
        }
        else if (teeth == 0){
            return true;
        }
        else if (days > 5){
            return true;
        }
        else return false;

    }
}

/*
Lab Goal : This lab was designed to teach you more about decision making and classes.
Lab Description :
For this problem, you need to make an AngryBear class.
The AngryBear class must have 2 instance variables.
The first instance variable will store the days the bear has been awake.
The second instance variable will store the number of teeth for the bear.
The AngryBear class will have 1 constructor that takes in values for days awake and number of teeth.
The AngryBear class will have one method isAngry();
An AngryBear is angry if it has been awake for more than 3 days and has less than 10 teeth.
An AngryBear is angry it if has no teeth.
An AngryBear is angry if it has been awake for more than 5 days.
Otherwise, the AngryBear is not really angry but he could be quite annoyed.
Runner Code :
AngryBear a = new AngryBear( 10, 3 );
System.out.println( a.isAngry() );
AngryBear b = new AngryBear( 10, 35 );
System.out.println( b.isAngry() );
AngryBear c = new AngryBear( 1, 25 );
System.out.println( c.isAngry() );
AngryBear d = new AngryBear( 6, 40 );
System.out.println( d.isAngry() );
AngryBear e = new AngryBear( 1, 1 );
System.out.println( e.isAngry() );
AngryBear f = new AngryBear( 111, 111 );
System.out.println( f.isAngry() );
Sample Output :
true
true
false
true
false
true
 */