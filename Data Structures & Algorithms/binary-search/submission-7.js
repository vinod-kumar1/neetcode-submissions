class Solution {
    /**
     * @param {number[]} nums
     * @param {number} target
     * @return {number}
     */
    search(nums, target) {
        let l = 0;
        let r = nums.length-1;
if(nums.length <=1) return nums.indexOf(target);

        while(l < r){
if(nums[l] == target) return l;
if(nums[r] == target) return r;

            let m = l + Math.floor(((r-l) / 2));
            if(nums[m] > target)  r = m-1;
            else if(nums[m] < target) l = m+1;
            else if(nums[m] == target) return m;
        }
    return -1;
    }
}
