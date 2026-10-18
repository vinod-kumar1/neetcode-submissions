class Solution {
    /**
     * @param {number[]} nums
     * @return {number}
     */
    firstMissingPositive(nums) {
let i=0;
let max = Math.max(...nums);

while(i < max){
i++;
if(nums.indexOf(i) == -1) return i;
}

return max+1 > 0  ? max+1 : 1;
    }
}
