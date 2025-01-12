import org.junit.Assert;
import org.junit.Test;

public class NoOfIslandsTest {

    @Test
    public void testSingleIsland() {
        NoOfIslands numberOfIslands = new NoOfIslands();
        char[][] grid = {
                {'1', '1', '0', '0', '0'},
                {'1', '1', '0', '0', '0'},
                {'0', '0', '0', '1', '1'},
                {'0', '0', '0', '1', '1'}
        };
        int result = numberOfIslands.numIslands(grid);
        Assert.assertEquals(2, result);
    }

    @Test
    public void testMultipleIslands() {
        NoOfIslands numberOfIslands = new NoOfIslands();
        char[][] grid = {
                {'1', '0', '0', '1', '0'},
                {'1', '0', '0', '1', '1'},
                {'0', '0', '0', '0', '0'},
                {'1', '1', '0', '0', '1'}
        };
        int result = numberOfIslands.numIslands(grid);
        Assert.assertEquals(4, result);
    }

    @Test
    public void testAllLand() {
        NoOfIslands numberOfIslands = new NoOfIslands();
        char[][] grid = {
                {'1', '1', '1'},
                {'1', '1', '1'},
                {'1', '1', '1'}
        };
        int result = numberOfIslands.numIslands(grid);
        Assert.assertEquals(1, result);
    }

    @Test
    public void testNoLand() {
        NoOfIslands numberOfIslands = new NoOfIslands();
        char[][] grid = {
                {'0', '0', '0'},
                {'0', '0', '0'},
                {'0', '0', '0'}
        };
        int result = numberOfIslands.numIslands(grid);
        Assert.assertEquals(0, result);
    }

    @Test
    public void testSingleCellIsland() {
        NoOfIslands numberOfIslands = new NoOfIslands();
        char[][] grid = {
                {'1'}
        };
        int result = numberOfIslands.numIslands(grid);
        Assert.assertEquals(1, result);
    }

    @Test
    public void testSingleCellWater() {
        NoOfIslands numberOfIslands = new NoOfIslands();
        char[][] grid = {
                {'0'}
        };
        int result = numberOfIslands.numIslands(grid);
        Assert.assertEquals(0, result);
    }
}
