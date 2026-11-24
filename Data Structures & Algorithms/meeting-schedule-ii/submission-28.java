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
Collections.sort(intervals , (a , b) -> {
    if(a.start == b.start) return Integer.compare(a.end , b.end);
    return Integer.compare(a.start , b.start);
});

PriorityQueue<Integer> pq = new PriorityQueue<>();
int rooms = 0;

for(Interval item : intervals){
    while(!pq.isEmpty() && item.start >= pq.peek()) pq.poll();
    pq.offer(item.end);
rooms = Math.max(pq.size() , rooms);    
} 

return rooms;
    }
}
