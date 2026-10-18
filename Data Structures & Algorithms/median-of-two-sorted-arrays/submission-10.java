class Solution {
    public double findMedianSortedArrays(int[] nums1, int[] nums2) {
        int arr[] = new int[nums1.length + nums2.length];

        int j = 0;
        int l = 0, r = 0;
        while (l < nums1.length && r < nums2.length) {
            if (nums1[l] < nums2[r]) {
                arr[j] = nums1[l];
                l++;
            } else {
                arr[j] = nums2[r];
                r++;
            }
            j++;
        }
        
        if (l != nums1.length)
            addItemsToArr(nums1, l, arr , j);
        if (r != nums2.length)
            addItemsToArr(nums2, r, arr , j);
      int m = arr.length/2;

      if(arr.length % 2 == 0) return ( (double) arr[m] + arr[m-1]) / 2;
      else return arr[m];
    }

    public void addItemsToArr(int arr[], int i, int res[] , int j) {
        for(int k=i; k < arr.length; k++){
            res[j] = arr[k];
            j++;
        }
    }
    }