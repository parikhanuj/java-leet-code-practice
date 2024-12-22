public class MedianOf2SortedArrays {
    public double findMedianSortedArrays(int[] nums1, int[] nums2) {
        if(nums1.length == 1 && nums2.length == 0) return nums1[0];
        if(nums2.length == 1 && nums1.length == 0) return nums2[0];
        int n = nums1.length;
        int m = nums2.length;
        int total = n + m;
        boolean isEven = total % 2 == 0;
        int mid = (total + 1) / 2;
        int p1 = 0;
        int p2 = 0;
        int counter = 0;
        int previousNum;
        int currentNum = -1;
        while (p1 < n || p2 < m) {
            if (p2 >= m || (p1 < n && nums1[p1] < nums2[p2])){
                previousNum = currentNum;
                currentNum = nums1[p1];
                p1++;
            }
            else {
                previousNum = currentNum;
                currentNum = nums2[p2];
                p2++;
            }

            if (counter == mid) {
                if (isEven) {
                    return (double) (previousNum + currentNum) / 2;
                } else {
                    return (double) previousNum;
                }
            }

            counter++;
        }
        return -1;
    }
}
