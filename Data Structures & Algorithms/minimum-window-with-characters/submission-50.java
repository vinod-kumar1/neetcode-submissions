class Solution {
    public String minWindow(String s, String t) {
        int len1 = s.length() , len2 = t.length();
        if(s.equals(t)) return s;

        if(len1 < len2) return "";

String res = s;
int l = 0;
int[] src = new int[52];
boolean changed = false;

for(char c : t.toCharArray()){
    if((int) c >= 97){
        src[c - 'a']++;
    }
    else{
        src[26 + c - 'A']++;
    }
}

int[] dst = new int[52];

for(int r = 0; r < len1; r++){
    char c = s.charAt(r);
        if((int) c >= 97){
        dst[c - 'a']++;
    }
    else{
        dst[26 + c - 'A']++;
    }

if(r - l + 1 >= len2 && match(src , dst)){
    while(l <= r && match(src , dst)){
        char ch = s.charAt(l);
       if((int) ch >= 97){
        dst[ch - 'a']--;
    }
    else dst[26 + ch - 'A']--;
    l++;
    }
    if(r - l + 2 <= res.length()) {
        res = s.substring(l - 1 , r + 1);
changed = true;
}
}

}
 return !changed? "" : res;
    }

public boolean match(int[] A, int[] B){
    for(int i = 0; i < A.length; i++){
        if(B[i] < A[i]) return false;
    }

return true;
}

}
