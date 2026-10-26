class Solution {
    public int characterReplacement(String s, int k) {
    HashMap<Character, Integer> map = new HashMap<>();

int l = 0, max = 0, res = 0;

for(int r = 0; r < s.length(); r++){
    char c = s.charAt(r);
map.put(c , map.getOrDefault(c, 0) + 1);
max = Math.max(max , map.get(c));

while((r - l + 1) - max > k){
    char ch = s.charAt(l);
    map.put(ch , map.get(ch) - 1);
    l++;
    max = Math.max(max , map.get(ch));
}
res = Math.max(res , r - l + 1);
}
    

return res;
    }
}
