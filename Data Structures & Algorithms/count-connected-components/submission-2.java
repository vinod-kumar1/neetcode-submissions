class Solution {
    public int countComponents(int n, int[][] edges) {
HashMap<Integer, HashSet<Integer>> map = new HashMap<>();
int connected = 0;

for(int temp [] : edges){
    int f = temp[0] , s = temp[1];
    if(!map.containsKey(f)) map.put(f , new HashSet<>());
    if(!map.containsKey(s)) map.put(s , new HashSet<>());

map.get(f).add(s);
map.get(s).add(f);
}

int cur = 0;
HashSet<Integer> vis = new HashSet<>();

while(vis.size() < n){

Deque<Integer> dq= new ArrayDeque<>();
for(int i = 0 ; i < n; i++){
    if(!vis.contains(i)){
        dq.addLast(i);
        break;
    }
}

while(!dq.isEmpty()){
int num = dq.removeFirst();

if(vis.contains(num)) continue;

vis.add(num);

if(map.containsKey(num)){
    for(int k : map.get(num)) if(!vis.contains(k)) dq.addLast(k);
}

}

 connected++;
    }

return connected;
}
}
