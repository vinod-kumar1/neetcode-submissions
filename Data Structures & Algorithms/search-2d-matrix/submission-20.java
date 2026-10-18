class Solution {
    public boolean searchMatrix(int[][] matrix, int target) {
        int i = 0, j = matrix[0].length-1;
        
        while(i < matrix.length && j >= 0){
            int n = matrix[i][j];
            if(n == target) return true;
            else if(n < target) i++;
            else j--;
        }

        return false;
    }
}
