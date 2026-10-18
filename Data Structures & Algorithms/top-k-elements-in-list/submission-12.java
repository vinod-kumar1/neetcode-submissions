class Solution {
    public int[] topKFrequent(int[] nums, int k) {
       HashMap<Integer, Integer> map = new HashMap<>();

       for(int n : nums) map.put(n , map.getOrDefault(n, 0) + 1);
PriorityQueue<int[]> pq = new PriorityQueue<>((a,b) -> Integer.compare(a[1] , b[1]));

for(int n : map.keySet()){
    pq.offer(new int[] { n , map.get(n)});
    if(pq.size() > k) pq.poll();
}

int idx = 0;
int[] res = new int[k];
while(!pq.isEmpty()) res[idx++] = pq.poll()[0];

return res;

    }
}
