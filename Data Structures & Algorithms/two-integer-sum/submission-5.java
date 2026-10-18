class Solution {
    public int[] twoSum(int[] nums, int target) {
        HashMap<Integer , Integer> map = new HashMap<Integer , Integer >();
    
    for(int i =0 ; i < nums.length; i++){
int n = nums[i];
        int l = target - n;
        if(map.containsKey(l)) return new int[] {map.get(l) , i};
        else map.put(n , i);
    }
return new int[] {0,0};
    }
}
