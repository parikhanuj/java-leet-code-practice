import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.stream.Collectors;

public class MinWindowSubString {

    private Map<Character, Integer> tCharMap = new HashMap<>();
    private Map<Character, Integer> sCharMap = new HashMap<>();

    public String minWindow(String s, String t) {

    if (s.length() < t.length()) return "";

    boolean isSubStringPresent = false;
    String result = s;

    for (int i = 0; i < t.length(); i++) {
        char charAtI = t.charAt(i);
        tCharMap.put(charAtI, tCharMap.getOrDefault(charAtI, 0) + 1);
    }

    int left = 0;
    int right = 0;
    while (right < s.length()) {
        char charAtRight = s.charAt(right);
        sCharMap.put(charAtRight, sCharMap.getOrDefault(charAtRight, 0) + 1);
        while (isSubStringPresent()) {
        isSubStringPresent = true;
        result = result.length() > s.substring(left, right + 1).length() ? s.substring(left, right + 1) : result;
        char charAtLeft = s.charAt(left);
        sCharMap.put(charAtLeft, sCharMap.get(charAtLeft) - 1);
        left++;
        }
        right++;
    }

    return isSubStringPresent ? result : "";
    }

    private boolean isSubStringPresent() {
    if (!sCharMap.keySet().containsAll(tCharMap.keySet())) return false;
    List<Character> misMatchChar = tCharMap.keySet().stream().filter(key ->
        sCharMap.containsKey(key) && tCharMap.get(key) > sCharMap.get(key)).collect(Collectors.toList());
    return misMatchChar.isEmpty();
    }
}
