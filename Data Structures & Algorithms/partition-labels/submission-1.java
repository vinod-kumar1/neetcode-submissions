class Solution {
    public List<Integer> partitionLabels(String s) {

ArrayList<Integer> res = new ArrayList<>();
HashMap<Character, Integer> lis = new HashMap<>();
for(int i = 0; i < s.length(); i++) lis.put(s.charAt(i) , i);

int i = 0;

while(i < s.length()){
    char c = s.charAt(i);
    int l = i;
    int r = lis.get(c);
    if(l == r) {
        res.add(1);
    i++;
    }
    else{
    for(int j = i; j < r; j++) r = Math.max(r , lis.get(s.charAt(j)));
    res.add(r - l + 1);
    i = r + 1;
    }    
}


return res;
    }
}
