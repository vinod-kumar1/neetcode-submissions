class Solution {
    public boolean checkInclusion(String s1, String s2) {
       int l=0;
    while(l  <= s2.length()-s1.length()){

Map<Character, Integer> map = new HashMap<>();
for(int i=0; i < s1.length(); i++){
char c = s1.charAt(i);
if(!map.containsKey(c)) map.put(c , 0);
map.put(c , map.get(c)+1);
}

for(int k=l; k <= l + s1.length()-1 ; k++){
char c = s2.charAt(k);
if(map.containsKey(c)){
    map.put(c , map.get(c)-1);
    if(map.get(c) <= 0) map.remove(c); 
    if(map.size() == 0) return true;
}
else break;
}
l++;
}


return false;
    }
}
