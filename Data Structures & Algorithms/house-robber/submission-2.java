class Solution {
    public int rob(int[] nums) {
        int n1 = 0, n2 = 0;

        for(int n : nums){
            int maxRob = Math.max(n1 + n , n2);
            n1 = n2;
            n2 = maxRob;
        }

return n2;
    }
}
