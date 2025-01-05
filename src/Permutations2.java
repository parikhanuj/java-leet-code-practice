import java.util.ArrayList;
import java.util.List;

public class Permutations2 {

    public List<List<Integer>> permute(int[] nums) {
        List<List<Integer>> result = new ArrayList<>();
        result.add(new ArrayList<>());

        for (int num: nums) {
            List<List<Integer>> temp = new ArrayList<>();
            for (List<Integer> integers : result) {
                for (int j = 0; j < integers.size() + 1; j++) {
                    List<Integer> permutation = new ArrayList<>(integers);
                    permutation.add(j, num);
                    temp.add(new ArrayList<>(permutation));
                }
            }
            result = temp;
        }
        return result;
    }
}
