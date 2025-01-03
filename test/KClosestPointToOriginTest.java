import org.junit.Assert;
import org.junit.Test;

public class KClosestPointToOriginTest {

    @Test
    public void simpleTest() {
        KClosestPointToOrigin kClosestPointToOrigin = new KClosestPointToOrigin();
        int[][] input = {{0, 2}, {2, 0}, {2, 2}};
        int[][] expectedResult = {{0, 2}, {2, 0}};
        int[][] result = kClosestPointToOrigin.kClosest(input, 2);
        Assert.assertArrayEquals(expectedResult, result);
    }

  @Test
  public void simpleTest2() {
    KClosestPointToOrigin kClosestPointToOrigin = new KClosestPointToOrigin();
    int[][] input = {{0, 2}, {2, 2}};
    int[][] expectedResult = {{0, 2}};
    int[][] result = kClosestPointToOrigin.kClosest(input, 1);
    Assert.assertArrayEquals(expectedResult, result);
  }
}
