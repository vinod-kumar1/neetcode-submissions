class Solution {
    public int maxProfit(int[] prices) {
int l = 0, r = 1;
int max = 0;

while(r < prices.length){
    int n = prices[r];
    if(n > prices[l]) max = Math.max(max , prices[r] - prices[l]);
    else{
        l = r;
    }
r++;
}    
    return max;
    }
}
