package CSA2425; //(c) A+ Computer Science

// www.apluscompsci.com
//Name -

public class Unit6a_LetterOrVowelRunner {

  public static void main(String args[]) {
    System.out.println(Unit6a_LetterOrVowel.check("apluscompsci"));
    System.out.println(Unit6a_LetterOrVowel.check("1forthemoney"));
    System.out.println(Unit6a_LetterOrVowel.check("chicken99"));
    System.out.println(Unit6a_LetterOrVowel.check("funkycoldsnow"));
    System.out.println(Unit6a_LetterOrVowel.check("APLUSCOMPSCI"));
    System.out.println(Unit6a_LetterOrVowel.check("77sodacans99"));
    System.out.println(Unit6a_LetterOrVowel.check("aardvark"));
    System.out.println(Unit6a_LetterOrVowel.check("cancancancan"));
  }
}
/*
Lab Description : Check a string to see if the first letter is a vowel or a number.
Sample Data :
apluscompsci
1forthemoney
chicken99
funkycoldsnow
APLUSCOMPSCI
77sodacans99
aardvark
cancancancan
Sample Output :
true
true
false
false
true
true
true
false
 */
