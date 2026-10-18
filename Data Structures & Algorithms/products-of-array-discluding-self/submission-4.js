class Solution {
    /**
     * @param {number[]} nums
     * @return {number[]}
     */
productExceptSelf(res) {
  let nums = [...res];
  function checkProd(k) {
    let prod = 1;
    for (let i = 0; i < nums.length; i++) {
      if (i == k) continue;
      else prod = prod * res[i];
    }
    return prod;
  }

  let total = res.reduce((acc, cv) => (acc = acc * cv));

  if (!res.includes(0)) {
    for (let i = 0; i < res.length; i++) {
      nums[i] = total / res[i];
    }
  } else {
    for (let i = 0; i < nums.length; i++) {
      if (res[i] == 0) nums[i] = checkProd(i);
      else nums[i] = total / res[i];
    }
  }

  return nums;
}
}
