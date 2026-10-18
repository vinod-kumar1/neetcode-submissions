class Solution {
    public String minWindow(String s, String t) {
        HashMap<Character, Integer> src = new HashMap<>();
        for(char c : t.toCharArray()) src.put(c , src.getOrDefault(c, 0) + 1);

        HashMap<Character , Integer> cur = new HashMap<>();

        int l = 0, r = 0;
int minLen = Integer.MAX_VALUE;
int stIdx = -1;

        while(r < s.length()){
            char c = s.charAt(r);
            cur.put(c , cur.getOrDefault(c, 0) + 1);
        while(l <= r && match(src, cur)){
if(r - l + 1 < minLen) {
 minLen = r - l + 1;
    stIdx = l;
}

char ch = s.charAt(l);

cur.put(ch , cur.get(ch) - 1);
if(cur.get(ch) <= 0) cur.remove(ch);
l++;
}

r++;
        }

return stIdx == -1 ? "" : s.substring(stIdx , stIdx + minLen);
    }

public boolean match(HashMap<Character , Integer> s , HashMap<Character , Integer> c){

for(char ch : s.keySet()){
if(!c.containsKey(ch) || c.get(ch) < s.get(ch)) return false;
}

return true;

}
}
