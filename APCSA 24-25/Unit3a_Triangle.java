//(c) A+ Computer Science
//www.apluscompsci.com
//Name -
//Date -

public class Unit3a_Triangle {

  private int sideA, sideB, sideC;
  public double perimeter;

  public Unit3a_Triangle(int a, int b, int c) {
    sideA = a;
    sideB = b;
    sideC = c;
  }

  public void calcPerimeter() {
    perimeter = (sideA + sideB + sideC);
  }

  public double getArea() {
    double s = perimeter / 2;
    return (Math.sqrt(s * (s - sideA) * (s - sideB) * (s - sideC)));
  }
}
// area= sqrt( s( s – a )( s – b )(s – c ))
