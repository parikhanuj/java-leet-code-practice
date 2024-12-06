import org.junit.Assert;
import org.junit.Test;

public class MaxConsecutiveOnesTest {
    @Test
    public void simpleTest() {
        MaxConsecutiveOnes maxConsecutiveOnes = new MaxConsecutiveOnes();
        int result = maxConsecutiveOnes.longestOnes(new int[]{1,1,1,0,0,0,1,1,1,1,0}, 2);
        Assert.assertEquals(6, result);
    }

    @Test
    public void simpleTest2() {
        MaxConsecutiveOnes maxConsecutiveOnes = new MaxConsecutiveOnes();
        int result = maxConsecutiveOnes.longestOnes(new int[]{0,0,1,1,0,0,1,1,1,0,1,1,0,0,0,1,1,1,1}, 3);
        Assert.assertEquals(10, result);
    }

    @Test
    public void simpleTest3() {
        MaxConsecutiveOnes maxConsecutiveOnes = new MaxConsecutiveOnes();
        int result = maxConsecutiveOnes.longestOnes(new int[]{0,0,0,0,0}, 0);
        Assert.assertEquals(0, result);
    }

    @Test
    public void simpleTest4() {
        MaxConsecutiveOnes maxConsecutiveOnes = new MaxConsecutiveOnes();
        int result = maxConsecutiveOnes.longestOnes(new int[]{0,0,0,0,0}, 3);
        Assert.assertEquals(3, result);
    }
}
