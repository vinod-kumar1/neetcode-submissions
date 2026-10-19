class Solution {
    public int trap(int[] height) {
        int len = height.length;

        int ml[] = new int[len];
        int mr[] = new int[len];
    
    ml[0] = 0;
    int maxLeft = 0;

    for(int i = 1; i < len; i++){
        ml[i] = maxLeft;
        if(height[i] > height[maxLeft]) maxLeft = i;
    }

    mr[len - 1] = 0;
int maxRight = len - 1;

    for(int i = len - 2; i >= 0; i--){
        mr[i] = maxRight;
        if(height[i] > height[maxRight]) maxRight = i;
    }

int sum = 0;

for(int i = 1; i < len - 1; i++){
    int li = ml[i], lh = height[li];
    int ri = mr[i] , rh = height[ri];
if(height[i] > lh || height[i] > rh) continue;

sum += (Math.min(lh , rh) - height[i]);

}

return sum;
    }
}
