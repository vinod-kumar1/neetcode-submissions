class Solution {
    public int minimumRecolors(String blocks, int k) {
        int l=0, r=0, res = k, cur=0, n = blocks.length();

        while(r < n){
            char c= blocks.charAt(r);
            if(c != 'B') cur++;
            if(r-l+1 == k){
                res = Math.min(res , cur);
                if(blocks.charAt(l) == 'W') cur--;
                l++;
            }
            r++;
        }
    return res;
    }
}