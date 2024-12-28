public class ConstructBinaryTree {
    public TreeNode buildTree(int[] preorder, int[] inorder) {
        List<Integer> preList = Arrays.stream(preorder).boxed().collect(Collectors.toList());
        List<Integer> inList = Arrays.stream(inorder).boxed().collect(Collectors.toList());

        return buildSubTree(inList, preList);
    }

    private TreeNode buildSubTree(List<Integer> i, List<Integer> p) {
        if (i.size() == 0 && p.size() == 0) return null;
        TreeNode subRoot = new TreeNode(p.get(0));
        int rootIndex = i.indexOf(p.get(0));
        subRoot.left = buildSubTree(i.subList(0, rootIndex), p.subList(1, rootIndex + 1));
        subRoot.right = buildSubTree(i.subList(rootIndex + 1, i.size()), p.subList(rootIndex + 1, p.size()));
        return subRoot;
    }
}
