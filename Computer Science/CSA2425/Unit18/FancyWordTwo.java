//(c) A+ Computer Science
//www.apluscompsci.com
//Name -

public class FancyWordTwo {

  private String[][] mat;

  public FancyWordTwo(String s) {
    //      //3 more statements
    //      //like the one I gave you
    mat = new String[s.length()][s.length()];

    for (int i = 0; i < s.length(); i++) {
      for (int j = 0; j < s.length(); j++) {
        mat[i][j] = " ";
      }
    }

    for (int i = 0; i < s.length(); i++) {
      mat[0][i] = String.valueOf(s.charAt(i));
      mat[s.length() - 1][i] = String.valueOf(s.charAt(s.length() - 1 - i));
      mat[i][s.length() - 1] = String.valueOf(s.charAt(s.length() - 1 - i));
      mat[i][0] = String.valueOf(s.charAt(i));
    }
  }

  public String toString() {
    String output = "";
    for (int r = 0; r < mat.length; r++) {
      for (int c = 0; c < mat[r].length; c++) {
        output += mat[r][c];
      }
      output += "\n";
    }
    return output;
  }
}
/*
Lab Goal : This lab was designed to teach you how to use a matrix, an array of arrays.
Lab Description : Take one word at a time and output the word as a square.
Sample Data :
HELLO
CAT
A
DOGHOUSE
ONE
IT
Sample Output :
HELLO
E L
L L
L E
OLLEH
CAT
A A
TAC
A
DOGHOUSE
O S
G U
H O
O H
U G
S O
ESUOHGOD
ONE
N N
ENO
IT
TI
algorithm help
for(int i=0; i<word.length(); i++)
{
mymat[0][i] = word.charAt(i);
//3 more statements
//like the one I gave you
}
 */
