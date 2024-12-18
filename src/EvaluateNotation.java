import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Objects;
import java.util.Stack;

public class EvaluateNotation {
  public int evalRPN(String[] tokens) {
    Stack<String> expStore = new Stack<>();
    List<String> operators = new ArrayList<>(Arrays.asList("+", "-", "*", "/"));
    for (String token : tokens) {
      expStore.add(token);
      while (operators.contains(expStore.peek())) {
        String operator = expStore.pop();
        int n1 = Integer.parseInt(expStore.pop());
        int n2 = Integer.parseInt(expStore.pop());
        int result = evaluateExpression(operator, n1, n2);
        expStore.add(Integer.toString(result));
      }
    }
    return Integer.parseInt(expStore.peek());
  }

  private int evaluateExpression(String operator, int n1, int n2) {
    if (Objects.equals(operator, "+")) return n1 + n2;
    else if (Objects.equals(operator, "-")) return n2 - n1;
    else if (Objects.equals(operator, "*")) return n2 * n1;
    else return n2/n1;
  }

}