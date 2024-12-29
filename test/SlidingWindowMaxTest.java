
import org.junit.Assert;
import org.junit.Test;

public class SlidingWindowMaxTest {

    @Test
    public void simpleTest() {
        SlidingWindowMax slidingWindowMax = new SlidingWindowMax();
        int[] result = slidingWindowMax.maxSlidingWindow(new int[]{1,2,1,0,4,2,6}, 3);
        Assert.assertArrayEquals(new int[]{2,2,4,4,6}, result);
    }
}
