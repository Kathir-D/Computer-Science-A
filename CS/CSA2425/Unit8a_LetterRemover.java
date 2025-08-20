package CSA2425; //(c) A+ Computer Science

//www.apluscompsci.com
//Name -

public class Unit8a_LetterRemover {

  public static String removeLetters(String s, char rem) {
    String[] arr = new String[s.length()];
    String x = "";
    for (int i = 0; i < s.length(); i++) {
      arr[i] = s.substring(i, i + 1);
    }

    for (int i = 0; i < s.length(); i++) {
      if (!arr[i].equals(String.valueOf(rem))) {
        x = x + arr[i];
      }
    }

    return x;
  }
}
/*
Lab Goal : This lab was designed to teach you how to use a while loop.
Lab Description : Remove all instances of the specified removal letter from the original sentence.
Sample Data :
I am Sam I am a
ssssssssxssssesssssesss s
qwertyqwertyqwerty a
abababababa b
abaababababa x
Sample Output :
I am Sam I am - letter to remove a
I m Sm I m
ssssssssxssssesssssesss - letter to remove s
xee
qwertyqwertyqwerty - letter to remove a
qwertyqwertyqwerty
abababababa - letter to remove b
aaaaaa
abaababababa - letter to remove x
 */
