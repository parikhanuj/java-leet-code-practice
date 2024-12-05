import org.junit.Assert;
import org.junit.Test;

import java.util.HashSet;
import java.util.Set;

public class LongestSubStringWithoutRepeatCharsTest {

    @Test
    public void simpleTest() {
        LongestSubStringWithoutRepeatChars longestSubStringWithoutRepeatChars = new LongestSubStringWithoutRepeatChars();
        int result = longestSubStringWithoutRepeatChars.lengthOfLongestSubstring("abcabcbb");
        Assert.assertEquals(3, result);
    }

    @Test
    public void simpleTest2() {
        LongestSubStringWithoutRepeatChars longestSubStringWithoutRepeatChars = new LongestSubStringWithoutRepeatChars();
        int result = longestSubStringWithoutRepeatChars.lengthOfLongestSubstring("bbbbb");
        Assert.assertEquals(1, result);
    }

    @Test
    public void simpleTest3() {
        LongestSubStringWithoutRepeatChars longestSubStringWithoutRepeatChars = new LongestSubStringWithoutRepeatChars();
        int result = longestSubStringWithoutRepeatChars.lengthOfLongestSubstring("pwwkew");
        Assert.assertEquals(3, result);
    }

    @Test
    public void simpleTest4() {
        LongestSubStringWithoutRepeatChars longestSubStringWithoutRepeatChars = new LongestSubStringWithoutRepeatChars();
        int result = longestSubStringWithoutRepeatChars.lengthOfLongestSubstring("qwertyu345qqqqqwerty5345334");
        Assert.assertEquals(10, result);
    }

    @Test
    public void simpleTest5() {
        LongestSubStringWithoutRepeatChars longestSubStringWithoutRepeatChars = new LongestSubStringWithoutRepeatChars();
        int result = longestSubStringWithoutRepeatChars.lengthOfLongestSubstring("tmmzuxt");
        Assert.assertEquals(5, result);
    }
}
