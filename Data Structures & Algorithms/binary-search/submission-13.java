class Solution {
    public int search(int[] nums, int target) {
int id = Arrays.binarySearch(nums , target);
return id >=0 ? id : -1;
    }
}
