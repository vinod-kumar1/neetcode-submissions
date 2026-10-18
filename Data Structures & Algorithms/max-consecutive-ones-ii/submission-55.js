class Solution {
    /**
     * @param {number[]} nums
     * @return {number}
     */
    findMaxConsecutiveOnes(nums) {
      let nz = 0;
      let r = 0, l=0;
      let max = 0;

 while(r < nums.length){
if(nums[r] != 1) nz++;

while(nz > 1){
  if(nums[l] == 0) nz--;
  l++;
}
let t = r-l+1;
if(t > max) max = t;
r++;
      }
      return max;
    }
}
