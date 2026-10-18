class Solution {
    public List<List<String>> partition(String s) {
        List<List<String>> res = new ArrayList<>();
       List<String> temp = new ArrayList<>();
        dfs(res  , temp , s , 0);
        return res;
    }

    public void dfs(List<List<String>> res, List<String> temp , String s , int i){

        if(i >= s.length()){
            res.add(new ArrayList<>(temp));
            return;
        }
int ln = s.length();

for(int j=i; j < ln; j++){
    if(isPal(i, j , s)){
        temp.add(s.substring(i , j+1));
        dfs(res , temp , s , j+1);
    temp.removeLast();
    }
}

}

public boolean isPal(int l , int r ,String s){
    // int l=0, r= s.length()-1;
    while(l < r){
        if(s.charAt(l) != s.charAt(r)) return false;
        l++;r--;
    }
    return true;
}
}
