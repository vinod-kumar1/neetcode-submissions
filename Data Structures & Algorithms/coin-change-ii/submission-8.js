class Solution {
    /**
     * @param {number} amount
     * @param {number[]} coins
     * @return {number}
     */
    change(amount, coins) {
let dp = Array(amount+1).fill(0);
dp[0] = 1;

        for(let c of coins){
            for(let a=1; a <= amount; a++){
dp[a]+= c <= a ? dp[a - c] : 0;
            }
        }
        return dp[amount];
    }
}
