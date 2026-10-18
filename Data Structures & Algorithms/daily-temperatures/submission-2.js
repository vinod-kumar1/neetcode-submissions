class Solution {
  /**
   * @param {number[]} temperatures
   * @return {number[]}
   */
  dailyTemperatures(res) {
    let out = [];
    let i = 0;
    let j = i + 1;

    while (i < res.length) {
      console.log("tes");
      if (res[j] > res[i]) {
        out.push(j - i);
        i++;
        j = i + 1;
      } else {
        if (j >= res.length - 1) {
          out.push(0);
          i++;
          j = i + 1;
        } else j++;
      }
    }
    return out;
  }
}