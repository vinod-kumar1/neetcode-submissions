class Solution {
    public int lengthOfLIS(int[] nums) {
ArrayList<Integer> temp = new ArrayList<>();
temp.add(nums[0]);

for(int i = 1; i < nums.length; i++){
    int n = nums[i];
    if(n > temp.get(temp.size() - 1)) temp.add(n);
    else{
        int l = 0, r = temp.size() - 1, idx = -1;
        while(l <= r){
            int m = l + ((r-l) / 2);
            int num = temp.get(m);

            if(n == num) break;
            else if(n < num){
                r = m - 1;
            idx = m;
            }
            else l = m + 1;
        }
    if(idx != -1)  temp.set(idx , n);
    }
}


return temp.size();
    }
}
// easy