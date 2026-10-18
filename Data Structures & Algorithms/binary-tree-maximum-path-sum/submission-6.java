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
    public int maxPathSum(TreeNode root) {
      int max[] = new int[] {Integer.MIN_VALUE};
      trav(root, max);
    return max[0];
    }

public int trav(TreeNode A, int[] max){
if(A == null) return 0;

int left = Math.max(0 , trav(A.left , max));
int right =Math.max(0 , trav(A.right , max));

if(A.val + left + right > max[0]) max[0] = A.val + left + right;

return A.val + Math.max(left , right);

}

}
