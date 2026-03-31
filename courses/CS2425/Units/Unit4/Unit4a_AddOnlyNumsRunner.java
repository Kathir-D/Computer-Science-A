package CSA2425; //(c) A+ Computer Science

//www.apluscompsci.com
//Name -

public class Unit4a_AddOnlyNumsRunner {

  public static void main(String args[]) {
    Unit4a_AddOnlyNums s = new Unit4a_AddOnlyNums();
    System.out.println(s.go("A123B", "R3D"));
    System.out.println(s.go("A77T", "B111P"));
    System.out.println(s.go("Z6E", "Q1W"));
    System.out.println(s.go("P4444L", "U4Y"));
    System.out.println(s.go("P3828L", "U22934Y"));
    //add more test cases of your own
  }
}
/*
Sample Data :
A123B R3D
A77T B111P
Z6E Q1W
P4444L U4Y
P3828L U22934Y


Sample Output : 
126
188
7
4448
26762

*/
