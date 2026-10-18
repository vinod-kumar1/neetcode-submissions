class Solution {
    public int characterReplacement(String s, int k) {
    
int l = 0, r=0, n = s.length(), maxf = 0, res = 0;
Map<Character , Integer> map = new HashMap<>();

while(l < n && r < n){
    char t = s.charAt(r);
if(!map.containsKey(t)) map.put(t , 0);
map.put(t , map.get(t) + 1);
maxf = Math.max(maxf , map.get(t));

while((r-l+1 - maxf) > k){
char lt = s.charAt(l);
map.put(lt, map.get(lt)-1);
l++;
for(int ks : map.values()) maxf = Math.max(maxf , ks);
}
res = Math.max(res , r-l+1);
r++;
}

return res;
    }
}
