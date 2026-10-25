class Solution {
    public double findMedianSortedArrays(int[] nums1, int[] nums2) {
     int len1 = nums1.length;     
     int len2 = nums2.length;     
    
    if(len1 > len2){
        int temp[] = nums1;
        nums1 = nums2;
        nums2 = temp;

        int t = len1;
        len1 = len2;
        len2 = t;
    }

int l = 0, r = len1;
int half = (len1 + len2 + 1) / 2;

while(l <= r){
int  m1 = l + ((r - l) / 2);
int  m2 = half - m1;

    int Bright = m2 < len2 ? nums2[m2] : Integer.MAX_VALUE;
    int Bleft = m2 - 1 >= 0 ? nums2[m2 - 1] : Integer.MIN_VALUE;
    int Aright = m1 < len1 ? nums1[m1] : Integer.MAX_VALUE;
    int Aleft = m1 - 1 >= 0 ? nums1[m1 - 1] : Integer.MIN_VALUE;

if(Aright >= Bleft && Aleft <= Bright){
    if((len1 + len2) % 2 == 0){
    return ((Math.max(Aleft , Bleft) + Math.min(Aright,  Bright))) / 2.0;
    }
    return (1.0 * Math.max(Aleft , Bleft));
}
else if(Aleft > Bright) r = m1 - 1;
else l = m1 + 1;

}


return -1;
    }
}
