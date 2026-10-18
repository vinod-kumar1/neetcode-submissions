class Solution {
    /**
     * @param {number[]} nums
     * @return {number}
     */
    firstMissingPositive(nums) {
  let missing = 1;
  let temp = 0;
  let i = 0;
  while (i < nums.length) {
    if (i == 0) temp++;
    if (nums[i] == missing) {
      missing++;
      i = 0;
      continue;
    }
    i++;
  }
  console.log(temp);
  return missing;
}
}