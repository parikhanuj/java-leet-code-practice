import org.junit.Assert;
import org.junit.Test;

public class PermutationInStringTest {

    @Test
    public void simpleTest() {
        PermutationInString permutationInString = new PermutationInString();
        boolean result = permutationInString.checkInclusion("aaaa", "aaaaa");
        Assert.assertTrue(result);
    }

    @Test
    public void simpleTest2() {
        PermutationInString permutationInString = new PermutationInString();
        boolean result = permutationInString.checkInclusion("abc", "lecaabee");
        Assert.assertFalse(result);
    }

    @Test
    public void simpleTest3() {
        PermutationInString permutationInString = new PermutationInString();
        boolean result = permutationInString.checkInclusion("adc", "dcda");
        Assert.assertTrue(result);
    }

    @Test
    public void simpleTest4() {
        PermutationInString permutationInString = new PermutationInString();
        boolean result = permutationInString.checkInclusion("abc", "lecabee");
        Assert.assertTrue(result);
    }

    @Test
    public void simpleTest5() {
        PermutationInString permutationInString = new PermutationInString();
        boolean result = permutationInString.checkInclusion("aaaa", "aaaaa");
        Assert.assertTrue(result);
    }
}
