/**
 * // This is MountainArray's API interface.
 * // You should not implement it, or speculate about its implementation
 * interface MountainArray {
 *     public int get(int index) {}
 *     public int length() {}
 * }
 */

class Solution {
    int len = 0;

    public int findInMountainArray(int target, MountainArray mountainArr) {
len = mountainArr.length();

if(len < 3) return -1;
int peek = findPeek(0 , len - 1 , mountainArr);
int peekVal = mountainArr.get(peek);

int res= -1;

if(target < peekVal) res = iob(0 , peek , target, mountainArr);
if(res != -1) return res;

res = dob(peek , len - 1, target, mountainArr);

return res;

}

public int findPeek(int l, int r, MountainArray mountainArr){
    while(l <= r){
        int m = l + (( r - l) / 2);
        int n = mountainArr.get(m);
        int left = m - 1 >= 0 ? mountainArr.get(m - 1) : -1;
        int right = m + 1 < len ? mountainArr.get(m + 1) : Integer.MAX_VALUE;

        if(n > left && n > right) return m;
        else if(n < left) r = m - 1;
        else l = m + 1;
    }

    return 0;
}

public int iob(int l, int r , int target, MountainArray mountainArr){
    while(l <= r){
        int m = l + ((r - l ) / 2);
        int n = mountainArr.get(m);

        if(n == target) return m;
        else if(target < n) r = m - 1;
        else l = m + 1;
    }

return -1;
}

public int dob(int l, int r , int target, MountainArray mountainArr){
    while(l <= r){
        int m = l + ((r - l ) / 2);
        int n = mountainArr.get(m);
        if(n == target) return m;

        else if(target < n) l = m + 1;
        else r = m - 1;
    }

return -1;
}

}
