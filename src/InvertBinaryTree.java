import java.util.LinkedList;
import java.util.Queue;

public class InvertBinaryTree {
    public TreeNode invertTree(TreeNode root) {
        Queue<TreeNode> queue = new LinkedList<>();
        queue.offer(root);

        while (!queue.isEmpty()) {
            TreeNode qNode = queue.poll();
            TreeNode temp = qNode.left;
            qNode.left = qNode.right;
            qNode.right = temp;

            if (qNode.left != null) {
                queue.offer(qNode.left);
            }

            if (qNode.right != null) {
                queue.offer(qNode.right);
            }
        }

        return root;
    }
}
