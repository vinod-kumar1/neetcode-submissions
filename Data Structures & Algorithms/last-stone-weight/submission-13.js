class Solution {
  /**
   * @param {number[]} stones
   * @return {number}
   */
  lastStoneWeight(stones) {
    function run(stones) {
      if (stones.length <= 1) return stones.length ? stones[0] : 0;
      let m1 = 0;
      let m2 = 0;
      let i1 = 0,
        i2 = 0;

      for (let i = 0; i < stones.length; i++) {
        if (stones[i] > m1) {
          m1 = stones[i];
          i1 = i;
        }
      }

      for (let j = 0; j < stones.length; j++) {
        if (stones[j] > m2 && j != i1) {
          m2 = stones[j];
          i2 = j;
        }
      }

      if (m1 == m2) {
        stones.splice(i1, 1);
        stones.splice(stones.indexOf(m2), 1);
      } else if (m1 > m2) {
        stones[i1] = stones[i1] - m2;
        stones.splice(i2, 1);
      } else {
        stones[i2] = stones[i2] - m1;
        stones.splice(i1, 1);
      }
      // console.log(m1, m2, stones);
      return run(stones);
    }
    return run(stones);
  }
}