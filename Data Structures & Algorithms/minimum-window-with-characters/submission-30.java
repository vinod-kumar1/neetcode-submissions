class Solution {
    public String minWindow(String s, String t) {
        int[] src = new int[256];
        if(t.length() > s.length()) return "";

        for(char c : t.toCharArray()) src[c]++;

        int l = 0, r = 0;
int[] temp = new int[256];
int st = -1, ed = -1;

int min = s.length() + 1;

        while(r < s.length()){
            char c = s.charAt(r);
temp[c]++;
if(src[c] > 0){

if(isValid(src , temp)){

while(l < r && temp[s.charAt(l)] > src[s.charAt(l)]) {
 temp[s.charAt(l)]--;
    l++;
}

if(r - l + 1 < min){
    min = r -l + 1;
    st = l;
    ed = r;
}

// l++; // because you're removing the extra chars from left anyways so no need to go one step forward here
}
}

r++;
}

return st == -1 ? "" : s.substring(st , ed + 1);
    }

public boolean isValid(int[] src , int[] temp){
    for(int i=0; i < 256; i++){
        if(temp[i] < src[i]) return false;
    }

return true;
}

}
