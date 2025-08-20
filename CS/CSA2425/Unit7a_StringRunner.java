package CSA2425; //(c) A+ Computer Science

// www.apluscompsci.com
//Name -

public class Unit7a_StringRunner {

  public static void main(String args[]) {
    System.out.println(Unit7a_BiggestString.getBiggest("abc", "cba", "bca"));
    System.out.println(
      Unit7a_BiggestString.getBiggest("one", "fourteen", "twenty")
    );
    System.out.println(
      Unit7a_BiggestString.getBiggest("124323", "20009", "3434")
    );
    System.out.println(
      Unit7a_BiggestString.getBiggest("abcde", "ABCDE", "1234234324")
    );
  }
}
/*
Lab Goal : The lab was designed to teach you how to use &&, ||, and !.
Lab Description : Compare three Strings to see which is the biggest. When comparing the strings, use
compareTo() to determine which one has the greatest alphabetical value.
Sample Data :
"abc" "cba" "bca"
"one" "fourteen" "twenty"
"124323" "20009" "3434"
"abcde" "ABCDE" "1234234324"
Sample Output :
abc cba bca
biggest = cba
one fourteen twenty
biggest = twenty
124323 20009 3434
biggest = 3434
abcde ABCDE 1234234324
biggest = abcde
 */
