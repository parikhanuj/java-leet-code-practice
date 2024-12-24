import java.util.PriorityQueue;

public class MergeKSortedLists {
    public ListNode mergeKLists(ListNode[] lists) {
        if (lists.length == 0) return null;
        ListNode sortedHead = new ListNode();
        ListNode dummy = sortedHead;
        ListNode local = lists[0];
        dummy.next = local;
        for (int i = 1; i < lists.length; i++) {
            local = merge2SortedLists(local, lists[i]);
            dummy.next = local;
        }
        return sortedHead.next;
    }

    private ListNode merge2SortedLists(ListNode l1, ListNode l2) {

        ListNode sortedHead = new ListNode();
        ListNode dummy = sortedHead;

        while (l1 != null && l2 != null) {
            if (l1.val > l2.val) {
                dummy.next = l2;
                l2 = l2.next;
            } else {
                dummy.next = l1;
                l1 = l1.next;
            }
            dummy = dummy.next;
        }

        if (l1 != null) {
            dummy.next = l1;
        }

        if (l2 != null) {
            dummy.next = l2;
        }

        return sortedHead.next;
    }

    public ListNode mergeKListsUsingHeap(ListNode[] lists) {
        if (lists.length == 0) return null;

        PriorityQueue<ListNode> minHeap = new PriorityQueue<>((a, b) -> a.val - b.val);
        for (ListNode list : lists) {
            if (list != null) {
                minHeap.offer(list);
            }
        }

        ListNode res = new ListNode(0);
        ListNode cur = res;
        while (!minHeap.isEmpty()) {
            ListNode node = minHeap.poll();
            cur.next = node;
            cur = cur.next;

            node = node.next;
            if (node != null) {
                minHeap.offer(node);
            }
        }
        return res.next;
    }
}
