//(c) A+ Computer Science
//www.apluscompsci.com
//Name -

public class Unit18b_FancyWordTwo {

  private String[][] mat;

  public Unit18b_FancyWordTwo(String s) {
    //size the matrix

    //use Arrays.fill() to fill in the matrix with spaces

    //use a for loop to load in the letters into the matrix

  }

  public String toString() {
    String output = "";
    return output + "\n\n";
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