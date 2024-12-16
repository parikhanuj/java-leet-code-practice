public class BestTimeStocks {
    public int maxProfit(int[] prices) {
        int p1 = 0;
        int maxProfit = 0;
        int minPrice = Integer.MAX_VALUE;

        while (p1 < prices.length) {
            if (minPrice >= prices[p1]) {
                minPrice = prices[p1];
            }
            maxProfit = Math.max(maxProfit, prices[p1] - minPrice);
            p1++;
        }

        return maxProfit;
    }
}
