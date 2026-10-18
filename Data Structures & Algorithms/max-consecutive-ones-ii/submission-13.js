class Solution {
  /**
   * @param {number[]} nums
   * @return {number}
   */
  findMaxConsecutiveOnes(nums) {
    let max = 0;
    let temp = 0;
    let lzi = -1;
    let flp = false;

    for (let i = 0; i < nums.length; i++) {
      if (nums[i] == 1) temp++;
      else {
        if (flp) {
          let t = i - Math.max(lzi, 0);
          max = Math.max(temp, max);
          temp = t;
          flp = false;
          continue;
        }
 flp = true;
        temp++;
        lzi = i;
      }
    }
    max = Math.max(temp , max);
    return max;
  }
}