package CSA2425; //(c) A+ Computer Science

//www.apluscompsci.com
//Name -

public class Unit6a_FunRunner {

  public static void main(String args[]) {
    Unit6a_Fun it = new Unit6a_Fun();
    System.out.println(it.check(23433));
    System.out.println(it.check(9500));
    System.out.println(it.check(-129));
    System.out.println(it.check(10987));
    System.out.println(it.check(0));
    System.out.println(it.check(9177));
    System.out.println(it.check(0));
    System.out.println(it.check(183712983));
  }
}
/*
Lab Description : If a number greater than 10000, return "fall". If a number is than 9000, return
"jump". Otherwise, return "fly".
Sample Data :
23433
9500
-129
10987
0
9177
0
183712983
Sample Output :
fall
fly
jump
fall
jump
fly
jump
fall
 */
/*
fall
fly
jump
fall
jump
fly
jump
fall
*/
