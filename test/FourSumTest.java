import org.junit.Assert;
import org.junit.Test;

import java.util.List;

public class FourSumTest {
    @Test
    public void simpleTest() {
        FourSum fourSum = new FourSum();
        List<List<Integer>> result = fourSum.fourSum(new int[]{1,0,-1,0,-2,2}, 0);
        System.out.println(result);
    }

    @Test
    public void simpleTest2() {
        FourSum fourSum = new FourSum();
        List<List<Integer>> result = fourSum.fourSum(new int[]{2,2,2,2,2}, 8);
        System.out.println(result);
    }

    @Test
    public void simpleTest3() {
        FourSum fourSum = new FourSum();
        List<List<Integer>> result = fourSum.fourSum(new int[]{1000000000,1000000000,1000000000,1000000000}, -294967296);
        System.out.println(result);
    }

    @Test
    public void simpleTest4() {
        FourSum fourSum = new FourSum();
        List<List<Integer>> result = fourSum.fourSum(new int[]{2,4,3,6,8,5}, 18);
        System.out.println(result);
    }


}
