package CSA2425; //(c) A+ Computer Science

// www.apluscompsci.com
//Name -

import java.util.Scanner;

class Unit8b_PassWordCheck {

  private String password;

  public Unit8b_PassWordCheck() {
    password = "Dragons";
  }

  public void check() {
    Scanner sc = new Scanner(System.in);
    String guess = "";
    boolean validity = false;

    do {
      System.out.print("Enter the password :: ");
      guess = sc.nextLine();
      if (guess.equals(password)) {
        validity = true;
        System.out.println("VALID");
      } else {
        System.out.println("INVALID");
      }
    } while (validity == false);
  }
}
/*
Lab Description : Set up a password variable and assign a password to this variable. Run your
program and type in invalid passwords to check and see if your boolean logic is correct. Once the correct
password is typed, the program should stop asking for input.
Sample Data :
shown below
Sample Output :
Enter the password :: hello
INVALID
Enter the password :: hacker
INVALID
Enter the password :: i
INVALID
Enter the password :: am
INVALID
Enter the password :: a
INVALID
Enter the password :: hacker
INVALID
Enter the password :: mchammer
INVALID
Enter the password :: go
INVALID
Enter the password :: hammer
INVALID
Enter the password :: mchammergo
INVALID
Enter the password :: mchammergoham
INVALID
Enter the password :: mchammergohammer
VALID
 */
