class Solution {
    public boolean containsNearbyDuplicate(int[] nums, int k) {
   int l=0, r=0;
HashMap<Integer, Integer> map = new HashMap<>();

for(int i=0; i < nums.length; i++){
int n = nums[i];
if(map.containsKey(n)){
    if(Math.abs(i - map.get(n)) <= k) return true;
    else map.put(n , i);
} 
else map.put(n , i);
}
return false;
    }
}