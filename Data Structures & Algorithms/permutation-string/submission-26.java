class Solution {
    public boolean checkInclusion(String s1, String s2) {
        int[] chars = new int[26];
        int len1 = s1.length(), len2 = s2.length();
        if(len1 > len2) return false;

        for(char c : s1.toCharArray()) chars[c-'a']++;
        int len = s1.length();

        for(int i=0; i <= len2 - len1; i++){
            char c = s2.charAt(i);
            if(chars[c-'a'] > 0 && search(s1 , s2 , i , i + len, chars)) return true;
        }

return false;
    }

public boolean search(String s1, String s2 , int i, int j, int[] chars){
int[] temp = new int[26];

for(int k = i; k < j; k++){
char c = s2.charAt(k);
temp[c - 'a']++;
}

for(int k=0; k < 26; k++){
    if(temp[k] != chars[k]) return false;
}

return true;
}

}
