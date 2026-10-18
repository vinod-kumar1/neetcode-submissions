class Solution {
    public String longestPalindrome(String s) {
     int max[] = new int[] {1, 0 , 0};
     int l = 0,r = 0;

     for(int i = 0; i < s.length(); i++){
        int n[] = trav(s , i);
        if(n[0] > max[0]){
            max[0] = n[0];
            max[1] = n[1];
            max[2] = n[2];
        }
     }   

return s.substring(max[1] , max[2] + 1);
    }

public int[] trav(String A , int i){
    // for odd length

    int l = i, r = i;
    int out[] = new int[] {1, i , i};

    while( l > 0 && r < A.length() - 1){
        if(A.charAt(l - 1) != A.charAt(r + 1)){
           break;
        }
        l--;r++;
    }

    if(r - l + 1 > out[0]){
        out[0] = r - l +1;
        out[1] = l;
        out[2] = r;
    }

// for even length

if(i > 0 && A.charAt(i) == A.charAt(i-1)){
    l = i - 1;
    r = i;

while( l > 0 && r < A.length() - 1){
        if(A.charAt(l - 1) != A.charAt(r + 1)){
           break;
        }
        l--;r++;
    }

    if(r - l + 1 > out[0]){
        out[0] = r -l +1;
        out[1] = l;
        out[2] = r;
    }
}

 return out;
}

}
