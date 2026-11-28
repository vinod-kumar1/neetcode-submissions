class Solution {
    public boolean isNStraightHand(int[] hand, int groupSize) {
        PriorityQueue<int[]> pq = new PriorityQueue<>((a,b) -> Integer.compare(a[0] , b[0]));
       
        HashMap<Integer, Integer> map = new HashMap<>();
        for(int n : hand){
            map.put(n , map.getOrDefault(n, 0) + 1);
        } 
        for(Map.Entry<Integer, Integer> item : map.entrySet()){
            pq.offer(new int[] {item.getKey() , item.getValue()});
        }

        ArrayList<int[]> temp = new ArrayList<>();

        while(!pq.isEmpty()){
int prev = pq.peek()[0] - 1;          
if(pq.size() < groupSize) return false;

for(int i = 0; i < groupSize; i++){
 int cur = pq.peek()[0];
 if(prev + 1 != cur) return false;
 temp.add(new int[] {cur , pq.poll()[1] - 1});
 prev = cur;
}

for(int[] temp2 : temp) if(temp2[1] > 0) pq.offer(temp2);
temp.clear();

        }

return true;
        }
}
