class Solution {
    public void sortColors(int[] nums) {
        int l = 0, r = nums.length - 1;

        for(int i = 0; i <= r; i++){
            int n = nums[i];

            if(n == 0){
                swap(l , i, nums);
                l++;
            }
            if(n == 2){
                swap(i , r, nums);
                r--;
                i--;
            }
        }
    
    }

public void swap(int l, int r, int[] A){
    if(l >= A.length || r < 0) return;
    int temp = A[l];
    A[l] = A[r];
    A[r] = temp;
}

}