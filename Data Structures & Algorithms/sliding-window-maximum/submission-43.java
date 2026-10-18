class Solution {
    public int[] maxSlidingWindow(int[] nums, int k) {
     int l=0, r=0;
ArrayDeque<Integer> deq = new ArrayDeque<>();
int res[] = new int[nums.length - k + 1];
int curId = 0;

     while(r < nums.length){
int n = nums[r];
if(!deq.isEmpty()){
if(nums[deq.getFirst()] < n){
    deq.clear();
    deq.addFirst(r);
}
else{
while(nums[r] > nums[deq.getLast()]) deq.removeLast();
deq.addLast(r);
}
}
else deq.addFirst(r);

if((r - l + 1) == k){
res[curId] = nums[deq.getFirst()];
curId++;
l++;
if(!deq.isEmpty() && deq.getFirst() < l) deq.removeFirst();
}
r++;
     }  

return res;
    }
}
