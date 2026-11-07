class Solution {
    public boolean carPooling(int[][] trips, int capacity) {
     Arrays.sort(trips , (a,b) -> Integer.compare(a[1] , b[1]));
     PriorityQueue<int[]> pq = new PriorityQueue<>((a,b) -> Integer.compare(a[0] , b[0]));

int curcap = 0;

     for(int i = 0; i < trips.length; i++){
      int n = trips[i][0] , f = trips[i][1] , t = trips[i][2];
curcap += n;
while(!pq.isEmpty() && pq.peek()[0] <= f){
    curcap -= pq.poll()[1];
}

if(curcap > capacity) return false;
pq.offer(new int[] {t , n});

     }   

return true;
    }
}