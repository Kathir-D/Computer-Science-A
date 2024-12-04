//(c) A+ Computer Science
// www.apluscompsci.com
//Name -

public class Unit6a_UpperLower {

  public static String go(String a, boolean b) {
    if (b == true) {
      return a.toUpperCase();
    } else {
      return a.toLowerCase();
    }
  }
}
/*
Lab Description : Return the given string all uppercase if the boolean parameter is true. Return the
string all lowercase if the boolean parameter is false.
Sample Data :
D0g True
aplus False
catgiraffe False
ApLuS True
ApLuS False
#d0G# True
#d0G# False
aplusdog#13337# False
CoEe1234 True
wow True
77777 True
77777 False
Sample Output :
D0G
aplus
catgiraffe
APLUS
aplus
#D0G#
#d0g#
aplusdog#13337#
COEE1234
WOW
77777
77777
 */
