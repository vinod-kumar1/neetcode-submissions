class Solution {
    public boolean canFinish(int numCourses, int[][] prerequisites) {
        int[] ind = new int[numCourses+1];

        HashMap<Integer, HashSet<Integer>> map = new HashMap<>();
         for(int temp[] : prerequisites){
            int f = temp[0], t = temp[1];
            ind[f]++;
            if(!map.containsKey(t)) map.put(t , new HashSet<>());
         map.get(t).add(f);
         }
    
    Deque<Integer> dq = new ArrayDeque<>();
    for(int i=0; i < ind.length; i++){
        if(ind[i] == 0) {
            dq.addLast(i);
        ind[i] = -1;
        }
    }

while(!dq.isEmpty()){
    int n = dq.poll();
    if(!map.containsKey(n)) continue;
   
    for(int k : map.get(n)){
       ind[k]--;
       if(ind[k] == 0){
        dq.add(k);
        ind[k]--;
       }
    }
}

for(int i=0; i < ind.length; i++) if(ind[i] > 0) return false;
return true;

    }
}
