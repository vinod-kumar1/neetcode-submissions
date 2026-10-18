class Solution {
    public int maxProfit(int[] prices) {
        int p = 0;
        int b = prices[0];

        for(int i=1; i < prices.length; i++){
if(prices[i] < b) b = prices[i];
if(p < prices[i] - b) p = prices[i] - b;
        }
        return p;
    }
}
