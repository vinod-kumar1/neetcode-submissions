class Solution {
    public int maxProfit(int[] prices) {
int buy = prices[0];
int max = 0;

for(int i=1; i < prices.length; i++){
    int n = prices[i];
    if(n < buy) buy = n;
    else max = Math.max(max, n - buy);
}
    return max;
    }
}
