import java.util.HashMap;
import java.util.Map;

/*
// Definition for a Node.
*/
class Node {
    int val;
    Node next;
    Node random;

    public Node(int val) {
        this.val = val;
        this.next = null;
        this.random = null;
    }
}

class Solution {
    public Node DeepCopyLL(Node head) {
        Map<Node, Node> valToNodeMap = new HashMap<>();
        Node dummy = new Node(-1);
        Node copy = dummy;
        while (head != null) {
            if (valToNodeMap.containsKey(head)) {
                dummy.next = valToNodeMap.get(head);
            } else {
                Node newNode = new Node(head.val);
                valToNodeMap.put(head, newNode);
                dummy.next = newNode;
            }

            if (head.random != null) {
                if (valToNodeMap.containsKey(head.random)) {
                    dummy.next.random = valToNodeMap.get(head.random);
                } else {
                    Node newNode = new Node(head.random.val);
                    valToNodeMap.put(head.random, newNode);
                    dummy.next.random = newNode;
                }
            } else {
                dummy.next.random = null;
            }
            dummy = dummy.next;
            head = head.next;
        }
        return copy.next;
    }
}
