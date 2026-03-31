package CS22526.Labs.Unit9;

import static java.lang.System.*;

//(c) A+ Computer Science
//www.apluscompsci.com

//Name -

import java.util.*;

public class HistoListRunner {

  public static void main(String[] args) {
    //A A A A B V S E A S A A
    HistoList test = new HistoList();
    test.addLetter('A');
    test.addLetter('A');
    test.addLetter('A');
    test.addLetter('A');
    test.addLetter('B');
    test.addLetter('V');
    test.addLetter('S');
    test.addLetter('E');
    test.addLetter('A');
    test.addLetter('S');
    test.addLetter('A');
    test.addLetter('A');
    System.out.println(test);

    //A B C
    test = new HistoList();
    test.addLetter('A');
    test.addLetter('B');
    test.addLetter('C');
    System.out.println(test);

    //A B C A B C A B C A B C A B C
    test = new HistoList();
    test.addLetter('A');
    test.addLetter('B');
    test.addLetter('C');
    test.addLetter('A');
    test.addLetter('B');
    test.addLetter('C');
    test.addLetter('A');
    test.addLetter('B');
    test.addLetter('C');
    test.addLetter('A');
    test.addLetter('B');
    test.addLetter('C');
    test.addLetter('A');
    test.addLetter('B');
    test.addLetter('C');
    System.out.println(test);
  }
}
