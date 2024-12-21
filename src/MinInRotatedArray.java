public class MinInRotatedArray {
    public int findMin(int[] nums) {
        int left = 0;
        int right = nums.length - 1;

        while (left < right) {
            int midPoint = left + (right - left) / 2;
            if (nums[midPoint] < nums[right]) {
                right = midPoint;
            } else {
                left = midPoint + 1;
            }
        }

        return nums[left];
    }
}
