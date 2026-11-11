class Solution {
    public int singleNumber(int[] nums) {
        int n = 0;
        for(int k : nums) n ^= k;
        return n;
    }
}
