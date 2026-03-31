package CSA2425; //(c) A+ Computer Science

//www.apluscompsci.com
//Name -

public class Unit8a_JavaLoopLabRunner {

  public static void main(String args[]) {
    int[] cases = {
      234,
      10000,
      111,
      9005,
      84645,
      8547,
      123456789,
      55556468,
      8525455,
      8514548,
      111111,
      1212121212,
      222222,
    };

    //uncomment the class you need to test
    //as you need to test them

    //DigitAdder s = new DigitAdder();
    //		CSA2425.Unit8a_DigitCounter s = new CSA2425.Unit8a_DigitCounter();
    //		CSA2425.Unit8a_DigitMath s = new CSA2425.Unit8a_DigitMath();
    //CountEvens s = new CountEvens();
    Unit8a_CountOdds s = new Unit8a_CountOdds();

    for (int val : cases) {
      System.out.println(s.go(val));
    }
  }
}
