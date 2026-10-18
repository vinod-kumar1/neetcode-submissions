class Solution {
    public boolean wordBreak(String s, List<String> wordDict) {
HashMap<Integer, Boolean> dp = new HashMap<>();
dp.put(s.length() , true);

        HashSet<String> set = new HashSet<>();
        for(String str : wordDict) set.add(str);
       return trav(s , set , 0, dp);
    }

public boolean trav(String s , HashSet<String> set, int i, HashMap<Integer, Boolean> dp){

    if(i >= s.length()) return true;
if(dp.containsKey(i)) return dp.get(i);

    for(int j = i ; j < s.length(); j++){
        if(set.contains(s.substring(i, j +1))){
            if((trav(s , set, j + 1 , dp))) {
                dp.put(i , true);
                return true;
            }
        }
    }

dp.put(i , false);
return false;
}

}
