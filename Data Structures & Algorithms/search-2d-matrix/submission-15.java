class Solution {
    public boolean searchMatrix(int[][] matrix, int target) {

for(int i=0; i < matrix.length; i++){
    int arr[] = matrix[i];

    if(target >= arr[0] && target <= arr[arr.length-1]){
        int l =0;
        int r = arr.length-1;
if(arr[l] == target || arr[r] == target) return true;

        while(l <= r){
int m = l + (r-l)/2;
if(arr[m] == target) return true;
else if(target < arr[m]) r = m-1;
else l = m+1; 
        }
        return false;
    }
}
return false;
    }
}
