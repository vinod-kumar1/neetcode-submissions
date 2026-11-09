class Solution {
    public boolean canFinish(int numCourses, int[][] prerequisites) {
        int[] ind = new int[numCourses];
HashMap<Integer, ArrayList<Integer>> map = new HashMap<>();

for(int temp[] : prerequisites){
int f = temp[0], s = temp[1];

if(!map.containsKey(f)) map.put(f , new ArrayList<>());
map.get(f).add(s);

ind[s]++;

}

Deque<Integer> dq = new ArrayDeque<>();

for(int i = 0; i < numCourses; i++) if(ind[i] == 0) dq.addLast(i);

while(!dq.isEmpty()){
int n = dq.removeFirst();

if(map.containsKey(n)){
    for(int k : map.get(n)) {
        ind[k]--;
    if(ind[k] == 0){
        dq.addLast(k);
        ind[k]--;
    }
    }
    }

ind[n] = -1;

}

for(int n : ind){
    if(n > 0) return false;
}

return true;

    }
}
