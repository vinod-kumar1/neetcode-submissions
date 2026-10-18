class Solution {
    public int eraseOverlapIntervals(int[][] intervals) {
        Arrays.sort(intervals, (a,b) -> Integer.compare(a[0] , b[0]));

       int s = intervals[0][0], e = intervals[0][1];
int len = intervals.length;
       int count = 0;

       for(int i=1; i < len; i++){
        int st = intervals[i][0], ed = intervals[i][1];
        if(st < e){
            count++;
            e = Math.min(e ,ed); // we ignore the long ending interval as it might overlap some other one so we only take the smaller ending one and move on
        }
        else{
            s = st;
            e = ed;
        }
       }
    
    return count;
    }
}
