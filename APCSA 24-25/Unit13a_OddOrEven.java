//(c) A+ Computer Science
//www.apluscompsci.com
//Name -

import java.io.File;
import java.io.IOException;
import java.util.Scanner;

public class Unit13a_OddOrEven {

  //	public static void main(String args[]) throws IOException {
  //    Scanner file = new Scanner(new File("APCSA 24-25/Unit13a_oddoreven.dat"));
  //    int size = file.nextInt();
  //    file.nextLine();
  //    for (int i = 0; i < size; i++) {
  //      int num = file.nextInt();
  //      if (num % 2 == 0) {
  //        System.out.println(num + " IS EVEN");
  //      } else {
  //        System.out.println(num + " IS ODD");
  //      }
  //    }
  //  }

  private int num;

  public Unit13a_OddOrEven(int num) {
    this.num = num;
  }

  public void checkOddOrEven() {
    if (num % 2 == 0) {
      System.out.println(num + " IS EVEN");
    } else {
      System.out.println(num + " IS ODD");
    }
  }
}
/*
Lab Goal : The lab was designed to teach you more about using data files.
Lab Description : The first value in the data files represents the number of data sets to follow. Each
data set will contain a single number. Determine if each number is odd or even. Output x is ODD or x is
EVEN after testing the number to see if it is odd or even. An even number is evenly divisible by two and an
odd number is not evenly divisible by two. x % 2 == 0 x % 2 != 0
Sample Data :
15
2
11
16
8
7
11
12
13
14
-5
1234123
-21343
0
-23432234
123421134
Sample Output :
2 IS EVEN
11 IS ODD
16 IS EVEN
8 IS EVEN
7 IS ODD
11 IS ODD
12 IS EVEN
13 IS ODD
14 IS EVEN
-5 IS ODD
1234123 IS ODD
-21343 IS ODD
0 IS EVEN
-23432234 IS EVEN
123421134 IS EVEN
# of data sets in the file - 15
Files Needed ::
OddOrEven.java
oddoreven.dat
A+ Computer Science ODD EVEN
CHECKER
basic code to read from a file
Scanner file;
file = new Scanner(new File("fun.dat"));
int size = file.nextInt();
file.nextLine(); //buffer clearing code
for(int i=0; i<size; i++)
{
int num = file.nextInt();
//do some stuff
//print out some stuff
}

 */
