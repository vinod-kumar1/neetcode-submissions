class Solution {
    /**
     * @param {string} s1
     * @param {string} s2
     * @param {string} s3
     * @return {boolean}
     */
    isInterleave(s1, s2, s3) {
        if((s1.length + s2.length) != s3.length) return false;
        let dp = Array(s1.length+1).fill(Array(s2.length+1).fill(-1));

        function dfs(i,j,k){
            if(k >= s3.length) return s1.length >= i && s2.length >= j;

        if(dp[i][j] != -1) return dp[i][j];

let res = false;
        if(i < s1.length && s1[i] == s3[k]) res = dfs(i+1 , j , k+1);
        if(j < s2.length && s2[j] == s3[k]) res = dfs(i , j+1 , k+1);
dp[i][j] = res;
return res;
}

       return dfs(0,0,0);
    }
}
