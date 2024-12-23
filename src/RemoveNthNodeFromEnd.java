public class RemoveNthNodeFromEnd {
    public ListNode removeNthFromEnd(ListNode head, int n) {
        ListNode left = head;
        ListNode right = head;
        ListNode prev = new ListNode();

        while (n > 0) {
            right = right.next;
            n--;
        }

        if (right == null) {
            return head.next;
        }

        while (right != null) {
            prev = left;
            left = left.next;
            right = right.next;
        }

        prev.next = left != null ? left.next : null;

        return head;
    }
}
