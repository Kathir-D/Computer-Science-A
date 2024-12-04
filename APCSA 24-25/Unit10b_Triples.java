//(c) A+ Computer Science
//www.apluscompsci.com
//Name -

public class Unit10b_Triples {

  private int number;

  public Unit10b_Triples(int num) {
    number = num;
  }

  private int greatestCommonFactor(int a, int b, int c) {
    return 1;
  }

  public String toString() {
    String output = "";
    return output + "\n";
  }
}
/*
© A+ Computer Science – Nested Loops - www.apluscompsci.com
Lab Goal : This lab was designed to teach you how to use nested loops. You will also learn more about
boolean algebra and Pythagorean triples.
Lab Description : Use nested loops to generate all of the Pythagorean triples from 1 up to a provided
number. For three numbers to be a triple, they have to satisfy several requirements. First, the three numbers
in the triple must satisfy the a2 + b2 == c2. Second, if a is odd, b must be even and if a is even, then b must be
odd, and c must be odd for either a / b combination. Lastly, the greatest common factor of a, b, and, c must
be no greater than 1.
Sample Data :
110
Sample Output :
3 4 5
5 12 13
7 24 25
8 15 17
9 40 41
11 60 61
12 35 37
13 84 85
16 63 65
20 21 29
20 99 101
28 45 53
33 56 65
36 77 85
39 80 89
48 55 73
60 91 109
65 72 97
algorithm help
loop a
loop b
loop c
check if a,b,c make a valid triple
Files Needed ::
Triples.java
TriplesRunner.java
A+ Computer Science TRIPLES

 */
