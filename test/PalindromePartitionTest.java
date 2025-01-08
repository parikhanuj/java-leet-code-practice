import org.junit.Assert;
import org.junit.Test;

import java.util.Arrays;
import java.util.List;

public class PalindromePartitionTest {

    @Test
    public void testSingleCharacterString() {
        PalindromePartition pp = new PalindromePartition();
        String input = "a";
        List<List<String>> expected = Arrays.asList(
                Arrays.asList("a")
        );
        Assert.assertEquals("Single character string should return itself as a partition.", expected, pp.partition(input));
    }

    @Test
    public void testTwoCharacterPalindrome() {
        PalindromePartition pp = new PalindromePartition();
        String input = "aa";
        List<List<String>> expected = Arrays.asList(
                Arrays.asList("a", "a"),
                Arrays.asList("aa")
        );
        Assert.assertEquals("Two-character palindrome should return both single and combined partitions.", expected, pp.partition(input));
    }

    @Test
    public void testNonPalindromeString() {
        PalindromePartition pp = new PalindromePartition();
        String input = "ab";
        List<List<String>> expected = Arrays.asList(
                Arrays.asList("a", "b")
        );
        Assert.assertEquals("Non-palindrome string should only have one valid partition.", expected, pp.partition(input));
    }

    @Test
    public void testMultiCharacterString() {
        PalindromePartition pp = new PalindromePartition();
        String input = "aab";
        List<List<String>> expected = Arrays.asList(
                Arrays.asList("a", "a", "b"),
                Arrays.asList("aa", "b")
        );
        Assert.assertEquals("Multi-character string should return all valid palindrome partitions.", expected, pp.partition(input));
    }

    @Test
    public void testEmptyString() {
        PalindromePartition pp = new PalindromePartition();
        String input = "";
        List<List<String>> expected = Arrays.asList(
                Arrays.asList() // Empty partition
        );
        Assert.assertEquals("Empty string should return a single empty partition.", expected, pp.partition(input));
    }

    @Test
    public void testComplexPalindromeString() {
        PalindromePartition pp = new PalindromePartition();
        String input = "racecar";
        List<List<String>> expected = Arrays.asList(
                Arrays.asList("r", "a", "c", "e", "c", "a", "r"),
                Arrays.asList("r", "a", "cec", "a", "r"),
                Arrays.asList("r", "aceca", "r"),
                Arrays.asList("racecar")
        );
        Assert.assertEquals("Complex palindrome string should return all valid partitions.", expected, pp.partition(input));
    }
}
