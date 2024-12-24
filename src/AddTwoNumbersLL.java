/**
 * Definition for singly-linked list.
 * public class ListNode {
 *     int val;
 *     ListNode next;
 *     ListNode() {}
 *     ListNode(int val) { this.val = val; }
 *     ListNode(int val, ListNode next) { this.val = val; this.next = next; }
 * }
 */
class addTwoNumbersLL {
    public ListNode addTwoNumbers(ListNode l1, ListNode l2) {
        boolean carryOne = false;
        ListNode dummy = new ListNode();
        ListNode result = dummy;
        while (l1 != null && l2 != null) {
            int sum = l1.val + l2.val + (carryOne ? 1 : 0);
            if (sum > 9) {
                carryOne = true;
            } else {
                carryOne = false;
            }
            dummy.next = new ListNode(sum % 10);
            dummy = dummy.next;
            l1 = l1.next;
            l2 = l2.next;
        }
        while (l2 != null) {
            int sum = l2.val + (carryOne ? 1 : 0);
            if (sum > 9) {
                carryOne = true;
            } else {
                carryOne = false;
            }
            dummy.next = new ListNode(sum % 10);
            dummy = dummy.next;
            l2 = l2.next;
        }

        while (l1 != null) {
            int sum = l1.val + (carryOne ? 1 : 0);
            if (sum > 9) {
                carryOne = true;
            } else {
                carryOne = false;
            }
            dummy.next = new ListNode(sum % 10);
            dummy = dummy.next;
            l1 = l1.next;
        }

        if (carryOne) {
            dummy.next = new ListNode(1);
        }
        return result.next;
    }
}