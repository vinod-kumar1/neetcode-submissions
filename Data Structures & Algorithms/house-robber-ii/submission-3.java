class Solution {
    public int rob(int[] nums) {
        if(nums.length == 1) return nums[0];

        return Math.max(trav(0 , nums.length - 2, nums) , trav(1 , nums.length-1, nums));
    }

public int trav(int i, int n, int[] A){
   int r1 = 0, r2 = 0;

    for(int j = i ; j <= n; j++){
     int max = Math.max(r1 + A[j] , r2);
     r1 = r2;
     r2 = max;
    }

return r2;
}

}
