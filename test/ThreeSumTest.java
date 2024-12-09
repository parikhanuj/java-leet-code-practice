import org.junit.Assert;
import org.junit.Test;

import java.util.List;

public class ThreeSumTest {
    @Test
    public void simpleTest() {
        ThreeSum threeSum = new ThreeSum();
        List<List<Integer>> result = threeSum.threeSum(new int[]{-1,0,1,2,-1,-4});
        Assert.assertEquals(6, result);
    }

    @Test
    public void simpleTest2() {
        ThreeSum threeSum = new ThreeSum();
        List<List<Integer>> result = threeSum.threeSum(new int[]{0,1,1});
        Assert.assertEquals(6, result);
    }

    @Test
    public void simpleTest3() {
        ThreeSum threeSum = new ThreeSum();
        List<List<Integer>> result = threeSum.threeSum(new int[]{0,0,0});
        Assert.assertEquals(6, result);
    }
}
