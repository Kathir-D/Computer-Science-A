package CSA2425;

import java.lang.*;

public class SEM2_FRQ_Practice_Q1 {

  private int currentFood;

  public void simulateOneDay(int numBirds) {
    double bearOrBird = Math.random();
    int birdFood = (int) (Math.random() * 41) + 10;

    if (bearOrBird <= 0.05) { // checks if bear
      currentFood = 0;
    } else {
      currentFood -= numBirds * birdFood;
      if (currentFood < 0) {
        currentFood = 0;
      }
    }
  }

  public int simulateManyDays(int numBirds, int numDays) {
    for (int i = 1; i < numDays + 1; i++) {
      simulateOneDay(numBirds);
      if (currentFood == 0) {
        return 0;
      }
    }
    return numDays;
  }
}
