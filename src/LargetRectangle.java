class LargestRectange {
    public int largestRectangleArea(int[] heights) {
        int maxArea = 0;
        Stack<int[]> stack = new Stack<>();

        if (heights.length == 1) {
            return heights[0];
        }

        for (int i = 0; i < heights.length; i++) {
            int[] currentBar = new int[] { heights[i], i };
            int indexForCurrentBar = currentBar[1];
            while (!stack.isEmpty() && stack.peek()[0] > currentBar[0]) {
                int[] topBar = stack.pop();
                maxArea = Math.max(maxArea, topBar[0] * (currentBar[1] - topBar[1]));
                indexForCurrentBar = topBar[1];
            }
            currentBar[1] = indexForCurrentBar;
            stack.add(currentBar);
        }

        while (!stack.isEmpty()) {
            int[] topBar = stack.pop();
            maxArea = Math.max(maxArea, topBar[0] * (heights.length - topBar[1]));
        }

        return maxArea;
    }
}
