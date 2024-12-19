public class GenerateParentheses {
    Stack<String> stack = new Stack<>();
    List<String> result = new ArrayList<>();

    public List<String> generateParenthesis(int n) {
        generate(0, 0, n);
        return result;
    }

    private void generate(int open, int close, int n) {
        if (open == n && close == n) {
            result.add(stack.stream().collect(Collectors.joining("")));
            return;
        }

        if (open < n) {
            stack.add("(");
            generate(open + 1, close, n);
            stack.pop();
        }

        if (close < open) {
            stack.add(")");
            generate(open, close + 1, n);
            stack.pop();
        }
    }
}
