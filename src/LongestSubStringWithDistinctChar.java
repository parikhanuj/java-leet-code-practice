public class LongestSubStringWithDistinctChar {
    public int lengthOfLongestSubstringKDistinct(String s, int k) {
        if (s == null || s.isEmpty())
            return 0;

        int maxLength = 0;
        int currentLength = 0;
        HashMap<Character, Integer> charOccurrenceMap = new HashMap<>();
        for (int p1 = 0, p2 = 0; p2 < s.length(); p2++) {
            char p2Char = s.charAt(p2);
            charOccurrenceMap.put(p2Char, charOccurrenceMap.getOrDefault(p2Char, 0) + 1);
            currentLength++;
            while (charOccurrenceMap.size() > k) {
                char p1Char = s.charAt(p1);
                charOccurrenceMap.put(p1Char, charOccurrenceMap.get(p1Char) - 1);
                currentLength--;
                if (charOccurrenceMap.get(p1Char) == 0) {
                    charOccurrenceMap.remove(p1Char);
                }
                p1++;
            }
            maxLength = Math.max(currentLength, maxLength);
        }
        return maxLength;
    }
}
