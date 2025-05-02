package UnitAPTEST;

public class AppointmentBook {

  private boolean[][] schedule; // add this

  public AppointmentBook() {
    schedule = new boolean[8][60]; // add this
    for (int r = 0; r < schedule.length; r++) for (
      int c = 0;
      c < schedule[r].length;
      c++
    ) schedule[r][c] = true; // through this
  }

  private boolean isMinuteFree(int period, int minute) {
    return schedule[period][minute]; // add this
  }

  private void reserveBlock(int period, int startMinute, int duration) {
    for (
      int i = startMinute;
      i < startMinute + duration;
      i++
    ) schedule[period][i] = false; // add this // add this
  }

  public int findFreeBlock(int period, int duration) {
    int spot = -1;
    int numMin = 0;

    for (int min = 0; min < 60; min++) {
      if (isMinuteFree(period, min)) {
        if (numMin == 0) {
          spot = min;
        }
        numMin++;
        if (numMin >= duration) {
          return spot;
        }
      } else {
        numMin = 0;
        spot = -1;
      }
    }

    return spot;
  }

  public boolean makeAppointment(int startPeriod, int endPeriod, int duration) {
    for (int i = startPeriod; i <= endPeriod; i++) {
      int spot = findFreeBlock(startPeriod, i);

      if (spot != -1) {
        reserveBlock(spot, i, duration);
        return true;
      }
    }

    return false;
  }
}
