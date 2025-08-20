package CSA2425; //(c) A+ Computer Science

//www.apluscompsci.com
//Name -

import java.util.Scanner;

public class Unit2c_PythagorasRunner {

  public static void main(String[] args) {
    //add a Scanner for keyboard input
    Scanner keyboard = new Scanner(System.in);
    Unit2c_Pythagoras obj = new Unit2c_Pythagoras();

    System.out.print("Enter side1 :: ");
    int side1 = keyboard.nextInt();
    System.out.print("Enter side2 :: ");
    int side2 = keyboard.nextInt();

    System.out.println("Side C == " + obj.getSide(side1, side2) + "\n\n");
  }
}
/*

Sample Data :
3
4
8
15
9
40

 


Sample Output : 
Enter side1 :: 3
Enter side2 :: 4
Side C == 5.0

Enter side1 :: 8
Enter side2 :: 15
Side C == 17.0

Enter side1 :: 9
Enter side2 :: 40
Side C == 41.0
*/
