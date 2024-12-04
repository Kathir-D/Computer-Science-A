//(c) A+ Computer Science
//www.apluscompsci.com
//Name -

//design your Ball class
//write all code for your Ball class here
//test your Ball class with the BallRunner

//make a Ball class
//add needed instance variables
//TYPE and CAPACITY are constants

public class Unit12b_Ball {

  private int capacity;
  private int pressure;
  private String color;
  private String type;

  public Unit12b_Ball(int capacity, int pressure, String color, String type) {
    this.capacity = capacity;
    this.pressure = pressure;
    this.color = color;
    this.type = type;
  }

  public double getPressure() {
    return pressure;
  }

  public double getCapacity() {
    return capacity;
  }

  public String getColor() {
    return color;
  }

  public String getType() {
    return type;
  }

  public boolean isFull() {
    return pressure >= capacity;
  }

  public double needsAir() {
    return capacity - pressure;
  }

  public boolean isFlat() {
    return pressure == 0;
  }

  public boolean addAir(int amount) {
    if (pressure + amount > capacity) {
      pressure = capacity;
      return false;
    } else {
      pressure += amount;
      return true;
    }
  }
}
