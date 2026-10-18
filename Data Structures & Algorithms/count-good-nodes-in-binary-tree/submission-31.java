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
    int[] sum = new int[] {0};

trav(root.left, root.val , sum);
trav(root.right, root.val , sum);
    return sum[0] + 1;
    }

public void trav(TreeNode A, int cur, int[] sum){
    if(A == null) return;
    
    if(A.val >= cur) sum[0]++;

 trav(A.left , Math.max(A.val , cur), sum);
 trav(A.right , Math.max(A.val , cur) , sum);
}

}
