class Solution {
    /**
     * @param {number[]} nums
     * @return {number[]}
     */
    sortArray(nums) {
  let res = [...nums];
  if(res[0] > res[1]) [res[0], res[1]] = [res[1], res[0]];

function sortFromLast(arr, i){
let temp = [...arr];
for(let i=temp.length-1; i>0; i--){
    if(temp[i] < temp[i-1]) [temp[i], temp[i-1]] = [temp[i-1], temp[i]]
}
return temp;
}

for(let i=2; i < res.length; i++){
    if(res[i] < res[i-1]){
        res = sortFromLast(res, i)
    } 
}
 return res;
  }
}