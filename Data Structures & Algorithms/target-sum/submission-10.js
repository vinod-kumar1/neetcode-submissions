class Solution {
    /**
     * @param {number[]} nums
     * @param {number} target
     * @return {number}
     */
    findTargetSumWays(nums, target) {
        let res = 0;

        function rec( i, curSum){
if(i >= nums.length){
    return curSum == target ? 1 : 0;
};

return rec(i+1 , curSum + nums[i]) + rec(i+1 , curSum - nums[i]);

        }
       return rec( 0, 0);
    // return res;
    }
}
