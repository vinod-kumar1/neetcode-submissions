class Solution {
    public String longestPalindrome(String s) {
     String max = s.charAt(0) + "";
     int l = 0,r = 0;

     for(int i = 0; i < s.length(); i++){
        String temp = trav(s , i);
        if(temp.length() > max.length()) max = temp;
     }   

return max;
    }

public String trav(String A , int i){
    // for odd length

    int l = i, r = i;
    String out = A.charAt(i) + "";

    while( l > 0 && r < A.length() - 1){
        if(A.charAt(l - 1) != A.charAt(r + 1)){
           break;
        }
        l--;
        r++;
    }

    if(r -l + 1 > out.length()) out = A.substring(l , r + 1);

// for even length

if(i > 0 && A.charAt(i) == A.charAt(i-1)){
    l = i - 1;
    r = i;

       while( l > 0 && r < A.length() - 1){
        if(A.charAt(l - 1) != A.charAt(r + 1)) break;
        l--;
        r++;
       }

    if(r - l + 1 > out.length()) out = A.substring(l , r + 1);
}

 return out;
}

}
