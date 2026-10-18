class Solution {
    public double findMedianSortedArrays(int[] nums1, int[] nums2) {
        int len = nums1.length + nums2.length;
    int half = (len + 1) / 2;

    if(nums1.length > nums2.length){
        int temp[] = nums1;
        nums1 = nums2;
        nums2 = temp;
    }

int ln1 = nums1.length, ln2 = nums2.length;

int l = 0, r = ln1;

while(l <= r){
int i = (l + r) / 2;
int j = half - i;

int al = i-1 >= 0 ? nums1[i-1] : Integer.MIN_VALUE;
int bl = j-1 >= 0 ? nums2[j-1] : Integer.MIN_VALUE;

int ar = i < ln1  ? nums1[i] : Integer.MAX_VALUE;
int br = j < ln2 ? nums2[j] : Integer.MAX_VALUE;

if(al <= br && bl <= ar){
    if((ln1 + ln2) % 2 == 0) return (Math.max(al , bl) + Math.min(ar, br)) / 2.0;    
    return (Math.max(al , bl) * 1.0);
}
else if(al > br) r = i - 1;
else l = i + 1;
}

return -1;
    }
}
