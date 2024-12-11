// https://leetcode.com/problems/4sum/description/

import java.util.*;

public class FourSum {
    public List<List<Integer>> fourSum(int[] nums, int target) {
        List<List<Integer>> result = new ArrayList<>();
        Arrays.sort(nums);
        for (int i = 0; i < nums.length - 3; i++) {
            if (i > 0 && nums[i] == nums[i - 1]) continue;
            for (int j = i + 1; j < nums.length - 2; j++) {
                if (j > i + 1 && nums[j] == nums[j - 1]) continue;
                findPair(nums, i, j, target, result);
            }
        }
        return result;
    }

    private void findPair(int[] nums, int first, int second, int target, List<List<Integer>> result) {
        int left = second + 1;
        int right = nums.length - 1;
        while (left < right) {
            long currentSum = (long) nums[first] + nums[second] + nums[left] + nums[right];
            if (currentSum == target) {
                List<Integer> quadruplet = new ArrayList<>();
                quadruplet.add(nums[first]);
                quadruplet.add(nums[second]);
                quadruplet.add(nums[left]);
                quadruplet.add(nums[right]);
                result.add(quadruplet);
                left++;
                right--;

                while (left < right && nums[left] == nums[left - 1]) {
                    left++;
                }
                while (left < right && nums[right] == nums[right + 1]) {
                    right--;
                }
            } else if (currentSum < target) {
                left++;
            } else {
                right--;
            }
        }
    }
}
