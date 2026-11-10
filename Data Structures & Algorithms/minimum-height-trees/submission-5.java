class Solution {
    public List<Integer> findMinHeightTrees(int n, int[][] edges) {
        if(edges.length == 0) return List.of(0);
        
        HashMap<Integer , ArrayList<Integer>> map = new HashMap<>();

        for(int temp[] : edges){
            int f = temp[0] , s = temp[1];

            if(!map.containsKey(f)) map.put(f , new ArrayList<>());
            if(!map.containsKey(s)) map.put(s , new ArrayList<>());
        
        map.get(f).add(s);
        map.get(s).add(f);
        }
    
    while(map.size() > 2){
        ArrayList<Integer> temp = new ArrayList<>();

        for(int num : map.keySet()){
            if(map.get(num).size() == 1) temp.add(num);
        }
        for(int num : temp){
            int k = map.get(num).get(0);
            map.remove(num);
           if(map.containsKey(k)){
            map.get(k).remove(map.get(k).indexOf(num));
           }
        }
    }

ArrayList<Integer> res = new ArrayList<>();

for(int k : map.keySet()) res.add(k);

return res;

    }
}