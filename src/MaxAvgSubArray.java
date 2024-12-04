// https://leetcode.com/problems/maximum-average-subarray-i/

public class MaxAvgSubArray {
    public double findMaxAverage(int[] nums, int k) {
        int windowSum = 0;
        int maxWindowSum = 0;
        for (int p2 = 0; p2 < k; p2++) {
            windowSum += nums[p2];
        }
        maxWindowSum = windowSum;
        for (int p1 = 1, p2 = k; p2 < nums.length; p1++, p2++) {
            windowSum += -nums[p1 - 1] + nums[p2];
            maxWindowSum = Math.max(maxWindowSum, windowSum);
        }
        return (double) maxWindowSum/k ;
    }
}
