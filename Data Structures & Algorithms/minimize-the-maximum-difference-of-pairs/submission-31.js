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

    let dp = Array.from({ length: nums.length + 1 }, () =>
      Array(nums.length + 1),
    );

      for (let i = 0; i < nums.length - 1; i++) dp[i][i + 1] = Math.abs(nums[i] - nums[i + 1]);


    function isValid(thr) {
      let count = 0;
      for (let i = 0; i < nums.length - 1; i++) {
        if (dp[i][i+1] <= thr) {
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
      console.log(res);
    }

    return res;
  }
}