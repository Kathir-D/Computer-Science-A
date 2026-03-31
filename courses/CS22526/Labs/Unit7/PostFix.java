package CS22526.Labs.Unit7;

import static java.lang.System.*;

import java.util.Scanner;
//(c) A+ Computer Science
//www.apluscompsci.com

//Name -

import java.util.Stack;

public class PostFix {

  private Stack<Double> stack;
  private String expression;

  public PostFix() {
    stack = new Stack<Double>();
    expression = "";
  }

  public PostFix(String exp) {
    stack = new Stack<Double>();
    expression = exp;
    setExpression(exp);
  }

  public void setExpression(String exp) {
    stack.clear();
    expression = exp;
    char[] arr = exp.toCharArray();
    for (char c : arr) {
      stack.push((double) c);
    }
  }

  public double calc(double one, double two, char op) {
    switch (op) {
      case '+':
        return one + two;
      case '-':
        return one - two;
      case '*':
        return one * two;
      case '/':
        return one / two;
      default:
        return 0;
    }
  }

  public void solve() {
    stack.clear();
    String[] tokens = expression.split(" ");

    for (String token : tokens) {
      if (
        token.equals("+") ||
        token.equals("-") ||
        token.equals("*") ||
        token.equals("/")
      ) {
        double operand2 = stack.pop();
        double operand1 = stack.pop();
        char op = token.charAt(0);
        double value = calc(operand1, operand2, op);
        stack.push(value);
      } else {
        stack.push(Double.parseDouble(token));
      }
    }
  }

  public String toString() {
    return expression + " = " + stack.peek();
  }
}
