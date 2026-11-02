class Solution {
    public List<List<Integer>> permuteUnique(int[] nums) {
        List<List<Integer>> res = new ArrayList<>();
        Arrays.sort(nums);
        trav(nums , new ArrayList<Integer>() , res , new boolean[nums.length]);
return res;
    }

public void trav(int[] A, ArrayList<Integer> temp , List<List<Integer>> res , boolean[] dp){

if(temp.size() == A.length){
    ArrayList<Integer> temp2 = new ArrayList<>();
    temp2.addAll(temp);
    res.add(temp2);
    return;
}

for(int i = 0; i < A.length; i++){

    if(dp[i] || (i > 0 && A[i] == A[i - 1] && !dp[i-1])) continue;

       dp[i] = true;
       temp.add(A[i]);
       trav(A , temp , res , dp);
        
       temp.removeLast();
       dp[i] = false;
    
}

}

}