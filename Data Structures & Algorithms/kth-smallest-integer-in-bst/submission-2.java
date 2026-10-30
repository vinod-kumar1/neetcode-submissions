/**
 * Definition for a binary tree node.
 * public class TreeNode {
 *     int val;
 *     TreeNode left;
 *     TreeNode right;
 *     TreeNode() {}
 *     TreeNode(int val) { this.val = val; }
 *     TreeNode(int val, TreeNode left, TreeNode right) {
 *         this.val = val;
 *         this.left = left;
 *         this.right = right;
 *     }
 * }
 */

class Solution {
    public int kthSmallest(TreeNode root, int k) {
        int res[] = new int[] {-1};
        int idx[] = new int[] {0};
        trav(root , k , idx,  res);
        return res[0];
    }

    public void trav(TreeNode A, int k, int[] idx, int[] res){
if(A == null) return;

trav(A.left , k, idx, res);
idx[0]++;
if(idx[0] == k && res[0] == -1) res[0] = A.val;
trav(A.right , k , idx,  res);
    }
}
