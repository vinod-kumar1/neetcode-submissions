class Solution {
    public int networkDelayTime(int[][] times, int n, int k) {
        HashMap<Integer, ArrayList<int[]> > map = new HashMap<>();

        for(int temp[] : times){
            int s = temp[0], t = temp[1], d = temp[2];

            if(!map.containsKey(s)) map.put(s , new ArrayList<>());
            map.get(s).add(new int[] {t , d});
        }
    
PriorityQueue<int[]> pq = new PriorityQueue<>((a,b) -> Integer.compare(a[1] , b[1]));
pq.offer(new int[] {k , 0});

HashSet<Integer> vis = new HashSet<>();
int maxDelay = 0;


    while(!pq.isEmpty()){
int temp[] = pq.poll();
int node = temp[0], dis = temp[1];

if(!vis.contains(node)){
vis.add(node);
maxDelay = Math.max(maxDelay , dis);

if(map.containsKey(node)){
for(int[] item : map.get(node)){
    int newDis = dis + item[1];
pq.offer(new int[] {item[0] , newDis});
}
}

}
}

if(vis.size() < n) return -1;

return maxDelay;

    }
}
