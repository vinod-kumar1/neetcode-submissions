class Solution {
    public int lengthOfLongestSubstring(String s) {
        int[] temp = new int[256];

int l = 0, r = 0, max = 0;

while(r < s.length()){
    char c = s.charAt(r);
    
    while(l < r && temp[c] > 0) temp[s.charAt(l++)]--;
    temp[c] = 1;
    
    max = Math.max(max , r  - l + 1);
r++;
}

return max;
    }
}
