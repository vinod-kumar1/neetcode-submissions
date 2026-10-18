class Solution {
    public boolean canPartition(int[] nums) {

        int sum = 0;
        for(int n : nums) sum += n;
    
    if(sum % 2 != 0) return false;

    return trav(0, nums, sum / 2, new Boolean[nums.length][sum / 2 + 1]);
    }

public boolean trav(int i, int[] A, int rem, Boolean[][] dp){
if( i >= A.length || rem < 0) return false;
if(rem == 0) return true;

if(dp[i][rem] != null) return dp[i][rem];

boolean  include = trav(i + 1, A , rem - A[i], dp);
boolean exclude = trav(i + 1, A , rem, dp);

return dp[i][rem] = include || exclude;

}

}
