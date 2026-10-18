class Solution {
    public int rob(int[] nums) {
        if(nums.length == 1) return nums[0];
        
        int[] dp1 = new int[nums.length];
        Arrays.fill(dp1 , -1);
        int[] dp2 = new int[nums.length];
        Arrays.fill(dp2 , -1);

        return Math.max(trav( 0 , nums.length - 2, nums, dp1), trav(1, nums.length - 1, nums, dp2));
    }

public int trav(int i, int n, int[] A, int[] dp){
    if(i > n) return 0;
    if(dp[i] != -1) return dp[i];

    int rob = A[i] + trav(i + 2, n , A, dp);
    int dontRob = trav(i + 1, n , A, dp);

return dp[i]= Math.max(rob , dontRob);
}

}
