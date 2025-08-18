package CSA2425; //(c) A+ Computer Science

//www.apluscompsci.com
//Name -

import static java.lang.System.out;

import java.util.Scanner;

public class Unit10a_BoxRunner {

  public static void main(String args[]) {
    Scanner keyboard = new Scanner(System.in);
    String choice = "";
    do {
      out.print("Enter the size of the box: ");
      int size = keyboard.nextInt();

      // static methods can be called using the class name
      System.out.println(Unit10a_Box.go(size));

      System.out.print("Do you want to enter more data? ");
      choice = keyboard.next();
    } while (choice.equalsIgnoreCase("Y"));
  }
}
/*
© A+ Computer Science – Nested Loops - www.apluscompsci.com
Lab Goal : This lab was designed to teach you how to use nested loops. You will also learn how to make
some cool shapes.
Lab Description : Use nested loops to print out the box pattern show below.
Sample Data :
3
4
5
2
1
Sample Output :
***#
**##
*###
****#
***##
**###
*####
*****#
****##
***###
**####
*#####
**#
*##
*#
algorithm help
output="";
loop i that runs num times
{
loop j
{
output += "*"
}
loop k
{
output += "#"
}
output += "\n"
}
Files Needed ::
Box.java
BoxRunner.java
A+ Computer Science LOOP BOX

 */
