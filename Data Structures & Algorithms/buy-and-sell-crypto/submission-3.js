class Solution {
    /**
     * @param {number[]} prices
     * @return {number}
     */
    maxProfit(prices) {
        let l = 0;
        let r = 1;
    let max = 0;

while(r < prices.length){
let sell = prices[r]
let buy = prices[l]

if(sell > buy) max = Math.max(max, sell- buy);
else l = r;
r++;
}
return max;
    }}