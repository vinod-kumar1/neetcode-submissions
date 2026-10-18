class Solution {
    public int[] findRedundantConnection(int[][] edges) {
        HashMap<Integer, HashSet<Integer>> map = new HashMap<>();
     HashSet<Integer> vis = new HashSet<>();
    int len = edges.length;
    int ind[] = new int[len+1];

     for(int temp[] : edges){
        int n1 = temp[0], n2 = temp[1];
        if(!map.containsKey(n1)) map.put(n1 , new HashSet<>());
        if(!map.containsKey(n2)) map.put(n2 , new HashSet<>());
     ind[n1]++;
     ind[n2]++;
     map.get(n1).add(n2);
     map.get(n2).add(n1);
     }
    
    Deque<Integer> dq = new ArrayDeque<>();

for(int i=1; i <= len; i++){
    if(ind[i] == 1) dq.addLast(i);
}


while(!dq.isEmpty()){
int n = dq.poll();
ind[n]--;

for(int k : map.get(n)){
 ind[k]--;
 if(ind[k] == 1) dq.addLast(k);
}
}

for(int i=len-1; i >= 0 ; i--){
    int n1 = edges[i][0], n2 = edges[i][1];
    if(ind[n1] == 2 && ind[n2] > 0) return new int[] {n1 , n2};
}

return new int[] {0,0};
    }
}
