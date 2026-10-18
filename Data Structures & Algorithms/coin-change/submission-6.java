class Solution {
        int maxVal = 1000000;

    public int coinChange(int[] coins, int amount) {
        if(amount == 0) return 0;

        Arrays.sort(coins);

        int l = 0, r = coins.length-1;
        while(l < r){
            int temp = coins[l];
            coins[l] = coins[r];
            coins[r] = temp;
            l++;
            r--;
        }


int res[] = new int[] {-1};
 int n = trav(0 , coins , amount, res);

return res[0] == 0 ? n : -1;

    }

public int trav(int i, int[] A, int rem, int res[]){
if(i >= A.length){
    if(rem == 0) {
    res[0] = 0;
        return 0;
    }
    else return maxVal;
}

if(rem < 0) return maxVal;
if(rem == 0) {
res[0] = 0;
    return 0;
}

int include = 1 + trav(i , A , rem - A[i] , res);
int exclude = trav(i + 1, A, rem ,res);

return Math.min(include, exclude);

}

}
