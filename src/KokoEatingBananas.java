import java.util.Arrays;

public class KokoEatingBananas {
    public int minEatingSpeed(int[] piles, int h) {
        Arrays.sort(piles);
        int minEatingRate = piles[piles.length - 1];
        int left = 1;
        int right = piles[piles.length - 1];
        while (left <= right) {
            int hoursTaken = 0;
            int midPointEatingRate = left + (right - left) / 2;
            boolean canEatAll = canEatAll(piles, h, midPointEatingRate);
            if (canEatAll) {
                minEatingRate = midPointEatingRate;
                right = midPointEatingRate - 1;
            } else {
                left = midPointEatingRate + 1;
            }
        }
        return minEatingRate;
    }

    private boolean canEatAll(int[] piles, int h, int eatingRate) {
        int hoursTaken = 0;
        for (int pile : piles) {
            hoursTaken += (pile + eatingRate - 1) / eatingRate;
            if (hoursTaken > h) {
                return false;
            }
        }
        return true;
    }
}
