class Solution {
    public int countSubstrings(String s) {
int len = s.length();
        int res = 0;

for(int i=0; i < len; i++){
   res += ((countPal(i , i, s)) + (countPal(i, i + 1, s)));
}

return res;
    }

public int countPal(int l, int r, String s){
      int count = 0;

    if(isPal(l , r, s)){        
        while(l >= 0 && r < s.length()){
            if(s.charAt(l) == s.charAt(r)){
                count++;
                l--;
                r++;
            }
            else break;
        }
    }
    
    return count;
}

public boolean isPal(int l, int r, String s){
if(l < 0 || r >= s.length()) return false;

while(l < r){
    if(s.charAt(l) != s.charAt(r)) return false;
    l++;
    r--;
}

return true;
}

}
