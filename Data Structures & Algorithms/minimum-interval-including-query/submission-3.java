class Solution {
    public int[] minInterval(int[][] intervals, int[] queries) {

    Arrays.sort(intervals, (a,b) -> Integer.compare(a[0] , b[0]));
    int[][] sortedQ = new int[queries.length][2];
        
for(int i=0; i < queries.length; i++){
    sortedQ[i][0] = queries[i];
    sortedQ[i][1] = i;
}
Arrays.sort(sortedQ, (a,b) -> Integer.compare(a[0] , b[0]));

int len = intervals.length;
int[] res = new int[queries.length];
int idx = 0;

PriorityQueue<int[]> pq = new PriorityQueue<>((a,b) -> Integer.compare(a[0] , b[0]));
int i = 0;

    for(int item[] : sortedQ){
int n = item[0];
int oidx = item[1];

while(i < len && intervals[i][0] <= n){
    int st = intervals[i][0], ed = intervals[i][1];
    
    pq.offer(new int[] {ed - st + 1, ed});
    
    i++;
}

while(!pq.isEmpty() && pq.peek()[1] < n) pq.poll();

if(pq.isEmpty()) res[oidx] = -1;
else res[oidx] = pq.peek()[0];

    }


return res;
    }
}
