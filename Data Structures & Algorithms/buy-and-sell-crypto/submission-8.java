class Solution {
    public int maxProfit(int[] prices) {
        int buy = prices[0];
        int prof = 0;
        
        for(int i = 1; i < prices.length; i++){
            int n = prices[i];
            if(n < buy) buy = n;

            if(n - buy > prof) prof = n - buy;
        }
    
    return prof;
    }
}
