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
    public TreeNode insertIntoBST(TreeNode root, int val) {
        if(root == null) return new TreeNode(val);
trav(root , val);
        return root;
    }

public void trav(TreeNode A, int val){
    if(A == null) return;
    if(val < A.val){
        if(A.left == null) {
            A.left = new TreeNode(val);
    return;
    } 
    else trav(A.left , val);
    }

        if(val > A.val){
        if(A.right == null) {
            A.right = new TreeNode(val);
    return;
    } 
    else trav(A.right , val);
    }
}

}