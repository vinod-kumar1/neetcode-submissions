class Solution {
    public String minWindow(String s, String t) {
             if(t.length() > s.length()) return "";

int l=0, r=0, need = t.length(), len = s.length(), found = 0, b = -1, e = -1, win = Integer.MAX_VALUE;
Map<Character , Integer> src = new HashMap<>();
for(char c : t.toCharArray()) src.put(c , src.getOrDefault(c , 0) + 1);
Map<Character , Integer> map = new HashMap<>();

while(r < len){
char c = s.charAt(r);
if(src.containsKey(c)){
map.put(c , map.getOrDefault(c, 0) + 1);
if(map.get(c) == src.get(c)) found+= map.get(c);

if(found == need){
while(!src.containsKey(s.charAt(l)) || map.get(s.charAt(l)) > src.get(s.charAt(l))){
    if(map.containsKey(s.charAt(l))) map.put(s.charAt(l) , map.get(s.charAt(l)) - 1);
l++;
}
if(r-l + 1 < win){
    win = r-l+1;
    b = l;
    e = r;
}

}

}

r++;
}

String res = "";
if(b >=0 && e >= 0) for(int v = b; v <= e; v++) res += s.charAt(v);

return res;
    }
}
