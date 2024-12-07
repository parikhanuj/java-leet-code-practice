import org.junit.Assert;
import org.junit.Test;

public class MinWindowSubStringTest {
    @Test
    public void simpleTest() {
        MinWindowSubString minWindowSubString = new MinWindowSubString();
        String result = minWindowSubString.minWindow("ADOBECODEBANC", "ABC");
        Assert.assertEquals("BANC", result);
    }

    @Test
    public void simpleTest2() {
        MinWindowSubString minWindowSubString = new MinWindowSubString();
        String result = minWindowSubString.minWindow("a", "a");
        Assert.assertEquals("a", result);
    }

    @Test
    public void simpleTest3() {
        MinWindowSubString minWindowSubString = new MinWindowSubString();
        String result = minWindowSubString.minWindow("a", "aa");
        Assert.assertEquals("", result);
    }

    @Test
    public void simpleTest4() {
        MinWindowSubString minWindowSubString = new MinWindowSubString();
        String result = minWindowSubString.minWindow("bdab", "ab");
        Assert.assertEquals("ab", result);
    }

    @Test
    public void simpleTest5() {
        MinWindowSubString minWindowSubString = new MinWindowSubString();
        String result = minWindowSubString.minWindow("ab", "a");
        Assert.assertEquals("a", result);
    }

    @Test
    public void simpleTest6() {
        MinWindowSubString minWindowSubString = new MinWindowSubString();
        String result = minWindowSubString.minWindow("aaaaaaaaaaaabbbbbcdd", "abcdd");
        Assert.assertEquals("abbbbbcdd", result);
    }
}
