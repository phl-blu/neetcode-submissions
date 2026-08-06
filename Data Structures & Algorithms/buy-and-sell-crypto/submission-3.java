class Solution {
    public int maxProfit(int[] prices) {
        // loop until find lowest
        // sell at next highest price
        // profit = loop - sell
        // 2 pointers?
        if (prices == null || prices.length == 0) return 0;

        int minPrice = prices[0];
        int maxProfit = 0;

        for (int i = 1; i < prices.length; i++) {
            // 1. Track the lowest price we have seen so far
            if (prices[i] < minPrice) {
                minPrice = prices[i];
            } 
            // 2. See if selling today beats our best profit so far
            else if (prices[i] - minPrice > maxProfit) {
                maxProfit = prices[i] - minPrice;
            }
        }

        return maxProfit;
    }
}
