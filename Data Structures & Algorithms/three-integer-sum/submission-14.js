class Solution {
  /**
   * @param {number[]} nums
   * @return {number[][]}
   */
  threeSum(nums) {
    nums = nums.sort((a, b) => a - b);
    let res = [];
    for (let i = 0; i < nums.length; i++) {
    if(i> 0 && nums[i] == nums[i-1]) continue;
      let l = i + 1;
      let r = nums.length - 1;

      while (l < r) {
    let sum = nums[l] + nums[r] + nums[i];
        if (sum > 0) r--;
        else if (sum < 0) l++;
        else {
          res.push([nums[l], nums[r], nums[i]]);
          l++;
          r--;
          while (l < r && nums[l] == nums[l - 1]) l++;
        }
      }
    }
    return res;
  }
}