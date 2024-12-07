public class BestTimeStocks {
    public int maxProfit(int[] prices) {
        int maxProfit = Integer.MIN_VALUE;
        int buy = 0;
        for (int sell = 0; sell < prices.length; sell++) {
            int currentProfit = prices[sell] - prices[buy];
            maxProfit = Math.max(maxProfit, currentProfit);
            if (currentProfit <= 0) {
                buy = sell;
            }
        }
        return maxProfit;
    }
}
