public class MaxConsecutiveOnes {
    public int longestOnes(int[] nums, int k) {
        int max = 0;
        int count0 = 0;
        int p1 = 0;
        for (int p2 = 0; p2 < nums.length; p2++) {
            if (nums[p2] == 0) {
                count0++;
            }
            while (count0 > k) {
                if (nums[p1] == 0) {
                    count0--;
                }
                p1++;
            }
            max = Math.max(max, p2 - p1 + 1);
        }
        return max;
    }
}
