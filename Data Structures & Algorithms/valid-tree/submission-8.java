class Solution {
    public boolean validTree(int n, int[][] edges) {
     HashMap<Integer, ArrayList<Integer>> map = new HashMap<>();

     for(int i=0; i < n; i++) map.put(i , new ArrayList<Integer>()); // we do this first to make sure we include disconnected nodes also in the map, so that we don't get null error later while traversing

     for(int temp[] : edges){
      int n1 = temp[0], n2 = temp[1];
      map.get(n1).add(n2);
      map.get(n2).add(n1);
     }

HashSet<Integer> vis = new HashSet<>();

if(!trav(0, -1, vis,  map)) return false;

return vis.size() == n; // just to make sure we've all the nodes in graph

    }

public boolean trav(int cur, int parent ,HashSet<Integer> vis , HashMap<Integer, ArrayList<Integer>> map){

vis.add(cur);

for(int nei : map.get(cur)){
    
    if(nei == parent) continue;
    if(vis.contains(nei)) return false;

    if(!trav(nei, cur , vis,  map)) return false;
    
}

return true;
}

}
