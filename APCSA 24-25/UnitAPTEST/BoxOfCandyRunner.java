package UnitAPTEST;

public class BoxOfCandyRunner {

  public static void main(String[] args) {
    BoxOfCandy bc = new BoxOfCandy();
    System.out.println(bc);
    System.out.println(bc.moveCandyToFirstRow(0));
    System.out.println(bc);
    System.out.println(bc.moveCandyToFirstRow(2));
    System.out.println(bc);

    System.out.println(bc.removeNextByFlavor("cherry"));
    System.out.println(bc);
  }
}
