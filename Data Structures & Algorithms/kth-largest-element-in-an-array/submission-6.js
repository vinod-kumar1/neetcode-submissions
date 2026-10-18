class Solution {
  /**
   * @param {number[]} nums
   * @param {number} k
   * @return {number}
   */
  findKthLargest(nums, k) {
let max;
for(let i=0; i < k; i++){
    max = Math.max(...nums);
    nums.splice(nums.indexOf(max),1);
}
return max;

  }
}