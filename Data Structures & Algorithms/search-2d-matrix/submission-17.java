public class Solution {

    public boolean searchMatrix(int[][] matrix, int target) {

int l = 0, r = matrix.length-1, colz = matrix[0].length-1;

while(l <= r){
int m = l + (r-l)/2;
if(target >= matrix[m][0] && target <= matrix[m][colz]) return binSearch(matrix[m] , target);
else if(target < matrix[m][0]) r = m-1;
else l = m+1;
}

return false;
    }

public boolean binSearch(int[] arr , int t){
int l=0;
int r = arr.length-1;

while(l <= r){
    int m = l + (int) Math.round((double) (r-l) / 2);
    if(arr[m] == t) return true;
    else if(t > arr[m]) l = m+1;
    else r = m-1;
}
    return false;
}

}
