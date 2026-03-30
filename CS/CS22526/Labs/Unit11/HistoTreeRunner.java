package CS.CS22526.Labs.Unit11;

//(c) A+ Computer Science
//www.apluscompsci.com

//Name -

import static java.lang.System.*;

public class HistoTreeRunner {

  public static void main(String[] args) {
    HistoTree test = new HistoTree();
    test.addData('A');
    test.addData('A');
    test.addData('A');
    test.addData('A');
    test.addData('B');
    test.addData('V');
    test.addData('S');
    test.addData('E');
    test.addData('A');
    test.addData('S');
    test.addData('A');
    test.addData('A');
    test.addData('V');
    test.addData('S');
    test.addData('E');
    test.addData('A');
    System.out.println(test);

    test = new HistoTree();
    test.addData(1);
    test.addData(2);
    test.addData(3);
    test.addData(11);
    test.addData(22);
    test.addData(32);
    test.addData(1);
    test.addData(22);
    test.addData(13);
    System.out.println(test);

    test = new HistoTree();
    test.addData("abc");
    test.addData("ead");
    test.addData("xyz");
    test.addData("xyz");
    test.addData("abc");
    test.addData("ead");
    test.addData("abc");
    test.addData("2342");
    test.addData("x2y2z");
    System.out.println(test);
  }
}
