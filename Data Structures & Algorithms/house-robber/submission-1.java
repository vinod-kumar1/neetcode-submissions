class Solution {
    public int rob(int[] nums) {
        int dp[] = new int[nums.length];
        Arrays.fill(dp , -1);

        return trav(0 , nums, dp);
    }

public int trav(int i, int[] A, int[] dp){
    if( i >= A.length) return 0;
    if(dp[i] != -1) return dp[i];

    int rob = A[i] + trav(i + 2 , A, dp);
    int dontRob = trav(i + 1, A, dp);

return dp[i] = Math.max(rob , dontRob);
}

}
