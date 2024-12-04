// https://leetcode.com/problems/minimum-size-subarray-sum/description/

public class MinSizeSubArraySum {
    public int minSubArrayLen(int target, int[] nums) {
        int minSubArrayLength = nums.length + 1;
        int p1 = 0, p2 = 0, currentSubArrayLength = 0, currentWindowSum = 0;

        while (p2 < nums.length) {
            currentWindowSum += nums[p2];
            p2++;
            currentSubArrayLength++;
            while (currentWindowSum >= target) {
                minSubArrayLength = Math.min(currentSubArrayLength, minSubArrayLength);
                currentWindowSum -= nums[p1];
                p1++;
                currentSubArrayLength--;
            }
        }

        return minSubArrayLength == nums.length + 1 ? 0 : minSubArrayLength;
    }
}
