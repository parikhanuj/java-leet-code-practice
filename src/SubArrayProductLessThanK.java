// https://leetcode.com/problems/subarray-product-less-than-k/

public class SubArrayProductLessThanK {
  public int numSubarrayProductLessThanK(int[] nums, int k) {
    int count = 0;
    int left = 0;
    int product = 1;
    for (int right = 0; right < nums.length; right++) {
      product *= nums[right];
      while (left <= right && product >= k) {
        product = product/nums[left];
        left++;
      }
      count = count + right - left + 1;
    }
    return count;
  }
}
