class Solution {
    public boolean canPartitionKSubsets(int[] nums, int k) {
        int sum = Arrays.stream(nums).sum();
if(sum % k != 0) return false;

int res[] = new int[k];

return trav(nums , res , 0 , sum / k);

    }

public boolean trav(int[] A, int[] temp, int i , int max){
    if(i >= A.length) {
     int n = temp[0];
     for(int k : temp){
        if(k != n) return false;
     }
     return true;
    }

for(int j = 0; j < temp.length; j++){
    temp[j] += A[i];
    if(trav(A , temp , i + 1 , max)) return true;
    temp[j] -= A[i];
    if(temp[j] > max || temp[j] == 0) break;
}

return false;
}

}