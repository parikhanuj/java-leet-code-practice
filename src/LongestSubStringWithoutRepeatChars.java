import java.util.HashSet;
import java.util.Set;

public class LongestSubStringWithoutRepeatChars {
    public int lengthOfLongestSubstring(String s) {
        int maxLength = 0;
        int p1 = 0;
        Set<Character> uniqueChars = new HashSet<>();

        for (int p2 = 0; p2 < s.length(); p2++) {
            char charAtP2 = s.charAt(p2);
            while (uniqueChars.contains(charAtP2)) {
                char charAtP1 = s.charAt(p1);
                uniqueChars.remove(charAtP1);
                p1++;
            }
            uniqueChars.add(charAtP2);
            maxLength = Math.max(uniqueChars.size(), maxLength);
        }
        return maxLength;
    }
}
