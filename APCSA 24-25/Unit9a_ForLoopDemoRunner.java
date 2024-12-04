//(c) A+ Computer Science
//www.apluscompsci.com
//Name

public class Unit9a_ForLoopDemoRunner {

  public static void main(String[] args) {
    Unit9a_ForLoopDemo.runForLoop(2, 90, 5);
    Unit9a_ForLoopDemo.runForLoop(3, 76, 4);
    Unit9a_ForLoopDemo.runForLoop(-10, 8, 2);
    Unit9a_ForLoopDemo.runForLoop(5, 30, 2);
    Unit9a_ForLoopDemo.runForLoop(100, 150, 5);
  }
}
/*
Lab Goal : This lab was designed to teach you how to use a for loop.
Lab Description : Demonstrate the workings of a for loop.
//initialization-start //condition-stop //incremenation
for ( int i = 0; i < 10; i = i + 1 )
{
//do something
}
Sample Data :
2 90 5
3 76 4
-10 8 2
5 30 2
100 150 5
Sample Output :
start 2 : stop 90 : increment 5
2 7 12 17 22 27 32 37 42 47 52 57 62 67 72 77 82 87
start 3 : stop 76 : increment 4
3 7 11 15 19 23 27 31 35 39 43 47 51 55 59 63 67 71 75
start -10 : stop 8 : increment 2
-10 -8 -6 -4 -2 0 2 4 6
start 5 : stop 30 : increment 2
5 7 9 11 13 15 17 19 21 23 25 27 29
start 100 : stop 150 : increment 5
100 105 110 115 120 125 130 135 140 145
ANATOMY OF A FOR LOOP
Files Needed ::
ForLoopDemo.java
ForLoopDemoRunner.java
A+ Computer Science FOR LOOP
DEMO

 */
