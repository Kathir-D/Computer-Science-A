//(c) A+ Computer Science
//www.apluscompsci.com
//Name -

public class Unit18b_FancyWordTwoRunner {

  public static void main(String args[]) {
    String[] words = { "HELLO", "CAT", "A", "DOGHOUSE", "ONE", "IT" };

    for (String word : words) {
      Unit18b_FancyWordTwo fancyWord = new Unit18b_FancyWordTwo(word);
      System.out.println(fancyWord);
    }
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
