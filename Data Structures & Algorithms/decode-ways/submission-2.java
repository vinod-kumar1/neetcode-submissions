class Solution {
    int len;
    HashSet<String> map = new HashSet<>();
int[] dp;

    public int numDecodings(String s) {
    for(int i=1; i <= 26; i++) map.add(String.valueOf(i));
    
       len = s.length();
       dp = new int[len];
       Arrays.fill(dp , -1);

        return trav(0 , s);
    }

    public int trav(int i, String s){
        if( i >= len) return 1;
        if(dp[i] != -1) return dp[i];

        String c1 = String.valueOf(s.charAt(i));
        String oneStep = c1;
       
        String twoStep = "0";
        if(i + 1 < len) twoStep = c1 + String.valueOf(s.charAt(i+1));

return dp[i] = (map.contains(oneStep) ? trav(i + 1 , s) : 0) + (map.contains(twoStep) ? trav(i+2 , s) : 0);
    }
}
