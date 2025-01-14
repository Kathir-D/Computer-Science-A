//(c) A+ Computer Science
//www.apluscompsci.com
//Name -
//Date -

public class Unit14a_RayNoRepeats {

  //method go will return true if there
  //are no numbers that repeat
  //false if any numbers repeat
  public static boolean go(int[] ray) {
    for (int i = 0; i < ray.length; i++) {
      for (int j = 0; j < ray.length; j++) {
        if (ray[j] == ray[i] && j != i) {
          return false;
        }
      }
    }

    return true;
  }
}
/*
Lab Goal : This lab was designed to teach you more about array processing and algorithms.
Lab Description : Write a program that will go through an array to see if any of the numbers in the
array repeat. If none of the numbers repeat, return true. If any of the numbers repeat, return false.
Sample Data
[-99,1,2,3,4,5,6,6,6,6,6,7,8,9,10,12345,5,5,5,5]
[10,9,8,7,6,5,4,3,2,1,-99]
[10,20,30,40,50,10,10,40,30,20,10]
[32767]
[255,255]
[9,10,-88,100,-555,1000]
[10,10,10,11,456,10,10,2,2,2,2,2,2,2]
[-111,1,2,3,9,11,20,30]
[9,8,7,6,5,4,3,2,0,-2,-989]
[12,12,15,18,21,23,1000]
[250,19,17,15,13,13,13,13,11,10,9,6,3,2,1,1]
[9,10,-8,10000,-5000,1000]
Sample Output
false
true
false
true
false
true
false
true
true
false
false
true
 */
