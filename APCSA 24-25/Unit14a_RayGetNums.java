//(c) A+ Computer Science
//www.apluscompsci.com
//Name -
//Date -

public class Unit14a_RayGetNums {

  //method go will return an array
  //containing the first 3 numbers
  //greater than 11
  public static int[] go(int[] ray) {
    int[] arr = new int[3];
    int curr = 0;

    for (int i = 0; i < ray.length && curr < 3; i++) {
      if (ray[i] > 11) {
        arr[curr] = ray[i];
        curr++;
      }
    }

    return arr;
  }
}
/*
Lab Goal : This lab was designed to teach you more about arrays. You will need to use a variable, if
statement, and a loop.
Lab Description : Write a program that return the first 3 numbers greater than 11. If there are fewer
than 3 numbers greater than 11, then return as many as you find. You will always return an array size 3.
Zeroes will fill the array if there are not 3 numbers greater than 11.
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
Sample Output - array
[12345, 0, 0]
[0, 0, 0]
[20, 30, 40]
[32767, 0, 0]
[255, 255, 0]
[100, 1000, 0]
[456, 0, 0]
[20, 30, 0]
[0, 0, 0]
[12, 15, 18]
[250, 19, 17]
[10000, 1000, 0]
 */
