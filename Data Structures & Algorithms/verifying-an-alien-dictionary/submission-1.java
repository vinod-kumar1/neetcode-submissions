class CustomCompare implements Comparator {
    HashMap<Character , Integer> map;

    CustomCompare(HashMap<Character , Integer> table){
        this.map = table;
    }


    @Override
    public int compare(Object x1 , Object y2) {
        String s1 = (String) x1;
        String s2 = (String) y2;

        for(int i =0 ; i < Math.min(s1.length() , s2.length()) ; i++){
            char c1 = s1.charAt(i), c2 = s2.charAt(i);
            if(map.get(c1) < map.get(c2)) return -1;
            else if(map.get(c1) > map.get(c2)) return 1;
        }
        if(s1.length() < s2.length()) return -1;
        return 0;
    }
}

class Solution {
    public boolean isAlienSorted(String[] words, String order) {
        HashMap<Character, Integer> map = new HashMap<>();
        for(int i = 0; i < order.length(); i++) map.put(order.charAt(i) , i);
        String temp[] = Arrays.copyOfRange(words , 0 , words.length);

        Arrays.sort(temp , new CustomCompare(map));
       return Arrays.equals(temp , words);
    }
}