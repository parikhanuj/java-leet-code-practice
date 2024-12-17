import java.util.Arrays;

class PermutationInString {
    public boolean checkInclusion(String s1, String s2) {
        if (s1.length() > s2.length()) return false;

        int[] occArrayS1 = new int[26];
        int[] occArrayS2Window = new int[26];
        int start = 0;
        int end = s1.length();

        for (int i = 0; i < s1.length(); i++) {
            occArrayS2Window[s2.charAt(i) - 'a']++;
            occArrayS1[s1.charAt(i) - 'a']++;
        }

        if (Arrays.equals(occArrayS1, occArrayS2Window)) return true;

        while (end < s2.length()) {
            occArrayS2Window[s2.charAt(end) - 'a']++;
            occArrayS2Window[s2.charAt(start) - 'a']--;

            if (Arrays.equals(occArrayS1, occArrayS2Window)) return true;

            end++;
            start++;
        }

        return false;
    }
}