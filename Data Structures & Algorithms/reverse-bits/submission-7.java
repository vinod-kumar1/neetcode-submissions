class Solution {
    public int reverseBits(int n) {
       int res = 0;

       for(int i = 31; i >= 0; i--){
        int bit = (n >> i) & 1;
        res |= (bit << (31 - i));
       }

return res;
    }
}
