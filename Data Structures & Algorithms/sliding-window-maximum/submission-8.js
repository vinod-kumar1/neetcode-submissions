class Solution {
    /**
     * @param {number[]} nums
     * @param {number} k
     * @return {number[]}
     */
    maxSlidingWindow(nums, k) {
        let res = [];

        for(let i=0; i <= nums.length-k; i++) res.push(Math.max(...nums.slice(i, i+k)))
        return res;
    }
}
