class Solution {
    public double findMedianSortedArrays(int[] nums1, int[] nums2) {
        int n = nums1.length + nums2.length;
        int half = (n + 1)/ 2;

        if(nums1.length > nums2.length){
            int temp[] = nums1;
            nums1 = nums2;
            nums2 = temp;
        }

int l = 0, r = nums1.length;

while(l <= r){
    int i = (r+l)/2;
    int j = half - i;

    int al = i - 1 >= 0 ? nums1[i-1] : Integer.MIN_VALUE;
    int ar = i < nums1.length ? nums1[i] : Integer.MAX_VALUE;
    int bl = j > 0 ? nums2[j-1] : Integer.MIN_VALUE;
    int br = j < nums2.length ? nums2[j] : Integer.MAX_VALUE;


if(al <= br && bl <= ar){
    if(n % 2 != 0) return 1.0 * Math.max(al , bl);
    return (Math.max(al , bl) + Math.min(ar , br)) / 2.0;
}
else if(al > br) r = i-1;
else l = i + 1;
}


return -1;
    }
}
