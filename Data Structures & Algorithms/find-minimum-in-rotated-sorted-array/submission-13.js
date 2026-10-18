class Solution {
    /**
     * @param {number[]} nums
     * @return {number}
     */
    findMin(nums) {
        if(nums.at(-1) > nums[0] || nums.length == 1) return nums[0];
        let l = 0;
        let r= nums.length;
        let x = nums[0];
        let lastMin = 0;

while(l <= r){
    let m = l + Math.floor((r-l) / 2);
    if(nums[m] >= x) l = m+1;
    else if(nums[m] < x){
    lastMin = nums[m];
        r=m-1;
    }}

return lastMin;
    }
}
