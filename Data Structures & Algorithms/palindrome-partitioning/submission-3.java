class Solution {
    public List<List<String>> partition(String s) {
        List<List<String>> res = new ArrayList<>();
trav(s , 0 , res, new ArrayList<String>());
        return res;
    }

public void trav(String s, int i, List<List<String>> res, ArrayList<String> temp){
    if(i >= s.length()){
        res.add(new ArrayList<>(temp));
        return;
    }

for(int j = i; j < s.length(); j++){
    if(isPal(i , j , s)){
        temp.add(s.substring(i , j +1));
        trav(s , j + 1 , res , temp);
        temp.remove(temp.size()-1);
    }
}

}

public boolean isPal(int l , int r, String s){
    while(l < r){
        if(s.charAt(l) != s.charAt(r)) return false;
    l++;
    r--;
    }

return true;
}

}
