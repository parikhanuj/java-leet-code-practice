public class ValidBinarySearchTree {
    public boolean isValidBST(TreeNode root) {
        return isValid(root, null, null);
    }

    private boolean isValid(TreeNode node, Integer leftMin, Integer rightMax) {
        if (node == null) return true;

        if (leftMin != null && node.val >= leftMin) return false;
        if (rightMax != null && node.val <= rightMax) return false;

        return isValid(node.left, node.val, rightMax)
                && isValid(node.right, leftMin, node.val);
    }
}
