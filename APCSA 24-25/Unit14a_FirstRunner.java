//(c) A+ Computer Science
//www.apluscompsci.com
//Name -
//Date -

public class Unit14a_FirstRunner {

  public static void main(String args[]) {
    Unit14a_RayFirst rt = new Unit14a_RayFirst();

    System.out.println(
      rt.go(new int[] { -99, 1, 2, 3, 4, 5, 6, 7, 8, 9, 10, 12345 })
    );
    System.out.println(rt.go(new int[] { 10, 9, 8, 7, 6, 5, 4, 3, 2, 1, -99 }));
    System.out.println(
      rt.go(new int[] { 10, 20, 30, 40, 50, -11818, 40, 30, 20, 10 })
    );
    System.out.println(rt.go(new int[] { 32767 }));
    System.out.println(rt.go(new int[] { 7, 7, 7, 7 }));
    System.out.println(rt.go(new int[] { 9, 10, -88, 100, -555, 1000 }));
    System.out.println(rt.go(new int[] { 10, 10, 10, 11, 456 }));
    System.out.println(rt.go(new int[] { -111, 1, 2, 3, 9, 11, 20, 30 }));
    System.out.println(
      rt.go(new int[] { 9, 8, 7, 6, 5, 4, 3, 2, 0, -2, 9, 9 })
    );
    System.out.println(rt.go(new int[] { 12, 15, 18, 21, 23, 1000 }));
    System.out.println(
      rt.go(new int[] { 250, 19, 17, 15, 13, 11, 10, 9, 6, 3, 2, 1, -455 })
    );
    System.out.println(rt.go(new int[] {}));
  }
}
/*
Lab Goal : This lab was designed to teach you more about arrays. You will need to use a variable, a
loop, and if statement.
Lab Description : Write a program that will search through an array and check to see if the first number
in the array occurs more than once. If the first number occurs more than once, return true. Otherwise, return
false. If the array is empty, return false.
Sample Data
[-99,1,2,3,4,5,6,7,8,9,10,12345]
[10,9,8,7,6,5,4,3,2,1,-99]
[10,20,30,40,50,-11818,40,30,20,10]
[32767]
[7,7,7,7]
[9,10,-88,100,-555,1000]
[10,10,10,11,456]
[-111,1,2,3,9,11,20,30]
[9,8,7,6,5,4,3,2,0,-2,9,9]
[12,15,18,21,23,1000]
[250,19,17,15,13,11,10,9,6,3,2,1,-455]
[]
Sample Output
false
false
true
false
true
false
true
false
true
false
false
false
 */
