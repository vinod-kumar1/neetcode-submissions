class Solution {
    public boolean canReach(String s, int minJump, int maxJump) {
     int len = s.length();
     if(s.charAt(len - 1) == '1') return false;

     boolean[] dp = new boolean[len];   
    dp[0] = true;
int j = 0;

for(int i = 0; i < len; i++){
    if(!dp[i]) continue;

    char c = s.charAt(i);

j = Math.max(j , i + minJump);

while(j < Math.min(len , i + maxJump + 1)){
    if(s.charAt(j) == '0'){
        dp[j] = true;
    }
j++;
}
}

return dp[len - 1];    
    }
}