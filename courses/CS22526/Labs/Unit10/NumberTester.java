package CS22526.Labs.Unit10;

import java.io.*;
import java.util.*;

//(c) A+ Computer Science
//www.apluscompsci.com

//Name -

public class NumberTester {
    public static void main(String[] args) {
        try (Scanner fileScanner = new Scanner(new File("courses/CS22526/Labs/Unit10/numbers.dat"))) {
            try {
                Number one = new Number(fileScanner.nextInt());
                System.out.println(one.hashCode());

                Number two = new Number(fileScanner.nextInt());
                System.out.println(two.hashCode());

                Number three = new Number(fileScanner.nextInt());
                System.out.println(three.hashCode());
            } catch (InputMismatchException e) {
                System.out.println("Error: numbers.dat contains non-integer values.");
                return;
            }
        } catch (FileNotFoundException e) {
            System.out.println("Error: numbers.dat was not found.");
        }
    }
}
