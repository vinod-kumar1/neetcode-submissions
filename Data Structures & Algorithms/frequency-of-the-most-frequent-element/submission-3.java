class Solution {
    public int maxFrequency(int[] nums, int k) {
        int l=0, r = 0, tot = 0 , fr = 0;
        Arrays.sort(nums);

        while(r < nums.length){
int n = nums[r];
tot += n;

 while(n * (r-l+1) > k + tot && l < nums.length){
    tot -= nums[l];
    l++;
  }
fr = Math.max(r-l+1 , fr);
r++;
}

return fr;
    }
}