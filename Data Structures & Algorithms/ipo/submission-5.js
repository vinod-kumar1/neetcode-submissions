class Solution {
  /**
   * @param {number} k
   * @param {number} w
   * @param {number[]} profits
   * @param {number[]} capital
   * @return {number}
   */
  findMaximizedCapital(k, w, profits, capital) {

    if(!capital.some(c => c <= w)) return w;
    let idx = [];
    let r = w;

    while (k > 0) {
      let avp = [];
      for (let i = 0; i < profits.length; i++) {
        if (idx.indexOf(i) == -1 && capital[i] <= r) avp.push([profits[i], i]);
      }
      let maxProfit = 0;
      let pidx = -1;
      avp.forEach(([p, i]) => {
        if (p > maxProfit) {
          maxProfit = p;
          pidx = i;
        }
      });

      r -= capital[pidx];
      let total = capital[pidx] + maxProfit;
      r += total;
      idx.push(pidx);
      k--;
    }
    return r;
  }
}