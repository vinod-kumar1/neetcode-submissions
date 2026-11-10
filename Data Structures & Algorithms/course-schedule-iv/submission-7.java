class Solution {
    public List<Boolean> checkIfPrerequisite(int numCourses, int[][] prerequisites, int[][] queries) {
        HashMap<Integer , HashSet<Integer>> map = new HashMap<>();

        for(int temp[] : prerequisites){
            int f = temp[0] , s = temp[1];

            if(!map.containsKey(s)) map.put(s , new HashSet<>());
            map.get(s).add(f);
        }

        List<Boolean> res = new ArrayList<>();

        for(int temp[] : queries){
            int f = temp[0] , s = temp[1];
res.add(trav(f , s , map, new HashSet<Integer>()));
        }

        return res;
    }

public boolean trav(int t , int s , HashMap<Integer , HashSet<Integer>> map, HashSet<Integer> vis){
    if(!map.containsKey(s)) return false;
    if(map.get(s).contains(t)) return true;
vis.add(s);

    for(int n : map.get(s)){
        if(!vis.contains(n) && trav(t , n , map, vis)) return true;
    }

    return false;
}

}