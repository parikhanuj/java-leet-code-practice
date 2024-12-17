import java.util.HashMap;
import java.util.Map;

class LongestConsecutiveSeq {
    public int longestConsecutive(int[] nums) {
        Map<Integer, Boolean> presentAndConsiderMap = new HashMap<>();
        int maxLength = 0;
        for (int i = 0; i < nums.length; i++) {
            presentAndConsiderMap.put(nums[i], false);
        }
        for (int i = 0; i < nums.length; i++) {
            if (!presentAndConsiderMap.get(nums[i])) {
                int postiveSeq = nums[i];
                int negativeSeq = nums[i] - 1;
                int currentPositiveLength = 0;
                int currentNegativeLength = 0;

                while (presentAndConsiderMap.containsKey(postiveSeq)) {
                    presentAndConsiderMap.put(postiveSeq, true);
                    currentPositiveLength++;
                    postiveSeq++;
                }
                while (presentAndConsiderMap.containsKey(negativeSeq)) {
                    presentAndConsiderMap.put(negativeSeq, true);
                    currentNegativeLength++;
                    negativeSeq--;
                }
                maxLength = Math.max(maxLength, currentPositiveLength + currentNegativeLength);
            }
        }
        return maxLength;
    }
}
