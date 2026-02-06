package CS22526.Labs.Unit9;

//(c) A+ Computer Science
//www.apluscompsci.com

//Linkable interface

public interface Linkable {
  Comparable getValue();
  Linkable getNext();
  void setNext(Linkable next);
  void setValue(Comparable value);
}
