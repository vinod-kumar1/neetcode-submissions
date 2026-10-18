class Solution {
    public int lastStoneWeight(int[] stones) {
 PriorityQueue<Integer> pq = new PriorityQueue<>(Collections.reverseOrder());

for(int n : stones) pq.offer(n);

while(pq.size() > 1){
    int n = pq.poll();
    int m = pq.poll();
pq.offer(Math.abs(n - m));
}

 return pq.peek();
    }
}
