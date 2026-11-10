class Solution {
    public boolean validTree(int n, int[][] edges) {
HashMap<Integer, HashSet<Integer>> map = new HashMap<>();

for(int temp[] : edges){
    int f = temp[0], s = temp[1];

    if(!map.containsKey(f)) map.put(f , new HashSet<>());
    if(!map.containsKey(s)) map.put(s , new HashSet<>());

map.get(f).add(s);
map.get(s).add(f);
}
int connected[] = new int[] {0};

boolean res = trav(0 , new HashSet<Integer>() , map , -1 , connected);
return connected[0] == n ? res : false;
    }

public boolean trav(int cur , HashSet<Integer> vis, HashMap<Integer , HashSet<Integer>> map, int parent, int[] res){

    vis.add(cur);
res[0]++;

if(map.containsKey(cur)){
    for(int n : map.get(cur)){
        if(n == parent) continue;
        if(vis.contains(n)) return false;
    if(!trav(n , vis , map , cur, res)) return false;
    }
}


return true;
}

}
