public class TrappingRainWater {
    public int trap(int[] height) {
        int volume = 0;
        int start = 0;
        int end = height.length - 1;
        while (start < end && height[start] < height[start + 1]) {
            start++;
        }
        while (end > 0 && height[end] < height[end - 1]) {
            end--;
        }
        int left = start;
        int right = start + 1;

        while (right < end) {
            while (right < end && height[left] > height[right]) {
                right++;
            }
            volume += calculateVolume(height, left, right);
            left = right;
            right++;
        }
        return volume;
    }

    private int calculateVolume(int[] height, int start, int end) {
        int volume = 0;
        for (int i = start + 1; i < end; i++) {
            int minWallHeight = Math.min(height[start], height[end]);
            int calcVolume = minWallHeight - height[i];
            volume += Math.max(calcVolume, 0);
        }
        return volume;
    }
}
