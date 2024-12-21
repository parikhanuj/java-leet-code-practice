import java.util.Stack;

class DailyTemperatures {
    public int[] dailyTemperatures(int[] temperatures) {
        Stack<int[]> stack = new Stack<>();
        int[] result = new int[temperatures.length];

        for (int i = 0; i < temperatures.length; i++) {
            if (stack.size() == 0) {
                stack.add(new int[]{temperatures[i], i});
            } else {
                while (!stack.isEmpty() && stack.peek()[0] < temperatures[i]) {
                    int[] top = stack.pop();
                    result[top[1]] = i - top[1];
                }
                stack.add(new int[]{temperatures[i], i});
            }
        }
        return result;
    }
}