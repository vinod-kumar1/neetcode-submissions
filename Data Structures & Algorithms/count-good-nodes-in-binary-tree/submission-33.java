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
    public int goodNodes(TreeNode root) {
      return trav(root , Integer.MIN_VALUE);
    }

public int trav(TreeNode A, int max){
    if(A == null) return 0;

int left =  trav(A.left , Math.max(max , A.val));
int right = trav(A.right , Math.max(max , A.val));

return (A.val >= max ? 1 : 0) + left + right;
}

}
