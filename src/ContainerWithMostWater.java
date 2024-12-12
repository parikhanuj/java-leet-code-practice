class ContainerWithMostWater {
    public int maxArea(int[] height) {
        int maxVolume = Integer.MIN_VALUE;
        int left = 0;
        int right = height.length - 1;
        while (left < right) {
            maxVolume = Math.max(maxVolume, ((right - left) * Math.min(height[right], height[left])));
            if (height[left] < height[right]) {
                left++;
            } else {
                right--;
            }
        }
        return maxVolume;
    }
}