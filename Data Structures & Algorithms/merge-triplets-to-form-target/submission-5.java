class Solution {
    public boolean mergeTriplets(int[][] triplets, int[] target) {
        int cur = 0;
HashSet<Integer> set = new HashSet<>();

        for(int i = 0; i < triplets.length; i++){
           int t[] = triplets[i];
           if(t[0] > target[0] || t[1] > target[1] || t[2] > target[2]) continue;

           for(int j = 0 ; j < 3; j++){
            if(t[j] == target[j]) set.add(j);
           }
        }
    
    return set.size() >= 3;
    }
}
