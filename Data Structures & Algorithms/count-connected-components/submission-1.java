class Solution {
    public int countComponents(int n, int[][] edges) {
    HashMap<Integer , ArrayList<Integer>> map = new HashMap<>();
HashSet<Integer> rem = new HashSet<>();

    for(int i=0; i < n; i++) {
    rem.add(i);
        map.put(i , new ArrayList<Integer>());
    }

    for(int temp[] : edges){
        int n1 = temp[0], n2 = temp[1];
        map.get(n1).add(n2);
        map.get(n2).add(n1);
    }

HashSet<Integer> vis = new HashSet<>();
int count = 0;

for(int i=0; i < n; i++){
    if(vis.contains(i)) continue;

    HashSet<Integer> vis2 = new HashSet<>();
    trav(-1, i , vis2 , map);
    count++;
    for(int k : vis2) vis.add(k);
}

return count;
    }

public void trav(int parent, int cur, HashSet<Integer> vis, HashMap<Integer, ArrayList<Integer>> map){
if(vis.contains(cur)) return;

vis.add(cur);

for(int nei : map.get(cur)){
    if(nei == parent) continue;
    trav(cur , nei, vis , map);
}

}

}
