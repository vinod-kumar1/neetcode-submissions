class Solution {
    public String longestPalindrome(String s) {
        int res[] = new int[] {0, 0};

        for(int i=0; i < s.length(); i++){
          int[] temp = trav(i , s);
          if((temp[1] - temp[0]) > (res[1] - res[0])){
            res[0] = temp[0];
            res[1] = temp[1];
          }
        }

        return s.substring(res[0], res[1] + 1);
    }

public int[] trav(int cur, String s){
 
 int l = cur, r = cur;
int oddLength[] = getMax(cur, cur, s);

int[] leftEven = new int[] {cur , cur};
int[] rightEven = new int[] {cur , cur};
 
if(cur > 0 && s.charAt(cur-1) == s.charAt(cur)) leftEven = getMax(cur-1, cur , s);
if(cur < s.length() - 1 && s.charAt(cur) == s.charAt(cur + 1)) leftEven = getMax(cur, cur + 1 , s);

return findMax(oddLength , findMax(leftEven , rightEven));

}

public int[] getMax(int l, int r, String s){
    while(l > 0 && r < s.length()-1){
        if(s.charAt(l-1) == s.charAt(r+1)){
            l--;
            r++;
        }
        else break;
    }

return new int[] {l , r};
}

public int[] findMax(int[] A, int[] B){
    if((A[1] - A[0]) > (B[1] - B[0])) return A;
    return B;
}

}