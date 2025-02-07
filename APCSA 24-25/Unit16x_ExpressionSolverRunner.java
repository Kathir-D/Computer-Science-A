//(c) A+ Computer Science
//www.apluscompsci.com
//Name -

public class Unit16x_ExpressionSolverRunner {

  public static void main(String args[]) {
    //add test cases
    Unit16x_ExpressionSolver test = new Unit16x_ExpressionSolver("3 + 5");
    test.solveExpression();
    System.out.println(test);

    test.setExpression("3 * 5");
    test.solveExpression();
    System.out.println(test);

    test.setExpression("3 - 5");
    test.solveExpression();
    System.out.println(test);

    test.setExpression("3 / 5");
    test.solveExpression();
    System.out.println(test);

    test.setExpression("5 / 5 * 2 + 8 / 2 + 5");
    test.solveExpression();
    System.out.println(test);

    test.setExpression("5 * 5 + 2 / 2 - 8 + 5 * 5 - 2");
    test.solveExpression();
    System.out.println(test);
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
