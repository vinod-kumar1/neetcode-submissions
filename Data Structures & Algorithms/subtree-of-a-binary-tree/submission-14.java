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
boolean[] res = new boolean[] {false};

    public boolean isSubtree(TreeNode root, TreeNode subRoot) {
if(root == null || subRoot == null) return root == subRoot;

return trav(root , subRoot) || isSubtree(root.left , subRoot) || isSubtree(root.right , subRoot);
      }

public boolean trav(TreeNode A, TreeNode B){
    if(A == null || B == null) return A == B;
if(A.val != B.val) return false;

return trav(A.left , B.left) && trav(A.right , B.right);

}


}
