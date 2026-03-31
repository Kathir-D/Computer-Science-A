package CSA2425; //(c) A+ Computer Science

//www.apluscompsci.com
//Name -

import java.util.ArrayList;

// In progress

public class Unit16b_ExpressionSolver {

  private int ans;
  private ArrayList<String> eqList;

  public Unit16b_ExpressionSolver(String s) {
    eqList = new ArrayList<>();
    ans = 0;
    setExpression(s);
  }

  public void setExpression(String s) {
    eqList.clear();
    for (String x : s.split(" ")) {
      eqList.add(x);
    }
    System.out.println(eqList);
  }

  public void solveExpression() {
    while (eqList.contains("*") || eqList.contains("/")) {
      int location = eqList.indexOf("*");
      if (location == -1) location = eqList.indexOf("/");

      int operand1 = Integer.parseInt(eqList.get(location - 1));
      int operand2 = Integer.parseInt(eqList.get(location + 1));
      if (
        location + 2 < eqList.size() && eqList.get(location + 2).equals("-")
      ) {
        operand2 = -operand2;
        eqList.remove(location + 2);
      }
      String operator = eqList.get(location);
      if (operator.equals("*")) {
        ans = operand1 * operand2;
      } else {
        if (operand2 == 0) {
          throw new ArithmeticException("Division by zero");
        }
        ans = operand1 / operand2;
      }

      eqList.remove(location - 1);
      eqList.remove(location - 1);
      eqList.set(location - 1, "" + ans);
    }

    while (eqList.contains("+") || eqList.contains("-")) {
      int location = eqList.indexOf("+");
      if (location == -1) location = eqList.indexOf("-");

      int operand1 = Integer.parseInt(eqList.get(location - 1));
      int operand2 = Integer.parseInt(eqList.get(location + 1));
      if (
        location + 2 < eqList.size() && eqList.get(location + 2).equals("-")
      ) {
        operand2 = -operand2;
        eqList.remove(location + 2);
      }
      String operator = eqList.get(location);
      if (operator.equals("+")) {
        ans = operand1 + operand2;
      } else {
        ans = operand1 - operand2;
      }

      eqList.remove(location - 1);
      eqList.remove(location - 1);
      eqList.set(location - 1, "" + ans);
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
