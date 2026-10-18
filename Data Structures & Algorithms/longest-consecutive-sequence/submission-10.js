class Solution {
    /**
     * @param {number[]} nums
     * @return {number}
     */
    longestConsecutive(nums) {
        if(!nums.length) return 0;
        nums = nums.sort((a,b) => a-b);
let res = [];
let temp = [];
        for(let i=0; i< nums.length; i++){
            if(nums[i] == nums[i+1]) continue;
            if(nums[i] + 1 == nums[i+1]) temp.push(nums[i]);
        else{
                    temp.push(nums[i + 1]);
           if(temp.length) res.push(temp);
            temp = [];
        }
        }

        res = res.map(x => x.length);
        return Math.max(...res);
    }
}
