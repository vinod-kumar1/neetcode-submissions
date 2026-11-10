class Solution {
    public List<Integer> findMinHeightTrees(int n, int[][] edges) {
        if(edges.length == 0) return List.of(0);
        
     ArrayList<ArrayList<Integer>> map = new ArrayList<>();
     for(int i =0 ; i < n; i++) map.add(new ArrayList<>());
int ind[] = new int[n];

     for(int temp[] : edges){
        int f = temp[0] , s = temp[1];

        map.get(f).add(s);
        map.get(s).add(f);
     ind[f]++;
     ind[s]++;
     }   

int rem = n;
Deque<Integer> dq = new ArrayDeque<>();
for(int i =0 ; i < ind.length; i++){
    if(ind[i] == 1){
        dq.addLast(i);
        ind[i]--;
    }
}

while(rem > 2){

int len = dq.size();
rem -= dq.size();

for(int i = 0; i < len; i++){
    
    int num = dq.removeFirst();

for(int k : map.get(num)){

    ind[k]--;
    if(ind[k] == 1){
        ind[k]--;
        dq.addLast(k);
    }

}
}

}

return new ArrayList<>(dq);

    }
}