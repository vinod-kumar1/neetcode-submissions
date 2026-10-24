class Solution {
    public boolean search(int[] nums, int target) {
     int len = nums.length;
     int l = 0, r = len - 1;

     while(l <= r){
        int m = l + ((r - l) / 2);
        int n = nums[m];
        if(n == target) return true;

if(nums[l] == nums[m] && nums[m] == nums[r]){
    l++;
    r--;
}

else  if(nums[l] <= n){
 if(target >= nums[l] && target < n) r = m - 1;
 else l = m + 1;
        }
        else{     
            if(target > n && target <= nums[r]) l =m + 1;
            else r = m - 1;
               }        
     }   

return false;
    }
}