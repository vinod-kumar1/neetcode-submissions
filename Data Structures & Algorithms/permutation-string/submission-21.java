class Solution {
    public boolean checkInclusion(String s1, String s2) {
        if(s1.length() > s2.length()) return false;
     int st1[] = new int[26];
     int st2[] = new int[26];
    
    for(int i=0; i < s1.length(); i++){
st1[s1.charAt(i) - 'a']++;
st2[s2.charAt(i) - 'a']++;
    }

int mc = 0;
for(int i=0; i < 26; i++){
    if(st1[i] == st2[i]) mc++;
}

int l=0;
for(int r = s1.length(); r < s2.length(); r++){
if(mc == 26) return true;

int rid = s2.charAt(r) - 'a';
st2[rid]++;
if(st2[rid] == st1[rid]) mc++;
else if(st1[rid]+1 == st2[rid]) mc--;

int lid = s2.charAt(l)-'a';
st2[lid]--;
if(st2[lid] == st1[lid]) mc++;
else if(st1[lid]-1 == st2[lid]) mc--;
l++;
}

return mc == 26;
    }
}
