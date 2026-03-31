package CSA2425; //(c) A+ Computer Science

//www.apluscompsci.com
//Name -

import static java.lang.System.*;

import java.util.Scanner;

public class Unit5b_StringRunner {

  public static void main(String[] args) {
    Scanner keyboard = new Scanner(System.in);

    out.print("Enter a word :: ");
    String word = keyboard.next();
    Unit5b_StringStuff s = new Unit5b_StringStuff(word);
    System.out.println("has even length " + s.isEvenLength());
    System.out.println(
      "has same first last letters " + s.sameFirstLastLetters()
    );
    System.out.println("ends with cat " + s.endsWith("it"));
    //add more test cases
  }
}
/*
Lab Description : Write a class that will take in a String. Check that string to see if it has an even
length. Check the string to see if it ends with a group of letters or single letter. Check the string to see if it has
the same first and last letters.
Sample Data :
Shown below
Sample Output :
Enter a word :: chickencat
has even length true
has same first last letters false
ends with cat true
Enter a word :: itwasafuntripitwas
has even length true
has same first last letters false
ends with it false
 */
