//(c) A+ Computer Science
//www.apluscompsci.com
//Name -

public class Unit12b_BallRunner {

  public static void main(String[] args) {
    Unit12b_Ball b = new Unit12b_Ball(30, 11, "RED", "BASKETBALL");
    System.out.println("AIR Pressure  " + b.getPressure());
    System.out.println("AIR Capacity  " + b.getCapacity());
    System.out.println("BALL Color  " + b.getColor());
    System.out.println("BALL Type  " + b.getType());
    System.out.println("Is Ball full of AIR  " + b.isFull());
    System.out.println("How much air is needed  " + b.needsAir());
    System.out.println("Is Ball FLAT  " + b.isFlat());
    System.out.println("Adding 20 to pressure  " + b.addAir(20));
    System.out.println("Adding 20 to pressure  " + b.addAir(20));
    System.out.println("Is Ball full of AIR  " + b.isFull());
    System.out.println("Is Ball FLAT  " + b.isFlat());
  }
}
/*

AIR Pressure  11.0
AIR Capacity  30.0
BALL Color  RED
BALL Type  BASKETBALL
Is Ball full of AIR  false
How much air is needed  19.0
Is Ball FLAT  true
Adding 20 to pressure  true
Adding 20 to pressure  false
Is Ball full of AIR  true
Is Ball FLAT  false

*/
