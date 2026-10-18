class Solution {
    /**
     * @param {number[]} nums
     * @param {number} target
     * @returns {number[][]}
     */
    combinationSum(nums, target) {
        let res = [];
nums = nums.sort((A,b) => A-b);

        function dfs(i, arr , s){
if(i >= nums.length || s > target) return;
if(target == s){
    res.push(arr.slice(0));
return;
}

arr.push(nums[i]);
dfs(i , arr , s + nums[i]);
arr.pop();
dfs(i+1 , arr , s);
        }
        dfs(0,[],0);
        return res;
    }
}
