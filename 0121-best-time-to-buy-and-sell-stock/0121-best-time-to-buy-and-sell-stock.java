class Solution {
    public int maxProfit(int[] prices) {
        int minPrice = prices[0];
        int profit;
        int maxProfit = 0;
        for(int i = 0;i<prices.length;i++){
            profit = prices[i]-minPrice;
            minPrice = Math.min(minPrice,prices[i]);
            maxProfit = Math.max(maxProfit,profit);
        }
        return maxProfit;
    }
}