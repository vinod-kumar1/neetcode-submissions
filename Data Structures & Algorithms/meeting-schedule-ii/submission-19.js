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
     * @returns {number}
     */
    minMeetingRooms(intervals) {
     let s = intervals.map(x => x.start).sort((a,b) => a - b);   
     let e = intervals.map(x => x.end).sort((a,b) => a - b);   
     let l=0;
     let r=0;
    let d = 0;
    let max = d;

    while(l < intervals.length){
        if(s[l] < e[r]){
d++;
l++;
}
else{
    d--;
    r++;
}
if(d > max) max = d;
    }
    return max;
    }
}
