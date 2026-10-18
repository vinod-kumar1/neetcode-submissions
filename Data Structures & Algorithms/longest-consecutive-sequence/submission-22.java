class Solution {
    public int longestConsecutive(int[] nums) {
        HashSet<Integer> set = new HashSet<>();
        for(int n : nums) set.add(n);
int max = 0;
        for(int n : nums){
            if(!set.contains(n-1)){
              int len = 1;
              int k = n;
              while(set.contains( k + 1)) {
                k++;
                len++;
                }
max = Math.max(max , len);
            }
        }

    return max;
    }
}
