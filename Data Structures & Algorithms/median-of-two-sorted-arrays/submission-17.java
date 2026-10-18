class Solution {
    public double findMedianSortedArrays(int[] nums1, int[] nums2) {
        int len = nums1.length + nums2.length;
        int half = (len + 1) / 2;

        if(nums1.length > nums2.length){
            int temp[] = nums1;
            nums1 = nums2;
            nums2 = temp;
        }

int l = 0, r = nums1.length;

while(l <= r){
    int m1 = l + (( r- l) / 2);
    int m2 = half - m1;

    int al = m1 - 1 < 0 ? Integer.MIN_VALUE : nums1[m1 - 1];
    int bl = m2 - 1 < 0 ? Integer.MIN_VALUE : nums2[m2 - 1];
    int ar = m1 >= nums1.length ? Integer.MAX_VALUE : nums1[m1 ];
    int br = m2 >= nums2.length ? Integer.MAX_VALUE : nums2[m2];

if(al <= br && bl <= ar){
    if(len % 2 == 0){
     return (Math.max(al , bl) + Math.min(ar , br)) / 2.0;
    }
    return 1.0 * Math.max(al , bl);
}
else if(al > br) r = m1 - 1;
else l = m1 + 1;

}

return 0.0;
    }
}
