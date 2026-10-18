class Solution {
    public List<Integer> partitionLabels(String s) {
     
     HashMap<Character, Integer> map = new HashMap<>();
     for(char c : s.toCharArray()) map.put(c , map.getOrDefault(c, 0) + 1);

ArrayList<Integer> res = new ArrayList<>();

int i = 0;

while(i < s.length()){
    char c = s.charAt(i);
    int l = i;
    int r = s.lastIndexOf(c);
    if(l == r) {
        res.add(1);
    i++;
    }
    else{
        for(int j = i; j < r; j++) r = Math.max(r , s.lastIndexOf(s.charAt(j)));
    res.add(r - l + 1);
    i = r + 1;
    }    
}


return res;
    }
}
