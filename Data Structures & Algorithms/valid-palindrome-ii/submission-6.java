class Solution {
    public boolean validPalindrome(String s) {
        int l = 0, r = s.length() - 1;
int max = 0;

while(l < r){
char lc = s.charAt(l);
char rc = s.charAt(r);

if(rc != lc){


return (isPal(l , r - 1, s) || isPal(l + 1, r , s));

}

else{
    l++;
    r--;
}

}

return true;
    }

public boolean isPal(int l, int r, String s){

    while(l < r){
        if(s.charAt(l) != s.charAt(r)) return false;
        l++;
        r--;
    }

    return true;
}

}