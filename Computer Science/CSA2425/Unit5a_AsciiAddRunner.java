package CSA2425; //(c) A+ Computer Science

//www.apluscompsci.com
//Name -

public class Unit5a_AsciiAddRunner {

  public static void main(String args[]) {
    Unit5a_AsciiAdd obj = new Unit5a_AsciiAdd();
    System.out.println(obj.go("funny", 100));
    System.out.println(obj.go("funny", 250));
    System.out.println(obj.go("A", 100));
    System.out.println(obj.go("AB", 200));
    System.out.println(obj.go("APLUS", 125));
    System.out.println(obj.go("&^#&@", 110));
    System.out.println(obj.go("0123456", 100));
    System.out.println(obj.go("DOG", 140));
    System.out.println(obj.go("CAT", 140));
    System.out.println(obj.go("#######COMP----SCI212", 125));
  }
}
/*
Sample Data :
"funny", 100
"funny", 250
"A", 100
"AB", 200
"APLUS", 125
"&^#&@", 110
"0123456", 100
"DOG", 140
"CAT", 140
"#######COMP----SCI212", 125
Sample Output :
true
false
false
false
true
false
true
false
true
false
 */
