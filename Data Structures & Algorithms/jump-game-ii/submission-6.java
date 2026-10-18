class Solution {
    public int jump(int[] nums) {
    int[] dp = new int[nums.length];
    Arrays.fill(dp , -1);

        return trav(0 , nums, dp);
    }

public int trav(int i, int[] A, int dp[]){
if(i >= A.length - 1) return 0;
if(dp[i] != -1) return dp[i];

int n = A[i];
int min = 10000;

for(int j = i + 1; j <= Math.min(i + n , A.length-1); j++){
 min = Math.min(min , 1 + trav(j , A, dp));
}

return dp[i] = min;
}

}
