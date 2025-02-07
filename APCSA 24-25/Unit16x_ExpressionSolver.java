//(c) A+ Computer Science
//www.apluscompsci.com
//Name -

import java.util.ArrayList;
// In progress

public class Unit16x_ExpressionSolver {

  private int ans;
  private ArrayList<String> eqList;

  public Unit16x_ExpressionSolver(String s) {
    eqList = new ArrayList<>();
    ans = 0;
    setExpression(s);
  }

  public void setExpression(String s) {
    for (String x : s.split(" ")) {
      eqList.add(x.replaceAll("\\s", ""));
    }
    System.out.println(eqList);
  }

  public void solveExpression() {
    /*
    while there are * and / symbols
		{
		find the 1st * or / operator
		get the first operand
		get the second operand
		get the operator
		calc the answer
		remove the first operand
		remove the operator
		replace the 2nd operand with the new answer
		}
		do the same thing for + and -
    */
    while (eqList.contains("*") || eqList.contains("/")) {
      int index = eqList.indexOf("*");
      if (index == -1) {
        index = eqList.indexOf("/");
      }
      int first = Integer.parseInt(eqList.get(index - 1));
      int second = Integer.parseInt(eqList.get(index + 1));
      String operator = eqList.get(index);
      int answer = 0;
      if (operator.equals("*")) {
        answer = first * second;
      } else {
        answer = first / second;
      }
      eqList.remove(index - 1);
      eqList.remove(index - 1);
      eqList.remove(index - 1);
      eqList.add(index - 1, "" + answer);
    }
  }

  public String toString() {
    solveExpression();
    return "" + ans;
  }
}
/*
Lab Goal : This lab was designed to teach you more about the ArrayList class.
Lab Description : Take an expression and solve it. For instance, if you were given 3 + 4 * 5, you
should come to the answer of 23. This would require that you handle the multiplication before the addition.
Sample Data :
3 + 5
3 * 5
3 - 5
3 / 5
5 / 5 * 2 + 8 / 2 + 5
5 * 5 + 2 / 2 - 8 + 5 * 5 – 2
Sample Output :
3 + 5 = 8
3 * 5 = 15
3 - 5 = -2
3 / 5 = 0
5 / 5 * 2 + 8 / 2 + 5 = 11
5 * 5 + 2 / 2 - 8 + 5 * 5 - 2 = 41
EXPRESSION SOLVER ALGORITHM
while there are * and / symbols
{
find the 1st * or / operator
get the first operand
get the second operand
get the operator
calc the answer
remove the first operand
remove the operator
replace the 2nd operand with the new answer
}
do the same thing for + and -
 */
