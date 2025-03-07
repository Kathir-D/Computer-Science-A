//(c) A+ Computer Science
//www.apluscompsci.com
//Name -

import java.util.Random;

public class Unit18c_Forest {

  private Unit18c_Thing[][] grid;

  public Unit18c_Forest(int rows, int cols) {
    final String[] typeList = "cat dog tree rock".split(" ");
    final String[] nameList =
      "a b c d e f g h i j k l m n o p q r t s u v w x y z".split(" ");
    grid = new Unit18c_Thing[rows][cols];
    Random rand = new Random();

    for (int r = 0; r < rows; r++) {
      for (int c = 0; c < cols; c++) {
        String type = typeList[rand.nextInt(typeList.length)];
        String name = nameList[rand.nextInt(nameList.length)];
        double size = 10 + (40 - 10) * rand.nextDouble(); // size between 10 and 40
        grid[r][c] = new Unit18c_Thing(type, name, size);
      }
    }
  }

  public int setTrappedToNull() {
    int trappedCount = 0;
    for (int r = 0; r < grid.length; r++) {
      for (int c = 0; c < grid[r].length; c++) {
        if (isTrapped(r, c)) {
          grid[r][c] = null;
          trappedCount++;
        }
      }
    }
    return trappedCount;
  }

  public boolean isTrapped(int r, int c) {
    if (grid[r][c] == null || grid[r][c].getType().equals("rock")) {
      return false;
    }

    int count = 0;
    for (int i = -1; i <= 1; i++) {
      for (int j = -1; j <= 1; j++) {
        if (i == 0 && j == 0) continue;
        int newRow = r + i;
        int newCol = c + j;
        if (inBounds(newRow, newCol) && grid[newRow][newCol] != null) {
          Unit18c_Thing neighbor = grid[newRow][newCol];
          if (
            neighbor.getType().equals("tree") ||
            neighbor.getType().equals("rock")
          ) {
            if (neighbor.getSize() >= 10) {
              count++;
            }
          }
        }
      }
    }
    return count >= 5;
  }

  private boolean inBounds(int r, int c) {
    return r >= 0 && r < grid.length && c >= 0 && c < grid[0].length;
  }

  public String toString() {
    StringBuilder sb = new StringBuilder();
    for (Unit18c_Thing[] row : grid) {
      for (Unit18c_Thing thing : row) {
        sb.append(thing == null ? "null " : thing.toString());
      }
      sb.append("\n");
    }
    return sb.toString();
  }
}
/*
Lab Goal : This lab was designed to teach you how to use a matrix, an array of arrays.
Lab Description : Generate a forest grid and determine how many of the animals are trapped. An
animal is trapped if it is surrounded by 5 or more rocks or trees that are size 10 or greater. Set all trapped
animals to null. Use the test cases below to help you.
Sample Data :
Generated randomly
Sample Output :
dog i 27.15 cat a 16.61 dog g 20.22 rock p 15.62
tree d 32.96 dog p 24.88 rock o 15.99 dog n 22.81
dog p 28.00 rock w 20.40 tree m 29.78 rock e 14.89
rock t 28.44 cat u 34.18 dog r 11.84 tree x 31.98
cat t 13.07 tree x 23.38 dog l 31.71 dog i 24.04
dog a 25.46 cat j 23.57 cat u 28.35 dog z 22.11
tree o 29.49 tree p 11.57 rock d 16.24 rock z 33.11
dog o 17.24 dog a 10.92 cat e 34.08 dog d 25.55
tree o 33.07 tree g 15.16 cat y 20.30 rock y 14.70
rock o 14.48 dog y 24.77 tree z 30.98 rock g 12.14
rock v 32.38 tree o 16.38 rock x 30.39 cat x 25.19
rock b 17.26 tree m 13.11 rock g 33.34 tree u 27.70
3
dog i 27.15 cat a 16.61 dog g 20.22 rock p 15.62
tree d 32.96 dog p 24.88 rock o 15.99 dog n 22.81
dog p 28.00 rock w 20.40 tree m 29.78 rock e 14.89
rock t 28.44 cat u 34.18 dog r 11.84 tree x 31.98
cat t 13.07 tree x 23.38 dog l 31.71 dog i 24.04
dog a 25.46 cat j 23.57 cat u 28.35 dog z 22.11
tree o 29.49 tree p 11.57 rock d 16.24 rock z 33.11
dog o 17.24 dog a 10.92 cat e 34.08 dog d 25.55
tree o 33.07 tree g 15.16 cat y 20.30 rock y 14.70
rock o 14.48 null nullrock g 12.14
rock v 32.38 nullrock x 30.39 cat x 25.19
rock b 17.26 tree m 13.11 rock g 33.34 tree u 27.70
 */
