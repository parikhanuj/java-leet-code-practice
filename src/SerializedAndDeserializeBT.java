public class SerializedAndDeserializeBT {
    // Encodes a tree to a single string.
    public String serialize(TreeNode root) {
        if (root == null)
            return "N";

        StringBuilder serializeSB = new StringBuilder();
        Queue<TreeNode> queue = new LinkedList<>();
        queue.offer(root);
        while (!queue.isEmpty()) {
            TreeNode node = queue.poll();
            if (node == null) {
                serializeSB.append("N,");
            } else {
                serializeSB.append(node.val).append(",");
                queue.offer(node.left);
                queue.offer(node.right);
            }
        }

        return serializeSB.toString();
    }

    // Decodes your encoded data to tree.
    public TreeNode deserialize(String data) {
        if (data == "N") return null;
        List<TreeNode> deserializedArray = Arrays
                .stream(data.split(","))
                .map(s -> s.equals("N") ? null : new TreeNode(Integer.parseInt(s)))
                .collect(Collectors.toList());
        int index = 0;
        Queue<TreeNode> queue = new LinkedList<>();
        TreeNode root = deserializedArray.get(index++);
        queue.add(root);
        while (!queue.isEmpty()) {
            TreeNode n = queue.poll();
            n.left = deserializedArray.get(index++);
            if (n.left != null) queue.offer(n.left);
            n.right = deserializedArray.get(index++);
            if (n.right != null) queue.offer(n.right);
        }
        return root;
    }
}
