class Solution {
    /**
     * @param {number[]} nums
     * @return {number[]}
     */
    sortArray(nums) {
let res = [...nums];
  if (res[0] > res[1]) [res[0], res[1]] = [res[1], res[0]];

  function sortLastNum(i, res) {
    let temp = [...res];
    for (let j = i; j > 0; j--) {
      if (temp[j] < temp[j - 1])
        [temp[j], temp[j - 1]] = [temp[j - 1], temp[j]];
    }
    return temp;
  }

  for (let i = 2; i < res.length; i++) {
    if (res[i] < res[i - 1]) {
      [res[i], res[i - 1]] = [res[i - 1], res[i]];
      res = sortLastNum(i - 1, res);
    }
    // console.log("res", res, i);
  }
  return res;
    }
}
