// https://leetcode.com/problems/minimum-size-subarray-sum/description/

import org.junit.Assert;
import org.junit.Test;
import java.util.Arrays;

public class MinSizeSubArraySumTest {

    @Test
    public void simpleTest() {
        MinSizeSubArraySum minSizeSubArraySum = new MinSizeSubArraySum();
        int result = minSizeSubArraySum.minSubArrayLen(7, new int[]{2,3,1,2,4,3});
        Assert.assertEquals(2, result);
    }

    @Test
    public void simpleTest2() {
        MinSizeSubArraySum minSizeSubArraySum = new MinSizeSubArraySum();
        int result = minSizeSubArraySum.minSubArrayLen(4, new int[]{1,4,4});
        Assert.assertEquals(1, result);
    }

    @Test
    public void simpleTest3() {
        MinSizeSubArraySum minSizeSubArraySum = new MinSizeSubArraySum();
        int result = minSizeSubArraySum.minSubArrayLen(6, new int[]{2,3,1,2,4,3});
        Assert.assertEquals(2, result);
    }

    @Test
    public void simpleTest4() {
        MinSizeSubArraySum minSizeSubArraySum = new MinSizeSubArraySum();
        int result = minSizeSubArraySum.minSubArrayLen(11, new int[]{1,1,1,1,1,1});
        Assert.assertEquals(0, result);
    }
}
