class Solution {
    public int leastInterval(char[] tasks, int n) {
        int[] temp = new int[26];
    for(char t : tasks) temp[t - 'A']++;

PriorityQueue<Integer> pq = new PriorityQueue<>(Collections.reverseOrder());

    for(int i=0; i < 26; i++) if(temp[i] > 0) pq.offer(temp[i]);

    Deque<int[]> dq = new ArrayDeque<>();

    int t = 0;

while(!pq.isEmpty() || !dq.isEmpty()){
    t++;

if(!pq.isEmpty()) {
    int item = pq.poll() - 1;
    if(item > 0) dq.addLast(new int[] {t + n , item});
}

if(!dq.isEmpty() && t == dq.getFirst()[0]) {
  pq.offer(dq.removeFirst()[1]);
}

}

return t;
    }
}
