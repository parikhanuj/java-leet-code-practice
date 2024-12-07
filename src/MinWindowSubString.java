public class MinWindowSubString {
    int[] tOccMap = new int[256];
    int[] sOccMap = new int[256];

    private boolean isSubString(String comStr) {
        for (int i = 0; i < comStr.length(); i++) {
            if (tOccMap[comStr.charAt(i) - 'A'] > sOccMap[comStr.charAt(i) - 'A']) {
                return false;
            }
        }
        return true;
    }

    public String minWindow(String s, String t) {
        String minWindow = s;
        int start = 0;
        boolean foundWindow = false;

        if (s.length() < t.length()) {
            return "";
        }

        for (int i = 0; i < t.length(); i++) {
            tOccMap[t.charAt(i) - 'A']++;
            sOccMap[s.charAt(i) - 'A']++;
        }

        for (int end = t.length(); end <= s.length(); end++) {
            if(isSubString(t)) {
                String matchStr = s.substring(start, end);
                minWindow = matchStr.length() < minWindow.length() ? matchStr : minWindow;
                sOccMap[s.charAt(start) - 'A']--;
                start++;
                foundWindow = true;
            }
            if (end < s.length()) {
                sOccMap[s.charAt(end) - 'A']++;
                while (start <= end && sOccMap[s.charAt(start) - 'A'] > tOccMap[s.charAt(start) - 'A']) {
                    sOccMap[s.charAt(start) - 'A']--;
                    start++;
                }
            }
        }

        return foundWindow ? minWindow : "";
    }
}
