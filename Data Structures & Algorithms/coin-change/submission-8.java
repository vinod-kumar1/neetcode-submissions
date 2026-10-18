class Solution {
        int maxVal = 1000000;

    public int coinChange(int[] coins, int amount) {
        if(amount == 0) return 0;

        Arrays.sort(coins);
        int dp[][] = new int[coins.length][amount + 1];
        for(int n[] : dp) Arrays.fill(n , -1);

        int l = 0, r = coins.length-1;
        while(l < r){
            int temp = coins[l];
            coins[l] = coins[r];
            coins[r] = temp;
            l++;
            r--;
        }

int n = trav(0 , coins , amount , dp);

return n >= maxVal ? -1 : n;

    }

public int trav(int i, int[] A, int rem , int[][] dp){
if(i >= A.length){
    if(rem == 0) return 0;
    else return maxVal;
}

if(rem < 0) return maxVal;
if(rem == 0) {
    return 0;
}

if(dp[i][rem] != -1) return dp[i][rem];

int include = 1 + trav(i , A , rem - A[i] , dp);
int exclude = trav(i + 1, A, rem , dp);

return dp[i][rem] = Math.min(include, exclude);

}

}
