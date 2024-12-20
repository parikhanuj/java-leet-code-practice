class BinarySearch {
    public int search(int[] nums, int target) {
        int left = 0;
        int right = nums.length - 1;

        while (left <= right) {
            if (nums[left] == target) return left;
            if (nums[right] == target) return right;
            if (nums[right] - nums[left] > target) right--;
            else left++;
        }

        return -1;
    }
}
