class Solution {
    public int mostBooked(int n, int[][] meetings) {
        Arrays.sort(meetings, (a,b) -> {
         if(a[0] == b[0]) return Integer.compare(a[1] , b[1]);
           return Integer.compare(a[0] , b[0]);
        });

PriorityQueue<int[]> pq1 = new PriorityQueue<>((a,b) -> {
   if(a[1] == b[1]) return Integer.compare(a[0] , b[0]);
   return Integer.compare(a[1] , b[1]);
    });

PriorityQueue<Integer> pq2 = new PriorityQueue<>();

for(int i =0; i < n; i++) pq2.offer(i);

int res[] = new int[n];

for(int[] temp :  meetings){
    int s = temp[0] , e = temp[1];

while(!pq1.isEmpty() && s >= pq1.peek()[1]) pq2.offer(pq1.poll()[0]);

int room;
if(pq2.isEmpty()){
int delay = pq1.peek()[1];
room = pq1.poll()[0];
e = delay + (e - s);
}
else{
room = pq2.poll();
}

res[room]++;
pq1.offer(new int[] {room , e});

}

int max = 0;

for(int i = 0; i < n; i++){
if(res[i] > res[max]) max = i;    
}

return max;
    }
}