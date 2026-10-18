class Solution {
    public List<Boolean> checkIfPrerequisite(int numCourses, int[][] prerequisites, int[][] queries) {
        HashMap<Integer, HashSet<Integer>> map = new HashMap<>();

        for(int temp[] : prerequisites){
            if(!map.containsKey(temp[0])) map.put(temp[0] , new HashSet<>());
            map.get(temp[0]).add(temp[1]);
        }
        
        ArrayList<Boolean> res = new ArrayList<>(queries.length);
        for(int n[] : queries) res.add(false);


        for(int i = 0; i < queries.length; i++){
            int[] temp = queries[i];
            int f = temp[0] , s = temp[1];
            if(found(f , s , map, new HashSet<Integer>())) res.set(i , true);
        }

return res;
    }

public boolean found(int s , int t, HashMap<Integer, HashSet<Integer>> map, HashSet<Integer> vis){
vis.add(s);

if(map.containsKey(s)){
    if(map.get(s).contains(t)) return true;

    for(int n : map.get(s)){
      if(!vis.contains(n) && found(n , t , map , vis)) return true;
    }
}

return false;

}

}