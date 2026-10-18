class Solution {
    /**
     * @param {number[]} nums
     * @return {number}
     */
    lengthOfLIS(nums) {
        let dp = [];
        function run(i){
            if(dp[i] != undefined) return dp[i];
let max = 1;
for(let j=i+1; j < nums.length; j++){
    if(nums[i] < nums[j]) max = Math.max(max, 1 + run(j));
}
dp[i] = max;
return max;
        }
    return Math.max(...nums.map((_,i) => run(i)));
    }
}
