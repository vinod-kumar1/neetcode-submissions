class Solution {
    public int longestConsecutive(int[] nums) {
        var set = new HashSet<Integer>();
        for (int n : nums) set.add(n);

        int max = 0;

        for(int n : nums){
int len = 1;
while(set.contains(n+len)) len++;
max = Math.max(len , max);
        }
        return max;
    }
}
