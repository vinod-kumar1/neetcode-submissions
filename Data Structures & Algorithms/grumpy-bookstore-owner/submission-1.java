class Solution {
    public int maxSatisfied(int[] customers, int[] grumpy, int minutes) {
        int sum = 0;
        // for(int i=0; i < customers.length; i++){
        //     if(grumpy[i] == 0) sum += customers[i];
        // }

        int l=0, r=0, tot = 0, max = 0;

while(r < grumpy.length){
int n = customers[r];
if(grumpy[r] == 1) tot+=n;
else sum+=n;

if(r-l+1 == minutes){
max = Math.max(max , tot);
if(grumpy[l] == 1) tot -= customers[l];
l++;
}
r++;
}

return sum+max;
    }
}