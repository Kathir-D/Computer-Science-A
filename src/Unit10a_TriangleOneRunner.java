//(c) A+ Computer Science
//www.apluscompsci.com
//Name -

import static java.lang.System.*;
import java.util.Scanner;

public class Unit10a_TriangleOneRunner
{
	public static void main( String args[] )
   {
   	Scanner keyboard = new Scanner(System.in);
   	String choice="";
		do{
			out.print("Enter the size of the triangle : ");
			int big = keyboard.nextInt();
			out.print("Enter a letter : ");
			String value = keyboard.next();

				//static methods can be called using the class name
			System.out.println( Unit10a_TriangleOne.go( value, big ) );

			System.out.print("Do you want to enter more data? ");
			choice=keyboard.next();
		}while(choice.equals("Y")||choice.equals("y"));
	}
}

/*

© A+ Computer Science – Nested Loops - www.apluscompsci.com
Lab Goal : This lab was designed to teach you how to use nested loops. You will also learn how to make
some cool shapes.
Lab Description : Use nested loops to print out the triangle letter pattern show below.
Sample Data :
3 A
7 X
1 R
5 T
4 W
Sample Output :
A
AA
AAA
X
XX
XXX
XXXX
XXXXX
XXXXXX
XXXXXXX
R
T
TT
TTT
TTTT
TTTTT
W
WW
WWW
WWWW
algorithm help
output="";
loop i = 1 to size
{
loop j = 1 to i
{
output = output + letter
}
output = output + "\n"
}
Files Needed ::
TriangleOne.java
TriangleOneRunner.java
A+ Computer Science TRIANGLE ONE

 */