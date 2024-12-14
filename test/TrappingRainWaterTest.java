import org.junit.Assert;
import org.junit.Test;

public class TrappingRainWaterTest {
    @Test
    public void simpleTest() {
        TrappingRainWater trappingRainWater = new TrappingRainWater();
        int result = trappingRainWater.trap(new int[]{0,1,0,2,1,0,1,3,2,1,2,1});
        Assert.assertEquals(6, result);
    }

    @Test
    public void simpleTest2() {
        TrappingRainWater trappingRainWater = new TrappingRainWater();
        int result = trappingRainWater.trap(new int[]{4,2,0,3,2,5});
        Assert.assertEquals(9, result);
    }

    @Test
    public void simpleTest3() {
        TrappingRainWater trappingRainWater = new TrappingRainWater();
        int result = trappingRainWater.trap(new int[]{1,2,3,4,5,6});
        Assert.assertEquals(0, result);
    }

    @Test
    public void simpleTest4() {
        TrappingRainWater trappingRainWater = new TrappingRainWater();
        int result = trappingRainWater.trap(new int[]{6,5,4,3,2,1});
        Assert.assertEquals(0, result);
    }

    @Test
    public void simpleTest5() {
        TrappingRainWater trappingRainWater = new TrappingRainWater();
        int result = trappingRainWater.trap(new int[]{3,3,3,3,3,3});
        Assert.assertEquals(0, result);
    }

    @Test
    public void simpleTest6() {
        TrappingRainWater trappingRainWater = new TrappingRainWater();
        int result = trappingRainWater.trap(new int[]{3,0,0,0,0,0,3});
        Assert.assertEquals(15, result);
    }

    @Test
    public void simpleTest7() {
        TrappingRainWater trappingRainWater = new TrappingRainWater();
        int result = trappingRainWater.trap(new int[]{5,4,1,2});
        Assert.assertEquals(1, result);
    }

    @Test
    public void simpleTest8() {
        TrappingRainWater trappingRainWater = new TrappingRainWater();
        int result = trappingRainWater.trap(new int[]{9,6,8,8,5,6,3});
        Assert.assertEquals(3, result);
    }
}
