import java.util.Deque;
import java.util.LinkedList;

public class SlidingWindowMax {
    public int[] maxSlidingWindow(int[] nums, int k) {
        int left = 0;
        int right = 0;
        int n = nums.length;
        Deque<Integer> q = new LinkedList<>();
        int[] result = new int[nums.length - k + 1];

        while (right < n) {

            while(!q.isEmpty() && nums[q.getFirst()] < nums[q.getLast()]) {
                q.removeFirst();
            }

            if (!q.isEmpty() && nums[q.getLast()] < nums[right]) {
                q.removeLast();
            }
            q.addLast(right);

            if (right >= k) {
                result[left] = nums[q.getFirst()];
                left++;

                if (q.getFirst() < left) {
                    q.removeFirst();
                }
            }

            right++;
        }

        while(!q.isEmpty() && nums[q.getFirst()] < nums[q.getLast()]) {
            q.removeFirst();
        }
        result[left] = nums[q.getFirst()];

        return result;
    }
}
