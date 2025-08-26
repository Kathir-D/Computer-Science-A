package CS22526.Labs.Unit1;

//(c) A+ Computer Science
//www.apluscompsci.com
//Name -

import java.io.*;
import java.util.*;

public class WordSearch {

  private String[][] m;

  public WordSearch(int size, String str) {
    m = new String[size][size];
    int index = 0;

    for (int i = 0; i < size; i++) {
      for (int j = 0; j < size; j++) {
        m[i][j] = (str.charAt(index)) + "";
        index++;
      }
    }
  }

  public boolean isFound(String word) {
    if (word.length() == 0) return false;

    for (int i = 0; i < m.length; i++) {
      for (int j = 0; j < m[i].length; j++) {
        if (
          checkRight(word, i, j) ||
          checkLeft(word, i, j) ||
          checkUp(word, i, j) ||
          checkDown(word, i, j) ||
          checkDiagUpRight(word, i, j) ||
          checkDiagUpLeft(word, i, j) ||
          checkDiagDownLeft(word, i, j) ||
          checkDiagDownRight(word, i, j)
        ) {
          return true;
        }
      }
    }

    return false;
  }

  public boolean checkRight(String w, int r, int c) {
    if (c + w.length() > m[r].length) return false;

    StringBuilder sb = new StringBuilder();

    for (int i = c; i < c + w.length(); i++) {
      sb.append(m[r][i]);
    }

    if (sb.toString().equals(w)) return true;

    return false;
  }

  public boolean checkLeft(String w, int r, int c) {
    if (c - w.length() + 1 < 0) return false;

    StringBuilder sb = new StringBuilder();

    for (int i = c; i > c - w.length(); i--) {
      sb.append(m[r][i]);
    }

    if (sb.toString().equals(w)) return true;

    return false;
  }

  public boolean checkUp(String w, int r, int c) {
    if (r - w.length() + 1 < 0) return false;

    StringBuilder sb = new StringBuilder();

    for (int i = r; i > r - w.length(); i--) {
      sb.append(m[i][c]);
    }

    if (sb.toString().equals(w)) return true;

    return false;
  }

  public boolean checkDown(String w, int r, int c) {
    if (r + w.length() > m.length) return false;

    StringBuilder sb = new StringBuilder();

    for (int i = r; i < r + w.length(); i++) {
      sb.append(m[i][c]);
    }

    if (sb.toString().equals(w)) return true;

    return false;
  }

  public boolean checkDiagUpRight(String w, int r, int c) {
    if(c+w.length() > m.length || r-w.length() + 1 < 0) return false;

    StringBuilder sb = new StringBuilder();

    for (int i = 0; i < w.length(); i++) {
      sb.append(m[r-i][c+i]);
    }

    return sb.toString().equals(w);
  }

  public boolean checkDiagUpLeft(String w, int r, int c) {
    if (r - w.length() + 1 < 0 || c - w.length() + 1 < 0) return false;

    StringBuilder sb = new StringBuilder();

    for (int i = 0; i < w.length(); i++) {
      sb.append(m[r-i][c-i]);
    }

    return sb.toString().equals(w);
  }

  public boolean checkDiagDownLeft(String w, int r, int c) {
    if (r + w.length() > m.length || c - w.length() + 1 < 0) return false;

    StringBuilder sb = new StringBuilder();

    for (int i = 0; i < w.length(); i++) {
      sb.append(m[r+i][c-i]);
    }

    return sb.toString().equals(w);
  }

  public boolean checkDiagDownRight(String w, int r, int c) {
    if (r + w.length() > m.length || c + w.length() > m[0].length) return false;

    StringBuilder sb = new StringBuilder();

    for (int i = 0; i < w.length(); i++) {
      sb.append(m[r+i][c+i]);
    }

    return sb.toString().equals(w);
  }

  public String toString() {
    StringBuilder sb = new StringBuilder();
    for (String[] row : m) {
      for (String val : row) {
        sb.append(val).append(" ");
      }
      sb.append("\n");
    }
    return sb.toString();
  }
}
