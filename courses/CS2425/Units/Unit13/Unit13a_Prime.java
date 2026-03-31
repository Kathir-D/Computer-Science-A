package CSA2425; //(c) A+ Computer Science

//www.apluscompsci.com
//Name -

public class Unit13a_Prime {

  private int number;

  public Unit13a_Prime() {
    number = 0;
  }

  public Unit13a_Prime(int number) {
    this.number = number;
  }

  public void setPrime(int num) {
    this.number = num;
  }

  public boolean isPrime() {
    if (number <= 1) {
      return false;
    }
    for (int i = 2; i <= Math.sqrt(number); i++) {
      if (number % i == 0) {
        return false;
      }
    }
    return true;
  }

  public String toString() {
    if (isPrime()) {
      return number + " IS PRIME.";
    } else {
      return number + " IS NOT PRIME.";
    }
  }
}
/*
Lab Goal : The lab was designed to teach you more about using data files.
Lab Description : Create a prime class that will determine if any provided number is prime. Use this
class to tell all numbers in the data file for primeness. A prime number is any number that is only divisible by 1
and itself.
Sample Data :
18
1201
77
1213
88
1217
99
121
1431
1223
141
234
97
436
47
7
547
2456
34
Sample Output :
1201 IS PRIME.
77 IS NOT PRIME.
1213 IS PRIME.
88 IS NOT PRIME.
1217 IS PRIME.
99 IS NOT PRIME.
121 IS NOT PRIME.
1431 IS NOT PRIME.
1223 IS PRIME.
141 IS NOT PRIME.
234 IS NOT PRIME.
97 IS PRIME.
436 IS NOT PRIME.
47 IS PRIME.
7 IS PRIME.
547 IS PRIME.
2456 IS NOT PRIME.
34 IS NOT PRIME.
 */
