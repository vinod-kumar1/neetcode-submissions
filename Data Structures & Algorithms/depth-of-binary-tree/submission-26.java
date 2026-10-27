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
    public int maxDepth(TreeNode root) {
        if(root == null) return 0;

        return trav(root , 1);
    }

public int trav(TreeNode node , int d){
    if(node == null) return d;

int left = node.left == null ? d : trav(node.left , d + 1);
int right = node.right == null ? d : trav(node.right , d + 1);

return Math.max(left , right);
}

}
