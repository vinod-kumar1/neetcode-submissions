class Solution {
    public List<List<Integer>> permute(int[] nums) {
       List<List<Integer>> res = new ArrayList<>();
       boolean[] dp = new boolean[nums.length];
        trav(nums , new ArrayList<Integer>() , res, dp);
return res;
    }

public void trav(int[] A, ArrayList<Integer> temp , List<List<Integer>> res ,boolean[] dp){
    
    if(temp.size() == A.length){
ArrayList<Integer> temp2 = new ArrayList<>();
temp2.addAll(temp);
res.add(temp2);
return;
    }

    for(int j = 0; j < A.length; j++){
      if(!dp[j]){
        dp[j] = true;
temp.add(A[j]);
    trav(A , temp , res, dp);
    temp.removeLast();
    dp[j] = false;    
      }
    }
    
}

}