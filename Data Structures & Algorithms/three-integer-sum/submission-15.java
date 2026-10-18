class Solution {
    public List<List<Integer>> threeSum(int[] nums) {
        List<List<Integer>> res = new ArrayList<List<Integer>>();
     Set<String> set= new HashSet<String>();

        for(int i=0; i < nums.length-2; i++){
            for(int j=i+1; j < nums.length-1; j++){
                for(int k=j+1; k < nums.length ; k++){
if(nums[i] + nums[j] + nums[k] == 0) {
   int arr[] = {nums[i] , nums[j] , nums[k]};
   Arrays.sort(arr);
   
   if(!set.contains(Arrays.toString(arr))) {
    res.add(new ArrayList<Integer>(List.of(nums[i],nums[j],nums[k])));
    set.add(Arrays.toString(arr));
    }
}
                }
            }
        }
return res;
    }
}
