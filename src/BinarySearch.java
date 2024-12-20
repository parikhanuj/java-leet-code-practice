class BinarySearch {
    public int search(int[] nums, int target) {
        int left = 0;
        int right = nums.length - 1;

        while (left <= right) {
            int midPointer = (left + right) / 2;
            int midNumber = nums[midPointer];
            if (midNumber == target) return midPointer;
            else if (midNumber <= target) {
                left = midPointer + 1;
            } else {
                right = midPointer - 1;
            }
        }

        return -1;
    }
}
