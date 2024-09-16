//(c) A+ Computer Science
//www.apluscompsci.com

//Name -
//Date -
//Class -
//Lab  - 

public class Unit4b_CharSum
{
   private String word;
   private int sum;
   private char letter;


	public Unit4b_CharSum(String w, char let)
	{
		word = w;
		letter = let;
		sum = 0;

	}

	public void locateAndAdd()
	{
		for (int i = 0; i<word.length(); i++) {
			int[] total = (int) word.charAt(1);
		}
	}

	public String toString()
	{
		return "The letters surrounding the "+letter+"s in " + word + " have a total of " + sum + "\n";
	}
}


/*
Lab Description : Locate the letter before and after the first and last given character within a word and
find the sum of their combined ASCII values. There will always be at least 2 of the specified search letters in
the string.
Sample Data :
Dallas a
Houston o
Statue t
copper p
happypeople p
Sample Output :
The letters surrounding the a's in Dallas have a total of 399
The letters surrounding the o's in Houston have a total of 415
The letters surrounding the t's in Statue have a total of 394
The letters surrounding the p's in copper have a total of 436
The letters surrounding the p's in happypeople have a total of 428
 */