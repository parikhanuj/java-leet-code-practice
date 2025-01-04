import java.util.ArrayList;
import java.util.List;

public class Permutations {
    List<List<Integer>> result = new ArrayList<>();
    boolean[] used = new boolean[6];

    public List<List<Integer>> permute(int[] nums) {
        backtrack(nums, new ArrayList<>());
        return result;
    }

    public void backtrack(int[] nums, List<Integer> permutation) {
        if (permutation.size() == nums.length) {
            result.add(new ArrayList<>(permutation));
            return;
        }

        for (int i = 0; i < nums.length; i++) {
            if (!used[i]) {
                used[i] = true;
                permutation.add(nums[i]);
                backtrack(nums, permutation);
                used[i] = false;
                permutation.remove(permutation.size() - 1);
            }
        }
    }
}
