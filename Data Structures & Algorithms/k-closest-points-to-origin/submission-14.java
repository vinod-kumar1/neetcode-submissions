class Pair{
int val;
int[] arr = new int[2];

Pair(int x, int y){
arr[0] = x;
arr[1] = y;
}

}

class Solution {
    public int[][] kClosest(int[][] points, int k) {
        
PriorityQueue<int[]> pq = new PriorityQueue<>((a,b) -> (b[0] * b[0] + b[1] * b[1]) - (a[0] * a[0] + a[1] * a[1]));

for(int[] temp : points){
    pq.offer(temp);
    if(pq.size() > k) pq.poll();
}


int[][] res = new int[k][2];
int idx = 0;

while(!pq.isEmpty()) res[idx++] = pq.poll();

return res;

    }
}
