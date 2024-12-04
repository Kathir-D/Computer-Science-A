//(c) A+ Computer Science
//www.apluscompsci.com
//Name -

//design your Rational class
//write all code for your Rational class here
//test your Rational class with the RationalRunner

class Unit12b_Rational {

  private int n1, n2;

  public Unit12b_Rational(int a, int b) {
    this.n1 = a;
    this.n2 = b;
    reduce();
  }

  public void setRational(int a, int b) {
    this.n1 = a;
    this.n2 = b;
    reduce();
  }

  public int getN1() {
    return n1;
  }

  public int getN2() {
    return n2;
  }

  private void reduce() {
    int gcd = gcd(n1, n2);
    this.n1 /= gcd;
    this.n2 /= gcd;
  }

  private int gcd(int a, int b) {
    if (b == 0) {
      return a;
    }
    return gcd(b, a % b);
  }

  public boolean isBigger(Object obj) {
    Unit12b_Rational other = (Unit12b_Rational) obj;
    return (double) n1 / n2 > (double) other.getN1() / other.getN2();
    //return (this.n1/this.n2)>(other.getN1()/ other.getN2());
  }

  public String add(Object obj) {
    Unit12b_Rational other = (Unit12b_Rational) obj;

    n1 = n1 * other.getN2() + other.getN1() * n2;
    n2 = n2 * other.getN2();
    reduce();

    return "" + n1 + " / " + n2;
  }

  public String toString() {
    return n1 + " / " + n2;
  }
}
/*
Lab Goal : The lab was designed to teach you more about objects and classes.
Lab Description : Create a Rational class to store fractions.
Addition Logic
n1/n2 + other.getN1()/other.getN2() == (n1 * other.getN2() + other.getN1() * n2) / (n2 * other.getN2())
so
the new n1 = (n1 * other.getN2() + other.getN1() * n2)
the new n2 = (n2 * other.getN2())
you must also reduce the fraction

Sample Output :
rOne = 1 / 2
rTwo = 2 / 3
1/2 > 2/3 == false
rOne.add(rTwo) = 7 / 6
1/2 > /3 == true
1/2.add(1/3) = 5 / 6
4/10.add(3/5) = 1 / 1
2/10.add(3/6) = 7 / 10
1/4.add(2/8) = 1 / 2
1/6 > 2/8 == false
1/6.add(2/8) = 5 / 12
1/2 == 2/4 is true

 */
