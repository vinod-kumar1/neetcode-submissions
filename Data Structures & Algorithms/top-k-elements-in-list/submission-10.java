class Solution {
    public int[] topKFrequent(int[] nums, int k) {
        HashMap<Integer, Integer> map = new HashMap<>();
        for(int n : nums){
          if(!map.containsKey(n)) map.put(n , 0);
          map.put(n , map.get(n) + 1);
        }

int res[] = new int[k];
int idx = 0;

PriorityQueue<int[]> pq =new PriorityQueue<>((a,b) -> Integer.compare(a[0] , b[0]));

for(Map.Entry<Integer, Integer> entry : map.entrySet()){
  pq.offer(new int[] {entry.getValue() , entry.getKey()});
  if(pq.size() > k) pq.poll();
}

while(!pq.isEmpty()) res[idx++] = pq.poll()[1];
return res;

    }
}
