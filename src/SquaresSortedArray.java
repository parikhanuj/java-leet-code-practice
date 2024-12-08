// https://leetcode.com/problems/squares-of-a-sorted-array/

public class SquaresSortedArray {
    public int[] sortedSquares(int[] nums) {
        int p1 = 0;
        int p2 = 0;
        int i = 0;
        int[] sortSquares = new int[nums.length];
        while (p1 < nums.length && nums[p1] < 0) {
            p1++;
            p2++;
        }
        p1--;
        if (p2 < nums.length && nums[p2] == 0) {
            sortSquares[i++] = 0;
            p2++;
        }
        while (p2 < nums.length && p1 >= 0) {
            if (-1 * nums[p1] < nums[p2]) {
                sortSquares[i++] = nums[p1] * nums[p1];
                p1--;
            } else {
                sortSquares[i++] = nums[p2] * nums[p2];
                p2++;
            }
        }
        while (p2 < nums.length) {
            sortSquares[i++] = nums[p2] * nums[p2];
            p2++;
        }
        while (p1 >= 0) {
            sortSquares[i++] = nums[p1] * nums[p1];
            p1--;
        }
        return sortSquares;
    }
}
