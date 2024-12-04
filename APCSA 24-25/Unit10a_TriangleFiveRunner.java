//(c) A+ Computer Science
//www.apluscompsci.com
//Name -

import java.util.Scanner;

public class Unit10a_TriangleFiveRunner {

  public static void main(String args[]) {
    Scanner keyboard = new Scanner(System.in);
    String choice = "";
    do {
      System.out.print("Enter the letter: ");
      char letter = keyboard.next().charAt(0);
      System.out.print("Enter the amount: ");
      int amount = keyboard.nextInt();

      // static methods can be called using the class name
      System.out.println(Unit10a_TriangleFive.go(amount, letter));

      System.out.print("Do you want to enter more data? ");
      choice = keyboard.next();
    } while (choice.equalsIgnoreCase("Y"));
  }
}
/*

Page
1
of 2
© A+ Computer Science – Nested Loops - www.apluscompsci.com
Lab Goal : This lab was designed to teach you how to use nested loops. You will also learn how to make
some cool shapes.
Lab Description : Used nested loops to print out a letter pattern as shown below. Wrap around the
letters from Z to A.
Sample Data :
C 4
A 5
B 7
X 6
Z 8
Sample Output :
CCCC DDD EE F
CCCC DDD EE
CCCC DDD
CCCC
AAAAA BBBB CCC DD E
AAAAA BBBB CCC DD
AAAAA BBBB CCC
AAAAA BBBB
AAAAA
BBBBBBB CCCCCC DDDDD EEEE FFF GG H
BBBBBBB CCCCCC DDDDD EEEE FFF GG
BBBBBBB CCCCCC DDDDD EEEE FFF
BBBBBBB CCCCCC DDDDD EEEE
BBBBBBB CCCCCC DDDDD
BBBBBBB CCCCCC
BBBBBBB
XXXXXX YYYYY ZZZZ AAA BB C
XXXXXX YYYYY ZZZZ AAA BB
XXXXXX YYYYY ZZZZ AAA
XXXXXX YYYYY ZZZZ
XXXXXX YYYYY
XXXXXX
ZZZZZZZZ AAAAAAA BBBBBB CCCCC DDDD EEE FF G
ZZZZZZZZ AAAAAAA BBBBBB CCCCC DDDD EEE FF
ZZZZZZZZ AAAAAAA BBBBBB CCCCC DDDD EEE
ZZZZZZZZ AAAAAAA BBBBBB CCCCC DDDD
ZZZZZZZZ AAAAAAA BBBBBB CCCCC
ZZZZZZZZ AAAAAAA BBBBBB
ZZZZZZZZ AAAAAAA
Files Needed ::
TriangleFive.java
TriangleFiveRunner.java
A+ Computer Science TRIANGLE FIVE
© A+ Computer Science – Nested Loops - www.apluscompsci.com
ZZZZZZZZ

 */
