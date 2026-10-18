class Solution {
  /**
   * @param {number[]} nums
   * @param {number} k
   * @return {number}
   */
  findKthLargest(nums, k) {
let visited={};
let max = -1;

function run(j){
if(j <= 0) return max;
max=-1;
let temp;

for(let i=0; i< nums.length; i++){
    if(!(i in visited) && nums[i] > max){
        max = nums[i];
        temp = i;
        }
}
visited[temp] = 1;
return run(j-1);
}

return run(k);

  }
}