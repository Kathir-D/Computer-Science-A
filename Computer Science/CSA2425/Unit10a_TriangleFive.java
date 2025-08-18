package CSA2425; //(c) A+ Computer Science

//www.apluscompsci.com
//Name -

public class Unit10a_TriangleFive {

  public static String go(int amount, char letter) {
    //		String[] arr = new String[26];
    //		String output="";
    //
    //        for (int i = 0; i < 26; i++) {
    //            arr[i] =  ("A" + i);
    //        }
    //
    //		int start = letter - 'A';
    //
    //		for (int i = 0; i < amount; i++) {
    //			for (int j = 0; j < amount - i; j++) {
    //				for (int k = 0; k < amount - j; k++) {
    //					output += arr[(start + j) % 26];
    //				} if (j < amount - i - 1) {
    //					output += " ";
    //				}
    //			}
    //			output += "\n";
    //		}
    //
    //		return output;

    StringBuilder output = new StringBuilder();

    int start = letter - 'A';

    for (int i = 0; i < amount; i++) {
      for (int j = 0; j < amount - i; j++) {
        char cur = (char) ('A' + ((start + j) % 26));
        output.append(String.valueOf(cur).repeat(amount - j));
        if (j < amount - i - 1) {
          output.append(" ");
        }
      }
      output.append("\n");
    }

    return output.toString();
  }
}
/*

Page
1
of 2
© A+ Computer Science – Nested Loops - www.apluscompsci.com
Lab Goal : This lab was designed to teach you how to use nested loops. You will also learn how to make
some cool shapes.
Lab Description : Used nested loops to print out a letter pattern as shown below. Wrap around the
letters from Z to A.
Sample Data :
C 4
A 5
B 7
X 6
Z 8
Sample Output :
CCCC DDD EE F
CCCC DDD EE
CCCC DDD
CCCC
AAAAA BBBB CCC DD E
AAAAA BBBB CCC DD
AAAAA BBBB CCC
AAAAA BBBB
AAAAA
BBBBBBB CCCCCC DDDDD EEEE FFF GG H
BBBBBBB CCCCCC DDDDD EEEE FFF GG
BBBBBBB CCCCCC DDDDD EEEE FFF
BBBBBBB CCCCCC DDDDD EEEE
BBBBBBB CCCCCC DDDDD
BBBBBBB CCCCCC
BBBBBBB
XXXXXX YYYYY ZZZZ AAA BB C
XXXXXX YYYYY ZZZZ AAA BB
XXXXXX YYYYY ZZZZ AAA
XXXXXX YYYYY ZZZZ
XXXXXX YYYYY
XXXXXX
ZZZZZZZZ AAAAAAA BBBBBB CCCCC DDDD EEE FF G
ZZZZZZZZ AAAAAAA BBBBBB CCCCC DDDD EEE FF
ZZZZZZZZ AAAAAAA BBBBBB CCCCC DDDD EEE
ZZZZZZZZ AAAAAAA BBBBBB CCCCC DDDD
ZZZZZZZZ AAAAAAA BBBBBB CCCCC
ZZZZZZZZ AAAAAAA BBBBBB
ZZZZZZZZ AAAAAAA
Files Needed ::
TriangleFive.java
TriangleFiveRunner.java
A+ Computer Science TRIANGLE FIVE
© A+ Computer Science – Nested Loops - www.apluscompsci.com
ZZZZZZZZ

 */
