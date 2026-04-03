class Solution {
    public int maxProfit(int[] prices) {
        int maxProfit = 0;
        int buy = 0;
        int sell = 1;
        while(sell < prices.length) {
            int currentProfit = 0;
            if(prices[buy] >= prices[sell]) {
                buy = sell;
            } else {
                currentProfit = Math.abs(prices[buy] - prices[sell]);    
            }
            sell++;
            maxProfit = Math.max(maxProfit, currentProfit);
        }
        return maxProfit;
    }
}
