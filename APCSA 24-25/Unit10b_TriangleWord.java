//(c) A+ Computer Science
//www.apluscompsci.com
//Name -

public class Unit10b_TriangleWord {

  private String word;

  public Unit10b_TriangleWord(String w) {
    word = w;
  }

  public String toString() {
    StringBuilder output = new StringBuilder();
    for (int i = 0; i < word.length(); i++) {
      for (int j = 0; j < word.length() - i - 1; j++) {
        output.append(" ");
      }
      for (int j = 0; j <= i; j++) {
        output.append(word.charAt(j));
        if (j < i) {
          output.append(" ");
        }
      }
      for (int j = i - 1; j >= 0; j--) {
        output.append(word.charAt(j));
      }
      output.append("\n");
    }
    return output.toString();
  }
}
/*

Page
1
of 2
© A+ Computer Science – Nested Loops - www.apluscompsci.com
Lab Goal : This lab was designed to teach you how to use nested loops. You will also learn how to make
some cool shapes.
Lab Description : Use nested loops to print out the triangle word pattern show below.
Sample Data :
WOW
BEN
SAMMY
WILE
APLUSCOMPSCI
Sample Output :
W
O O
WOWOW
B
E E
NEBEN
S
A A
M M
M M
YMMASAMMY
W
I I
L L
ELIWILE
A
P P
L L
U U
S S
C C
O O
M M
P P
S S
C C
ICSPMOCSULPAPLUSCOMPSCI
Files Needed ::
TriangleWord.java
TriangleWordRunner.java
A+ Computer Science TRIANGLE
WORDS
© A+ Computer Science – Nested Loops - www.apluscompsci.com

 */
