class Solution {
    public int[] twoSum(int[] nums, int target) {
        HashMap<Integer, Integer> obj = new HashMap<Integer, Integer>();
    int[] temper = {};
    
    for (int i = 0; i < nums.length; i++) {
      if (obj.containsKey(nums[i])) {
        ArrayList<Integer> num = new ArrayList<Integer>();
        num.add(obj.get(nums[i]));
        num.add(i);
        int[] temp = num.stream().mapToInt(is -> is).toArray();
      return temp;
      }
      obj.put(target - nums[i], i);
    }

    return temper;
    
    }
}
