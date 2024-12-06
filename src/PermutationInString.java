class PermutationInString {
    public boolean checkInclusion(String s1, String s2) {
        int p1 = 0;
        int[] s1OccurrenceMap = new int[26];
        int[] s2OccurrenceMap = new int[26];
        for (int i = 0; i < s1.length(); i++) {
            s1OccurrenceMap[s1.charAt(i) - 97]++;
        }
        for (int p2 = 0; p2 < s2.length(); p2++) {
            boolean isValid = true;
            s2OccurrenceMap[s2.charAt(p2) - 97]++;
            while (p2 - p1 + 1 > s1.length()) {
                s2OccurrenceMap[s2.charAt(p1) - 97]--;
                p1++;
            }
            for (int i = 0; i < s1.length(); i++) {
                if (s1OccurrenceMap[s1.charAt(i) - 97] != s2OccurrenceMap[s1.charAt(i) - 97]) {
                    isValid = false;
                    break;
                }
            }
            if (isValid) return true;
        }
        return false;
    }
}