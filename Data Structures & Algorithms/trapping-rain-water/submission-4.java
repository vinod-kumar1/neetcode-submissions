class Solution {
    public int trap(int[] height) {
        int l =0 , r = height.length-1;
        int maxl = height[l] , maxr = height[r];
        int res = 0;

        while(l < r){
            if(height[l] < height[r]){
                l++;
                if(maxl > height[l]) res+= (maxl - height[l]);
                maxl = Math.max(maxl , height[l]);
            }
            else{
                r--;
                if(maxr > height[r]) res+= (maxr - height[r]);
                maxr = Math.max(maxr , height[r]);
            }
        }
        return res;


    }
}
