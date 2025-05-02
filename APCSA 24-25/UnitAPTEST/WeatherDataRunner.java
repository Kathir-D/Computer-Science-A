package UnitAPTEST;

public class WeatherDataRunner {

  public static void main(String[] args) {
    double[] w = {
      99.1,
      142.0,
      85.0,
      85.1,
      84.6,
      94.3,
      124.9,
      98.0,
      101.0,
      102.5,
    };
    WeatherData x = new WeatherData(w);
    System.out.println(x);
    x.cleanData(85.0, 120.0);
    System.out.println(x);

    double[] z = {
      100.5,
      98.5,
      102.0,
      103.9,
      87.5,
      105.2,
      90.3,
      94.8,
      109.1,
      102.1,
      107.4,
      93.2,
    };
    WeatherData m = new WeatherData(z);
    System.out.println(m);
    System.out.println(m.longestHeatWave(95.2));

    double[] y = { 8, 8, 8, 2, 2, 2, 4, 4, 8, 8, 8, 8 };
    WeatherData f = new WeatherData(y);
    System.out.println(f);
    System.out.println(f.longestHeatWave(1));
    System.out.println(f.longestHeatWave(2));
    System.out.println(f.longestHeatWave(5));
  }
}
/*
output

[99.1, 142.0, 85.0, 85.1, 84.6, 94.3, 124.9, 98.0, 101.0, 102.5]
[99.1, 85.0, 85.1, 94.3, 98.0, 101.0, 102.5]
[100.5, 98.5, 102.0, 103.9, 87.5, 105.2, 90.3, 94.8, 109.1, 102.1, 107.4, 93.2]
4
[8.0, 8.0, 8.0, 2.0, 2.0, 2.0, 4.0, 4.0, 8.0, 8.0, 8.0, 8.0]
12
6
4

*/
