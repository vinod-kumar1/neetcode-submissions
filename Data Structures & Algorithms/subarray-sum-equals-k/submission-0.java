class Solution {
    public int subarraySum(int[] nums, int k) {
     HashMap<Integer, Integer> map = new HashMap<>();
     map.put(0 , 1);

     int cur = 0;
     int count = 0;

     for(int n : nums){
        cur += n;
        int diff = cur - k;

        count += map.getOrDefault(diff, 0);
        map.put(cur , map.getOrDefault(cur, 0) + 1);
           
     }
      

     return count;
    }
}