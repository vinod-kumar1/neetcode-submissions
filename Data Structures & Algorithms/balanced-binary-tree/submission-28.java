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
boolean bal = true;
    public int traverseNode(TreeNode node){
if(node == null || !bal ) return 0;
int l = traverseNode(node.left);
int r = traverseNode(node.right);

if(Math.abs(r-l) > 1){
bal = false;
return 0;
}
if(!bal) return 0;
return 1 + Math.max(l,r);
}


    public boolean isBalanced(TreeNode root) {
        if(root == null) return true;
traverseNode(root);

return bal;
    }
}
