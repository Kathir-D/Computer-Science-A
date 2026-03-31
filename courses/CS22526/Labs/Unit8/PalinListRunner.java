package CS22526.Labs.Unit8;

//(c) A+ Computer Science
//www.apluscompsci.com

//Name -

public class PalinListRunner {

  public static void main(String[] args) {
    String x =
      "one two three two one\n" +
      "1 2 3 4 5 one two three four five\n" +
      "a b c d e f g x y z g f h\n" +
      "racecar is racecar\n" +
      "1 2 3 a b c c b a 3 2 1\n" +
      "chicken is a chicke";

    String[] lines = x.split("\n");
    for (String line : lines) {
      PalinList pl = new PalinList(line);
      System.out.println(pl);
    }
  }
}
