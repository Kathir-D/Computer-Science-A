//(c) A+ Computer Science
//www.apluscompsci.com

public class Unit3a_DogRunner {

  public static void main(String[] args) {
    Unit3a_Dog d = new Unit3a_Dog("rover");

    System.out.println(d.getPeopleAge(7));
    d.increaseAgeByOne();
    d.increaseAgeByOne();
    System.out.println(d.getPeopleAge(11));
    System.out.println(d.getName());
    d.increaseAgeByOne();
    d.increaseAgeByOne();
    d.increaseAgeByOne();
    d.increaseAgeByOne();
    System.out.println(d.getPeopleAge(8));
    Unit3a_Dog g = new Unit3a_Dog("bob", 3);
    System.out.println(g.getName());
    System.out.println(g.getPeopleAge(5));
  }
}
