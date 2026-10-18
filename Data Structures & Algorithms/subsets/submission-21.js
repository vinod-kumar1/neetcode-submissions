class Solution {
    /**
     * @param {number[]} nums
     * @return {number[][]}
     */
    subsets(nums) {
      let res = [[]];

for(let n of nums){
let s = res.length;

for(let i=0; i < s; i++){
  let temp = res[i].slice();
  temp.push(n);
  res.push(temp);
}

}
    return res;
    }
}
