class Solution {
    public int totalFruit(int[] fruits) {
        int l=0, len = fruits.length, tot = 0, max = 0;
        Map<Integer , Integer> map = new HashMap<>();

    
    for(int r=0; r < len; r++){
        int n = fruits[r];
        tot++;
map.put(n , map.getOrDefault(n , 0) + 1);

while(map.size() > 2){
int m = fruits[l];
map.put(m , map.getOrDefault(m , 0) - 1);
tot--;
if(map.get(m) <= 0) map.remove(m);
l++;
}
max = Math.max(max , tot);
    }
 return max;
    }
}