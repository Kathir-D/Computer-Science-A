//(c) A+ Computer Science
// www.apluscompsci.com
//Name -

public class Unit6a_UpperLowerRunner {

  public static void main(String args[]) {
    Unit6a_UpperLower s = new Unit6a_UpperLower();
    System.out.println(s.go("D0g", true));
    System.out.println(s.go("aplus", false));
    System.out.println(s.go("catgiraffe", false));
    System.out.println(s.go("ApLuS", true));
    System.out.println(s.go("ApLuS", false));
    System.out.println(s.go("#d0G#", true));
    System.out.println(s.go("#d0G#", false));
    System.out.println(s.go("aplusdog#13337#", false));
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
