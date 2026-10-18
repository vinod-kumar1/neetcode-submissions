class Solution {
        int maxVal = 1000000;

    public int coinChange(int[] coins, int amount) {
        if(amount == 0) return 0;
        
        Arrays.sort(coins);
        int dp[] = new int[coins.length];
        Arrays.fill(dp , maxVal);

        int l = 0, r = coins.length-1;
        while(l < r){
            int temp = coins[l];
            coins[l] = coins[r];
            coins[r] = temp;
            l++;
            r--;
        }

trav(0 , coins , amount , dp);

int min = maxVal;

for(int n : dp) min = Math.min(min , n);

return min >= maxVal ? -1 : min;

    }

public int trav(int i, int[] A, int rem , int[] dp){
if(i >= A.length){
    if(rem == 0) return 0;
    else return maxVal;
}

if(rem < 0) return maxVal;
if(rem == 0) return 0;

int include = 1 + trav(i , A , rem - A[i] , dp);
int exclude = trav(i + 1, A, rem , dp);

return dp[i] = Math.min(include, exclude);

}

}
