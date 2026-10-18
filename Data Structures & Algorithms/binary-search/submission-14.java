class Solution {
    public int search(int[] nums, int target) {
int l=0, r = nums.length-1;
int res = -1;

while(l <= r){
int m = l + ((r-l)/2);

if(nums[m] == target){
    res = m;
    break;
}
else if(nums[m] < target) l = m+1;
else r = m-1;
System.out.println(l + " " + r);
}

return res;
    }
}
