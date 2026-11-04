class KthLargest {
PriorityQueue<Integer> pq;
int max = 0;

    public KthLargest(int k, int[] nums) {
max = k;
pq = new PriorityQueue<>();        
for(int n : nums) pq.offer(n);

    }
    
    public int add(int val) {
        pq.offer(val);
        while(pq.size() > max) pq.poll();

        return pq.peek();
    }
}
