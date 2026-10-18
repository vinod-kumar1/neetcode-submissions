class Solution {
    /**
     * @param {number[]} nums
     * @return {number}
     */
firstMissingPositive(nums) {
  let missing = 1;
  let i = 0;
  while (i < nums.length) {
    if (nums[i] == missing) {
      missing++;
      i = 0;
      continue;
    }
    i++;
  }
  return missing;
}
}