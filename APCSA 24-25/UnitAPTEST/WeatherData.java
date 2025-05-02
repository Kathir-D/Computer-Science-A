package UnitAPTEST;

import java.util.ArrayList;

public class WeatherData {

  private ArrayList<Double> temperatures;

  public WeatherData(double[] vals) {
    temperatures = new ArrayList<Double>();
    for (double r : vals) {
      temperatures.add(r);
    }
  }

  public void cleanData(double lower, double upper) {}

  public int longestHeatWave(double threshold) {
    return -1;
  }

  public String toString() {
    return "" + temperatures;
  }
}
/*



*/
