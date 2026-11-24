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
        if(intervals.isEmpty()) return true;
        
Collections.sort(intervals , ( a , b) -> Integer.compare(a.start , b.start));

int num = intervals.get(0).end;

for(int i = 1; i < intervals.size() ; i++){
    Interval temp = intervals.get(i);

    int s = temp.start , e = temp.end;
    if(num > s) return false;
    num = e;
}

return true;
    }
}
