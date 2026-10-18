class Solution {
    public boolean isNStraightHand(int[] hand, int groupSize) {
     PriorityQueue<Integer> pq = new PriorityQueue<>();

int len = hand.length;
if(groupSize == 1) return true;
if(len % groupSize != 0) return false;
HashMap<Integer, Integer> map = new HashMap<>();

for(int n : hand) map.put(n, map.getOrDefault(n, 0) + 1);
for(int n : map.keySet()) pq.offer(n);

while(map.size() > 0){

int n = pq.peek();
int cur = 0;

for(int i =0 ; i < groupSize; i++){
    if(!map.containsKey(n)) return false;
    map.put(n , map.get(n) - 1);
    if(map.get(n) == 0){
        if(pq.peek() != n) return false;
        map.remove(n);
        pq.poll();
    }
    cur++;
    if(cur == groupSize) cur = 0;
    n++;
}

}

return true;
    }
}
