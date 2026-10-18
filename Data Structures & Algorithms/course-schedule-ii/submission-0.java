class Solution {
    public int[] findOrder(int numCourses, int[][] prerequisites) {
     int ind[] = new int[numCourses];

     HashMap<Integer, HashSet<Integer>> map = new HashMap<>();

     for(int temp[] : prerequisites){
        int n1 = temp[0], n2 = temp[1];
        ind[n1]++;
        if(!map.containsKey(n2)) map.put(n2 , new HashSet<>());
        map.get(n2).add(n1);

     }  
Deque<Integer> dq = new ArrayDeque<>();

     for(int i=0; i < ind.length; i++){
        if(ind[i] == 0) dq.addLast(i);
     }

ArrayList<Integer> res = new ArrayList<>();

while(!dq.isEmpty()){
    int n = dq.removeFirst();
res.add(n);

    if(map.containsKey(n)){
        for(int k : map.get(n)){
            ind[k]--;
            if(ind[k] == 0){
                dq.addLast(k);
                ind[k]--;
            }
        }
    }
}

for(int i=0; i < ind.length ; i++) if(ind[i] > 0) return new int[] {};
return res.stream().mapToInt(k -> (int) k).toArray();

    }
}
