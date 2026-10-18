class Solution {
    public boolean isValid(String s) {
        Map<Character,  Character> map = new HashMap<Character,  Character>();
map.put('[' , ']');
map.put('(' , ')');
map.put('{' , '}');

int i=0;
int n = s.length();
var w = new ArrayList<Character>();

while(i < n){
char cur = s.charAt(i);
if(map.containsKey(cur)) w.add(cur);
else if(w.size() > 0 && map.get(w.getLast()) == cur) w.removeLast();
else return false;
i++;
}

return w.size() == 0;
    }
}
