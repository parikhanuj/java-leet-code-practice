import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;

public class SubStringWithAllWords {
    public List<Integer> findSubstring(String s, String[] words) {
        List<Integer> startingIndices = new ArrayList<>();
        int noOfWords = words.length;
        int wordLength = words[0].length();

        HashMap<String, Integer> wordOccMap = new HashMap<>();
        for (String x : words)
            wordOccMap.put(x, wordOccMap.getOrDefault(x, 0) + 1);

        for (int i = 0; i < wordLength; i++) {
            HashMap<String, Integer> temp = new HashMap<>();
            int count = 0;
            for (int p2 = i, p1 = i; p2 + wordLength <= s.length(); p2 = p2 + wordLength)
            {
                String word = s.substring(p2, p2 + wordLength);
                temp.put(word, temp.getOrDefault(word, 0) + 1);
                count++;

                if (count == noOfWords) {
                    if (wordOccMap.equals(temp)) {
                        startingIndices.add(p1);
                    }
                    String remove = s.substring(p1, p1 + wordLength);
                    temp.computeIfPresent(remove, (a, b) -> (b > 1) ? b - 1 : null);
                    count--;
                    p1 = p1 + wordLength;
                }
            }
        }
        return startingIndices;
    }
}
