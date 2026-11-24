
class Solution {
    public int minExtraChar(String s, String[] dictionary) {
   HashSet<String> set = new HashSet<>();
   for(String str : dictionary) set.add(str);
   int[] dp = new int[s.length()];
   Arrays.fill(dp , -1);

   return trav(s , 0, set , dp);
    }

public int trav(String s , int i, HashSet<String> set, int[] dp){
    if(i >= s.length()) return 0;
if(dp[i] != -1) return dp[i];

    int res = 1 + trav(s , i + 1 , set , dp);

    for(int j = i; j < s.length(); j++){
        if(set.contains(s.substring( i, j + 1))){
            res = Math.min(res , trav(s , j + 1, set, dp));
        }
    }

return dp[i] = res;
}

}