//(c) A+ Computer Science
//www.apluscompsci.com
//Name -
//Date -

public class Unit14a_RaySmallest {

  public static int go(int[] ray) {
    int smallest = ray[0];

    for (int i = 0; i < ray.length; i++) {
      if (ray[i] < smallest) {
        smallest = ray[i];
      }
    }
    return smallest;
  }
}
/*
Lab Goal : This lab was designed to teach you more about array processing and algorithms.
Lab Description : Write a program that will search through an array to find the smallest number. You
must combine variables, ifs, and a loop to create a working method. There will always be at least one item in
the list.
Sample Data
[-99,1,2,3,4,5,6,7,8,9,10,12345]
[10,9,8,7,6,5,4,3,2,1,-99]
[10,20,30,40,50,-11818,40,30,20,10]
[32767]
[255,255]
[9,10,-88,100,-555,1000]
[10,10,10,11,456]
[-111,1,2,3,9,11,20,30]
[9,8,7,6,5,4,3,2,0,-2,-989]
[12,15,18,21,23,1000]
[250,19,17,15,13,11,10,9,6,3,2,1,-455]
[9,10,-8,10000,-5000,1000]
Sample Output
-99
-99
-11818
32767
255
-555
10
-111
-989
12
-455
-5000
 */
