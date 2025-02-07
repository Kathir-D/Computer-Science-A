import java.util.ArrayList;

public class Unit16a_FlowerGarden {

  private ArrayList<String> flowers;

  Unit16a_FlowerGarden() {
    flowers = new ArrayList<String>();
  }

  //write add flower
  public void addFlower(String s) {
    for (String x : flowers) {
      if (x.substring(3).equals(s)) {
        int count = Integer.parseInt(x.substring(0, 2));
        count++;
        flowers.remove(x);
        flowers.add(String.format("%02d ", count) + s);
        return;
      }
    }
    flowers.add("01 " + s);
  }

  //write get count
  public int getCount(String s) {
    for (String x : flowers) {
      if (x.substring(3).equals(s)) {
        return Integer.parseInt(x.substring(0, 2));
      }
    }
    return 0;
  }

  //write get flower name
  public String getFlowerName(int x) {
    if (!inRange(x)) {
      return "Out of Range";
    }
    return flowers.get(x).substring(3);
  }

  //write in range
  public boolean inRange(int x) {
    if (x >= flowers.size()) {
      return false;
    }
    return true;
  }

  //write find flower
  public int findFlower(String s) {
    for (String x : flowers) {
      if (x.substring(3).equals(s)) {
        return flowers.indexOf(x);
      }
    }
    return -1;
  }

  //write max flower
  public String maxFlower() {
    int max = Integer.MIN_VALUE;
    String maxFlower = "";

    for (String x : flowers) {
      if (Integer.parseInt(x.substring(0, 2)) > max) {
        max = Integer.parseInt(x.substring(0, 2));
        maxFlower = x.substring(3);
      }
    }

    return flowers.get(findFlower(maxFlower));
  }

  public String toString() {
    return flowers.toString();
  }
}
/*
Lab Goal : This lab was designed to teach you more class and methods using ArrayList and String.
Lab Description :
Create a class that stores an ArrayList of Strings.
The Strings store 2 bits of information about flowers.
The Strings store a count and a name.
You will need to use ParseInt.
“14 Daisy” there are 14 daisies.
“01 Rose” there is one rose.
There are numerous methods.
In order for this program to work correctly, several of the methods must call other methods.
For this problem, you need to make a FlowerGarden class.
The first and only instance variable will be an ArrayList < String >.
The FlowerGarden class will have one constructor that creates a new ArrayList.
The ArrayList stores Strings that store Flower information.
Each String has a count and a flower name.
"14 rose" there are 14 rose flowers in the garden.
The FlowerGarden class will have 8 methods.
The addFlower method adds a new flower to the arraylist - adds “00 flower name”
The findFlower will return the position in the arraylist where the flower is found
The getCount method returns how many of the particular flower is in the garden
The getFlowerName method returns the flower name at a particular position
The maxFlower method returns the name of the flower that exists the garden the most
The inRange method checks to see if a value is in a specified range
The ToString method will return the arraylist instance variable.
A+ Computer Science FLOWER
GARDEN
© A+ Computer Science – ArrayList - www.apluscompsci.com

Sample Output :
[01 rose, 01 poppy, 01 sunflower, 02 daisy]
3
-1
2
0
rose
out of range
02 daisy
[01 sunflower, 03 rose, 03 poppy, 02 gardenia, 06 daisy, 03 lily]
5
-1
6
0
gardenia
out of range
06 daisy
Press any key to continue...
 */
