class Solution {
  /**
   * @param {number[]} nums
   * @return {number}
   */
  findMaxConsecutiveOnes(nums) {
    let left = 0;
    let max = 0;
    let zeroCount = 0;

    for (let right = 0; right < nums.length; right++) {
      // 1. Expand the window: count the zero if we find one
      if (nums[right] === 0) {
        zeroCount++;
      }

      // 2. Contract the window: if we have more than 1 zero, 
      // move 'left' until we've discarded one zero
      while (zeroCount > 1) {
        if (nums[left] === 0) {
          zeroCount--;
        }
        left++;
      }

      // 3. Update the maximum: window length is (right - left + 1)
      max = Math.max(max, right - left + 1);
    }

    return max;
  }
}