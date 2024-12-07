import java.util.ArrayList;
import java.util.List;

class FindAllAnagrams {
    public List<Integer> findAnagrams(String s, String p) {
        List<Integer> anagrams = new ArrayList<>();
        if (p.length() > s.length()) return anagrams;
        int p1 = 0;
        int[] sMap = new int[26];
        int[] pMap = new int[26];
        for (int i = 0; i < p.length(); i++) {
            pMap[p.charAt(i) - 'a']++;
        }
        for (int p2 = 0; p2 < s.length(); p2++) {
            boolean isValid = true;
            sMap[s.charAt(p2) - 'a']++;
            if (p2 - p1 + 1 > p.length()) {
                sMap[s.charAt(p1) - 'a']--;
                p1++;
            }
            for (int i = 0; i < p.length(); i++) {
                if (pMap[p.charAt(i) - 'a'] != sMap[p.charAt(i) - 'a']) {
                    isValid = false;
                    break;
                }
            }
            if (isValid) {
                anagrams.add(p1);
            }
        }
        return anagrams;
    }
}