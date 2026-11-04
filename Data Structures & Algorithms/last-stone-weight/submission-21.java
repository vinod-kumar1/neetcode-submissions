class Solution {
    public int lastStoneWeight(int[] stones) {
        PriorityQueue<Integer> pq = new PriorityQueue<>(Collections.reverseOrder());

        for(int n : stones){
            pq.offer(n);

        }
        
            while(pq.size() >= 2){
                int x = pq.poll(), y = pq.poll();
                int rem = Math.abs(x - y);
                if(rem > 0) pq.offer(rem);
            }
    
    return pq.isEmpty() ? 0 : pq.peek();
    }
}
