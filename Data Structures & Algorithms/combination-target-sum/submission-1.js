class Solution {
    /**
     * @param {number[]} nums
     * @param {number} target
     * @returns {number[][]}
     */
    combinationSum(nums, target) {
  let res = [];

     function dfs(i , arr , s){
        // base cases
if(i >= nums.length || s > target) return;
if(s == target) {
    res.push(arr.slice(0));
    return;
}

// code
arr.push(nums[i]);

dfs(i , arr , s + nums[i]);
arr.pop();
dfs(i+1 , arr , s);
     } 

dfs(0 , [] , 0);
return res;
    }
}
