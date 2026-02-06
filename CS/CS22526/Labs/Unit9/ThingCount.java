package CS22526.Labs.Unit9;
//(c) A+ Computer Science
//www.apluscompsci.com

//Name -

public class ThingCount implements Comparable {

  private int count;
  private Object thing;

  public ThingCount() {
    this.count = 0;
    this.thing = null;
  }

  public ThingCount(Object thang, int cnt) {
    this.count = cnt;
    this.thing = thang;
  }

  public int getCount() {
    return count;
  }

  public void setCount(int cnt) {
    count = cnt;
  }

  public void setThing(Object obj) {
    thing = obj;
  }

  public Object getThing() {
    return thing;
  }

  public boolean equals(Object obj) {
    ThingCount other = (ThingCount) obj;
    return false;
  }

  public int compareTo(Object obj) {
    ThingCount other = (ThingCount) obj;
    return -1;
  }

  public String toString() {
    return "" + getThing() + " - " + getCount();
  }
}
