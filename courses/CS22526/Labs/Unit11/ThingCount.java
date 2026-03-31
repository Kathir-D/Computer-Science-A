package CS22526.Labs.Unit11;

import java.util.Objects;

public class ThingCount implements Comparable {

  private int count;
  private Object thing;

  public ThingCount() {
    this(null, 0);
  }

  public ThingCount(Object thang, int cnt) {
    thing = thang;
    count = cnt;
  }

  public int getCount() {
    return count;
  }

  public void setCount(int cnt) {
    count = cnt;
  }

  public Object getThing() {
    return thing;
  }

  public void setThing(Object obj) {
    thing = obj;
  }

  public boolean equals(Object obj) {
    if (!(obj instanceof ThingCount)) {
      return false;
    }
    ThingCount other = (ThingCount) obj;
    return count == other.count && Objects.equals(thing, other.thing);
  }

  public int compareTo(Object obj) {
    if (obj == null) {
      return 1;
    }
    Object otherThing = obj;
    if (obj instanceof ThingCount) {
      otherThing = ((ThingCount) obj).thing;
    }

    String thisValue = String.valueOf(thing);
    String otherValue = String.valueOf(otherThing);
    return Integer.compare(thisValue.compareTo(otherValue), 0);
  }

  public String toString() {
    return String.valueOf(thing) + " - " + count;
  }
}
