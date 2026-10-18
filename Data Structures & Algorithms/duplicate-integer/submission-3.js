class Solution {
    /**
     * @param {number[]} nums
     * @return {boolean}
     */
    hasDuplicate(nums) {
        let dp = {};

for(let i=0; i < nums.length; i++){
    if(nums[i] in dp) return true;
    dp[nums[i]] = true;
}
return false;
    }
}
