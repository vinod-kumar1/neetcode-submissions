class Solution {
    /**
     * @param {number[]} prices
     * @return {number}
     */
    maxProfit(prices) {
        let b = 0;
        let s = -1;
        let p = 0;

        for(let i=1; i < prices.length; i++){
let x = prices[i];
let bb = prices[b];

if(x < bb) b = i;
else{
p += x - bb;
s = i;
b = i;
}
        }
return p;
    }
}
