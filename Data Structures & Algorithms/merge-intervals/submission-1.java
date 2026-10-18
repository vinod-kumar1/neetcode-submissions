class Solution {
    public int[][] merge(int[][] intervals) {
        Arrays.sort(intervals, (a,b) -> Integer.compare(a[0] , b[0]));
        ArrayList<int[]> res = new ArrayList<>();
        int s = intervals[0][0], e = intervals[0][1];
int len = intervals.length;

        for(int i=1; i < len; i++){
          int st = intervals[i][0], ed = intervals[i][1];
          if((s >= st && s <= ed) || (e >= st && e <= ed) || (s < st && e > ed)){
            e = Math.max(e , ed);
          }
          else{
            res.add(new int[] {s , e});
            s = st;
            e = ed;
          }
        }

res.add(new int[] {s , e});
int[][] out = new int[res.size()][2];
int idx = 0;

for(int temp[] : res) out[idx++] = new int[] {temp[0] , temp[1]};

return out;

    }
}
