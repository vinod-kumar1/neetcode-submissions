class Solution {
    public int characterReplacement(String s, int k) {
     
      int l = 0, r = 0, res = 0;
int[] temp = new int[26];

while(r < s.length()){
    char c = s.charAt(r);
    temp[c - 'A']++;

    int n = max(temp);
    while(r - l + 1 - n > k){
        char ch = s.charAt(l);
        temp[ch - 'A']--;
        l++;
    }
res = Math.max(res , r -l + 1);

r++;
}

return res;
    }

public int max(int temp[]){
    int res = 0;
    for(int n : temp) res = Math.max(n , res);
    return res;
}

}
// didn't understood