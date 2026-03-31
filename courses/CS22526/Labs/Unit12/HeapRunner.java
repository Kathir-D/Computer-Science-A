package CS22526.Labs.Unit12;

import static java.lang.System.*;

//(c) A+ Computer Science
//www.apluscompsci.com

//Name -

import java.util.ArrayList;

public class HeapRunner {

  public static void main(String[] args) {
    Heap heap = new Heap();

    heap.add(1);
    heap.add(2);
    heap.add(8);
    heap.add(9);
    heap.add(10);
    heap.add(7);
    heap.add(75);
    heap.add(17);
    heap.add(5);

    heap.print();
    heap.remove();
    heap.print();
    heap.remove();
    heap.print();
    heap.remove();
    heap.print();
    heap.remove();
    heap.print();
    heap.remove();
    heap.print();
    heap.remove();
    heap.print();
    heap.remove();

    heap.print();
    heap.add(25);
    heap.print();
    heap.add(35);
    heap.print();
    heap.remove();
    heap.print();
  }
}
