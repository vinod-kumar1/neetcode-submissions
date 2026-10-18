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
  int num[] = new int[] {0};

    public int kthSmallest(TreeNode root, int k) {
        int res[] = new int[]{0};

         trav(root , k, res);
        return res[0];
    }

public void trav(TreeNode A, int k, int[] res){
if(A == null) return;

trav(A.left , k , res);
num[0]++;
if(num[0] == k){
  res[0] = A.val;
  return;
}

trav(A.right , k , res);

}

}
