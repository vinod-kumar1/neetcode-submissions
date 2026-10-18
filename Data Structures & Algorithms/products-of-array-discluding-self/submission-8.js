class Solution {
    /**
     * @param {number[]} nums
     * @return {number[]}
     */
    productExceptSelf(nums) {
        let res = [...nums];
          let total = res.reduce((acc, cv) => (acc = acc * cv));
 if(nums.includes(0) && nums.indexOf(0) != nums.lastIndexOf(0)) return new Array(nums.length).fill(0);
        if (!res.includes(0)) {
    for (let i = 0; i < nums.length; i++) {
      res[i] = total / nums[i];
    }
  }
  else{
let temp = new Array(nums.length).fill(0);
let prod = 1;
let k = nums.indexOf(0);

for(let i=0; i< nums.length; i++){
    if(i == k) continue;
    else prod = prod * nums[i];
}
temp[nums.indexOf(0)] = prod;
return temp;
  }
  return res;
    }
}
