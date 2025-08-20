package CSA2425; //(c) A+ Computer Science

//www.apluscompsci.com
//Name -

import java.util.Scanner;

public class Unit3a_TriangleRunner { //this class is used to test Triangle

  public static void main(String[] args) {
    Scanner keyboard = new Scanner(System.in);

    //ask for user input
    System.out.print("Enter side A ::  ");
    int a = keyboard.nextInt();

    System.out.print("Enter side B ::  ");
    int b = keyboard.nextInt();

    System.out.print("Enter side C ::  ");
    int c = keyboard.nextInt();

    Unit3a_Triangle test = new Unit3a_Triangle(a, b, c);
    test.calcPerimeter();
    System.out.println(test.getArea());
  }
}
/*

Sample Data :
3 3 3
7 8 9
10 9 11

Sample Output : 
Enter side A ::  3
Enter side B ::  3
Enter side C ::  3

3 3 3
Area == 3.89711




Enter side A ::  7
Enter side B ::  8
Enter side C ::  9

7 8 9
Area == 26.83282





Enter side A ::  10
Enter side B ::  9
Enter side C ::  11

10 9 11
Area == 42.42641

*/
