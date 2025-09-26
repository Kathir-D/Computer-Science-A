package CS22526.Labs.Unit3;

import java.awt.Color;
import java.awt.Font;
//(c) A+ Computer Science
//www.apluscompsci.com
//Name -

import java.awt.Graphics;

public class Grid {

  private Cell[][] grid;

  public Grid() {
    setSize(0, 0);
  }

  public Grid(int rows, int cols) {
    setSize(rows, cols);
  }

  public void setSize(int rows, int cols) {
    grid = new Cell[rows][cols];
  }

  public void setSpot(int row, int col, Cell val) {
    grid[row][col] = val;
  }

  public Cell getSpot(int row, int col) {
    return grid[row][col];
  }

  public int getNumRows() {
    return grid.length;
  }

  public int getNumCols() {
    return grid[0].length;
  }

  public boolean drawGrid(Graphics window) {
    boolean full = true;

    for (int r = 0; r < grid.length; r++) {
      for (int c = 0; c < grid[r].length; c++) {
        Cell currentCell = grid[r][c];
        if (currentCell != null) {
          currentCell.draw(window);
        } else {
          full = false;
        }
      }
    }
    return full;
  }

  public String toString() {
    String output = "";

    for (int r = 0; r < grid.length; r++) {
      for (int c = 0; c < grid[r].length; c++) {
        if (grid[r][c] != null) {
          output += grid[r][c].toString() + " ";
        } else {
          output += "null ";
        }
      }
      output += "\n";
    }
    return output;
  }
}
