package CSA2425; //(c) A+ Computer Science

//www.apluscompsci.com
//Name -

import java.io.File;
import java.io.IOException;
import java.util.Scanner;

public class Unit13a_BoxRunner {

  public static void main(String args[]) throws IOException {
    Scanner file = new Scanner(new File("APCSA 24-25/Unit13a_box.dat"));
    int size = file.nextInt();
    file.nextLine();

    for (int i = 0; i < size; i++) {
      String let = file.next();
      int num = file.nextInt();
      Unit13a_Box obj = new Unit13a_Box(let, num);
      System.out.println(obj.toString());
    }
  }
}
/*
 * /*
Lab Goal : The lab was designed to teach you more about using data files.
Lab Description : Create letter boxes using the letter and size values read in from the file. Nested
loops will be helpful.
Sample Data :
5
A 5
E 8
B 2
C 1
D 4
Sample Output :
AAAAA
AAAAA
AAAAA
AAAAA
AAAAA
EEEEEEEE
EEEEEEEE
EEEEEEEE
EEEEEEEE
EEEEEEEE
EEEEEEEE
EEEEEEEE
EEEEEEEE
BB
BB
C
DDDD
DDDD
DDDD
DDDD
 */
