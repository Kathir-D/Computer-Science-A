package CSA2425; //(c) A+ Computer Science

//www.apluscompsci.com
//Name -

public class Unit2b_MilesPerHour {

  public static double getMPH(int dist, int hrs, int mins) {
    return (double) (dist / (hrs + (mins / 60.0)));
  }
}
