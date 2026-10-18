class Solution {
    /**
     * @param {string} s1
     * @param {string} s2
     * @param {string} s3
     * @return {boolean}
     */
    isInterleave(s1, s2, s3) {
      let m = s1.length;
      let n = s2.length;
      let s = s3.length;
      let dp = {};

      if(m + n != s) return false;

      function dfs(i,j,k){
if(k >= s) return i == m && j == n;
      if(`${i},${j}` in dp) return dp[`${i},${j}`];

      let res = false;
      if(i < m && s1[i] == s3[k]) res = dfs(i+1 , j , k+1);
      if(j < n && s2[j] == s3[k]) res = dfs(i , j+1 , k+1);
      dp[`${i},${j}`] = res;

      return res;
      }

      return dfs(0,0,0);
    }
}
