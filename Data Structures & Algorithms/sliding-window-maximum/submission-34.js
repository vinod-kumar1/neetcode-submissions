class Solution {
    /**
     * @param {number[]} nums
     * @param {number} k
     * @return {number[]}
     */
    maxSlidingWindow(nums, k) {
        let res = [];
        let dq = [];

        for(let i=0; i < nums.length; i++){
let x = nums[i];
if(dq.length){
    if(x > nums[dq[0]]) dq = [];
    else while(x > nums[dq.at(-1)]) dq.pop();
}

dq.push(i);

if(dq[0] == i-k) dq.shift();

if(i >= k-1) res.push(nums[dq[0]]);
            
}    return res;
    }
}
