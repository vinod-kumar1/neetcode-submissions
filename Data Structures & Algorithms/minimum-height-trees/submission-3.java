class Solution {
    public List<Integer> findMinHeightTrees(int n, int[][] edges) {
        
        HashMap<Integer , HashSet<Integer>> map = new HashMap<>();
        for(int temp[] : edges){
            int f = temp[0] , s = temp[1];

            if(!map.containsKey(f)) map.put(f , new HashSet<>());
            if(!map.containsKey(s)) map.put(s , new HashSet<>());

            map.get(f).add(s);
            map.get(s).add(f);

        }

        HashMap<Integer , ArrayList<Integer>> res = new HashMap<>();

        for(int i = 0; i < n; i++){
            Deque<Integer> dq = new ArrayDeque<>();
            HashSet<Integer> vis = new HashSet<>();
            dq.addFirst(i);
            int hg = 0;

            while(!dq.isEmpty()){

                int len = dq.size();
                for(int j =0; j < len; j++){
                    int num = dq.removeFirst();

                    if(vis.contains(num)) continue;
                    vis.add(num);

                    if(map.containsKey(num)){
                        for(int k : map.get(num)) if(!vis.contains(k)) dq.addLast(k);
                    }
                }
                hg++;
            }

            if(!res.containsKey(hg)) res.put(hg , new ArrayList<>());
            res.get(hg).add(i);
        }

        for(int i = 0; i <= n; i++){
            if(res.containsKey(i)){
                return res.get(i);
            }
        }
        
    return new ArrayList<Integer>(List.of(0));
    }
}