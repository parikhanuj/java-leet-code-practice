import org.junit.Assert;
import org.junit.Test;

public class SearchInRotatedArrayTest {
    @Test
    public void simpleTest() {
        SearchInRotatedArray searchInRotatedArray = new SearchInRotatedArray();
        int result = searchInRotatedArray.search(new int[]{3,4,5,6,1,2}, 1);
        Assert.assertEquals(4, result);
    }

    @Test
    public void simpleTest2() {
        SearchInRotatedArray searchInRotatedArray = new SearchInRotatedArray();
        int result = searchInRotatedArray.search(new int[]{4,5,6,7,0,1,2}, 0);
        Assert.assertEquals(4, result);
    }

    @Test
    public void simpleTest3() {
        SearchInRotatedArray searchInRotatedArray = new SearchInRotatedArray();
        int result = searchInRotatedArray.search(new int[]{4,5,6,7,0,1,2}, 3);
        Assert.assertEquals(-1, result);
    }

    @Test
    public void simpleTest4() {
        SearchInRotatedArray searchInRotatedArray = new SearchInRotatedArray();
        int result = searchInRotatedArray.search(new int[]{1}, 0);
        Assert.assertEquals(-1, result);
    }

    @Test
    public void simpleTest5() {
        SearchInRotatedArray searchInRotatedArray = new SearchInRotatedArray();
        int result = searchInRotatedArray.search(new int[]{4,5,6,7,8,1,2,3}, 8);
        Assert.assertEquals(4, result);
    }

    @Test
    public void simpleTest6() {
        SearchInRotatedArray searchInRotatedArray = new SearchInRotatedArray();
        int result = searchInRotatedArray.search(new int[]{5,1,3}, 3);
        Assert.assertEquals(2, result);
    }
}
