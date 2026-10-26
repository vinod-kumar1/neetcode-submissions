class Solution {
    public int lengthOfLongestSubstring(String s) {
        HashSet<Character> set = new HashSet<>();
int l = 0;
int max = 0;

        for(char c : s.toCharArray()){
            if(set.contains(c)){
                while(!set.isEmpty() && set.contains(c)) set.remove(s.charAt(l++));
            }
            set.add(c);
            max = Math.max(max , set.size());
        }

return max;
    }
}
