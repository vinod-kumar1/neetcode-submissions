class Solution {
    public int longestConsecutive(int[] nums) {
        if(nums.length == 0) return 0;
        var res = new HashSet<Integer>();
        int max = 0;

        for(int n : nums) res.add(n);

for(int num : nums){
    int cur = 0;
int copy = num;

while(res.contains(copy+1)){
cur++;
copy++;
}
max = Math.max(cur , max);
}
return max+1;
}
}
