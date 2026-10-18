class Solution {
    public List<List<Integer>> threeSum(int[] nums) {
        Arrays.sort(nums);
List<List<Integer>> res = new ArrayList<>();

        for(int i = 0; i < nums.length - 2; i++){
            int n = nums[i];
            if(i > 0 && n == nums[i - 1]) continue;

            int l = i + 1, r = nums.length - 1;
    
    while(l < r){
        int n1 = nums[l];
        int n2 = nums[r];
    int sum = n + n1 + n2;

    if(sum == 0){
ArrayList<Integer> temp = new ArrayList<>();
temp.add(n);     
temp.add(n1);     
temp.add(n2);     
res.add(temp);
while(l < r && nums[l] == nums[l + 1]) l++;
while(l < r && nums[r] == nums[r-1]) r--;
    
     l++;
     r--;
    }
    else if(sum < 0) l++;
    else r--;
    
    }
        }
    
    return res;
    }
}

// -4 -1 -1 0 1 2