class Solution {
    public int[] productExceptSelf(int[] nums) {
        int len = nums.length;
int zeroes = 0;
int res[] = new int[len];
Arrays.fill(res, 0);

for(int n : nums) if(n == 0) zeroes++;
if(zeroes > 1) return res;
else if(zeroes == 1){
    int prod = 1;
int idx = 0;

    for(int i=0; i < len; i++){
        int n = nums[i];
if(n == 0) idx = i;
        if(n != 0) prod *= n;
    }

res[idx] = prod;
return res;
}
else{
    int prod = 1;
    for(int n : nums) prod *= n;

    for(int i=0; i < len; i++){
        res[i] = prod / nums[i];
    }
return res;
}
    }
}  
