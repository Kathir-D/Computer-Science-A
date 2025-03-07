//(c) A+ Computer Science
//www.apluscompsci.com
//Name -

import java.io.IOException;

public class Unit18b_KittyMapRunner {

  public static void main(String args[]) throws IOException {
    Unit18b_KittyMap km = new Unit18b_KittyMap(10, 10);
    System.out.println(km + "\n\n");
    km.printKittyCount();
  }
}
/*
Lab Goal : The lab was designed to teach you more about nested loops and matrices.
Lab Description : Ben loves Kitties and his kitties are running free. You need to help Ben identify
where his kitties are so he can get them all rounded up.
Each cell in thet boolean matrix that contains a kitty will be set to true. Each cell that contains no kitty will be
set to false. Use Math.random() to randomly place the 0s and 1s in the grid – try multiplying by numbers
larger than 2 if you want fewer kitties in the grid.
As you work to help Ben recover his lost kitties, you will create an integer matrix that stores the number of
kitties near each cell. Each cell that contains a kitty is set to 9. All other cells are set to the value of how many
kitties are around them. This integer grid will be used to determine the best location from which to start
collecting Ben’s kitties.
Sample Input:
It is all random.
Sample Output :
0 0 0 0 0 0 0 1 0 0 0 0 0 1 0 0 0 0 0 0
0 0 0 0 0 0 0 0 0 0 0 0 0 1 0 0 0 0 1 0
0 0 0 0 0 0 0 0 0 0 0 0 0 1 0 1 0 0 0 1
0 0 0 0 1 0 0 1 0 1 0 0 0 0 0 0 0 0 0 0
0 0 0 0 0 0 0 0 0 1 1 0 1 0 0 0 0 0 0 0
0 0 0 0 0 0 0 1 0 0 1 0 0 0 0 0 0 0 0 0
0 0 1 0 0 0 0 1 0 0 0 1 1 0 0 0 0 0 0 0
0 1 0 0 0 0 0 0 0 0 0 0 0 0 0 0 0 0 0 1
0 0 0 0 0 0 0 0 0 0 0 0 0 1 0 0 0 0 0 0
0 0 0 0 0 0 0 0 0 0 0 1 0 0 0 0 1 0 0 0
0 0 0 0 0 0 0 0 0 0 0 0 0 0 0 0 0 0 0 1
0 0 0 0 0 0 0 1 0 0 0 0 0 0 0 0 0 0 0 0
0 0 0 0 0 1 0 0 0 0 0 1 0 1 0 0 0 0 0 0
0 0 0 0 0 1 0 0 0 1 0 0 0 0 0 0 0 0 0 0
0 0 0 1 0 0 0 0 1 0 0 0 0 0 0 0 0 0 0 0
0 0 0 1 0 0 0 1 0 0 0 0 0 0 0 0 0 0 0 0
1 0 0 0 0 0 0 0 0 0 0 0 0 0 0 0 0 0 0 0
0 0 0 0 0 0 0 0 0 0 0 0 1 0 1 0 0 1 0 0
0 0 0 0 0 0 0 1 0 0 1 0 0 1 1 0 0 0 0 0
0 0 0 0 0 0 0 0 0 0 0 0 0 1 0 1 0 0 0 0
0 0 0 0 0 0 1 9 1 0 0 0 2 9 2 0 0 1 1 1
0 0 0 0 0 0 1 1 1 0 0 0 3 9 4 1 1 1 9 2
0 0 0 1 1 1 1 1 2 1 1 0 2 9 3 9 1 1 2 9
0 0 0 1 9 1 1 9 3 9 3 2 2 2 2 1 1 0 1 1
0 0 0 1 1 1 2 2 4 9 9 3 9 1 0 0 0 0 0 0
0 1 1 1 0 0 2 9 3 3 9 5 3 2 0 0 0 0 0 0
1 2 9 1 0 0 2 9 2 1 2 9 9 1 0 0 0 0 1 1
1 9 2 1 0 0 1 1 1 0 1 2 3 2 1 0 0 0 1 9
1 1 1 0 0 0 0 0 0 0 1 1 2 9 1 1 1 1 1 1
0 0 0 0 0 0 0 0 0 0 1 9 2 1 1 1 9 1 1 1
0 0 0 0 0 0 1 1 1 0 1 1 1 0 0 1 1 1 1 9
0 0 0 0 1 1 2 9 1 0 1 1 2 1 1 0 0 0 1 1
0 0 0 0 2 9 3 1 2 1 2 9 2 9 1 0 0 0 0 0
0 0 1 1 3 9 2 1 2 9 2 1 2 1 1 0 0 0 0 0
0 0 2 9 3 1 2 2 9 2 1 0 0 0 0 0 0 0 0 0
1 1 2 9 2 0 1 9 2 1 0 0 0 0 0 0 0 0 0 0
9 1 1 1 1 0 1 1 1 0 0 1 1 2 1 1 1 1 1 0
1 1 0 0 0 0 1 1 1 1 1 2 9 4 9 2 1 9 1 0
Files Needed ::
KittyMap.java
KittyMapRunner.java
BONUS ::
Write a method to find the
best place to drop a kitty
collecting robot. The robot
will fan out in all directions
and collect all kitties within a
3 cell radius.
Your method should return
the location of the best place
to drop the robot.
A+ Computer Science BEN’S KITTY
MAP
© A+ Computer Science – Matrices – www.apluscompsci.com
0 0 0 0 0 0 1 9 1 1 9 2 3 9 9 3 2 1 1 0
0 0 0 0 0 0 1 1 1 1 1 1 2 9 4 9 1 0 0 0

 */
