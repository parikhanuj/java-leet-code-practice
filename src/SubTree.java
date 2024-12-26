public class SubTree {
    public boolean isSubtree(TreeNode root, TreeNode subRoot) {
        if (root == null && subRoot == null) return true;
        if (root == null || subRoot == null) return false;

        boolean rootNode = areTreesSame(root, subRoot);
        boolean left = isSubtree(root.left, subRoot);
        boolean right = isSubtree(root.right, subRoot);

        return rootNode || left || right;
    }

    private boolean areTreesSame(TreeNode p, TreeNode q) {
        if (p == null && q == null) return true;
        if (p == null || q == null || p.val != q.val) return false;

        return areTreesSame(p.left, q.left) && areTreesSame(p.right, q.right);
    }
}
