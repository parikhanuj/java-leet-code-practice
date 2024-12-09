import java.util.*;

public class ThreeSum {
    private final List<List<Integer>> allTriplets = new ArrayList<>();

    public List<List<Integer>> threeSum(int[] nums) {
        Arrays.sort(nums);
        for (int i = 0; i < nums.length - 2; i++) {
            if (i > 0 && nums[i - 1] == nums[i]) {
                continue;
            }
            twoSums(nums, i + 1, -nums[i]);
        }
        return allTriplets;
    }

    private void twoSums(int[] nums, int startIndex, int target) {
        int leftPointer = startIndex;
        int rightPointer = nums.length - 1;
        while (leftPointer < rightPointer) {
            int currentSum = nums[leftPointer] + nums[rightPointer];
            if (currentSum == target) {
                allTriplets.add(List.of(-1 * target, nums[leftPointer], nums[rightPointer]));
                leftPointer++;
                rightPointer--;
                while (leftPointer < rightPointer && nums[leftPointer - 1] == nums[leftPointer]) {
                    leftPointer++;
                }
                while (leftPointer < rightPointer && nums[rightPointer + 1] == nums[rightPointer]) {
                    rightPointer--;
                }
            } else if (currentSum > target) {
                rightPointer--;
            } else {
                leftPointer++;
            }
        }
    }
}
