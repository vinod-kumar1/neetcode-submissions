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
    public boolean isSubtree(TreeNode root, TreeNode subRoot) {
       if(root == null || subRoot == null){
         if(root == subRoot) return true;
         else return false;
       }

if(trav(root , subRoot)) return true;

       boolean left = isSubtree(root.left , subRoot);
       boolean right = isSubtree(root.right , subRoot);
    
    return left || right;
    }

public boolean trav(TreeNode A, TreeNode B){
    if(A == null && B == null) return true;
    if(A == null || B == null) return false;

    if(A.val != B.val) return false;

boolean left = trav(A.left , B.left);
boolean right = trav(A.right , B.right);

return left && right;
}

}
