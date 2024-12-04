//(c) A+ Computer Science
//www.apluscompsci.com
//Name -

import static java.lang.System.*;

public class Unit12b_RationalRunner {

  public static void main(String args[]) {
    Unit12b_Rational rOne = new Unit12b_Rational(1, 2);
    Unit12b_Rational rTwo = new Unit12b_Rational(2, 3);

    out.println("\n\nrOne = " + rOne);
    out.println("rTwo = " + rTwo);

    out.println("1/2 > 2/3 == " + rOne.isBigger(rTwo));

    rOne.add(rTwo);
    out.println("\n\nrOne.add(rTwo) = " + rOne);

    rOne.setRational(1, 2);
    rTwo.setRational(1, 3);

    out.println("1/2 > /3 == " + rOne.isBigger(rTwo));
    rOne.add(rTwo);
    out.println("\n\n1/2.add(1/3) = " + rOne);

    rOne.setRational(4, 10);
    rTwo.setRational(3, 5);
    rOne.add(rTwo);
    out.println("\n\n4/10.add(3/5) = " + rOne);

    rOne.setRational(2, 10);
    rTwo.setRational(3, 6);
    rOne.add(rTwo);
    out.println("\n\n2/10.add(3/6) = " + rOne);

    //1/4 + 2/8 = 1/2
    rOne.setRational(1, 4);
    rTwo.setRational(2, 8);
    rOne.add(rTwo);
    out.println("\n\n1/4.add(2/8) = " + rOne);

    //1/6 + 2/8 = 5/12
    rOne.setRational(1, 6);
    rTwo.setRational(2, 8);
    out.println("1/6 > 2/8 == " + rOne.isBigger(rTwo));
    rOne.add(rTwo);
    out.println("\n\n1/6.add(2/8) = " + rOne);
  }
}
/*
Lab Goal : The lab was designed to teach you more about objects and classes.
Lab Description : Create a Rational class to store fractions.
Addition Logic
num1/den1 + num2/den2 == (num1 * den2 + num2 * den1) / (den1 * den2)
so
the new numerator = (num1 * den2 + num2 * den1)
the new denominator = (den1 * den2)
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
