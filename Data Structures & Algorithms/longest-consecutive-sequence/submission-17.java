class Solution {
    public int longestConsecutive(int[] nums) {
        if(nums.length == 0) return 0;
        var res = new HashSet<Integer>();
        var seen = new HashSet<Integer>();

        int max = 0;

        for(int n : nums) res.add(n);

for(int num : nums){
if(seen.contains(num)) continue;
seen.add(num);
int cur = 0;
int copy = num;

while(res.contains(copy+1)){
cur++;
copy++;
}
if(cur > max) max = cur;
}
return max+1;
}
}
