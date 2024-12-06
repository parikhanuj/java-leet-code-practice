public class LongestRepeatChar {
    public int characterReplacement(String s, int k) {
        int longest = 0;
        int p1 = 0;
        int[] occMap = new int[26];
        int mostFrequent = 0;
        for (int p2 = 0; p2 < s.length(); p2++) {
            char p2Char = s.charAt(p2);
            occMap[p2Char - 65]++;
            mostFrequent = Math.max(occMap[p2Char - 65], mostFrequent);
            while (p2 - p1 + 1 - mostFrequent > k) {
                char p1Char = s.charAt(p1);
                p1++;
                occMap[p1Char - 65]--;
            }
            longest = Math.max(longest, p2 - p1 + 1);
        }
        return longest;
    }
}
