import java.util.Arrays;
import java.util.PriorityQueue;

public class KClosestPointToOrigin {
    public int[][] kClosest(int[][] points, int k) {
        int[][] result = new int[k][2];
        PriorityQueue<int[]> minHeap = new PriorityQueue<>(
                (a, b) -> {
                    int aDistance = a[0] * a[0] + a[1] * a[1];
                    int bDistance = b[0] * b[0] + b[1] * b[1];
                    return aDistance - bDistance;
                }
        );

        for (int[] point: points) {
            minHeap.offer(new int[]{point[0], point[1]});
        }

        for (int i = 0; i < k; ++i) {
            int[] point = minHeap.poll();
            result[i] = new int[]{point[0], point[1]};
        }
        return result;
    }
}
