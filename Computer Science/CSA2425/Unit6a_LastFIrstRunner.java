package CSA2425; //(c) A+ Computer Science

//www.apluscompsci.com
//Name -

public class Unit6a_LastFIrstRunner {

  public static void main(String args[]) {
    System.out.println(Unit6a_LastFirst.check("chickenisa"));
    System.out.println(Unit6a_LastFirst.check("frog"));
    System.out.println(Unit6a_LastFirst.check("chicken"));
    System.out.println(Unit6a_LastFirst.check("theapluscompsci"));
    System.out.println(Unit6a_LastFirst.check("aa"));
    System.out.println(Unit6a_LastFirst.check("racecar"));
    System.out.println(Unit6a_LastFirst.check("mommy"));
    System.out.println(Unit6a_LastFirst.check("mom"));
    System.out.println(Unit6a_LastFirst.check("dogsarebadboy"));
  }
}
/*
Lab Description : If the first letter is bigger than the last, return “aplus”. If the last letter is bigger
than the first, return “compsci”. If the first and last letters are the same, return “apluscompsci”.
You will need to use compareTo for this lab to compare the first and last letters of the string.
Sample Data :
chickenisa
frog
chicken
theapluscompsci
aa
racecar
mommy
mom
dogsarebadboy
Sample Output :
aplus
compsci
compsci
aplus
apluscompsci
apluscompsci
compsci
apluscompsci
compsc
 */
