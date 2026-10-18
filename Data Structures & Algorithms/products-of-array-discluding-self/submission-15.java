class Solution {
    public int[] productExceptSelf(int[] nums) {
        int zeroes = 0;
        int idx = -1;
        int len = nums.length;
        int prod = 1;
        
        for(int i = 0; i < len; i++) {
            int n = nums[i];

            if(n == 0) {
             zeroes++;
             idx = i;
            }
           if(n != 0) prod *= n;

        }

int res[] = new int[len];
          Arrays.fill(res, 0);

        if(zeroes > 1){
          return res;
        }

        if(zeroes == 1){
        res[idx] = prod;
        return res;
        }

        for(int i = 0; i < len; i++){
            res[i] = prod / nums[i];
        }
        return res;

        
    }
}  
