class Solution {
    public int trap(int[] height) {
        int len = height.length;

        int pf[] = new int[len];
        int sf[] = new int[len];
    pf[0] = 0;
    sf[len-1] = 0;

int maxl = height[0];
for(int i=1; i < len; i++){
    pf[i] = maxl;
    if(height[i] > maxl) maxl = height[i];
}

int maxr = height[len-1];

for(int i=len-2; i>= 0; i--){
    sf[i] = maxr;
    if(height[i] > maxr) maxr = height[i];
}

int sum = 0;

for(int i=1; i < len-1; i++){
int h = (Math.min(pf[i] , sf[i])) - height[i];
if(h <= 0) continue;

sum += h;

}

return sum;
    }
}
