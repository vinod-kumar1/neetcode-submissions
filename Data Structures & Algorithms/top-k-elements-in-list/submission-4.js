class Solution {
    /**
     * @param {number[]} nums
     * @param {number} k
     * @return {number[]}
     */
    topKFrequent(nums, k) {
let obj = {};
for(let i=0; i< nums.length; i++){
    if(nums[i] in obj) obj[nums[i]]++;
    else obj[nums[i]] = 1;
}
let temp = Object.entries(obj).sort((a,b) => b[1] - a[1]);
let res = [];
for(let i=0 ;i < k; i++){
res.push(temp[i][0]);
}
return res;

}
}
