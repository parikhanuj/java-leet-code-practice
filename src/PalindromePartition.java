import java.util.ArrayList;
import java.util.List;

public class PalindromePartition {
    List<List<String>> result = new ArrayList<>();

    public List<List<String>> partition(String s) {
        backtrack(new ArrayList<>(), 0, s);
        return result;
    }

    private void backtrack(List<String> partition, int index, String target) {

        if (index >= target.length()) {
            result.add(new ArrayList<>(partition));
            return;
        }

        String firstPartition = s.substring(0, index);
        partition.add("" + firstPartition);
        backtrack(partition, index + 1, firstPartition, target);
        partition.remove(partition.size() - 1);

        String secondPartition = s.substring(index, s.length() + 1);
        partition.add("" + secondPartition);
        backtrack(partition, index + 1, secondPartition, target);
    }

    private boolean isPalindrome(List<String> inputStrs) {
        for (String i: inputStrs) {
            String reverseI = new StringBuilder(i).reverse().toString();
            if (!i.equals(reverseI)) {
                return false;
            }
        }
        return true;
    }
}
