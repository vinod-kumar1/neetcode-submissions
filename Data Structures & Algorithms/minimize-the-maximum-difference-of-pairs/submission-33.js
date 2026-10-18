class Solution {
  /**
   * @param {number[]} nums
   * @param {number} p
   * @return {number}
   */
  minimizeMax(nums, p) {
    let l = 0;
    let r = 1000000000;
    let res = 0;
    nums = nums.sort((a, b) => a - b);

    function isValid(thr) {
      let count = 0;
      for (let i = 0; i < nums.length - 1; i++) {
        if (Math.abs(nums[i] - nums[i + 1]) <= thr) {
          count++;
          i++;
        }
        if (count >= p) return true;
      }
      return false;
    }

    while (l <= r) {
      let m = l + Math.floor((r - l) / 2);
      if (isValid(m)) {
        r = m - 1;
        res = m;
      } else l = m + 1;
    }

    return res;
  }
}