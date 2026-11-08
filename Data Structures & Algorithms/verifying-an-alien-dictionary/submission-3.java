

class Solution {
    public boolean isAlienSorted(String[] words, String order) {
        HashMap<Character, Integer> map = new HashMap<>();
        for(int i = 0; i < order.length(); i++) map.put(order.charAt(i) , i);
        
        for(int i =0 ; i < words.length - 1; i++){
            String s1 = words[i], s2 = words[i+1];
            for(int j = 0; j < Math.min(s1.length() , s2.length()) ; j++){
                char c1 = s1.charAt(j), c2 = s2.charAt(j);
                if(map.get(c1) < map.get(c2)) break;
                if(map.get(c1) > map.get(c2)) return false;
            if(j == Math.min(s1.length() - 1 , s2.length() - 1) && s1.length() != s2.length()){
                if(s1.length() > s2.length()) return false;
            }
            }

        }

        return true;
        
    }
}