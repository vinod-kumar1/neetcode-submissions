class Solution {
    public int longestConsecutive(int[] nums) {
        HashSet<Integer> set = new HashSet<>();
        for(int n : nums) set.add(n);
int max = 0;

        for(int n : nums){
            if(set.contains(n - 1)) continue;
            else{
                int count = 1;
                int cur = n;
                while(set.contains(cur + 1)){
                    count++;
                    cur++;
                }
                max = Math.max(max , count);
            }
        }
    
    return max;
    }
}
