import org.junit.Test;

import java.util.List;

public class PermutationsTest {
    @Test
    public void simpleTest() {
        Permutations2 permutations = new Permutations2();
        List<List<Integer>> result = permutations.permute(new int[]{1,2,3});
        System.out.println(result);
    }

    @Test
    public void simpleTest2() {
        Permutations2 permutations = new Permutations2();
        List<List<Integer>> result = permutations.permute(new int[]{7});
        System.out.println(result);
    }

    @Test
    public void simpleTest3() {
        Permutations2 permutations = new Permutations2();
        List<List<Integer>> result = permutations.permute(new int[]{-1,-2,3,5});
        System.out.println(result);
    }
}
