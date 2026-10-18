class Solution {
    public int majorityElement(int[] nums) {
        int cur = nums[0];
int freq = 1;

        for(int i=1; i < nums.length; i++){
           int n = nums[i];
           if(n == cur) freq++;
           else {
            freq--;
            if(freq == 0) {
                cur = n;
                freq = 1;
            }
           }
        }
    
    return cur;
    }
}