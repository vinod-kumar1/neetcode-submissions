class Solution {
    public int removeElement(int[] nums, int val) {
        int len = nums.length;
        int res[] = new int[len];

        int l = 0, r = len - 1, count = 0;

        for (int i = 0; i <= r; i++) {
            int n = nums[i];
            
            if (n == val) {
                while (r > i && nums[r] == val) r--;
               if(r > i) swap(i, r, nums);
                r--;
              if(nums[i] != val)  count++;
            }
            else count++;
        }

        return count;
    }

public void swap(int i, int j, int[] A){
int temp = A[i];
A[i] = A[j];
A[j] = temp;
}

}