class Solution {
    /**
     * @param {number[]} nums
     * @param {number} target
     * @return {number}
     */
    findTargetSumWays(nums, target) {
        let res = new Map();
res.set(0,1);

        for(let n of nums){
            let temp = new Map();
            for(let [t,c] of res){
temp.set(t+n , (temp.get(t + n) || 0) + c)
temp.set(t-n , (temp.get(t - n) || 0) + c)
            }
            res = temp;
                    }
return res.get(target) || 0;
    }
}
