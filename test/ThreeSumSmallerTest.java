import org.junit.Assert;
import org.junit.Test;

public class ThreeSumSmallerTest {
    @Test
    public void simpleTest() {
        ThreeSumSmaller threeSumSmaller = new ThreeSumSmaller();
        int result = threeSumSmaller.threeSumSmaller(new int[]{-2,0,1,3}, 2);
        Assert.assertEquals(2, result);
    }

    @Test
    public void simpleTest2() {
        ThreeSumSmaller threeSumSmaller = new ThreeSumSmaller();
        int result = threeSumSmaller.threeSumSmaller(new int[]{}, 0);
        Assert.assertEquals(0, result);
    }

    @Test
    public void simpleTest3() {
        ThreeSumSmaller threeSumSmaller = new ThreeSumSmaller();
        int result = threeSumSmaller.threeSumSmaller(new int[]{0}, 0);
        Assert.assertEquals(0, result);
    }

    @Test
    public void simpleTest4() {
        ThreeSumSmaller threeSumSmaller = new ThreeSumSmaller();
        int result = threeSumSmaller.threeSumSmaller(new int[]{1,1,1,1,4,5,3,2}, 12);
        Assert.assertEquals(55, result);
    }

    @Test
    public void simpleTest5() {
        ThreeSumSmaller threeSumSmaller = new ThreeSumSmaller();
        int result = threeSumSmaller.threeSumSmaller(new int[]{1,2,3,4}, 12);
        Assert.assertEquals(4, result);
    }
}
