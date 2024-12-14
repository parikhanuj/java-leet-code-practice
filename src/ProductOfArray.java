public class ProductOfArray {
    public int[] productExceptSelf(int[] nums) {
        int productWithoutZero = 1;
        boolean isZeroPresent = false;
        int zeroCounter = 0;
        for (int num: nums) {
            if (num != 0) {
                productWithoutZero *= num;
            } else {
                zeroCounter++;
                isZeroPresent = true;
            }
        }

        for (int i = 0; i < nums.length; i++) {
            if (zeroCounter > 1) {
                nums[i] = 0;
            } else if (nums[i] == 0) {
                nums[i] = productWithoutZero;
            } else if (isZeroPresent) {
                nums[i] = 0;
            } else {
                nums[i] = productWithoutZero/nums[i];
            }
        }

        return nums;
    }
}
