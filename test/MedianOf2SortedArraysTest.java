import org.junit.Assert;
import org.junit.Test;

public class MedianOf2SortedArraysTest {
    @Test
    public void simpleTest() {
        MedianOf2SortedArrays medianOf2SortedArrays = new MedianOf2SortedArrays();
        double result = medianOf2SortedArrays.findMedianSortedArrays(new int[]{1,2}, new int[]{3});
        Assert.assertEquals(2.0, result, 0);
    }

    @Test
    public void simpleTest2() {
        MedianOf2SortedArrays medianOf2SortedArrays = new MedianOf2SortedArrays();
        double result = medianOf2SortedArrays.findMedianSortedArrays(new int[]{1,3}, new int[]{2,4});
        Assert.assertEquals(2.5, result, 0);
    }

    @Test
    public void simpleTest3() {
        MedianOf2SortedArrays medianOf2SortedArrays = new MedianOf2SortedArrays();
        double result = medianOf2SortedArrays.findMedianSortedArrays(new int[]{1,3,5,8}, new int[]{2,6,9,10});
        Assert.assertEquals(5.5, result, 0);
    }

    @Test
    public void simpleTest4() {
        MedianOf2SortedArrays medianOf2SortedArrays = new MedianOf2SortedArrays();
        double result = medianOf2SortedArrays.findMedianSortedArrays(new int[]{}, new int[]{1});
        Assert.assertEquals(1.0, result, 0);
    }
}
