//(c) A+ Computer Science
// www.apluscompsci.com
// Name -

public class Thing {

  private String type;
  private String name;
  private double size;

  public Thing(String t, String n, double s) {
    type = t;
    name = n;
    size = s;
  }

  public String getType() {
    return type;
  }

  public double getSize() {
    return size;
  }

  public String toString() {
    return type + " " + name + " " + String.format("%.2f", size) + " ";
  }
}
/*
Lab Goal : This lab was designed to teach you how to use a matrix, an array of arrays.
Lab Description : Generate a forest grid and determine how many of the animals are trapped. An
animal is trapped if it is surrounded by 5 or more rocks or trees that are size 10 or greater. Set all trapped
animals to null. Use the test cases below to help you.
Sample Data :
Generated randomly
Sample Output :
dog i 27.15 cat a 16.61 dog g 20.22 rock p 15.62
tree d 32.96 dog p 24.88 rock o 15.99 dog n 22.81
dog p 28.00 rock w 20.40 tree m 29.78 rock e 14.89
rock t 28.44 cat u 34.18 dog r 11.84 tree x 31.98
cat t 13.07 tree x 23.38 dog l 31.71 dog i 24.04
dog a 25.46 cat j 23.57 cat u 28.35 dog z 22.11
tree o 29.49 tree p 11.57 rock d 16.24 rock z 33.11
dog o 17.24 dog a 10.92 cat e 34.08 dog d 25.55
tree o 33.07 tree g 15.16 cat y 20.30 rock y 14.70
rock o 14.48 dog y 24.77 tree z 30.98 rock g 12.14
rock v 32.38 tree o 16.38 rock x 30.39 cat x 25.19
rock b 17.26 tree m 13.11 rock g 33.34 tree u 27.70
3
dog i 27.15 cat a 16.61 dog g 20.22 rock p 15.62
tree d 32.96 dog p 24.88 rock o 15.99 dog n 22.81
dog p 28.00 rock w 20.40 tree m 29.78 rock e 14.89
rock t 28.44 cat u 34.18 dog r 11.84 tree x 31.98
cat t 13.07 tree x 23.38 dog l 31.71 dog i 24.04
dog a 25.46 cat j 23.57 cat u 28.35 dog z 22.11
tree o 29.49 tree p 11.57 rock d 16.24 rock z 33.11
dog o 17.24 dog a 10.92 cat e 34.08 dog d 25.55
tree o 33.07 tree g 15.16 cat y 20.30 rock y 14.70
rock o 14.48 null nullrock g 12.14
rock v 32.38 nullrock x 30.39 cat x 25.19
rock b 17.26 tree m 13.11 rock g 33.34 tree u 27.70
 */
