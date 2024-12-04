//(c) A+ Computer Science
//www.apluscompsci.com

//Name -
//Date -
//Class -
//Lab  -

public class Unit4b_CharSum {

  private String word;
  private int sum;
  private char letter;

  public Unit4b_CharSum(String w, char let) {
    word = w;
    letter = let;

    locateAndAdd();
  }

  public void locateAndAdd() {
    sum = 0;

    //		for (int i = 0; i < word.length(); i++){
    //			sum += (int) word.charAt(i);
    //		}
    //
    //		for (int i = 0; i <word.length(); i++){
    //			if (letter == word.charAt(i)){
    //				sum -= (int) word.charAt(i);
    //			}
    //		}
    if (word.indexOf(letter) > 0) {
      sum += word.charAt((word.indexOf(letter)) - 1);
    }
    if (word.indexOf(letter) < word.length() - 1) {
      sum += word.charAt((word.indexOf(letter)) + 1);
    }

    if (
      word.lastIndexOf(letter) > 0 &&
      (word.lastIndexOf(letter)) != (word.indexOf(letter))
    ) {
      sum += word.charAt((word.lastIndexOf(letter)) - 1);
    }
    if (
      word.lastIndexOf(letter) < word.length() - 1 &&
      (word.lastIndexOf(letter)) != (word.indexOf(letter))
    ) {
      sum += word.charAt((word.lastIndexOf(letter)) + 1);
    }
  }

  //	public void locateAndAdd() {
  //        sum = 0;
  //
  //        for (int i = 0; i < word.length(); i++) {
  //            if (word.charAt(i) != letter) {
  //                sum += (int) word.charAt(i);
  //            }
  //        }
  //    }

  public String toString() {
    return (
      "The letters surrounding the " +
      letter +
      "'s in " +
      word +
      " have a total of " +
      sum +
      "\n"
    );
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
