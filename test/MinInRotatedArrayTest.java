import org.junit.Assert;
import org.junit.Test;

public class MinInRotatedArrayTest {
    @Test
    public void simpleTest() {
        MinInRotatedArray minInRotatedArray = new MinInRotatedArray();
        int result = minInRotatedArray.findMin(new int[]{3,4,5,6,1,2});
        Assert.assertEquals(1, result);
    }
}
