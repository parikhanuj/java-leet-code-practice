class ShortestUnsortedArray {
    public int findUnsortedSubarray(int[] nums) {
        if (nums.length <= 1) {
            return 0;
        }
        int min = Integer.MAX_VALUE;
        int max = Integer.MIN_VALUE;

        for (int i = 1; i < nums.length; i++) {
            if (nums[i] < nums[i - 1]) {
                min = Math.min(min, nums[i]);
            }
        }

        for (int j = nums.length - 2; j >= 0; j--) {
            if (nums[j] > nums[j + 1]) {
                max = Math.max(max, nums[j]);
            }
        }

        int start, end;
        for (start = 0; start < nums.length; start++) {
            if (nums[start] > min) {
                break;
            }
        }

        for (end = nums.length - 1; end >= 0; end--) {
            if (nums[end] < max) {
                break;
            }
        }

        return end - start < 0 ? 0 : end - start + 1;
    }
}