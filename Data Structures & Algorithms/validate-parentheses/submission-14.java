class Solution {
    public boolean isValid(String s) {
        Map<Character , Character> map = Map.of('(',')','{','}','[',']');

        ArrayDeque<Character> arr = new ArrayDeque<Character>();
int n = s.length();
        
        for(int i=0; i<n ; i++){
            char t = s.charAt(i);
if(map.containsKey(t)) arr.add(t);
else if(map.containsValue(t) && arr.size() > 0 && map.get(arr.getLast()) == t ) arr.removeLast(); 
else return false;
        }
return arr.size() == 0;
    }
}
