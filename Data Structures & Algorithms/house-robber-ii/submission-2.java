class Solution {
    public int rob(int[] nums) {
        if(nums.length == 1) return nums[0];

        int[] dp = new int[nums.length];
        Arrays.fill(dp , -1);
        int n1 = trav(0 , nums.length-2 , nums , dp);
        Arrays.fill(dp , -1);
        int n2 = trav(1 , nums.length - 1, nums, dp);

return Math.max(n1 , n2);
    }

public int trav(int i, int n, int[] A, int[] dp){
    if(i > n) return 0;
    if(dp[i] != -1) return dp[i];

    int rob = A[i] + trav(i + 2, n , A, dp);
    int dontRob = trav(i + 1, n , A, dp);

return dp[i]= Math.max(rob , dontRob);
}

}
