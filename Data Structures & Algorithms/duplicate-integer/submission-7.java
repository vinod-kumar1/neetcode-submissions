class Solution {
    public boolean hasDuplicate(int[] nums) {
 HashSet temp = new HashSet<Integer>(IntStream.of(nums).boxed().collect(Collectors.toCollection(ArrayList::new)));
return temp.size() != nums.length;

    }
}