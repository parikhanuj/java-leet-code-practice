import java.util.HashMap;
import java.util.Map;

public class TwoSums {
    public int[] twoSum(int[] nums, int target) {
        Map<Integer, Integer> numberCounter = new HashMap<>();
        for (int i = 0; i < nums.length; i++) {
            numberCounter.put(nums[i], numberCounter.getOrDefault(nums[i], 0) + 1);
        }
        for (int i = 0; i < nums.length; i++) {
            numberCounter.put(nums[i], numberCounter.get(nums[i]) - 1);
            if (numberCounter.containsKey(target - nums[i]) && numberCounter.get(target - nums[i]) > 0) {
                for (int j = 0; j < nums.length; j++) {
                    if (i != j && nums[j] == target - nums[i]) {
                        return new int[]{i, j};
                    }
                }
            }
        }
        return new int[]{};
    }
}
