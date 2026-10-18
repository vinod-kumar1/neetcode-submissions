class Solution {
    public int characterReplacement(String s, int k) {
       int d = 0;
       int l = 0, r = 0;
HashMap<Character, Integer> set = new HashMap<>();
int max = 0;

    int mf = 0;

while(r < s.length()){
    char c = s.charAt(r);
    set.put(c , set.getOrDefault(c , 0) + 1);
    
    for(char n : set.keySet()) mf = Math.max(mf , set.get(n));
     
    while((r-l+1) - mf > k){
     set.put(s.charAt(l) , set.get(s.charAt(l)) - 1);
     l++; 
    }

    max = Math.max(max , r-l+1);
    r++;
}

return max;        
       
    }
}
