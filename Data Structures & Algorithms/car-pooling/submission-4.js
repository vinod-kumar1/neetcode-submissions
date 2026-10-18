class Solution {
  /**
   * @param {number[][]} trips
   * @param {number} capacity
   * @return {boolean}
   */
  carPooling(trips, capacity) {
    if (!trips.every((trip) => trip[0] <= capacity)) return false;
    let res = trips.sort((a, b) => b[1] - a[1]);

    let curCap = 0;
    let le = 0;
    let lc = 0;

   while(res.length){
let [c,s,e] = res.pop();
if(s >= le) curCap=0;
curCap+=c;
if(curCap > capacity) return false;

lc=c;
le = Math.max(le, e);

   }
  
  return true;
  }
}