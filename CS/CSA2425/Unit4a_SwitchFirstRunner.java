package CSA2425; //(c) A+ Computer Science

//www.apluscompsci.com
//Name -

public class Unit4a_SwitchFirstRunner {

  public static void main(String args[]) {
    Unit4a_SwitchFirst s = new Unit4a_SwitchFirst();
    System.out.println(s.go("dog", "cats"));
    System.out.println(s.go("aplus", "pigs"));
    System.out.println(s.go("catgiraffe", "apluscompsci"));
    System.out.println(s.go("ap", "aplus"));
    System.out.println(s.go("pluscat", "dogsaplus"));
    System.out.println(s.go("#", "#"));
    System.out.println(s.go("aplusdog#13337#", "pigaplusprogram"));
    System.out.println(s.go("code", "code1234"));
    System.out.println(s.go("plus", "wow"));
    System.out.println(s.go("catsand", "aplusdogsaplus"));
    System.out.println(s.go("7", "77777"));
  }
}
