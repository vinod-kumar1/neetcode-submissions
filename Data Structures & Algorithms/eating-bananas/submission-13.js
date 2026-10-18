class Solution {
  /**
   * @param {number[]} piles
   * @param {number} h
   * @return {number}
   */
  minEatingSpeed(piles, h) {
    if(piles.length ==1) return Math.ceil(piles[0] / h);
    let l = 1;
    let r = Math.max(...piles);

 
    while (l < r) {
      let m = l + Math.floor((r - l) / 2);
      console.log(m);
      let res = 0;
      for (let i = 0; i < piles.length; i++) {
        let pile = piles[i];
        res += Math.ceil(pile / m);
        if (res > h) {
          res = 0;
          l = m + 1;
          break;
        }
        if (i >= piles.length - 1) r = m;
      }
    }
    return l;
  }
}