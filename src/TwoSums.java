import java.util.HashMap;
import java.util.Map;

public class TwoSums {
    public int[] twoSum(int[] nums, int target) {
        Map<Integer, Integer> numToIndexMap = new HashMap<>();
        for (int i = 0; i < nums.length; i++) {
            numToIndexMap.put(nums[i], i);
        }
        for (int i = 0; i < nums.length; i++) {
            if (numToIndexMap.containsKey(target - nums[i]) && numToIndexMap.get(target - nums[i]) != i ) {
                return new int[]{i, numToIndexMap.get(target - nums[i])};
            }
        }
        return new int[]{};
    }
}
