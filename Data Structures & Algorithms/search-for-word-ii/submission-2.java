class Solution {
    int dir[][] = new int[][] {{-1 , 0} , {0 , -1} , {1 , 0} , {0 , 1}};
int n , m;

    public List<String> findWords(char[][] board, String[] words) {
     HashMap<Character , ArrayList<int[]>> map = new HashMap<>();
n = board.length;
m = board[0].length;

     for(int i = 0; i < board.length; i++){
       for(int j = 0; j < board[i].length; j++){
         char c = board[i][j];

          if(!map.containsKey(c)) map.put(c , new ArrayList<>());
          map.get(c).add(new int[] {i , j});
       }
     }   
    
    ArrayList<String> res = new ArrayList<>();

    for(String s : words){
        if(map.containsKey(s.charAt(0))){
            for(int[] temp : map.get(s.charAt(0))){
                if(trav(s , temp[0] , temp[1] , board, new boolean[board.length][board[0].length] , 1)){
                    res.add(s);
                    break;
                } 
            }
        }
    }
    
    return res;
    }

public boolean trav(String s , int i , int j , char[][] A, boolean[][] vis, int idx){

if(idx >= s.length()) return true;

vis[i][j] = true;

for(int temp[] : dir){
    int r = i + temp[0], c = j + temp[1];
    if(r >= 0 &&  r < n && c >= 0 && c < m && !vis[r][c] && A[r][c] == s.charAt(idx)) {
        if(trav(s , r , c , A , vis , idx + 1)) return true;
}
}

return false;
}

}
