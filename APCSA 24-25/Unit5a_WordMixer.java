//(c) A+ Computer Science
//www.apluscompsci.com
//Name -

public class Unit5a_WordMixer {

  public static String moveEmAround(String a, int x) {
    if (x > a.length()) {
      return "no can do";
    }

    String cut = a.substring(0, x);
    a = a.substring(x, a.length());
    a = a + cut;
    return a;
  }
}
/*
Lab Description : Given a string and an integer value x, return a new string with the first x characters of
the original string now at the end. Make sure there are enough characters before attempting to move them to
the end of the string.
Sample Data :
apluscompsci 3
apluscompsci 5
apluscompsci 1
apluscompsci 2
apluscompsci 30
apluscompsci 4
Sample Output :
uscompsciapl
compsciaplus
pluscompscia
luscompsciap
no can do
scompsciaplu
 */
