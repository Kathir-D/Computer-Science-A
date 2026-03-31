package CSA2425; //(c) A+ Computer Science

//www.apluscompsci.com
//Name

public class Unit9a_NumberBox {

  public static void print(int num) {
    int x = num;
    for (int i = 1; i <= num; i++) {
      System.out.println("##" + i + "##---##" + x + "##---##" + i + "##");
      x--;
    }
  }
}
/*
Lab Goal : Write a program that will print out the box of # signs and numbers as show below.
Lab Description : Demonstrate that you can write a simple loop to print out values.
Sample Data :
3
8
11
Sample Output :
run 1
##1##---##3##---##1##
##2##---##2##---##2##
##3##---##1##---##3##
run 2
##1##---##8##---##1##
##2##---##7##---##2##
##3##---##6##---##3##
##4##---##5##---##4##
##5##---##4##---##5##
##6##---##3##---##6##
##7##---##2##---##7##
##8##---##1##---##8##
run 3
##1##---##11##---##1##
##2##---##10##---##2##
##3##---##9##---##3##
##4##---##8##---##4##
##5##---##7##---##5##
##6##---##6##---##6##
##7##---##5##---##7##
##8##---##4##---##8##
##9##---##3##---##9##
##10##---##2##---##10##
##11##---##1##---##11##
Files Needed ::
NumberBox.java
NumberBoxRunner.java
A+ Computer Science Number Box

 */
