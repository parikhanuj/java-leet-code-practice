// https://leetcode.com/problems/sort-colors/description/

public class SortColors {
  public void sortColors(int[] nums) {
    int i = 0;
    int p0 = 0;
    int p2 = nums.length - 1;

    while (i <= p2) {
      if (nums[i] == 0) {
        swap(nums, i, p0);
        p0++;
      } else if (nums[i] == 2) {
        swap(nums, i, p2);
        p2--;
        i--;
      }
      i++;
    }
  }

  private void swap(int[] nums, int i1, int i2) {
    int temp = nums[i2];
    nums[i2] = nums[i1];
    nums[i1] = temp;
  }
}