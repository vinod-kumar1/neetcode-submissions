class Solution {
    public boolean exist(char[][] board, String word) {
        int[] dir = new int[] {1 , -1};
     boolean visited[][] = new boolean[board.length][board[0].length];

        for(int i=0; i < board.length; i++){
            for(int j=0; j < board[0].length; j++){
                 if(dfs(i,j,word , board , visited , 0)) return true;
            }
        }
return false;
    }

    public boolean dfs(int i , int j , String s , char[][] nums , boolean[][] visited , int cur){
if(cur >= s.length()) return true;

if(i < 0 || i >= nums.length || j < 0 || j >= nums[0].length || visited[i][j] == true || nums[i][j] != s.charAt(cur)) return false;

visited[i][j] = true;

boolean res = dfs(i+1 , j , s , nums , visited , cur+1) 
|| dfs(i-1 , j , s , nums , visited , cur+1) 
|| dfs(i , j +1 , s , nums , visited , cur+1) 
|| dfs(i , j - 1, s , nums , visited , cur+1);

visited[i][j] = false;

return res;
    }
}
