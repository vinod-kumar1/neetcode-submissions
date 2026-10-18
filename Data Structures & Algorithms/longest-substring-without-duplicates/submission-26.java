class Solution {
    public int lengthOfLongestSubstring(String s) {
        HashSet<Character> set = new HashSet<>();

        int l = 0, r = 0;
int max = 0;

        while(r < s.length()){
            char c = s.charAt(r);

            if(set.contains(c)){
while(set.contains(c) && l < r) set.remove(s.charAt(l++));
            }
            set.add(c);

max = Math.max(max , set.size());
            r++;
        }

return set.size() > 0 && max == 0 ? set.size() : max;
    }
}
