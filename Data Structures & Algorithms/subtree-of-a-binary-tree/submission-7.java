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

public boolean compareTree(TreeNode root , TreeNode st){
if(root == null || st == null){
    if(st == root) return true;
    return false;
}
if(root.val != st.val) return false;
return compareTree(root.left , st.left) && compareTree(root.right , st.right);
}

public boolean traverseTree(TreeNode r , TreeNode s){
if(r == null || s == null) return false;
if(r.val == s.val && compareTree(r , s)) return true;
return traverseTree(r.left , s) || traverseTree(r.right , s);
}

    public boolean isSubtree(TreeNode root, TreeNode subRoot) {
 if(root == null || subRoot == null) return false;
return traverseTree(root , subRoot);
    }
}
