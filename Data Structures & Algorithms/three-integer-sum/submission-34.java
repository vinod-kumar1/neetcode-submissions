class Solution {
    public List<List<Integer>> threeSum(int[] nums) {
        Arrays.sort(nums);
List<List<Integer>> res = new ArrayList<>();

for(int i=0; i < nums.length - 2; i++){
if(i > 0 && nums[i] == nums[i-1]) continue;
if(nums[i] > 0) break;

int n = nums[i];
int l = i + 1 , r = nums.length - 1;

while(l < r){
    int sum = n + nums[l] + nums[r];

    if(sum == 0){
    ArrayList<Integer> temp = new ArrayList<>();
    temp.add(n);
    temp.add(nums[l]);
    temp.add(nums[r]);
    res.add(temp);

    while(l < r && nums[l] == nums[l + 1]) l++;
    while(l < r && nums[r] == nums[r - 1]) r--;
    l++;
    r--;
// we increment both after removing duplicates, cuz in the range l -> r, it can form a perfect zero, but if we only move l or right after removing the duplicates, the sum will either increse or decrease which cannot become zero with new l & r pointers
    } 
    else if(sum < 0) l++;
    else r--;
}

}
return res;
    }
}
