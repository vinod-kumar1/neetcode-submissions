/**
 * Definition of Interval:
 * class Interval {
 *   constructor(start, end) {
 *     this.start = start;
 *     this.end = end;
 *   }
 * }
 */

class Solution {
    /**
     * @param {Interval[]} intervals
     * @returns {boolean}
     */
    canAttendMeetings(intervals) {
   let res = []
intervals = intervals.map(x => [x.start , x.end]);

function check([s,e]){
for(let i=0; i < res.length; i++){
    let [x,y] = res[i];
    if((x > s && x < e) || (y > s && y < e) || (s > x && s < y) || (e > x && e < y) || (x == s && e == y)) return false;
}
res.push([s,e]);
return true;
}

    for(let i=0; i < intervals.length; i++){
if(!check(intervals[i])) return false;
    }
    return true;
    }
}
