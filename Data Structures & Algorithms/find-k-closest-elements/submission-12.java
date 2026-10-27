

class Solution {
    public List<Integer> findClosestElements(int[] arr, int k, int x) {
        int idx = findIdx(arr, x);

        int l = idx - 1;
        int r = idx;

        List<Integer> res = new ArrayList<>();

        while (res.size() < k) {
            if (l < 0) {
                res.add(arr[r++]);
            } else if (r >= arr.length) {
                res.add(0, arr[l--]);
            } else if (x - arr[l] <= arr[r] - x) {
                res.add(0, arr[l--]);
            } else {
                res.add(arr[r++]);
            }
        }

        return res;
    }

    public int findIdx(int[] A, int target) {
        int l = 0, r = A.length - 1;

        while (l <= r) {
            int m = l + (r - l) / 2;
if(A[m] == target) return m;

            if (A[m] < target) {
                l = m + 1;
            } else {
                r = m - 1;
            }
        }

        return l;
    }
}
