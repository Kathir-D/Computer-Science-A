//(c) A+ Computer Science
//www.apluscompsci.com
//Name -

import java.util.HashMap;

public class Caesar implements Cipher {

  // I used hashmaps, your not supposed to use hashmaps yet

  private final String alpha = "ABCDEFGHIJKLMNOPQRSTUVWXYZ";
  private String shiftSt;
  private int howFar;
  private HashMap<String, String> encod;
  private HashMap<String, String> decod;

  public Caesar() {
    howFar = (int) (Math.random() * 26);
    shiftSt = alpha.substring(howFar) + alpha.substring(0, howFar);
  }

  public Caesar(int far) {
    howFar = far;
    shiftSt = alpha.substring(howFar) + alpha.substring(0, howFar);
  }

  public void createHashMap() {
    encod = new HashMap<>();
    decod = new HashMap<>();

    for (int i = 0; i < alpha.length(); i++) {
      String original = alpha.substring(i, i + 1);
      String shifted = shiftSt.substring(i, i + 1);
      encod.put(original, shifted);
      decod.put(shifted, original);
    }
  }

  public String encode(String toEncode) {
    createHashMap();
    String encoded = "";

    for (int i = 0; i < toEncode.length(); i++) {
      String letter = toEncode.substring(i, i + 1);
      if (encod.containsKey(letter.toUpperCase())) {
        encoded += encod.get(letter.toUpperCase());
      } else {
        throw new IllegalArgumentException(
          "Character not found in encoding map: " + letter
        );
      }
    }

    return encoded;
  }

  public String decode(String toDecode) {
    createHashMap();
    String decoded = "";

    for (int i = 0; i < toDecode.length(); i++) {
      String letter = toDecode.substring(i, i + 1);
      if (decod.containsKey(letter.toUpperCase())) {
        decoded += decod.get(letter.toUpperCase());
      } else {
        throw new IllegalArgumentException(
          "Character not found in decoding map: " + letter
        );
      }
    }

    return decoded;
  }
}
/*
Lab Goal : This lab was designed to teach you more about objects, interfaces, and the String class.
While at the same time, you will be learning about ciphers and codes. You will create a class that implements
the Cipher interface shown below.
public interface Cipher
{
public String encode(String original);
public String decode(String encoded);
}
Lab Description : Take a word or phrase and apply the idea of a Caesar cipher to the word or phrase.
A Caesar cipher is a substitution cipher. Substitution ciphers use a rotated alphabet String to encode words
and phrases.
alpha = "ABCDEFGHIJKLMNOPQRSTUVWXYZ"
shift = "XYZABCDEFGHIJKLMNOPQRSTUVW"
Use a random number to determine the amount of the shift. This will make the encoded words and phrases
harder to break. You will need a constructor to set the amount to rotate.
howFar = (int)(Math.random()*26)
Sample Data :
friendly
abc
dnadoublehelix
cipherscodesandstrings
elvissoundgardenhinderseetherbeatles
Sample Output :
friendly
COFBKAIV
FRIENDLY
abc
XYZ
ABC
dnadoublehelix
AKXALRYIBEBIFU
DNADOUBLEHELIX
cipherscodesandstrings
ZFMEBOPZLABPXKAPQOFKDP
CIPHERSCODESANDSTRINGS
elvissoundgardenhinderseetherbeatles
BISFPPLRKADXOABKEFKABOPBBQEBOYBXQIBP
ELVISSOUNDGARDENHINDERSEETHERBEATLES
 */
