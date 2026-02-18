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
    return thing.toString().equals(obj.toString());
  }

  public int compareTo(Object obj) {
    if (obj instanceof ThingCount) {
      ThingCount other = (ThingCount) obj;
      if (thing.getClass() != other.getThing().getClass()) {
        throw new RuntimeException("both objects are not of the same type");
      }
      return thing.toString().compareTo(other.getThing().toString());
    }
    return thing.toString().compareTo(obj.toString());
  }

  public String toString() {
    return "" + getThing() + " - " + getCount();
  }
}
