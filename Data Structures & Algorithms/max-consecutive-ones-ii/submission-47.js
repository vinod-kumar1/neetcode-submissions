class Solution {
    /**
     * @param {number[]} nums
     * @return {number}
     */
    findMaxConsecutiveOnes(nums) {
      let k = nums.indexOf(0);
      let sum = 0;
      let lzi = -1;
      let max = 0;

      for(let i=0; i < nums.length; i++){
        if(nums[i] == 1 || i == k) sum++;
        else{

let t = i - lzi;
if(sum > max) max = sum;
sum-=t;
lzi = i;          
        }
      if(sum > max) max = sum;
      }
    return max;
    }
}
