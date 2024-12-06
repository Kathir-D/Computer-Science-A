//(c) A+ Computer Science
//www.apluscompsci.com
//Name -

public class Unit13a_Box {

  private String let;
  private int size;

  public Unit13a_Box() {
    let = "";
    size = 0;
  }

  public Unit13a_Box(String let, int size) {
    this.let = let;
    this.size = size;
  }

  public String toString() {
    String output = "";
    for (int i = 0; i < size; i++) {
      for (int j = 0; j < size; j++) {
        output += let;
      }
      output += "\n";
    }
    return output + "\n";
  }
}
/*
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
