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
        intervals = intervals.map(x => [x.start , x.end]).sort((a,b) => a[0] - b[0]);
        console.log(intervals);
for(let i=1; i < intervals.length; i++){
    let [px, py] = intervals[i-1];
    let [x,y] = intervals[i];
if(x < py) return false;
}
return true;
    }
}
