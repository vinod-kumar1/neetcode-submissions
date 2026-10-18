class Solution {
    public boolean searchMatrix(int[][] matrix, int target) {
        int l = 0, r = matrix.length-1;
int len = matrix[0].length;

        while(l <= r){
            int m = l + ((r-l) / 2);
            if(target >= matrix[m][0] && target <= matrix[m][len-1] ){
                return search(matrix[m] , target);
            }
            if(target < matrix[m][0]) r = m-1;
            else l = m+1;
        }
    
    return false;
    }

public boolean search(int[] nums, int target){
  int l =0, r = nums.length-1;

        while(l <= r){
            int m = l + ((r-l)/2);
            if(nums[m] == target) return true;
            if(nums[m] < target) l = m+1;
            else r = m-1;
        }

return false;    
}

}
