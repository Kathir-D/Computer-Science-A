package CSA2425; //(c) A+ Computer Science

//www.apluscompsci.com
//Name

public class Unit9a_VowelCounter {

  public static String getNumberString(String s) {
    String[] vowels = { "a", "e", "i", "o", "u", "A", "E", "I", "O", "U" };
    String[] arr = new String[s.length()];
    StringBuilder y = new StringBuilder();
    boolean isVowel = false;

    for (int i = 0; i < s.length(); i++) {
      arr[i] = s.substring(i, i + 1);
    }

    for (int i = 0; i < arr.length; i++) {
      isVowel = false;
      for (String vowel : vowels) {
        if (arr[i].equals(vowel)) {
          y.append(i);
          isVowel = true;
          break;
        }
      }
      if (!isVowel) {
        y.append(arr[i]);
      }
    }

    return y.toString();
  }
}
/*
Lab Goal : This lab was designed to teach you how to use for loops to take old strings and make a new
strings. You will need to know how to use loops and how to manipulate the letters in strings
Lab Description : Change all of the vowels in the String to numbers. Make sure the numbers range
from 0-9 and that you reset the number to 0 when you get to a count > 9.
Sample Data :
abcdef
hhhhhhh
aaaaaaa
catpigdatrathogbogfrogmoosegeese
hhhhhhh1234356HHHHDH
AEIOUaeiou87878alkjdaslwlejrlajflawjkflwj
//input for this line is "" empty quotes
x
e
Sample Output :
0bcd1f
hhhhhhh
0123456
c0tp1gd2tr3th4gb5gfr6gm78s9g01s2
hhhhhhh1234356HHHHDH
0123456789878780lkjd1slwl2jrl3jfl4wjkflwj
x
0
Files Needed ::
VowelCounter.java
VowelCounterRunner.java
A+ Computer Science VOWEL
COUNTER

 */
