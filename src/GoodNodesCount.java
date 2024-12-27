public class GoodNodesCount {
    private int result = 0;

    public int goodNodes(TreeNode root) {
        calcGoodNodes(root, root.val);
        return result;
    }

    private void calcGoodNodes(TreeNode node, int max) {
        if (node == null)
            return;
        if (node.val >= max) {
            result++;
        }
        if (node.left != null)
            calcGoodNodes(node.left, Math.max(max, node.left.val));
        if (node.right != null)
            calcGoodNodes(node.right, Math.max(max, node.right.val));
    }
}
