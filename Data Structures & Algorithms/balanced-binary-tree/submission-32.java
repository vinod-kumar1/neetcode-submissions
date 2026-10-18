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
    public boolean isBalanced(TreeNode root) {
        int res[] = new int[] {0};
        trav(root , res);
    return res[0] == 0;   
    }

    public int trav(TreeNode node, int[] res){
        if(node == null || res[0] == -1) return 0;

        int left = trav(node.left , res);
        int right = trav(node.right, res);
    if(Math.abs(left - right) > 1){
        res[0] = -1;
        return -1;
    }
return 1 + Math.max(left , right);    
    }
}
