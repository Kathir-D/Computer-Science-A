# Computer Science A
 AP Computer Science A assigments from apluscompsci.com

### Create a issue with the name of the assigment as given
    Filename = Unit # Day # as letter
    
    Example: Unit 7 Day 2 - Cool Chicken
    ---> Unit7b - Cool Chicken

    Example: Unit 9 Day 1 - Dog Distance
    ---> Unit9a - Dog Distance

    Example: Unit 2 Day 4 - Sum of Chars
    ---> Unit2d - Sum of Chars

* Add the description following markdown using three ### for title names 
* rename the files following the example

### Files
    Code from files

### Documentation
    Document

# Example

-----

* Second unit day 1 with assigment name as WalkingTheDog
* Home.java and HomeRunner.java

# Unit2a - WalkingTheDog

### CSA2425.Unit2a_Home.java
    //(c) A+ Computer Science
    //www.apluscompsci.com
    //Name -
    
    public class CSA2425.Unit2a_Home
    { 
	    public static double getDistance(int xOne, int yOne, int xTwo, int yTwo )
	    {
	    	return 0;
	    }
    }

### CSA2425.Unit2a_HomeRunner.java
    //(c) A+ Computer Science
    //www.apluscompsci.com
    //Name -
    //Date -
    
    import java.util.Scanner;
    import static java.lang.System.*;
    
    public class CSA2425.Unit2a_HomeRunner
    {
        public static void main( String[] args )
        {
            Scanner sc = new Scanner( System.in );
            CSA2425.Unit2a_Home s = new CSA2425.Unit2a_Home();
	    }
    }
    
### Documentation
    Computer Science – Math – Distance Formula - © A+ Computer Science
    Lab Goal : This lab was designed to teach you more about objects, input, output formatting, and the Math
    class.

    Lab Description : Every day, Janet walks her tiny dog Picasso. Picasso sometimes turns around and
    goes in the opposite direction (-). From each set of data, calculate the total to determine how far Janet ends up
    from her house when Picasso stops walking and waits to be carried home. Each number represents the number
    of blocks walked before Picasso changed direction. If the answer is zero, then they ended up at home when
    Picasso stopped walking. Any other answer represents how far from the house they are. If Picasso went too far
    after turning, the answer may end up negative. We need the actual number of blocks from home.
    
    Sample Data :
    4 -8 5 -3
    10 -4 -2 5
    5 -11 18 -6

    Sample Output :
    Enter X1 :: 4
    Enter Y1 :: -8
    Enter X2 :: 5
    Enter Y2 :: -3
    distance == 2
    Enter X1 :: 10
    Enter Y1 :: -4
    Enter X2 :: -2
    Enter Y2 :: 5
    distance == 9
    Enter X1 :: 5
    Enter Y1 :: -11
    Enter X2 :: 18
    Enter Y2 :: -6
    distance == 6

    FORMATTING OUTPUT
    //printf is a void method
    System.out.printf("%.3f\n",9.541724); //outs 9.542
    //format is a String return method
    System.out.println(String.format("%.3f",9.541724)); //outs 9.542

    Files Needed ::
    Home.java
    HomeRunner.java
    A+ Computer Science Walking The Dog





