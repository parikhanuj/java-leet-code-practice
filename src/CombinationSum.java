import java.util.ArrayList;
import java.util.List;

public class CombinationSum {
    List<List<Integer>> combinations = new ArrayList<>();

    public List<List<Integer>> combinationSum(int[] nums, int target) {
        backtrack(new ArrayList<>(), target, nums, 0);
        return combinations;
    }

    private void backtrack(List<Integer> combination, int target, int[] nums, int index) {
        if (target == 0) {
            combinations.add(new ArrayList<>(combination));
            return;
        }

        if (target < 0 || index >= nums.length) {
            return;
        }

        combination.add(nums[index]);
        backtrack(combination, target - nums[index], nums, index);
        combination.remove(combination.size() - 1);
        backtrack(combination, target, nums, index + 1);
    }
}
