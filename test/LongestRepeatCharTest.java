import org.junit.Assert;
import org.junit.Test;

public class LongestRepeatCharTest {
    @Test
    public void simpleTest() {
        LongestRepeatChar longestRepeatChar = new LongestRepeatChar();
        int result = longestRepeatChar.characterReplacement("AABABBA", 1);
        Assert.assertEquals(4, result);
    }

    @Test
    public void simpleTest2() {
        LongestRepeatChar longestRepeatChar = new LongestRepeatChar();
        int result = longestRepeatChar.characterReplacement("ABAB", 2);
        Assert.assertEquals(4, result);
    }

    @Test
    public void simpleTest3() {
        LongestRepeatChar longestRepeatChar = new LongestRepeatChar();
        int result = longestRepeatChar.characterReplacement("ABCDEFG", 6);
        Assert.assertEquals(7, result);
    }

    @Test
    public void simpleTest4() {
        LongestRepeatChar longestRepeatChar = new LongestRepeatChar();
        int result = longestRepeatChar.characterReplacement("AAAAAAA", 6);
        Assert.assertEquals(7, result);
    }

    @Test
    public void simpleTest5() {
        LongestRepeatChar longestRepeatChar = new LongestRepeatChar();
        int result = longestRepeatChar.characterReplacement("ABCDEFG", 0);
        Assert.assertEquals(1, result);
    }

    @Test
    public void simpleTest6() {
        LongestRepeatChar longestRepeatChar = new LongestRepeatChar();
        int result = longestRepeatChar.characterReplacement("ABBBB", 2);
        Assert.assertEquals(5, result);
    }
}
