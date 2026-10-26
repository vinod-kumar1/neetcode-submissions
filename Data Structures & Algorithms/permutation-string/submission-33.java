class Solution {
    public boolean checkInclusion(String s1, String s2) {
if(s2.length() < s1.length()) return false;

char[] src = new char[26];
for(char c : s1.toCharArray()) src[c - 'a']++;

int len = s1.length();
char[] dst = new char[26];
int l = 0;

for(int r = 0; r < s2.length(); r++){
char c = s2.charAt(r);

dst[c - 'a']++;
if(r - l + 1 > len){
    dst[s2.charAt(l++) - 'a']--;
}

if(r - l + 1 >= len && found(src , dst)) return true;

}

return false;
    }

public boolean found(char[] A, char[] B){
    for(int i = 0; i < 26;i++){
        if(A[i] != B[i]) return false;
    }
    return true;
}

}
