import java.util.*;

public class Postfix {

  /**
   * Evaluates a postfix expression.
   * 
   * @param expression the postfix expression to evaluate.
   * @return the result of evaluating the expression.
   * @throws IllegalArgumentException if the expression is not a valid postfix
   *                                  expression.
   * @throws ArithmeticException      if the expression contains a division by
   *                                  zero.
   */
  public static int evaluatePostfix(String expression) {
    String[] tokens = expression.split("\\s+");
    LinkStack<Integer> stack = new LinkStack<Integer>();

    for (String token : tokens) {
      if (token.matches("\\d+")) {
        // token is a number
        int value = Integer.parseInt(token);
        stack.push(value);
      } else if (token.equals("+")) {
        // token is addition operator
        int operand2 = stack.pop();
        int operand1 = stack.pop();
        int result = operand1 + operand2;
        stack.push(result);
      } else if (token.equals("-")) {
        // token is subtraction operator
        int operand2 = stack.pop();
        int operand1 = stack.pop();
        int result = operand1 - operand2;
        stack.push(result);
      } else if (token.equals("*")) {
        // token is multiplication operator
        int operand2 = stack.pop();
        int operand1 = stack.pop();
        int result = operand1 * operand2;
        stack.push(result);
      } else if (token.equals("/")) {
        // token is division operator
        int operand2 = stack.pop();
        int operand1 = stack.pop();
        if (operand2 == 0) {
          throw new ArithmeticException("Division by zero");
        }
        int result = operand1 / operand2;
        stack.push(result);
      } else {
        throw new IllegalArgumentException("Invalid token: " + token);
      }
    }

    if (stack.size() != 1) {
      throw new IllegalArgumentException("Invalid postfix expression");
    }

    return stack.top();
  }

  public static void main(String[] args) {

    String expression1 = "10 20 * 30 +";
    int result1 = evaluatePostfix(expression1);
    System.out.println("Postfix expression: " + expression1);
    System.out.println("Expected result: " + (230));
    System.out.println("Actual result: " + result1);
    System.out.println();

    String expression2 = "15 7 1 1 + - / 3 * 2 1 1 + + -";
    int result2 = evaluatePostfix(expression2);
    System.out.println("Postfix expression: " + expression2);
    System.out.println("Expected result: " + (5));
    System.out.println("Actual result: " + result2);

    String expression3 = "5 3 2 * + 4 - 5 +";
    int result3 = evaluatePostfix(expression3);
    System.out.println("Postfix expression: " + expression3);
    System.out.println("Expected result: " + (12));
    System.out.println("Actual result: " + result3);

  }
}
