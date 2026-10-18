class Solution {
  /**
   * @param {number[]} nums
   * @param {number} k
   * @return {number}
   */
  findKthLargest(nums, k) {
    let max = nums[0];
    let visited = {};

    function run(j) {
      if (j > k) return;
      max = Math.min(...nums);
      let id = 0;
      for (let i = 0; i < nums.length; i++) {
        if (!(i in visited) && nums[i] > max) {
          max = nums[i];
          id = i;
        }
      }
      visited[id] = true;
      run(j + 1);
    }
    run(1);
    return max;
  }
}