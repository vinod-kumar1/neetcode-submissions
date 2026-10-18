class Solution {
    public int minCostClimbingStairs(int[] cost) {
int dp1[] = new int[cost.length];
int dp2[] = new int[cost.length];
        Arrays.fill(dp1 , -1);
        Arrays.fill(dp2 , -1);
        
        return Math.min(trav(0 , cost.length , cost , dp1) , trav(1 , cost.length , cost, dp2));
    }

public int trav(int cur, int max, int[] A, int dp[]){
    if(cur == max) return 0;
    if(cur > max) return 1000000;
    if(dp[cur] != -1) return dp[cur];

    int oneStep = A[cur] + trav(cur + 1, max , A, dp);
    int twoStep = A[cur] + trav(cur + 2, max , A, dp);

    return dp[cur] = Math.min(oneStep , twoStep);

}

}
