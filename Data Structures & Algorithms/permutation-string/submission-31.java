class Solution {
    public boolean checkInclusion(String s1, String s2) {
        int[] chars = new int[26];
        int len1 = s1.length(), len2 = s2.length();
        if(len1 > len2) return false;
int[] temp = new int[26];

        for(char c : s1.toCharArray()) chars[c-'a']++;
        int len = s1.length();

int l = 0, r = 0;
while(r < s2.length()){
    char c = s2.charAt(r);
    temp[c-'a']++;
    if((r-l+1) > s1.length()) temp[s2.charAt(l++) - 'a']--;
if(chars[c-'a'] > 0 && isValid(chars , temp)) return true;
r++;
}

return false;
    }

public boolean isValid(int[] src, int[] dst){

for(int k=0; k < 26; k++){
    if(src[k] != dst[k]) return false;
}

return true;

}
}