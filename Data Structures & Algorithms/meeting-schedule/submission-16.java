/**
 * Definition of Interval:
 * public class Interval {
 *     public int start, end;
 *     public Interval(int start, int end) {
 *         this.start = start;
 *         this.end = end;
 *     }
 * }
 */

class Solution {
    public boolean canAttendMeetings(List<Interval> intervals) {
    if(intervals.size() == 0) return true;
    Collections.sort(intervals , (a,b) -> {
        if(a.start < b.start) return -1;
        else if(a.start > b.start) return 1;
        return Integer.compare(a.end , b.end);
    });

    int s = intervals.get(0).start, e = intervals.get(0).end;
int len = intervals.size();

    for(int i=1; i < len ; i++){
       int st = intervals.get(i).start, ed = intervals.get(i).end;


       if((s > st && s < ed) || (e > st && e < ed) || (s < st && e > ed) || (s == st && e == ed)) return false;
       else {
        s = st;
        e = ed;
       }
    }

return true;
    }
}
