import java.util.Arrays;

public class BalancedBinaryTree {
    public boolean isBalanced(TreeNode root) {

        if (root == null) return true;

        int left = heightOfNode(root.left);
        int right = heightOfNode(root.right);

        if (Math.abs(left - right) > 1) return false;

        return isBalanced(root.left) && isBalanced(root.right);
    }

    private int heightOfNode(TreeNode node) {
        if (node == null) return 0;

        return 1 + Math.max(heightOfNode(node.left), heightOfNode(node.right));
    }
}
