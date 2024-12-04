//(c) A+ Computer Science
//www.apluscompsci.com
//Name -

public class Unit6a_DecoderRunner {

  public static void main(String args[]) {
    Unit6a_Decoder s = new Unit6a_Decoder();
    System.out.println(s.deCode("a"));
    System.out.println(s.deCode("A"));
    System.out.println(s.deCode("b"));
    System.out.println(s.deCode("0"));
    System.out.println(s.deCode("T"));
    System.out.println(s.deCode("*"));
    System.out.println(s.deCode("H"));
    System.out.println(s.deCode("T"));
  }
}
/*
Lab Description : You are to decode each letter. The following explains how to decode each
letter. You can easily do all of the conversions using the ASCII values of the letters.
LowerCase becomes UpperCase
UpperCase becomes LowerCase
Digits 0-9 become A-J
Any other characters become #
Sample Data :
a
A
b
0
T
*
H
T
Sample Output :
Enter a letter :: a
a decodes to A
Enter a letter :: A
A decodes to a
Enter a letter :: b
b decodes to B
Enter a letter :: 0
0 decodes to A
Enter a letter :: t
t decodes to T
Enter a letter :: *
* decodes to #
Enter a letter :: h
h decodes to H
Enter a letter :: T
T decodes to t
 */
