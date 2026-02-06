package CS22526.Labs.Unit9;
//(c) A+ Computer Science
//www.apluscompsci.com

//Name -

public class ThingCountRunner {

  public static void main(String[] args) {
    ThingCount one = new ThingCount();
    ThingCount two = new ThingCount('A', 5);

    System.out.println(one);
    System.out.println(two);

    ThingCount three = new ThingCount("hello", 7);
    System.out.println(three);
    System.out.println(three.getCount());
    three.setCount(22);
    three.setThing(54.12);
    System.out.println(three);

    System.out.println(three.equals(two));
    two.setCount(22);
    two.setThing(54.12);
    System.out.println(two.equals(three));
  }
}
