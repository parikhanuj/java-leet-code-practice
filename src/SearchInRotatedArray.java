public class SearchInRotatedArray {
    public int search(int[] nums, int target) {
        int n = nums.length;
        int minIndex = getMinIndex(nums);

        int result = binarySearch(nums, target, 0, minIndex - 1);
        if (result != -1)
            return result;

        result = binarySearch(nums, target, minIndex, nums.length - 1);
        return result;
    }

    private int binarySearch(int[] nums, int target, int left, int right) {
        while (left <= right) {
            int mid = (left + right) / 2;
            if (nums[mid] == target) {
                return mid;
            } else if (nums[mid] < target) {
                left = mid + 1;
            } else {
                right = mid - 1;
            }
        }
        return -1;
    }

    private int getMinIndex(int[] nums) {
        int left = 0;
        int right = nums.length - 1;

        while (left < right) {
            int mid = left + (right - left) / 2;
            if (nums[mid] < nums[right]) {
                right = mid;
            } else {
                left = mid + 1;
            }
        }

        return left;
    }
}
