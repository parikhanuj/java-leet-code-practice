public class FindMinToTargetInSortedArray {
  public int find(int[] sortedArray, int target) {
    int left = 0;
    int right = sortedArray.length - 1;

    while (left <= right) {
      int mid = left + (right - left) / 2;
      if (sortedArray[mid] == target) return sortedArray[mid];
      else if (sortedArray[mid] > target) {
        right = mid - 1;
        if (sortedArray[right] < target) return sortedArray[right];
      } else {
        left = mid + 1;
        if (sortedArray[left] > target) return sortedArray[left - 1];
      }
    }
    return -1;
  }
}
