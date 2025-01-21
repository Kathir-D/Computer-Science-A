//(c) A+ Computer Science
//www.apluscompsci.com
//Name -
//Date -

public class Unit14b_Histogram {

  private int[] numCount;

  public Unit14b_Histogram(String line, int size) {
    numCount = new int[size];
    reset(line, size);
  }

  public void reset(String line, int size) {
    numCount = new int[size];
    String[] numbers = line.split(" ");
    for (String num : numbers) {
      int value = Integer.parseInt(num);
      if (value >= 0 && value < size) {
        numCount[value]++;
      }
    }
  }

  public void changeCount(int v, int a) {
    if (v >= 0 && v < numCount.length) {
      numCount[v] += a;
    }
  }

  public int getMax() {
    int maxIndex = 0;
    for (int i = 1; i < numCount.length; i++) {
      if (numCount[i] > numCount[maxIndex]) {
        maxIndex = i;
      }
    }
    return maxIndex;
  }

  public String toString() {
    StringBuilder output = new StringBuilder();
    for (int i = 0; i < numCount.length; i++) {
      output.append(i).append(" - ").append(numCount[i]).append(" | ");
    }
    return output.toString().trim();
  }
}

/*
Lab Goal : This lab was designed to teach you how to use an array, create a class, and search for values.
Lab Description : Take a list of numbers and a size. Create an array that size and load in the count of
each number. The array will store how many occurrences of each number exist. Write a max method that will
return the value that occurs the most.
 */
