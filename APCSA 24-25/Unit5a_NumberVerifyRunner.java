//(c) A+ Computer Science
//www.apluscompsci.com
//Name -

import java.util.Scanner;

public class Unit5a_NumberVerifyRunner {

  public static void main(String[] args) {
    Scanner keyboard = new Scanner(System.in);
    System.out.print("Enter a whole number :: ");
    int num = keyboard.nextInt();

    System.out.println(num + " is odd :: " + Unit5a_NumberVerify.isOdd(num)); //111
    System.out.println(num + " is even :: " + Unit5a_NumberVerify.isEven(num)); //111
    //add more test cases

  }
}
