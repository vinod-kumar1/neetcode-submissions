class Solution {
    public int firstMissingPositive(int[] nums) {
        int len = nums.length;

for(int i = 0; i < len; i++){
    int n = nums[i];
    if(n <= 0 || n > len || n == i + 1 || nums[n - 1] == n) continue;
int id = n - 1;

int temp = nums[id];
nums[id] = n;
nums[i] = temp;
i--;

}

for(int i = 0; i < len; i++){
    if((i + 1) != nums[i]) return i + 1;
}

return len + 1;

    }
}