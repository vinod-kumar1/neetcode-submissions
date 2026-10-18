class Solution {
    /**
     * @param {number[]} nums
     * @return {number[]}
     */
    sortArray(nums) {
  let res = [...nums];
  for(let i=0; i< res.length; i++){
    for(let j=0; j < nums.length-i; j++){
if(res[j] > res[j+1]) [res[j], res[j+1]] = [res[j+1], res[j]];
    }
  }
  return res;
  }
}