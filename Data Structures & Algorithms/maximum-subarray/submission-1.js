class Solution {
    /**
     * @param {number[]} nums
     * @return {number}
     */
    maxSubArray(nums) {
        let max = nums[0];
        let c = 0;

        for(let num of nums){
            if(c < 0) c=0;
            c+=num;
            if(c > max) max = c;
        }
        return max;
    }
}
