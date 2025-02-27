//(c) A+ Computer Science
//www.apluscompsci.com
//Name -

public class Unit18a_BiggestRunner {

  public static void main(String args[]) throws Exception {
    int[][] f1 = { { 1, 2, 3 }, { 5, 5, 5, 5 } };
    System.out.println(
      "The biggest number is :: " + Unit18a_Biggest.getBig(f1)
    );

    int[][] f2 = { { 1, 2, 3 }, { -5 }, { 11 }, { 21, 2 } };
    System.out.println(
      "The biggest number is :: " + Unit18a_Biggest.getBig(f2)
    );

    int[][] f3 = {
      { 1, 2 },
      { -5, 5 },
      { 5, 5 },
      { 4, 5, 6, 7 },
      { 123124, 12312 },
    };
    System.out.println(
      "The biggest number is :: " + Unit18a_Biggest.getBig(f3)
    );

    int[][] f4 = { { -20, -40 }, { -234, -234234 } };
    System.out.println(
      "The biggest number is :: " + Unit18a_Biggest.getBig(f4)
    );
  }
}
/*
Lab Goal : This lab was designed to teach you how to use a matrix, an array of arrays.
Lab Description : Take the given matrix and determine which value in the matrix is the biggest.
Sample Data :
{{1,2,3},{5,5,5,5}}
{{1,2,3},{-5},{11},{21,2}}
{{1,2},{-5,5},{5,5},{4,5,6,7},{123124,12312}}
{{-20, -40},{-234,-234234 } }
Sample Output :
The biggest number is :: 5
The biggest number is :: 21
The biggest number is :: 123124
The biggest number is :: -20
 */
