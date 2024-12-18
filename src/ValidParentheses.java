import java.util.HashMap;
import java.util.Map;
import java.util.Stack;

public class ValidParentheses {
    public boolean isValid(String s) {
        Map<Character, Character> bracketRevMap = new HashMap<>();
        bracketRevMap.put('}', '{');
        bracketRevMap.put(')', '(');
        bracketRevMap.put(']', '[');
        Stack<Character> stack = new Stack<>();
        if (s.length() % 2 != 0) return false;

        for (int i = 0; i < s.length(); i++) {
            if (bracketRevMap.containsKey(s.charAt(i))) {
                if (!stack.isEmpty() && stack.peek() == bracketRevMap.get(s.charAt(i))) {
                    stack.pop();
                } else {
                    return false;
                }
            } else {
                stack.push(s.charAt(i));
            }
        }

        return stack.isEmpty();
    }
}
