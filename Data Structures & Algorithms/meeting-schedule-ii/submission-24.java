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
    public int minMeetingRooms(List<Interval> intervals) {
int len = intervals.size();

int st[] = new int[len];
int ed[] = new int[len];
int idx = 0;

for(Interval temp : intervals){
st[idx] = temp.start;
ed[idx++] = temp.end;
}

Arrays.sort(st);
Arrays.sort(ed);

int i = 0, j = 0;
int rooms = 0, max = 0;

while(i < len){
    int s = st[i], e = ed[j];

    if(s < e){
        rooms++;
        i++;
    }
    else{
        j++;
        rooms--;
    }
    max = Math.max(max , rooms);
}

return max;
    }
}
