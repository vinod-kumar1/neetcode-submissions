class Solution {
    public void rotate(int[] nums, int k) {
        int len = nums.length;
        if(k > len) k =  k % len;
        if(len == k) return;

rev(0 , len - 1, nums);
rev(0 , k - 1 , nums);
rev(k , len - 1, nums);

    }

public void rev(int l , int r , int[] nums){
 while(l < r){
        int temp = nums[l];
        nums[l] = nums[r];
        nums[r] = temp;
        l++;
        r--;
    }
}

}