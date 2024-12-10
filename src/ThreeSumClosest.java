import java.util.Arrays;

public class ThreeSumClosest {
    private int closest;

    public int threeSumClosest(int[] nums, int target) {
        closest = nums[0] + nums[1] + nums[2];
        Arrays.sort(nums);
        for (int i = 0; i < nums.length - 2; i++) {
            closestTarget(nums, i, target);
        }
        return closest;
    }

    private void closestTarget(int[] nums, int currentIndex, int target) {
        int left = currentIndex + 1;
        int right = nums.length - 1;
        while (left < right) {
            int currentSum = nums[currentIndex] + nums[left] + nums[right];
            if (currentSum > target) {
                right--;
            } else if (currentSum < target) {
                left++;
            } else {
                closest = target;
                break;
            }
            closest = Math.abs(target - currentSum) < Math.abs(target - closest) ? currentSum : closest;
        }
    }
}
