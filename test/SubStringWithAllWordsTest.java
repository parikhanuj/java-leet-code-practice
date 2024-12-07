import org.junit.Assert;
import org.junit.Test;

import java.util.List;

public class SubStringWithAllWordsTest {
    @Test
    public void simpleTest() {
        SubStringWithAllWords subStringWithAllWords = new SubStringWithAllWords();
        List<Integer> result = subStringWithAllWords.findSubstring("barfoothefoobarman", new String[]{"foo", "bar"});
        Assert.assertTrue(result.containsAll(List.of(0, 9)));
    }

    @Test
    public void simpleTest2() {
        SubStringWithAllWords subStringWithAllWords = new SubStringWithAllWords();
        List<Integer> result = subStringWithAllWords.findSubstring("wordgoodgoodgoodbestword", new String[]{"word", "good", "best", "word"});
        Assert.assertTrue(result.containsAll(List.of()));
    }

    @Test
    public void simpleTest3() {
        SubStringWithAllWords subStringWithAllWords = new SubStringWithAllWords();
        List<Integer> result = subStringWithAllWords.findSubstring("barfoofoobarthefoobarman", new String[]{"bar", "foo", "the"});
        Assert.assertTrue(result.containsAll(List.of(6, 9, 12)));
    }

    @Test
    public void simpleTest4() {
        SubStringWithAllWords subStringWithAllWords = new SubStringWithAllWords();
        List<Integer> result = subStringWithAllWords.findSubstring("barfoobarfoo", new String[]{"bar", "foo"});
        Assert.assertTrue(result.containsAll(List.of(0, 3, 6)));
    }

    @Test
    public void simpleTest5() {
        SubStringWithAllWords subStringWithAllWords = new SubStringWithAllWords();
        List<Integer> result = subStringWithAllWords.findSubstring("aaabbbaaaaaa", new String[]{"aaa"});
        Assert.assertTrue(result.containsAll(List.of(0, 6, 7, 8, 9)));
    }

    @Test
    public void simpleTest6() {
        SubStringWithAllWords subStringWithAllWords = new SubStringWithAllWords();
        List<Integer> result = subStringWithAllWords.findSubstring("a", new String[]{"a"});
        Assert.assertTrue(result.contains(0));
    }

    @Test
    public void simpleTest7() {
        SubStringWithAllWords subStringWithAllWords = new SubStringWithAllWords();
        List<Integer> result = subStringWithAllWords.findSubstring("barfoo", new String[]{"foo", "bar"});
        Assert.assertTrue(result.contains(0));
    }

    @Test
    public void simpleTest8() {
        SubStringWithAllWords subStringWithAllWords = new SubStringWithAllWords();
        List<Integer> result = subStringWithAllWords.findSubstring("aaaaaaaaaaaaaa", new String[]{"aa", "aa"});
        Assert.assertTrue(result.containsAll(List.of(0, 1, 2, 3, 4, 5, 6, 7, 8, 9, 10)));
    }
}
