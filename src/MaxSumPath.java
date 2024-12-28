public class MaxSumPath {
    public int maxPathSum(TreeNode root) {
        int[] result = new int[]{root.val};

        dfs(root, result);

        return result[0];
    }

    private int dfs(TreeNode node, int[] result) {
        if (node == null) return 0;

        int leftMax = Math.max(dfs(node.left, result), 0);
        int rightMax = Math.max(dfs(node.right, result), 0);

        int sum = node.val + Math.max(leftMax, rightMax);
        result[0] = Math.max(result[0], node.val + leftMax + rightMax);

        return sum;
    }
}
