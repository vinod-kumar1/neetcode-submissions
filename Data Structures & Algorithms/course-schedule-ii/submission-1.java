class Solution {
    public int[] findOrder(int numCourses, int[][] prerequisites) {
        int[] ind = new int[numCourses];
    HashMap<Integer, ArrayList<Integer>> map = new HashMap<>();

    for(int[] temp : prerequisites){
        int f = temp[0] , s = temp[1];
        if(!map.containsKey(s)) map.put(s , new ArrayList<>());
        map.get(s).add(f);

        ind[f]++;
    }
int[] res = new int[numCourses];
int idx = 0;

Deque<Integer> dq = new ArrayDeque<>();
for(int i =0; i < ind.length; i++){
    if(ind[i] == 0) dq.addLast(i);
}

while(!dq.isEmpty()){
    int n = dq.removeFirst();
res[idx++] = n;

    if(map.containsKey(n)){
        for(int k : map.get(n)){
            ind[k]--;
            if(ind[k] == 0){
                dq.addLast(k);
                ind[k]--;
            }
        }
    }

    ind[n]--;
}

for(int n : ind) if(n > 0) return new int[] {};

return res;
    }
}
