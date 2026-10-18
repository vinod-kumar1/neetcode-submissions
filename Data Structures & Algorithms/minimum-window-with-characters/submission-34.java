class Solution {
    public String minWindow(String s, String t) {
        if(t.equals(s)) return s;
        
        int[] temp = new int[256];
        int target[] = new int[256];
        for(char c: t.toCharArray()) target[c]++;
 String res = "";

        int l = 0, r = 0;

        while(r < s.length()){
           char c = s.charAt(r);
           temp[c]++;

if(matches(temp , target)){
while(matches(temp , target)){
    temp[s.charAt(l)]--;
    l++;
}
l--;
temp[s.charAt(l)]++;

if((r - l + 1) < res.length() || res == ""){
    res = s.substring(l , r + 1);
}

}
r++;
                   }

return res;
    }

public boolean matches(int[] A, int[] B){
    for(int i=0; i < 256; i++){
        if(A[i] < B[i]) return false;
    }

    return true;
}

}
