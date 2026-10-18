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
int count = 0;

public void findNode(TreeNode node, int max){
if(node == null) return;
if(node.val >= max){
    max = node.val;
    count++;
}
findNode(node.left , max);
findNode(node.right , max);
}

    public int goodNodes(TreeNode root) {
     if(root == null) return 0;
       findNode(root, root.val);
       return count;
    }
}
