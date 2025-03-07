//(c) A+ Computer Science
//www.apluscompsci.com
//Name -

public class Unit18d_CipherRunner {

  public static void main(String args[]) {
    Unit18d_Cipher cs = new Unit18d_Caesar();
    System.out.println("chicken");
    System.out.println(cs.encode("chicken"));
    System.out.println(cs.decode(cs.encode("chicken")));

    System.out.println("\nabc");
    System.out.println(cs.encode("abc"));
    System.out.println(cs.decode(cs.encode("abc")));

    System.out.println("\ndnadoublehelix");
    System.out.println(cs.encode("dnadoublehelix"));
    System.out.println(cs.decode(cs.encode("dnadoublehelix")));

    System.out.println("\ncipherscodesandstrings");
    System.out.println(cs.encode("cipherscodesandstrings"));
    System.out.println(cs.decode(cs.encode("cipherscodesandstrings")));

    System.out.println("\nelvissoundgardenhinderseetherbeatles");
    System.out.println(cs.encode("elvissoundgardenhinderseetherbeatles"));
    System.out.println(
      cs.decode(cs.encode("elvissoundgardenhinderseetherbeatles"))
    );
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
