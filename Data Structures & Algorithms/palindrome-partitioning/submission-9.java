class Solution {
    public List<List<String>> partition(String s) {
        List<List<String>> res = new ArrayList<>();
        trav(s ,new ArrayList<>(),  res , 0);
        return res;
    }

public void trav(String s, ArrayList<String> temp,  List<List<String>> res , int i){
    if( i >= s.length()){
        if(temp.size() > 0){
        res.add(new ArrayList<>(temp));
        }
        return;
    }

    for(int j=i; j < s.length(); j++){
        if(isPal(s , i , j)) {
        temp.add(s.substring(i, j + 1));
        trav(s , temp, res , j + 1);
        temp.remove(temp.size() - 1);
        }
        }
}

public boolean isPal(String s, int l, int r){
    while(l < r){
     if(s.charAt(l) != s.charAt(r)) return false;
     l++;
     r--;
    }

return true;
}

}
