import org.junit.Test;

import java.util.List;

public class CombinationSumTest {
    @Test
    public void simpleTest() {
        CombinationSum combinationSum = new CombinationSum();
        List<List<Integer>> result = combinationSum.combinationSum(new int[]{2,5,6,9}, 9);
        System.out.println(result);
    }

    @Test
    public void simpleTest2() {
        CombinationSum combinationSum = new CombinationSum();
        List<List<Integer>> result = combinationSum.combinationSum(new int[]{3,4,5}, 16);
        System.out.println(result);
    }

    @Test
    public void simpleTest3() {
        CombinationSum combinationSum = new CombinationSum();
        List<List<Integer>> result = combinationSum.combinationSum(new int[]{3}, 5);
        System.out.println(result);
    }
}
