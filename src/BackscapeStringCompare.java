public class BackscapeStringCompare {
    public boolean backspaceCompare(String s, String t) {
        return formatString(s).equals(formatString(t));
    }

    private String formatString(String input) {
        int p1 = 0;
        int p2 = 0;
        StringBuilder sb = new StringBuilder(input);
        while (p2 < sb.length()) {
            if (p1 < 0) {
                p1 = 0;
            }
            if (sb.charAt(p2) != '#') {
                sb.setCharAt(p1, sb.charAt(p2));
                p1++;
                p2++;
            } else {
                p1--;
                p2++;
            }
        }
        return sb.substring(0, Math.max(p1, 0));
    }
}
