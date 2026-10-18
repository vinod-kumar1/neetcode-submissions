class Solution {
  /**
   * @param {number[][]} points
   * @param {number} k
   * @return {number[][]}
   */
  kClosest(points, k) {
    let res = {};
    for (let i = 0; i < points.length; i++) {
      let [x, y] = points[i];
      let cal = Math.sqrt(Math.pow(x, 2) + Math.pow(y, 2)).toFixed(2);
      if (cal in res) {
        res[cal].push([x, y]);
      } else res[cal] = [[x, y]];
    }
    let ks = [];
    let mins = Object.keys(res);
   while(ks.length < k){
      let id = Math.min(...mins.map(Number));
      ks.push(...res[id.toFixed(2)]);
      mins.splice(mins.indexOf(id.toFixed(2)), 1);
   }
   
    // for (let i = 0; i < k; i++) {
    // }
    return ks;
  }
}